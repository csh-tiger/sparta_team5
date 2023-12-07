package com.example.spartahw2_kiosk

import java.lang.NumberFormatException

class CustardMenu() : OrderMenu {
    override fun orderMenu(): Order? {
    var a:Int
    val custardList = listOf(VanillaCookies(), MintCookies(), ClassicHandSpun(), Floats(),CupCones())
    println("[ Custard MENU ]")
        custardList.forEachIndexed { index, custard -> println("${index + 1}. ${custard.info}") }
    println("0. 뒤로가기      | 뒤로가기")

    try {
        a = readln().toInt()
    } catch (e: NumberFormatException){
        println("숫자로만 입력해주세요")
        return null
    }
    return when (a) {
        in 1..custardList.size -> {
            OrderProcess.order(custardList[a - 1])
        }
        0 -> null
        else -> {println("올바른 메뉴를 선택해주세요.")
            null}
    }



}
}