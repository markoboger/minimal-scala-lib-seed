object printProject {
  println("Project: Dominion")
}
printProject

case class Cell(cardID:Int){
  def isOcc: Boolean = cardID > 0

}

case class Car(length:Int, align: Int, carID: Int){
  def isLength1 : Boolean = length ==1
  def isSet: Boolean = length !=0 && align < 3 && align > 0 && carID > 0 //align= 1 -> herizontal 2-> vertikal
}

val car1 = Car(2,1,1)
val car2 = Car(1,2,1)