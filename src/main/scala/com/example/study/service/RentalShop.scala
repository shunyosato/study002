package com.example.study.service

import com.example.study.models.{Receipt}
import scala.collection.mutable.ListBuffer

/**
  * Created by shunyo.sato on 2016/06/21.
  */
object RentalShop {
  def accouting(receipt: Receipt):Double = {
    val sumPrice: ListBuffer[Double] = receipt.cars.map(car => car.rentPrice + car.kmPrice * car.records.map(x => x.km).sum)
    sumPrice.sum
  }

  def accoutingByCarType(receipt: Receipt): Map[String, Double] = {
    //分類 -> 価格と走行距離ループさせて結果を返す
    receipt.cars.groupBy(n => n.carType).mapValues(m => m.foldLeft(0.0)((x, y) => x + y.rentPrice + y.kmPrice * y.records.map(z => z.km).sum))
  }
}