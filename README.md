# Visitor-Pattern
Implementation of Visitor Pattern

Definition:
- Allows for one or more operation to be applied to a set of objects at runtime, decoupling the operations from the object structure.

Used For:
- Used to create an external class that uses data in the other classes.
- To perform operations across a dispate set of objects.
- To decouple some logical code from the elements that you're using as input.

Implementation:
- Our set of elements will be the durations of each movie identified by “minutes”. 
- The values will be pre-determined by the program. 
- We create a general, visitable interface that accepts visitors
- Then, we can modify it to make it more complex with the extra accept method added to allow visitor access to the element.
- On the other hand, we also implement a visitor interface. 
- This deals with the specifics of the output. 
