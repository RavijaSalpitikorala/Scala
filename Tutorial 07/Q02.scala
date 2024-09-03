def calculateSquare(list: List[Int]): List[Int] = {
  list.map((x: Int) => x * x)
}

def main(args: Array[String]): Unit = {
    print("Enter a list of numbers:")
    val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

    println(calculateSquare(list))
}