Exercise 1
	Let's create a method to return the sum of the areas of a list of shapes.
	
UML Diagram:

    <<interface>> Shape

        + area() : double

    Rectangle (implements Shape)

        - width : double

        - height : double

    Circle (implements Shape)

        - radius : double
