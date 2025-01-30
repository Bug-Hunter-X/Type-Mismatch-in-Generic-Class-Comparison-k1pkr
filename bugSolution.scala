```scala
class MyClass[T](val value: T)(implicit ev: T => Ordered[T]) {
  def compare(other: MyClass[T]): Boolean = {
    value == other.value 
  }
}

object MainObject{
  def main(args: Array[String]): Unit = {
    val obj1 = new MyClass[Int](10)
    val obj2 = new MyClass[String]("10")(implicitly[Ordering[String]])
    println(obj1.compare(obj2)) //This will now compile
    //To enable the comparison of other types, provide an implicit Ordering for each type used

    // Example of using it with other types:
    val obj3 = new MyClass[Double](10.0)
    val obj4 = new MyClass[Double](10.0)
    println(obj3.compare(obj4))
  }
}
```