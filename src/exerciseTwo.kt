

fun main (args: Array<String>) {
//    var fortune: String
//    for (i in 1..10){
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is : $fortune")
//        if (fortune.contains("Take it easy"))break

//      Using a repeat loop
//    var fortune: String = ""
//    repeat(10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is : $fortune")
//        if (fortune.contains("Take it easy")) ;
//    }

        var fortune: String = ""
        while (!fortune.contains("Take it easy")){
            fortune = getFortune(getBirthday())
            println("\nYour fortune is : $fortune")}

}

  //Gets birthday from the user
fun getBirthday() : Int{
    print("\nEnter your birthday")
    return readLine()?.toIntOrNull() ?: 1
}

//Pass the result from getBirthday to getFortune using an Integer argument
fun getFortune(birthday : Int) : String{

    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Take it easy and enjoy life",
        "Treasure your friends because they are your greatest fortune")


    // The when statement assigns some fortunes based on my conditions listed
    val index = when (birthday) {
        in 1..7 -> 4
            28, 3 -> 2

        //Returns the calculated fortune
            else ->  birthday.rem(fortunes.size)
    }
    return  fortunes[index]
}