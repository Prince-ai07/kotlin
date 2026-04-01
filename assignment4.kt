import kotlin.math.pow

fun main() {
    // Create a function that accepts parameters that is able to do the convertion of degree celcius into fahrenheit
    fun conversion(celcius: Double){
        val fahrenheit = ((9.0/5 * celcius) + 32)
        println("$celcius degrees celcius is equal to $fahrenheit fahrenheits")
    }
    conversion(25.0)

    println("====================")
    // Create a function that is able to calculate the compound interest of a person
    fun compoundInterest(principal:Double, rate:Double, time:Int){
        val newamount = principal * (1 + (rate/100)).pow(time)
        val interest = newamount - principal
        println("The Compound Interest is $interest Ksh")
    }
    compoundInterest(10000.0, 5.0, 2)
    
}