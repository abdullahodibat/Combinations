/**
  * Created by abdullahodibat.
  */
object Combinations {

  def main(args: Array[String]): Unit = {
    val input: List[Integer] = List(0, 1, 2, 3, 4)
    println(combinations(input, 3))
  }

  // get combinations of size 'length' from a list of integers
  def combinations(list: List[Integer], length: Int): List[List[Integer]] = {
    if (length > list.size) Nil
    else if (length == 1) list.map(List(_))
    else list match {
      case head :: tail =>
        combinations(tail, length - 1).map(c => head :: c) ::: combinations(tail, length)
      case _ => Nil
    }
  }

}
