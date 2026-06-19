Read the data of an order with N items (N provided by the user). Then, show a summary of the order as shown in the example (next page). Note: the order's instant must be the system's current instant: new Date()
UML Class Diagram Elements
1. Order (Class)

    Attributes:

        - moment : Date

        - status : OrderStatus

    Methods:

        + addItem(item : OrderItem) : void

        + removeItem(item : OrderItem) : void

        + total() : Double

    Associations:

        Has a composition relationship with OrderItem (* - items)

        Has a 1-to-1 relationship with Client (1 - client)

2. OrderItem (Class)

    Attributes:

        - quantity : Integer

        - price : Double

    Methods:

        + subTotal() : Double

    Associations:

        Has a unidirectional association with Product (1 - product)

3. Product (Class)

    Attributes:

        - name : String

        - price : Double

4. Client (Class)

    Attributes:

        - name : String

        - email : String

        - birthDate : Date

5. OrderStatus (Enumeration)

    <<enum>>

        - PENDING_PAYMENT : int = 0

        - PROCESSING : int = 1

        - SHIPPED : int = 2

        - DELIVERED : int = 3
