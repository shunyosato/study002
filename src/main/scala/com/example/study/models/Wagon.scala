package com.example.study.models

import scala.collection.mutable.ListBuffer

/**
  * Created by shunyo.sato on 2016/06/21.
  */
class Wagon(val records: ListBuffer[DrivingRecord]) extends RentaCar {
  val carType = "wagon"
  val rentPrice = 8000
  val kmPrice = 200
}
