package com.example.study.models


/**
  * Created by shunyo.sato on 2016/06/21.
  */
import scala.collection.mutable.ListBuffer
class Receipt( val cars: ListBuffer[RentaCar] = ListBuffer.empty[RentaCar]) {

  def add(car: RentaCar) = {
    cars += car
  }

  def remove(n: Int) = {
    cars.remove(n)
  }

}
