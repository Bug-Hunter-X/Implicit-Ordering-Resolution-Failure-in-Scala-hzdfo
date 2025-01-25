```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

import scala.math.Ordering.String

val myInt = new MyClass(10)
val myString = new MyClass("Hello")

myInt.myMethod // works fine
myString.myMethod // Now works correctly
```