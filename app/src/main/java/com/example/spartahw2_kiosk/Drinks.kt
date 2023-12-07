package com.example.spartahw2_kiosk

class Drinks {
    fun drinksMenu(): Order? {
        println("[ Drinks MENU ]")
        println("1. Shack-made Lemonade      | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드")
        println("2. Fresh Brewed Iced Tea    | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티")
        println("3. Fifty/Fifty              | W 3.5 | 레몬에이트와 아이스티의 만남")
        println("4. Fountain Soda            | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프")
        println("5. Abita Root Beer          | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료")
        println("6. Bottled Water            | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수")
        println("0. 뒤로가기 ")

        val orders = ArrayList<Order>()
        var a = readln().toIntOrNull()
        return when (a) {
            1 -> {
                println("Shack-made Lemonade를 장바구니에 담았습니다")
                Order("Shack-made Lemonade", 3.9)
            }
            2 -> {
                println("Fresh Brewed Iced Tea를 장바구니에 담았습니다")
                Order("Fresh Brewed Iced Tea", 3.4)
            }
            3 -> {
                println("Fifty/Fifty를 장바구니에 담았습니다")
                Order("Fifty/Fifty", 3.5)
            }
            4 -> {
                println("Fountain Soda를 장바구니에 담았습니다")
                Order("Fountain Soda", 2.7)
            }
            5 -> {
                println("Abita Root Beer를 장바구니에 담았습니다")
                Order("Abita Root Beer", 4.4)
            }
            6 -> {
                println("Bottled Water를 장바구니에 담았습니다")
                Order("Bottled Water", 1.0)
            }
            0 -> null
            else -> {println("올바른 메뉴를 선택해주세요.")
                null}
        }



    }
}