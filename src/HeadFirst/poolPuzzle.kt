package HeadFirst

import java.lang.reflect.Array.set

class Rectangle(var width: Int, var height: Int) {
    // A getter that says whether a rectangle is square
    val isSquare: Boolean
        get() = (width == height)

    // A getter that calculates the rectangle's area
    val area: Int
         get()  = (width * height)
}
    fun main(args: Array<String>) {
        val r = arrayOf(Rectangle(1, 1), Rectangle(1, 1),
                        Rectangle(1, 1), Rectangle(1, 1))

        // We loop for the 4 items in r array
        for (x in 0..3)
        {
            // Sets the width and height of the rectangle
            r[x].width = (x + 1) * 3
            r[x].height = x + 5


            print("Rectangle $x has area ${r[x].area}. ")
            println("It is ${if (r[x].isSquare) "" else "not "}a square.")
        }
    }