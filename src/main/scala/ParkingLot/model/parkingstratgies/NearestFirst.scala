package ParkingLot.model.parkingstratgies

import java.util.TreeSet


class NearestFirst extends ParkingStrategy {

  var freeSlots = new TreeSet[Integer]

  override def add (i: Int): Unit = {
  freeSlots.add (i)
}

  override def getSlot: Int = {
  return freeSlots.first
}

  override def removeSlot (availableSlot: Int): Unit = {
  freeSlots.remove (availableSlot)
}
}
