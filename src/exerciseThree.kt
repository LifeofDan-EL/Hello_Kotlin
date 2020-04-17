

fun main(array: Array<String>) {

    println(whatShouldIDoToday("happy","sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature >35

fun isSadRainyCold(mood: String, weather: String, temperature: Int)=
    mood == "sad" && weather == "rainy" && temperature == 0

fun  isHappySunny (mood: String, weather: String) =
    mood == "Happy" && weather == "Sunny"

fun whatShouldIDoToday(
    mood : String,
    weather: String = "sunny",
    temperature : Int = 24
) : String{


    return when{

       isVeryHot(temperature) -> "Go for a walk"
       isSadRainyCold(mood,weather,temperature) -> "stay in bed"
        isHappySunny(mood,weather) -> "Go for a walk"
        else -> "Stay at home and read."

    }

}