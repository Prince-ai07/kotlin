fun main() {
    // looping from a higher number to a lower number by use of a for loop
    // create a program that is able to print from 10 to 1
    for(x in 10 downTo 1){
        println(x)
    }

    println("=======================")
    // Create a program that finds the odd numbers from 20 to 10
    for(i in 20 downTo 10){
        if(i % 2 != 0){
            println(i)
        }
    }    
}