package Aquarium

fun main(){
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
             "Height: ${myAquarium.height} ")

    myAquarium.height = 80

    println("New Height is : ${myAquarium.height}cm")

    println("Volume: ${myAquarium.volume} litres")

    val smallAquarium = Aquarium(length = 20, width =  15, height = 30)
    println("The volume of the small aquarium: ${smallAquarium.volume} litres")

    val myAquarium2 = Aquarium(numberOfFish = 9)

    println("Small Aquarium 2: ${myAquarium2.volume} litres with " +
            "length ${myAquarium2.length} " +
            "width  ${myAquarium2.width} " +
            "height ${myAquarium2.height} ")
}
fun feedFish (fish: FishAction){
    fish.eat()
}

//Implementing Interface
fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}
