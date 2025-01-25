# Implicit Ordering Resolution Failure in Scala

This example demonstrates an uncommon Scala error related to implicit resolution of the `Ordering` type class.  While implicit conversions are a powerful feature, the absence of an implicit instance can lead to unexpected compilation failures, especially when dealing with different data types.

The `bug.scala` file showcases the problem, and `bugSolution.scala` demonstrates a simple fix.
