package com.example.spartahw2_kiosk

data class Delivery(
    val name:String,
    val price:Double,
    val latitude: Double,
    val longitude: Double
)
//lv7 프로그램이 실행되는 중 10초마다 랜덤하게 배달주문(메뉴명, 금액, 위도, 경도)이 추가되게 만들어요. SHAKESHACK MENU에 번호를 추가해서 배달요청목록을 출력해요.
//해야할것 배달요청 목록 출력
//랜덤 [메뉴명, 금액] 랜덤 위도, 경도 0..360.00 (지역 범위 전세계)
//배달요청 목록 만드는 함수 생성 delay(10000)