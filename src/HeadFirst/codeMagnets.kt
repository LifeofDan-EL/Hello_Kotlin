package HeadFirst/*Somebody used fridge magnets to write a useful new HeadFirst.main function that
prints the String “YabbaDabbaDo”. Unfortunately, a freak kitchen whirlwind
has dislodged the magnets. Can you piece the code back together again?
page 77
 */
fun main(){
    var x = 1

  while ( x < 3) {

      print(if (x == 1) "Yab" else "Dab")
      print("ba")
      x = x + 1
  }
 if (x == 3) print("Do")
}