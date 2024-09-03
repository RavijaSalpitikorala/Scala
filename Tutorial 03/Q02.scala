object Q02 {
    def filterList(l: List[String]): List[String] = {
        l.filter(_.length > 5)
    }

    def main (args: Array[String]): Unit = {
        var list = scala.io.StdIn.readLine("Enter the string : ")
        val l = list.split(" ").toList
        println(filterList(l))
    }
}