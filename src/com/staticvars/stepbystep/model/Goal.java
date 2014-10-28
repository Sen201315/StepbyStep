package com.staticvars.stepbystep.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.os.Bundle;

import com.staticvars.stepbystep.MilestoneView;

public class Goal {
	private int _goalid;
	private String GoalTitle;
	private String GoalPriority;
	private String Goalrole;
	private float GoalProgresspercent;
	private Date Deadline;
	private int Tot_milestones;
	private int completed_milestones;
	
	private List<Milestone> goalmilestoes=new ArrayList<Milestone>();
	
	
	
	
	
public Goal(String goalTitle, String goalPriority, String goalrole,
			Date deadline, int tot_milestones,
			int completed_milestones) {
		
		GoalTitle = goalTitle;
		GoalPriority = goalPriority;
		Goalrole = goalrole;
		Deadline = deadline;
		Tot_milestones = tot_milestones;
		this.completed_milestones = completed_milestones;
		GoalProgresspercent = ((float)completed_milestones/tot_milestones)*100;
	}



public Goal(){
	

	GoalTitle = null;
	GoalPriority = null;
	Goalrole = null;
	GoalProgresspercent = 0;
	Deadline = null;
	Tot_milestones = 0;
	this.completed_milestones = 0;
}

public String getGoalTitle() {
		return GoalTitle;
	}





	public void setGoalTitle(String goalTitle) {
		GoalTitle = goalTitle;
	}





	public String getGoalPriority() {
		return GoalPriority;
	}





	public void setGoalPriority(String goalPriority) {
		GoalPriority = goalPriority;
	}





	public String getGoalrole() {
		return Goalrole;
	}





	public void setGoalrole(String goalrole) {
		Goalrole = goalrole;
	}





	public float getGoalProgresspercent() {
		return GoalProgresspercent;
	}





	public void setGoalProgresspercent(int totmilesotnes,int completedmilestones) {
		GoalProgresspercent = ((float)completedmilestones/totmilesotnes)*100;
	}





	public Date getDeadline() {
		return Deadline;
	}





	public void setDeadline(Date deadline) {
		Deadline = deadline;
	}





	public int getTot_milestones() {
		return Tot_milestones;
	}





	public void setTot_milestones(int tot_milestones) {
		Tot_milestones = tot_milestones;
	}





	public int getCompleted_milestones() {
		return completed_milestones;
	}





	public void setCompleted_milestones(int completed_milestones) {
		this.completed_milestones = completed_milestones;
	}


	public Bundle toBundle(){
		
		Bundle b=null;
		
		return b;
	}




}
