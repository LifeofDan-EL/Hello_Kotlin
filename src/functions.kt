import java.util.*

fun main(args: Array<String>){
    //usage of arguement
    println("Hello, ${args[0]}")

    feedTheFish()
}

fun feedTheFish (){
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish will eat $food")
}
fun randomDay() : String {
    //An array list of Days of the week
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // it returns the array week, using the Random library and 7 as the boundary of randomization
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String{

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" ->  "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" ->  "lettuce"
        "Sunday" ->  "plankton"
        else -> "fasting"
    }
}