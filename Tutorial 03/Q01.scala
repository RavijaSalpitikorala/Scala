object Q01 {    
    def main (args: Array[String]) : Unit = {   
      val str:String = scala.io.StdIn.readLine("Enter the string : ")
      println(reverseStr(str))
    }

    def reverseStr(str: String): String = {
      if(str.isEmpty) {
        ""
      }
      else {
        reverseStr(str.tail) + str.head
      }
    }
}