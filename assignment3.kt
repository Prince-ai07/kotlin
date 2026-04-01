fun main() {
    val points = 2000

    if(points>=0 && points<=100){
        println("You do not qualify")
    }
    else if(points>=101 && points<=400){
        println("You Win a Smartphone")
    }
    else if(points>=401 && points<=1000){
        println("You win a laptop")
    }
    else if(points>1000){
        println("You win a trip to Canada")
    }
    else{
        println("Invalid points")
    }
    
}