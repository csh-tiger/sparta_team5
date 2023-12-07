import com.example.spartahw2_kiosk.BeerMenu
import com.example.spartahw2_kiosk.Menu
import com.example.spartahw2_kiosk.BurgerMenu
import com.example.spartahw2_kiosk.CustardMenu
import com.example.spartahw2_kiosk.DiscountCoupon
import com.example.spartahw2_kiosk.DrinksMenu
import com.example.spartahw2_kiosk.Order
import com.example.spartahw2_kiosk.thousand
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.NumberFormatException
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread

fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e: Exception) {
        false
    }
}

fun main() {
    var cash: Double = 0.0
    var orders = ArrayList<Order>()
    var coupons = ArrayList<Order>()
    var a: Int
    var orderWaitCount = 0
    var accum = 0.0
    var usecoupon = ArrayList<Order>()
    /*thread {
        while (true) {
            runBlocking {
                launch {
                    delay(5000)
                    println("(현재 주문대기수 ${orderWaitCount})")
                }
            }
        }
    }*/
    println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    while (true) {
        println("[ Burgers MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("5. Order           | 장바구니를 확인 후 주문합니다.")
        println("6. Cancel          | 진행중인 주문을 취소합니다.")
        println("7. Recharge        | 잔액을 충전 합니다")
        println("8. Discount coupon | 할인 쿠폰 발급")
        println("0. 종료             | 프로그램 종료")
        val menuList = listOf(BurgerMenu(), CustardMenu(), DrinksMenu(), BeerMenu())
        try {
            a = readln().toInt()
        } catch (e: NumberFormatException) {
            println("숫자로만 입력해주세요")
            continue
        }
        when (a) {
            in 1..4 -> {
                val k = menuList[a - 1].orderMenu()
                if (k != null) { //null 체크하고
                    val a = orders.find { it.name == k.name } // orders에 겹치는거 체크
                    if (a == null) { //없으면 추가
                        orders.add(k)
                    } else {
                        a.quantity++//있으면 수량 증가
                    }
                }
            }

            5 -> {
                println("아래와 같이 주문 하시겠습니까? (현재 주문대기수 ${orderWaitCount})")
                println("[ Orders ]")
                var totalPrice = orders.sumByDouble { it.price * it.quantity }
                for (order in orders) {
                    println("${order.name} - ${order.price} W - ${order.quantity}개")
                }
                println("[ Total ]")
                println("W ${totalPrice}")
                println("")
                println("1. 주문      2. 메뉴판")
                var a = readln().toInt()
                when (a) {
                    1 -> {
                        print("쿠폰을 사용하시겠습니까? 현재보유중인 쿠폰: ")
                        for (i in coupons) {
                            print("${i.name} ${i.quantity}개, ")
                        }
                        println(" ")
                        println("1. 예     2. 아니오")
                        var a = readln().toInt()
                        when (a) {
                            1 -> {
                                println("어떤 쿠폰을 쓰시겠습니까?")
                                println("1. 1000원할인 쿠폰 | 15000원 이상 주문시 사용가능")
                                println("2. 3000원할인 쿠폰 | 30000원 이상 주문시 사용가능")
                                println("3. 1000원할인 쿠폰 | 50000원 이상 주문시 사용가능")
                                var a = readln().toInt()
                                when (a) {
                                    1 -> {
                                        if (totalPrice >= 15.0) {
                                            var k = usecoupon("1000원 쿠폰", coupons)
                                            if (k != null) {
                                                usecoupon = k
                                                totalPrice -= 1.0
                                            } else continue
                                        } else {
                                            println("15000원 이상만 가능합니다.")
                                        }
                                    }

                                    2 -> {
                                        if (totalPrice >= 30.0) {
                                            var k = usecoupon("3000원 쿠폰", coupons)
                                            if (k != null) {
                                                usecoupon = k
                                                totalPrice -= 3.0
                                            } else continue
                                        } else {
                                            println("30000원 이상만 가능합니다.")
                                        }
                                    }

                                    3 -> {
                                        if (totalPrice >= 50.0) {
                                            var k = usecoupon("5000원 쿠폰", coupons)
                                            if (k != null) {
                                                usecoupon = k
                                                totalPrice -= 5.0
                                            } else continue
                                        } else {
                                            println("50000원 이상만 가능합니다.")
                                        }
                                    }
                                }
                            }

                            2 -> {}
                            else -> {
                                println("잘못된 입력입니다.")
                                continue
                            }
                        }

                        if (cash < totalPrice) {
                            println("현재 잔액은 ${cash} W 으로 ${totalPrice - cash} W 이 부족해서 주문할 수 없습니다.")
                            continue
                        } else {
                            coupons = usecoupon
                            var now = LocalDateTime.now()
                            var formatter =
                                DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")
                            if (LocalTime.now() in LocalTime.of(23, 10)..LocalTime.of(
                                    23,
                                    20
                                )
                            ) {
                                println("은행 점검 시간은 오후11시 10분 ~ 오후 11시 20분이므로 결제할 수 없습니다.")
                            } else {
                                println("주문이 완료되었습니다 (${now.format(formatter)})")
                                cash = cash - totalPrice
                                accum += totalPrice
                                orders.clear()
                                orderWaitCount++
                                thread {
                                    runBlocking {
                                        launch {
                                            delay(3000)
                                            orderWaitCount--
                                        }
                                    }
                                }
                            }
                        }
                    }


                    2 -> continue
                }
            }

            6 -> {
                println("주문이 취소 되었습니다")
                orders.clear()
            }

            7 -> {
                println("충전 금액을 입력하세요 ")
                cash += recharge(readln().toInt())
                println("[ Cash ]")
                println("${cash} W")
            }

            8 -> {
                val coupon1 = DiscountCoupon.coupon()
                if (coupon1 != null) {
                    coupons = coupon1
                }

                println("보유중인 쿠폰: ")
                for (i in coupons) {
                    println("${i.name} ${i.quantity}개")
                }
            }

            0 -> break
            else -> {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                continue
            }
        }

    }
}

fun recharge(a: Int): Double {
    return a.toDouble() / 1000
}

fun usecoupon(a: String, coupons: ArrayList<Order>): ArrayList<Order>? {
    val k = coupons.find { it.name == a }
    if (k != null) {
        if (k.quantity < 0) {
            println("쿠폰이 없습니다")
            return null
        }
        if (k.quantity > 0) {
            coupons.find { it.name == a }?.quantity = coupons.find { it.name == a }?.quantity!! - 1
            return coupons
        }
    }
    return null
}