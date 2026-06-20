Exercise 2
	Write a program to read the data of N products (N provided by the user). At the end, show the price tag of each product in the same order they were entered.

	Every product has a name and a price. Imported products have a customs fee, and used products have a manufacture date. These specific data must be added to the price tag as shown in the example (next page). For imported products, the customs fee must be added to the final price of the product.

	Please implement the program according to the project alongside.
UML Class Diagram Elements

    Product (Base Class)

        - name : String

        - price : Double

        + priceTag() : String

    ImportedProduct (Subclass / Derived Class)

        (Inherits from Product)

        - customsFee : Double

        + priceTag() : String

        + totalPrice() : Double

    UsedProduct (Subclass / Derived Class)

        (Inherits from Product)

        - manufactureDate : Date

        + priceTag() : String
