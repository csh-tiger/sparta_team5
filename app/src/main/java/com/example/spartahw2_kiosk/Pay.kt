package com.example.spartahw2_kiosk

class Pay(num:Int) {
    val num=0

    fun pay(){
        if(num==1)
            println("카드로 결제가 되었습니다.")
        else
            println("현금으로 결제가 되었습니다.")
    }

}