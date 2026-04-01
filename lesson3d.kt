fun main() {
    // Arrays
    // An array is a collection of items that are related in nature
    // To access an item of an array, we use the index starting from index 0
    // To create an array we use the arrayOf function/method

    val numbers = arrayOf(25, 54, 54, 32, 74, 36, 74, 31)

    println(numbers.contentToString())

    // accessing items of an array by use of index
    println("Item on index 3 is: " + numbers[3])
    
}

// Assignment, by use of for loop, create an array of 7 counties and loop through them.