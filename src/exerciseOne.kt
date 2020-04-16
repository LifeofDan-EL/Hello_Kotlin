import java.util.*

fun main (){

    dayOfWeek()

    // Proves all value has a unit
    val isUnit = println("This is an expression")
    println(isUnit)

    //Kotlin as expression
    val temperature = 100
    val isHot = if (temperature > 50 ) true else false
    println(isHot)

    val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    println(message)

}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "error"
    })
    }