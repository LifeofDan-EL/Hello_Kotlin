import java.util.*

fun main(args: Array<String>){
    //usage of arguement
    println("Hello, ${args[0]}")

    feedTheFish()
}

fun feedTheFish (){
    val day = randomDay()
    val food = "pellets"

    println("Today is $day and the fish will eat $food")
}
fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}