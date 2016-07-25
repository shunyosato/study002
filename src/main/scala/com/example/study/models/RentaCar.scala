package com.example.study.models

/**
  * Created by shunyo.sato on 2016/06/21.
  */

import scala.collection.mutable.ListBuffer

trait RentaCar {
  val carType: String
  val rentPrice: Int
  val kmPrice: Int
  val records: ListBuffer[DrivingRecord]

  def run(record: DrivingRecord): Unit = {
    records += record
  }
}