object printProject {
  println("Project: Rush_Hour")
}

case class Cell(x:Int,y:Int,car:Int){
  println("Cell was created")
  def occ: Int=car
}
val cell1 =Cell(0,0,0)
val cell2 =Cell(0,1,3)
val cell52= Cell(5,2,0)
case class Standard_field(cell:Vector[Cell]){
  def isSolved: Boolean = cell52.car == 1
}
val field0 = Standard_field(Vector(cell1,cell2))
field0.isSolved
cell2.occ
cell1.occ
case class Car(length:Int, alignment: Int){
  def getLength: Int = length
  def getAlignment: Int = alignment //0=horizontal 1=vertical
}
val car1 = Car(3,1)
car1.getLength
car1.getAlignment
val car2 = Car(2,2)