package com.example.spartahw2_kiosk

class Frozen_Custard {
    fun frozenCustardMenu(): Order? {
        println("[ Frozen Custard MENU ]")
        println("1. Shakes              | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피")
        println("2. Shack of the week   | W 6.5 | 특별한 커스터드 플레이버")
        println("3. Red Been Shake      | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크")
        println("4. Floats              | W 5.9 | 루트 비어, 퍼플 카우, 크림시클")
        println("5. Cups & Corns        | W 4.9 | 바닐라, 초콜렛, Flavor of the Week")
        println("0. 뒤로가기 ")

        val orders = ArrayList<Order>()
        var a = readln().toIntOrNull()
        return when (a) {
            1 -> {
                println("Shakes를 장바구니에 담았습니다")
                Order("Shakes", 5.9)
            }
            2 -> {
                println("Shack of the week를 장바구니에 담았습니다")
                Order("Shack of the week", 6.5)
            }
            3 -> {
                println("Red Been Shake를 장바구니에 담았습니다")
                Order("Red Been Shake", 6.5)
            }
            4 -> {
                println("Floats를 장바구니에 담았습니다")
                Order("Floats ", 5.9)
            }
            5 -> {
                println("Cups & Corns를 장바구니에 담았습니다")
                Order("Hamburger", 4.9)
            }
            0 -> null
            else -> {println("올바른 메뉴를 선택해주세요.")
                null}
        }



    }
}