package HeadFirst

class Wolfa {
    var hunger = 10
    val food = "meat"

    fun eat(){
        println("The wolf is eating $food")
    }
}

class MyWolf{
    var wolfa: Wolfa? = Wolfa()

    fun myFunction() {
        wolfa?.eat()
    }
}

fun getAlphaWolf() : Wolfa? {
    return Wolfa()
}

fun main(){
    var w: Wolfa? = Wolfa()

    if (w != null){
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = MyWolf()
    myWolf?.wolfa?.hunger = 8
    println("The value of myWolf?.wolfa?.hunger is ${myWolf?.wolfa?.hunger}")

    var myArray = arrayOf("Hi","Hello", null)
    for (item in myArray){
        item?.let { println(it) }
    }

    getAlphaWolf()?.let { it.eat() }

    w = null
    var z = w!!.hunger

}