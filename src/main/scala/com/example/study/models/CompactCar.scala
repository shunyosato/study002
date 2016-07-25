package com.example.study.models

/**
  * Created by shunyo.sato on 2016/06/21.
  */
 import scala.collection.mutable.ListBuffer

class CompactCar(val records: ListBuffer[DrivingRecord]) extends RentaCar {
  val carType = "compact car"
  val rentPrice = 5000
  val kmPrice = 100
}
