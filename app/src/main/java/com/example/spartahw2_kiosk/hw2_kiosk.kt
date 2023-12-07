import com.example.spartahw2_kiosk.Beer
import com.example.spartahw2_kiosk.Burger
import com.example.spartahw2_kiosk.Drinks
import com.example.spartahw2_kiosk.Frozen_Custard
import com.example.spartahw2_kiosk.Order


fun String.isNumeric(): Boolean {
    return try {
        this.toInt()
        true
    } catch (e: Exception) {
        false
    }
}
fun main (){
    println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")

    val orders = ArrayList<Order>()
    while (true) {
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
        println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
        println("3. Drinks          | 매장에서 직접 만드는 음료")
        println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
        println("5. 주문 목록: ")
        println("0. 종료")

        var a = readln().toInt()
        when (a) {
            1 -> orders.add(Burger().burgerMenu()!!)
            2 -> orders.add(Frozen_Custard().frozenCustardMenu()!!)
            3 -> orders.add(Drinks().drinksMenu()!!)
            4 -> orders.add(Beer().beerMenu()!!)
            5 -> {
                println("주문 목록")
                for (order in orders) {
                println("${order.name} - ${order.price} W")
                }
            }
            0 -> break
            else -> println("올바른 메뉴를 선택해주세요")
        }

    }
}
