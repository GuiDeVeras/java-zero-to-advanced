Exercise 1
	Write a program to read the path of a .csv file containing data of sold items. Each item has a name, unit price, and quantity, separated by commas. You must generate a new file named "summary.csv", located in a subfolder named "out" created from the original folder of the source file, containing only the name and the total value for that item (unit price multiplied by quantity), as shown in the example.
Example

Source file (in.csv):

	TV LED,1290.99,1
	Video Game Chair,350.50,3
	Iphone X,900.00,2
	Samsung Galaxy 9,850.00,2

Output file (out/summary.csv):

	TV LED,1290.99
	Video Game Chair,1051.50
	Iphone X,1800.00
	Samsung Galaxy 9,1700.00
