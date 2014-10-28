package com.staticvars.stepbystep.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Goaldata {

	
	private List<Goal> goladata=new ArrayList<Goal>();

	public List<Goal> getGoladata() {
		return goladata;
	}
	
	@SuppressWarnings("deprecation")
	public Goaldata(){
		
		goladata.add(new Goal("Be President", "High", "Patriot", new Date(2025, 12, 13), 15, 3));
		goladata.add(new Goal("Survive Zombie Attact", "normal", "Survivors", null, 13, 10));
		goladata.add(new Goal("Kick Dhanwani's Ass", "low", "Very Personal", new Date(2014, 10, 27), 2, 1));
		goladata.add(new Goal("Be President", "High", "Personal", new Date(2025, 12, 13), 15, 3));
		goladata.add(new Goal("Be President", "High", "Personal", new Date(2025, 12, 13), 15, 3));
		goladata.add(new Goal("Be President", "High", "Personal", new Date(2025, 12, 13), 15, 3));
		goladata.add(new Goal("Be President", "High", "Personal", new Date(2025, 12, 13), 15, 3));
		
	}
	
	
}
