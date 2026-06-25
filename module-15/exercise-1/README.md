Exercise 1
	Write a program to read the data of a hotel reservation (room number, check-in date, and check-out date) and display the reservation data, including its duration in days. Next, read new check-in and check-out dates, update the reservation, and display the reservation again with the updated data. The program must not accept invalid data for the reservation, according to the following rules:

    Reservation changes can only occur for future dates

    The check-out date must be after the check-in date

UML Class Diagram Elements

    Reservation (Class)

        - roomNumber : Integer

        - checkin : Date

        - checkout : Date

        + duration() : Integer

        + updateDates(checkin : Date, checkout : Date) : void
