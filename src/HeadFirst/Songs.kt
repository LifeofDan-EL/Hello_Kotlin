package HeadFirst


class Song(val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }
}

fun main(){
    val songOne = Song("Weak","AJR")
    val songTwo = Song("Hand of God", "Jon Bellion")
    val songThree = Song("Someone you loved","Lewis Capaldi")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}
