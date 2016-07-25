package com.example.study

import com.example.study.models._
import com.example.study.service.RentalShop

import scala.collection.mutable.ListBuffer

object Application {

  def run(args: Array[String]) = {
    println("application started!")

    val compactCar = new CompactCar(ListBuffer())
    compactCar.run(new DrivingRecord(30.0))
    compactCar.run(new DrivingRecord(70.0))
    compactCar.run(new DrivingRecord(50.0))

    val wagon1 = new Wagon(ListBuffer())
    wagon1.run(new DrivingRecord(40.0))
    val wagon2 = new Wagon(ListBuffer())
    wagon2.run(new DrivingRecord(60.0))

    val receipt = new Receipt()
    receipt.add(wagon1)
    receipt.add(wagon2)
    receipt.add(compactCar)

    println(receipt.cars.map(x => x.kmPrice + " " + x.carType + " "  + x.rentPrice))
    println(receipt.cars.groupBy(c => c.carType))

    println("合計" + RentalShop.accouting(receipt) + "円")
    RentalShop.accoutingByCarType(receipt).map(x => println( x._1 + x._2 + "円"))
  }

}
