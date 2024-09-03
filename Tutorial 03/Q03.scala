object Q03 {
    def average(n1: Int, n2: Int): Float = {
        ((n1.toFloat + n2.toFloat) / 2) 
    }

    def main(args: Array[String]): Unit = {
        print("Enter the first integer : ")
        val num1 = scala.io.StdIn.readInt()
        print("Enter the first integer : ")
        val num2 = scala.io.StdIn.readInt()
        printf("The average of two integers are : %.2f", average(num1, num2))
    }
}