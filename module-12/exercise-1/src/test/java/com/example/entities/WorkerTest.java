package com.example.entities;

import com.example.entities.enums.WorkerLevel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

	private Worker worker;
    	private Department department;

    	@BeforeEach
    	void setUp() {
		department = new Department("IT");
		worker = new Worker("Maria", WorkerLevel.JUNIOR, 3000.0, department);
    	}

    	@Test
    	void emptyConstructor() {
		Worker empty = new Worker();
		assertNull(empty.getName());
		assertNull(empty.getDepartment());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("Maria", worker.getName());
		assertEquals(3000.0, worker.getBaseSalary());
		assertEquals(department, worker.getDepartment());
	}

    	@Test
    	void setName() {
        	worker.setName("João");
        	assertEquals("João", worker.getName());
    	}

    	@Test
    	void setDepartment() {
        	Department newDept = new Department("Sales");
        	worker.setDepartment(newDept);
        	assertEquals(newDept, worker.getDepartment());
    	}

    	@Test
    	void setBaseSalary() {
		worker.setBaseSalary(5000.0);
		assertEquals(5000.0, worker.getBaseSalary());
    	}

    	@Test
    	void setWorkerLevel() {
		worker.setWorkerLevel(WorkerLevel.SENIOR);
		assertEquals(WorkerLevel.SENIOR, worker.getWorkerLevel());
    	}

    	@Test
    	void addContract() {
		HourContract contract = new HourContract(new Date(), 50.0, 10);
		worker.addContract(contract);
		assertEquals(1, worker.getContracts().size());
    	}

    	@Test
    	void removeContract() {
		HourContract contract = new HourContract(new Date(), 50.0, 10);
		worker.addContract(contract);
		worker.removeContract(contract);
        	assertEquals(0, worker.getContracts().size());
    	}

    	@Test
    	void incomeWithoutContracts() {
		double result = worker.income(2026, 6);
		assertEquals(3000.0, result, 0.001);
    	}

    	@Test
    	void incomeWithMatchingContract() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2026, Calendar.JUNE, 15);
		HourContract contract = new HourContract(calendar.getTime(), 50.0, 10);
		worker.addContract(contract);

		double result = worker.income(2026, 6);
		assertEquals(3500.0, result, 0.001);
    	}

    	@Test
    	void incomeWithNonMatchingMonthContract() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2026, Calendar.JANUARY, 15);
		HourContract contract = new HourContract(calendar.getTime(), 50.0, 10);
		worker.addContract(contract);

		double result = worker.income(2026, 6); 
		assertEquals(3000.0, result, 0.001);
    	}
}
