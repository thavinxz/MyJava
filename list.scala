/* @Author Falcon
 * @Created Sun 24 Jun 2018 3:28PM
 */

object list {
  def main(args: Array[String]): Unit = {
    var fruit1 = List("Banana", "apple", "Grape")
    println(fruit1)
    var fruit2= List("strawberry", "mango")
    var fruits = fruit1:::fruit2
    println(fruits)
    var x = fruits.slice(2, 5)
    println(x)
    var (l, r) = fruits.splitAt(3)
    println("Left side list: "+l)
    println("Right side list: "+r)
  }
}
