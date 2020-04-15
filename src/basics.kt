import kotlin.math.pow

fun main() {


    // String Concatenation Template
   var fish1  = "trout"
   var fish2 = "haddock"
    var fish3 = "snappec"
    println("I like to eat $fish1 and $fish2 but not $fish3" )

   // If you start with 2 fish, and they breed twice, producing 71 offspring the first time,
    // and 223 the second time, and then 13 fishes are swallowed by hungry moray eel, how many fishes do you have left?
    //How many aquariums will you be needing if you can put 30 fish per aquarium
   var result = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println(result)

    //Create a String variable rainbowColour, set its colour value, then change it
    var rainbowColour = "red"
    rainbowColour = "blue"

    println(rainbowColour)

    //Create a String blackColour whose value cannot be changed once assigned. Try changing it anyways
    val blackColour = "black"

    //Making nullable
    var greenColour = null
    var blueColour : Int? = null

   var fishname = "Herringjknionnonuvytf"

    when (fishname.length){
        0 -> println("error")
        in 3..12 -> println("Good fish name")
        else ->  println("OK fish name")
    }

    //Manipulating array
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    myList.add(2, "geisha")
    println(myList)

    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants,7, 20, 39)

    //Simple array
    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))

    println(swarm)
    println(bigSwarm)

    //accessing elements
    for (element in swarm) println(element)

    //getting element and the index
    for ((index, element) in swarm.withIndex()){
        println("Fish at $index is $element")
    }
        //Printing using ranges
    for (i in 'b'..'d') println(i)
    for (i in 1..5) println(i)
    //range downwards
    for (i in 5 downTo 1) println(i)
    //Incremental range
    for (i in 3..10 step 2) println(i)

    val array = Array(7){
        1000.0.pow(it)
    }

    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte", "exabyte")

    for ((i, value) in array.withIndex()){
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}
