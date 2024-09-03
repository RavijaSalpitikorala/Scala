object findVolume{
  
  def main(args: Array[String]): Unit={
    println("Volume of the sphere : " + calcVolume(5));
  }

  def calcVolume(r:Int):Float={
    val pi=3.14f
    var volume = 4/3 * pi * r * r * r

    return volume
  }
}