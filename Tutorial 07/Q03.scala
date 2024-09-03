def filterPrime(list: List[Int]): List[Int] = {
    list.filter((x: Int) => 
    {
        var isPrime = true
        if (x <= 1) {
            isPrime = false
        }
        else {
            for (i <- 2 to x - 1) {
                if (x % i == 0) {
                    isPrime = false
                }
            }
        }
        isPrime
    })
}

def main(args: Array[String]): Unit = {
    print("Enter a list of numbers:")
    val list = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList

    println(filterPrime(list))
}