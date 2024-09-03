import scala.main
object variables {
    def main(args:Array[String]): Unit = {
        var k , i , j = 2
        var m , n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'
        
        println(+ k+12*m)
        println(+ m/j)
        println(+ n%j)
        println(+ m/j*j)
        println(+ f+10*5+g)
        println(+ (i+1)*n)    //++i won't work in scala
    }
}

// Java supports unary oparators but scala doesn't support unary oparators like x++ , ++x
// In scala all the variables are declared as var but in java we have to declare them acording to there variable type
// In scala variables can't be declared in one line 