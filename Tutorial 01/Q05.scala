object Running {
    
    def main(args: Array[String]): Unit = {
        var ep = easyPace(2)
        var temp = tempo(3)
        println("Total running time : " + (ep + temp + ep))
    }
    def easyPace(x:Int): Int = {
        x * 8
    }
    def tempo(x:Int): Int = {
        x * 7
    }
}