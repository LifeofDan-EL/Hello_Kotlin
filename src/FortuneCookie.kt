

//A program that returns a fortune message that an be printed

fun main (args: Array<String>){

    //This handles the printing
    println("\nYour fortune is: ${getFortuneCookie()}")


    // Here it runs the program for 10 times and breaks or if it contains "Take it easy"
    var fortune: String

    for (i in 1..10){
        fortune  = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

    getFortuneCookie()
}

    // This functions returns a String
fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well",
        "Today is a good day for exercising restraint",
        "Take it easy and enjoy life",
        "Treasure your friends because they are your greatest fortune")

    print("\nEnter your birthday: ")

        //Reads the user's input and assign it to birthday, ? checks for null and ?: handles the null case.
        //The toIntOrNull, converts a number as a String too an Integer numeric
    var birthday = readLine()?.toIntOrNull() ?: 1

        //Divides the birthday by the number of fortunes, and use the remainder as the index for the fortune to return
    return fortunes[birthday.rem(fortunes.size)]
}
