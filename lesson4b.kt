fun main() {
    // Below is a function that is able to add two numbers
    fun addition () {
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        println("The sum of the numbers is: $sum")
    }
    addition()
    println("==================================")
    // Create a function that is able to multiply 3 numbers
    fun product () {
        val num1 = 2
        val num2 = 3
        val num3 = 4
        val product = num1 * num2 * num3

        println("The product of the numbers is: $product")
    }
    product()


    println("===================================")
    // Given two numbers, create a function that is able to find the largest and the smallest of the numbers
    fun question () {
        val a = 5
        val b = 8
        if( a > b ){
            println("The largest number is $a while the smallest number is $b")
        }
        else{
            println("The largest number is $b while the smallest number is $a")
        }

    }
    question()

    println("=================================")
    // Given 179 minutes, create a function that is able to convert the said minutes into hours and to show the remainder of the minutes
    fun convertedMinutes() {
        val minutes = 179
        val hours = minutes/60
        val remainder = minutes % 60
        println("$minutes minutes is equal to $hours hours $remainder minutes")

    }
    convertedMinutes()
    
}