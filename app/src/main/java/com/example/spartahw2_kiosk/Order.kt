package com.example.spartahw2_kiosk

class Order(arr:Array<Double>) {
    var arr=arrayOf<Double>()
    fun order(){
        var price=arr.sum()
        println("결제금액은 ${price}입니다.")
        //추가주문
        println("추가주문하시겠습니까?")
        println("1. 추가주문   |   0. 결제")
        val choice=readLine()!!.toInt()
        if (choice==0) {
            println("1. 카드결제   |   2. 현금결제")
            val num = readLine()!!.toInt()
            val pay = Pay(num)
            pay.pay()
        }
        else{

        }
    }
}