package ParkingLot.model

import java.io.Externalizable
import java.io.IOException
import java.io.ObjectInput
import java.io.ObjectOutput

abstract class Vehicle(var registrationNo:String, var color:String ) {

  def Vehicle(registrationNo: String, color: String) {

    this.registrationNo = registrationNo

    this.color = color

  }

  override def toString: String = "[registrationNo=" + registrationNo + ", color=" + color + "]"

  def getRegistrationNo: String = registrationNo

  /**
    * @param registrationNo
    * the registrationNo to set
    */
  def setRegistrationNo(registrationNo: String): Unit = {
    this.registrationNo = registrationNo
  }

  /**
    * @return the color
    */
  def getColor: String = color

  /**
    * @param color
    * the color to set
    */
  def setColor(color: String): Unit = {
    this.color = color
  }



}
