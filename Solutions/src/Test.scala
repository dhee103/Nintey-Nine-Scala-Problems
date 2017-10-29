object Test {
  def main(args: Array[String]): Unit = {
    val lst: List[Int] = List(1, 2, 3)
    val inst: Problems = new Problems
    println(lst)
    println(inst.last(lst))
    println(inst.reverse(lst))
  }
}
