

fun main(){

    val spices = listOf("curry", "pepper",
        "cayenne", "ginger", "red curry",
        "green curry", "green pepper",
        "c justtotest e", "shombo",
        "atarodo","iruoma")


    // Sorts curry by String lengths
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    //Filters the list and prints ones starting with 'c' and ending with 'e'
    println(spices.filter {it [0] == 'c' && it[it.lastIndex] == 'e' })
    println(spices.filter { it.startsWith('c')}.filter { it.endsWith('e') })
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })

    //Filters by first 3 items by 'c'
    println(spices.take(3).filter { it.startsWith('c') })
}