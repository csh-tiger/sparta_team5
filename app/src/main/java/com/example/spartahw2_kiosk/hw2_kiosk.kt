package com.example.spartahw2_kiosk

fun main (){
    var price=arrayOf<Double>()
    val display= Display()

    while (true) {
        display.mainMenu()      //메인메뉴

        val num1 = readLine()!!.toInt()
        when (num1) {
            1 -> {
                display.burgerMenu()        //상세메뉴
                price=burgerMenu()
                if (price.isNotEmpty()){
                    val order=Order(price)
                    order.order()
                }

            }
            //2,3,4 추가
            0 -> {
                println("주문을 종료합니다. ")
                break
            }
            else -> println("올바른 메뉴를 선택해주세요")
        }

    }
}

fun burgerMenu():Array<Double>{

    val num2 = readln().toIntOrNull()
    when (num2){
        0 -> return emptyArray()
        1 -> {
            val choice=MenuChoice("ShackBurger",6.9)
            val pricearr=choice.choice()
            return pricearr
        }
        //2,3,4,5 추가
        else -> {
            println("올바른 메뉴를 선택해주세요")
            return emptyArray()
        }
    }
}