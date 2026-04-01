// Using if or when statements, create a program to find if given year is leap or not 
fun main() {
    val year = 2100

    when {
        (year % 400 == 0) -> println("Year is a leap year")
        (year % 100 == 0) -> println("Year is not a leap year")
        (year % 4 == 0) -> println("Year is a leap year")
        else -> println("Year is not a leap year")
    }
}

