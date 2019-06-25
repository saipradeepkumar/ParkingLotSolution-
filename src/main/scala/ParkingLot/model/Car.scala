package ParkingLot.model

import java.io.{ObjectInput, ObjectOutput}



class Car (registrationNo: String, color: String) extends Vehicle (registrationNo: String, color: String){

  def Car(registrationNo: String, color: String) {
    super.Vehicle(registrationNo, color)
  }

}
