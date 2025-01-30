```scala
class MyClass[T](val value: T) {
  def compare(other: MyClass[T]): Boolean = {
    value == other.value 
  }
}

object MainObject{
  def main(args: Array[String]): Unit = {
    val obj1 = new MyClass[Int](10)
    val obj2 = new MyClass[String]("10")
    println(obj1.compare(obj2)) //This will result in a compile-time error
  }
}
```