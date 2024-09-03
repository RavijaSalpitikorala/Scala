object salary{
    def main(args:Array[String]): Unit = {
        println("Salary of an employee : Rs." + outcome(40, 30))
    }
    def outcome(x:Int, y:Int): Int = {
        val normalhour = 250
        val OT = 85
        (x * normalhour + y * OT) * (100 - 12) / 100 
    }
}
