import java.util.*

fun main(args: Array<String>){
    //usage of argument
    println("Hello, ${args[0]}")
    feedTheFish()
}



//A function with data types passed through it, it is a boolean function
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20 ) : Boolean{


    //Here it returns the boolean logic after checking the conditions
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) ->  true
        isSunday(day) -> true
        else -> false
    }
}
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

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

    dirtyProcessor()
}

fun randomDay() : String {
    //An array list of Days of the week
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // it returns the array week, using the Random library and 7 as the boundary of randomization
    return week[Random().nextInt(7)]

}

  // We pass the argument of day to the fishfood
fun fishFood(day : String) : String{

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }

}

var dirty = 20

//This is any function that takes an Int and returns an Int

val waterFilter: (Int) -> Int = {dirty -> dirty /2}
fun feedFish(dirty: Int) = dirty + 10

//It takes two parameters,an Int and a function of Int to Int
fun updateDirty(dirty: Int, operation: (Int) -> Int) : Int{
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)

}
