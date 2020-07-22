// Somebody used fridge magnets to write a noisy new DrumKit class,
// and a main function that prints the following output:
// ding ding ba-da-bing!
// bang bang bang!
// ding ding ba-da-bing!
// Unfortunately, the magnets have got scrambled.
// Can you piece the code back together again?

package HeadFirst

class DrumKit (var hasTopHat: Boolean, var hasSnare: Boolean){
    // A method that works only if hasShare is true
    fun playSnare(){
        if (hasSnare)
        println("bang bang bang!")
    }
    // A method that works only if hasTopHat is true
    fun playTopHat(){
        if (hasTopHat)
        println("ding ding ba-da-bing!")
    }
}

fun main(){
    // Initializing the object
    val d = DrumKit(true,true)

    // Runs the functions
    d.playTopHat()
    d.playSnare()

    // Sets the hasSnare object to false
    d.hasSnare = false

    // Runs the functions
    d.playTopHat()
    d.playSnare()

}