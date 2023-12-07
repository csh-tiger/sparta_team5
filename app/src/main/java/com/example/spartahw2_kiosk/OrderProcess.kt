package com.example.spartahw2_kiosk

class OrderProcess {
    companion object {
        fun order(a: Menu): Order? {
            println("${a.info}")
            println("위 메뉴를 장바구니에 추가하시겠습니까?")
            println("1. 확인        2. 취소")
            try {
                var b = readln().toInt()

                when (b) {
                    1 -> {
                        println("${a.name}가 장바구니에 추가되었습니다.")
                        return Order(a.name, a.price)
                    }

                    2 -> return null
                    else -> {
                        println("잘못된 입력입니다")
                        return null
                    }
                }
            } catch (e: NumberFormatException) {
                println("숫자로만 입력해주세요")
                return null
            }
        }
    }
}