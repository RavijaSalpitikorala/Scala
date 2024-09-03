object CelToFah {

  def main(args: Array[String]): Unit = {
    println(" Temperature in F = " + temp(35));
  }

  def temp(c:Int) : Float = {
    val n1 = 1.80f
    val n2 = 32.00f
    (c * n1)  + n2

  }
}