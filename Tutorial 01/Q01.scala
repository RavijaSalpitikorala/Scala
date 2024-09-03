object Area {

  var Pi = 3.14f

  def main(args:Array[String]): Unit = {
    println("Area of the disk : " + calcArea(5))
  }
  def calcArea(c:Int): Float = {
    var radius = c
    Pi* radius * radius
  }
}