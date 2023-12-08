package com.example.spartahw2_kiosk

class ShackBurger : Menu("ShackBurger", 6.9){
    override val info: String = "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거"
}
class SmokeShack : Menu("SmokeShack", 8.9){
    override val info: String = "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"
}
class ShroomBurger : Menu("Shroom Burger", 9.4){
    override val info: String = "Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"
}
class Cheeseburger : Menu("Cheeseburger", 6.9){
    override val info: String = "Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"
}
class Hamburger : Menu("Hamburger", 5.4){
    override val info: String = "Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
}