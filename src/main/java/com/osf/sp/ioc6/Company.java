package com.osf.sp.ioc6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	/*
	 * private Worker w1; private Worker w2;
	 * 
	 * public Company(Worker w1, Worker w2) { this.w1 = w1; this.w2 = w2; }
	 * 
	 * public void startOperate() { w1.goToOffice(); w2.goToOffice(); } public void
	 * operating() { w1.doWork(); w2.doWork(); }
	 */

	private List<Worker> workers;

	@Autowired
	public Company(List<Worker>workers) {
		this.workers = workers;
	}
	
	public void startOperate() {
		for(Worker worker:workers) {
			worker.goToOffice();
		}
	}
	public void operating() {
		for(Worker worker:workers) {
			worker.doWork();
		}
	}
}
