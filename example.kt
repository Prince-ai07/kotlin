fun main() {
    // By use of for loop, create an array of 7 counties and loop through them.
    val counties = arrayOf("Nairobi", "Mombasa", "Nakuru", "Kisumu", "Kakamega", "Narok", "Kiambu")

    // println(counties.contentToString())
    //for(x in counties){
    //    println(x)
   // }
         
    for (index in counties.indices) {
        if(index == 0 || index == 2){
            print("${counties[index]} ")
        }
    }
    
}