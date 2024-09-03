def filterEvenNumbers(list: List[Int]): List[Int] = {
  list.filter((x: Int) => x % 2 == 0)
}

def main(args: Array[String]): Unit = {
    print("Enter a list of numbers:")
    val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

    println(filterEvenNumbers(list))
}