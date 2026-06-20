Exercise 1
	A company has both regular and outsourced employees. For each employee, it is required to register their name, hours worked, and value per hour. Outsourced employees also have an additional charge.

The payment for employees corresponds to the value per hour multiplied by the hours worked, and outsourced employees also receive a bonus corresponding to 110% of their additional charge.

Write a program to read the data of N employees (N provided by the user) and store them in a list. After reading all the data, show the name and payment of each employee in the same order they were entered.

Build the program according to the project alongside. See example on the next page.
UML Class Diagram Elements

    Employee (Base Class)

        - name : String

        - hours : Integer

        - valuePerHour : Double

        + payment() : Double

    OutsourcedEmployee (Subclass / Derived Class)

        (Inherits from Employee)

        - additionalCharge : Double
