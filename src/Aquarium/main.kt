package Aquarium

fun main(){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
             "Height: ${myAquarium.height} ")

    myAquarium.height = 80
    println("New Height is : ${myAquarium.height}cm")
    println("Volume: ${myAquarium.volume} litres")
}
