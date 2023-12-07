package com.example.spartahw2_kiosk

class Burger() {
    fun burgerMenu(): Order? {
        println("[ Burgers MENU ]")
        println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
        println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기")

        val orders = ArrayList<Order>()
        var a = readln().toIntOrNull()
        return when (a) {
            1 -> {
                println("ShackBurger를 장바구니에 담았습니다")
                Order("ShackBurger", 6.9)
            }
            2 -> {
                println("SmokeShack를 장바구니에 담았습니다")
                Order("SmokeShack", 8.9)
            }
            3 -> {
                println("ShroomShack를 장바구니에 담았습니다")
                Order("Shroom Burger", 9.4)
            }
            4 -> {
                println("Cheeseburger를 장바구니에 담았습니다")
                Order("Cheeseburger", 6.9)
            }
            5 -> {
                println("Hamburger를 장바구니에 담았습니다")
                Order("Hamburger", 5.4)
            }
            0 -> null
            else -> {println("올바른 메뉴를 선택해주세요.")
            null}
        }



    }
}