```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = value
}

val myInt = new MyClass(10)
val myString = new MyClass("Hello")

myInt.myMethod // works fine
myString.myMethod // throws an implicit conversion error
```