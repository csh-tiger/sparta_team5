package com.example.spartahw2_kiosk

import java.lang.NumberFormatException

class BeerMenu() : OrderMenu {
    override fun orderMenu(): Order? {
        var a:Int
        val burgerList = listOf(Draft(),Cass(),Terra())
        println("[ Beer MENU ]")
        burgerList.forEachIndexed { index, burger -> println("${index + 1}. ${burger.info}") }
        println("0. 뒤로가기      | 뒤로가기")

        try {
            a = readln().toInt()
        } catch (e: NumberFormatException){
            println("숫자로만 입력해주세요")
            return null
        }
        return when (a) {
            in 1..burgerList.size -> {
                OrderProcess.order(burgerList[a - 1])
            }
            0 -> null
            else -> {println("올바른 메뉴를 선택해주세요.")
                null}
        }



    }
}