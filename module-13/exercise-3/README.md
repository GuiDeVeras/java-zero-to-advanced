Exercise 3
	Write a program to read the data of N shapes (N provided by the user), and then show the areas of these shapes in the same order they were entered."
UML Class Diagram Elements

    Shape (Base Class)

        - color : Color

        + area() : Double

    Rectangle (Subclass / Derived Class)

        (Inherits from Shape)

        - width : Double

        - height : Double

    Circle (Subclass / Derived Class)

        (Inherits from Shape)

        - radius : Double

    Color (Enumeration)

        <<enum>>

        - BLACK : int

        - BLUE : int

        - RED : int
