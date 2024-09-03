object TotalCost {

  def main(args: Array[String]): Unit = {
    println("Total cost = " + cost(60));
  }

  def cost(c:Int) : Float = {
    val CoverP = 24.95f
    val Dis = 0.4f
    val ShippingCost1 = 3f
    val ShippingCost2 = 0.75f

    var Tcost = if(c <= 50){
        (CoverP * (1-Dis) * c) + (ShippingCost1 * c)
    }
    else{
        (CoverP * (1-Dis) * c) + (ShippingCost1 * 50) + (ShippingCost2 * (c - 50))
    }

    return Tcost
  }
}