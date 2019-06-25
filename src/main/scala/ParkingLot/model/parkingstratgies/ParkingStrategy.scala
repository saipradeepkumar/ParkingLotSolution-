package ParkingLot.model.parkingstratgies

trait ParkingStrategy {

  def add(i: Int): Unit

  def getSlot: Int

  def removeSlot(slot: Int): Unit
}
