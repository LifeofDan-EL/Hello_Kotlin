package Aquarium


//The class is a property with a String for the name of the spice, and a String for the level of spiciness
//Set the name to curry and the spiciness to mild
//Using a String for spiciness is nice for users, but not useful for calculations.
//Add a heat property to your class with a getter that returns a numeric value for spiciness.
//Use a value of 5 for mild
//Create an instance of SimpleSpice and print out its name and heat

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat : Int
    get() {return 5}
}

fun main() {

    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
}