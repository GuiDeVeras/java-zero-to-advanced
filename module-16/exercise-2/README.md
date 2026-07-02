Exercise 2
	A company wishes to automate the processing of its contracts. Processing a contract consists of generating the installments to be paid for that contract, based on 	the desired number of months.  

	The company uses an online payment service to process installment payments. Online payment services typically charge monthly interest as well as a payment fee. For now, the service contracted by the company is Paypal, which applies simple interest of 1% to each installment, plus a payment fee of 2%.  

	Write a program to read the data of a contract (contract number, contract date, and total contract value). Next, the program must read the number of months for the contract installment plan, and then generate the installment records to be paid (date and value), with the first installment to be paid one month after the contract date, the second installment two months after the contract, and so on. Display the installment data on the screen
	


Domain Layer Design (Entities)

    Contract (Class)

        - number : Integer

        - date : Date

        - totalValue : Double

        Relationship: Has many (*) installments

    Installment (Class)

        - dueDate : Date

        - amount : Double

Service Layer Design

    ContractService (Class)

        + processContract(contract : Contract, months : Integer) : void

        Relationship: Depends on OnlinePaymentService

    OnlinePaymentService (Interface)

        <<interface>>

        + paymentFee(amount : Double) : Double

        + interest(amount : Double, months : Integer) : Double

    PaypalService (Class)

        (Implements OnlinePaymentService)

        + paymentFee(amount : Double) : Double

        + interest(amount : Double, months : Integer) : Double
