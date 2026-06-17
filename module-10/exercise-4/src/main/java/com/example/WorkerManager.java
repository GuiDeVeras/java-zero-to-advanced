package com.example;

import java.util.List;
import java.util.Optional;

public class WorkerManager {
	
	private List<Worker> workers;
	
	
	public WorkerManager (List<Worker> workers) {
		this.workers = workers;
	}
	
	public boolean findId (int id) {
		return workers.stream().anyMatch(x -> x.getId() == id);
	}
	
	public Optional<Worker> findById(int id) {
        return workers.stream().filter(w -> w.getId() == id).findFirst();
    	}
	
}
