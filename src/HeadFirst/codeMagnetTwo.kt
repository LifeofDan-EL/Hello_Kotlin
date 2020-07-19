//A working Kotlin program is all scrambled up on the fridge.
// Can you reconstruct the code snippets to make a working
// Kotlin function that produces the following output:
// Fruit = Banana
// Fruit = Blueberry
// Fruit = Pomegranate
// Fruit = Cherry
package HeadFirst


fun main(){
    var x = 0
    val fruit= arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var y: Int


    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x += 1
    }

work()
}

// A short Kotlin program is listed below. When the line
// Do stuff is reached, some objects and variables have been created.
// Your task is to determine which of the variables refer to which objects by the time the
// Do stuff line is reached. Some objects may be referred to more than once.
fun work (){
    val x = arrayOf(0, 1, 2, 3, 4)
    x[3] = x[2]
    x[4] = x[0]
    x[2] = x[1]
    x[1] = x[0]
    x[0] = x[1]
    x[4] = x[3]
    x[3] = x[2]
    x[2] = x[4]

    var y = 0
    while (y < 6){
        println("${x[y]}")
        y += 1
    }
}
