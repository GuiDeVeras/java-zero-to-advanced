// WorkerManagerTest.java
package com.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WorkerManagerTest {
	@Test
	void findIdReturnsTrueWhenFound() {
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker(1, "Maria", 1000.0));

		WorkerManager manager = new WorkerManager(workers);
		assertTrue(manager.findId(1));
	}

	@Test
	void findIdReturnsFalseWhenNotFound() {
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker(1, "Maria", 1000.0));

		WorkerManager manager = new WorkerManager(workers);
		assertFalse(manager.findId(99));
	}


	@Test
	void findByIdReturnsWorkerWhenFound() {
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker(1, "Maria", 1000.0));

		WorkerManager manager = new WorkerManager(workers);
		assertTrue(manager.findById(1).isPresent());
		assertEquals("Maria", manager.findById(1).get().getName());
	}

	@Test
	void findByIdReturnsEmptyWhenNotFound() {
		List<Worker> workers = new ArrayList<>();
		workers.add(new Worker(1, "Maria", 1000.0));

		WorkerManager manager = new WorkerManager(workers);
		assertFalse(manager.findById(99).isPresent());
	}
}
