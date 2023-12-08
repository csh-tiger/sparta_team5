package com.example.spartahw2_kiosk

import java.lang.NumberFormatException

class DrinksMenu(): OrderMenu {

    override fun orderMenu(): Order? {
        var a:Int
        val drinkList = listOf(RaspberryLemonade(), Lemonade(), FreshBrewedIcedTea(), FiftyFifty(), FountainSoda(), AbitaRootBeer(), HotTea())
        println("[ Drink MENU ]")
        drinkList.forEachIndexed { index, drink -> println("${index + 1}. ${drink.info}") }
        println("0. 뒤로가기      | 뒤로가기")

        try {
            a = readln().toInt()
        } catch (e: NumberFormatException){
            println("숫자로만 입력해주세요")
            return null
        }
        return when (a) {
            in 1..drinkList.size -> {
                OrderProcess.order(drinkList[a - 1])
            }
            0 -> null
            else -> {println("올바른 메뉴를 선택해주세요.")
                null}
        }



    }
}