

fun main() {

    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(
    mood : String,
    weather: String = "sunny",
    temperature : Int = 24
) : String{

    return when{

        mood == "happy" && weather == "sunny" -> "Go for a walk"
        else -> "Stay at home and read."

    }

}