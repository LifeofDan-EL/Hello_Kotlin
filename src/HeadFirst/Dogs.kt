package HeadFirst

//The class constructor doesn't have an initial weight and breed value
class Dog(val name: String,
          weight_param: Int,
          breed_param: String) {

    // Initializes as the code is compiled
    init {
        print("Dog $name has been created. ")
    }

    // We add an array property activities which is part of the class
    var activities = arrayOf("Walks")

    // We initialize the breed name and add the function to make the breed name to be capitalized
    val breed = breed_param.toUpperCase()

    // Initializes as the code is compiled
    init {
        println("The breed is $breed.")
    }

    // The setter sets the weight property if the value is above 0
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    // A getter to get the value of weight in Kilograms
    val weightInKgs: Double
        get() = weight / 2.2

    // A method to for barking
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {

    // We make a variable with property of the class
    val myDog = Dog("Fido", 70, "Mixed")

    // Accesses the bark function
    myDog.bark()

    // Updates the weight to be 75
    myDog.weight = 75

    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

    // Print function that loops through the items in the activities array
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }

    // An array with two Dog objects which have their own objects.
    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))

    // Updates the items in the second dog array
    dogs[1].bark()
    dogs[1].weight = 15

    // Prints the items in the second dog array
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}