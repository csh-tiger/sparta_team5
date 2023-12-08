package com.example.spartahw2_kiosk

class DiscountCoupon {
    companion object {
        fun coupon(): ArrayList<Order>? {
            var couponList = ArrayList<Order>()
            while (true) {
                println("[ Coupon ]")
                println("15W 이상 구매시 1000원 할인")
                println("30W 이상 구매시 3000원 할인")
                println("50W 이상 구매시 5000원 할인")
                println("1.쿠폰 발행 0.돌아가기")
                try {

                    var a = readln().toInt()
                    when (a) {

                        1 -> {
                            println("어떤 쿠폰을 받으시겠습니까?")
                            println("1. 1000원 할인쿠폰 2. 3000원 할인쿠폰 3. 5000원 할인쿠폰")
                            var b = readln().toInt()
                            when (b) {
                                1 -> {
                                    val cop = Order(thousand().name, thousand().price)
                                    val a = couponList.find { it.name == cop.name }
                                    println("쿠폰이 발급되었습니다")
                                    if (a == null) {
                                        couponList.add(cop)
                                        continue
                                    } else {
                                        a.quantity++
                                        continue
                                    }
                                }

                                2 -> {

                                    val cop = Order(thrthousand().name, thrthousand().price)
                                    val a = couponList.find { it.name == cop.name }
                                    println("쿠폰이 발급되었습니다")
                                    if (a == null) {
                                        couponList.add(cop)
                                        continue
                                    } else {
                                        a.quantity++
                                        continue
                                    }
                                }

                                3 -> {/*
                                if (accum < 50.0) {
                                    println("사용금액이 부족합니다")
                                    continue
                                } else if (accum >= 50.0) {*/
                                    val cop = Order(fivthousand().name, fivthousand().price)
                                    val a = couponList.find { it.name == cop.name }
                                    println("쿠폰이 발급되었습니다")
                                    /*accum -= 50.0*/
                                    if (a == null) {
                                        couponList.add(cop)
                                        continue
                                    } else {
                                        a.quantity++
                                        continue
                                    }
                                } /*else {
                                    println("잘못된 입력값입니다")
                                    continue
                                }
                            }*/
                            }
                            continue
                        }

                        0 -> {
                            return couponList
                        }
                    }
                }catch (e:NumberFormatException){
                    println("숫자로만 입력해주세요")
                    continue
                }
            }
        }
    }
}