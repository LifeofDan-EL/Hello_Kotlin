package Aquarium



class Spice (val name : String, val spiciness : String = "mild"){

    val heat : Int
    get() {
        return when (spiciness){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }
    }
}


val spices1 = listOf(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "mild"),
    Spice("ginger", "mild"),
    Spice("red curry", "medium"),
    Spice("green curry", "mild"),
    Spice("hot pepper","extremely spicy")


)

fun main() {
//
//    val spice : Spice("cayenne", )

    val spicelist = spices1.filter { it.heat < 5 }

    println(listOf(spicelist))
}