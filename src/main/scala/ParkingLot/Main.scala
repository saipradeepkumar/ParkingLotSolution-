package ParkingLot

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.InputStreamReader
import model.Car

object Main {

  def main(args: Array[String]): Unit = {

    val honda:Car=new Car("ka054497","red")

    println(honda)

  }

}
