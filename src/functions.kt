import java.util.*

fun main(args: Array<String>){
    //usage of arguement
    println("Hello, ${args[0]}")

    feedTheFish()
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20 ) : Boolean{
    return true
}

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    day: String
) {
}

fun feedTheFish (){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }

    swim()
}

fun swim(speed: String = "fast"){    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Take it easy and enjoy life",
        "Treasure your friends because they are your greatest fortune")
    println("swimming $speed")
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