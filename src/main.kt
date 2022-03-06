import java.util.*

fun main(){
    //create a function that takes in 4 strings and creates an array out of it
girls()
capital()
score()
//index of 158
    colours("red","blue","black")

}
fun girls(){
    var names = arrayOf("mary","jane","mercy","lucy")
    println(names.contentToString())

}
fun capital(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { country ->
        println(country.capitalize())
    }
    }
fun score(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var adding =(numbers[1]+(numbers[4]))
    println(adding)
    println( numbers.indexOf(158))
    var digit = numbers.sortedArray()
    println(Arrays.toString(digit))

}
fun colours(x: String,Y: String,Z: String): String{
    var design = "$x $Y $Z"
    println(design)
    return design

}




