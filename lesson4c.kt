fun main() {
    // functions with parameters
    // parameters are inputs that get passed as arguments when invoking a function
    // Note: For parameters you must specify their data type.

    fun greeting (name: String) {
        println("Hello $name, Hope you had a good day?")
    }    
    // When the function is invoked, you pass a given name as an argument
    greeting("Jeremiah")
    greeting("Jaden")

    println("=============================")
    // Below is an example of a function that is able to calculate the BMI of a person
    fun BMI (weight: Double, height: Double){
        val answer = weight / (height * height)

        println("The BMI of the person is:" + answer)
    }

    BMI(69.5, 1.732)
    BMI(58.6, 1.87)

    // Create a function that accepts parameters and checks whether a given number is odd or even
    println("=============================")
    fun number (num: Int){
        if( num % 2 == 0){
            println("This is an even number")
        }
        else{
            println("This is an odd number")
        }
    }

    number(4)
}


// Create a function that is able to calculate the compound interest of a person