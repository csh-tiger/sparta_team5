package com.example.spartahw2_kiosk

class Beer {
    fun beerMenu(): Order? {
        println("[ Beer MENU ]")
        println("1. ShakeMeister Ale      | W 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어에서 특별히 양조한 에일 맥주")
        println("2. Magpie Brewing Co.    | W 6.8 | ")
        println("3. The Hand and Malt     | W 6.8 | ")
        println("0. 뒤로가기")

        val orders = ArrayList<Order>()
        var a = readln().toIntOrNull()
        return when (a) {
            1 -> {
                println("ShakeMeister Ale를 장바구니에 담았습니다")
                Order("ShakeMeister Ale", 9.8)
            }

            2 -> {
                println("Magpie Brewing Co.를 장바구니에 담았습니다")
                Order("Magpie Brewing Co.", 6.8)
            }

            3 -> {
                println("The Hand and Malt를 장바구니에 담았습니다")
                Order("The Hand and Malt", 6.8)
            }

            0 -> null
            else -> {
                println("올바른 메뉴를 선택해주세요.")
                null
            }
        }

    }
}