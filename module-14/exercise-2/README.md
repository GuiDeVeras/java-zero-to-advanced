Exercise 2
	Write a program to read the data of a bank account and then perform a withdrawal on this bank account, showing the new balance. A withdrawal cannot occur either if there is no balance in the account, or if the withdrawal amount exceeds the account's withdrawal limit. Implement the bank account according to the project below:  

UML Class Diagram Elements

    Account (Class)

        - number : Integer

        - holder : String

        - balance : Double

        - withdrawLimit : Double

        + deposit(amount : Double) : void

        + withdraw(amount : Double) : void
