fun main() {
    // for loop 
    // It is used to execute a block of code/ statement a number of times until a condition is met.

    for(number in 1..10){
        println("The count is: $number")
    }

    println("=========================")

    //Create a for loop that is able to print from 50 to 65.

    for(num in 50..65){
        println("The count is: $num")
    }

    println("=========================")
    // How to increment on the for loop by use of steps.
    for(x in 20..40 step 2){
        println(x)
    }

    println("=========================")
    // Below we find the odd number in the given range
    for(y in 20..40){
        if(y % 2 != 0){
            println(y)
        }
    }

    println("==========================")
    // By use of a for loop; generate the multiplication table for 5 from 1 to 5.
    for(a in 1..5){
        val product = 5 * a
        println("5 * $a = $product")
    }

    println("==========================")
    // Create a program that is able to find the factorial of number 5
    var factorial = 1

    for (i in 1..5){
        factorial = factorial * i
        println(factorial)
    }
    println("Factorial of 5 is $factorial")
}

// Difference between local variables and global variables.