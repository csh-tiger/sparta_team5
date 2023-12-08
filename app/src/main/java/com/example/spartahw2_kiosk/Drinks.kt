package com.example.spartahw2_kiosk

class RaspberryLemonade : Menu("Raspberry Lemonade", 4.8){
    override val info: String = "Raspberry Lemonade    | W 6.9 | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드"
}
class Lemonade : Menu("Lemonade", 4.3){
    override val info: String = "Lemonade              | W 4.3 | 매장에서 직접 만드는 상큼한 레몬에이드"
}
class FreshBrewedIcedTea : Menu("Fresh Brewed Iced Tea", 3.5){
    override val info: String = "Fresh Brewed Iced Tea | W 3.5 | 직접 유기농 홍차를 우려낸 아이스 티"
}
class FiftyFifty : Menu("Fifty/FiftyTM", 3.8){
    override val info: String = "Fifty/FiftyTM         | W 3.8 | 레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료"
}
class FountainSoda : Menu("Fountain Soda", 2.9){
    override val info: String = "Fountain Soda         | W 2.9 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"
}
class AbitaRootBeer : Menu("Abita Root Beer", 4.8){
    override val info: String = "Abita Root Beer       | W 4.8 | 청량감 있는 독특한 미국식 무알콜 탄산음료"
}
class HotTea : Menu("Hot Tea", 3.4){
    override val info: String = "Hot Tea               | W 3.4 | 보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스"
}