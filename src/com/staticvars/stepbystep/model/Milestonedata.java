package com.staticvars.stepbystep.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Milestonedata {

	private List<Milestone> msdata=new ArrayList<Milestone>();
	
	
	public List<Milestone> getMilestoneData(){
		
		return msdata;
	}


	public Milestonedata() {
		
		
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(456, "Make APP UI", Status.COMPLETED, new GregorianCalendar(2014, 10, 11)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		msdata.add(new Milestone(1234, "Join politics", Status.NOT_STARTED, new GregorianCalendar(2014, 9, 26)));
		
	}
	
	
	
	
}
