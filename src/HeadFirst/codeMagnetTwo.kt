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
}
