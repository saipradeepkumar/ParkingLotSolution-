package ParkingLot.constants

import java.util
import java.util.{HashMap, Map}

object CommandInputMap {

    private val commandsParameterMap = new util.HashMap[String, Integer]
    commandsParameterMap.put(Constants.CREATE_PARKING_LOT, 1)
    commandsParameterMap.put(Constants.PARK, 2)
    commandsParameterMap.put(Constants.LEAVE, 1)
    commandsParameterMap.put(Constants.STATUS, 0)
    commandsParameterMap.put(Constants.REG_NUMBER_FOR_CARS_WITH_COLOR, 1)
    commandsParameterMap.put(Constants.SLOTS_NUMBER_FOR_CARS_WITH_COLOR, 1)
    commandsParameterMap.put(Constants.SLOTS_NUMBER_FOR_REG_NUMBER, 1)

  /**
    * @return
    *the commandsParameterMap
    */
  def getCommandsParameterMap: util.Map[String, Integer] = commandsParameterMap

  /**
    * @param
    * the commandsParameterMap to set
    */
  def addCommand(command: String, parameterCount: Int): Unit = {
    commandsParameterMap.put(command, parameterCount)
  }


}


