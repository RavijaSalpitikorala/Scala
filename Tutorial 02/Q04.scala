object pricing{
    def main(args:Array[String]): Unit= {
        println("The best ticket price is : " + outcome())
    }
    
    def outcome(): Int = {
        val cost = 500
        var price = 15
        var attend = 120

        var profit1 = 0
        var check_profit1 = 0
        var best_price1 = 0

        for(i <- 0 to 6){
            check_profit1 = (price + i * 5) * (attend - i * 20) - (cost + (attend - i * 20) * 3)
            if (check_profit1 > profit1){
                profit1 = check_profit1
                best_price1 = (price + i * 5)
            }
        }

        var check_profit2 = 0
        var profit2 = 0
        var best_price2 = 0

        for(i <- 0 to 3){
            check_profit2 = (price - i * 5) * (attend + i * 20) - (cost + (attend + i * 20) * 3) 
            if (check_profit2 > profit2){
                profit2 = check_profit2
                best_price2 = (price - i * 5)
            }
        }

        if (best_price2 > best_price1){
            best_price2
        }
        else {
            best_price1
        }
    }
}