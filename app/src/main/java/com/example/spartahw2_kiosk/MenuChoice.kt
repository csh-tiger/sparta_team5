package com.example.spartahw2_kiosk

class MenuChoice(name:String, price:Double) {
    var name:String=""
    var price:Double=0.0
    var arr=arrayOf<Double>()

    fun choice(): Array<Double> {
        arr=arr.plus(price)
        println("${name}을 선택하셨습니다. 가격은 ${price*1000}입니다.")

        return arr
    }
}