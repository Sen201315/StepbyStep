package com.staticvars.stepbystep.model;

import java.util.Calendar;
import java.util.List;

public class Milestone {

	private int _Mid;
	private String MStitle;
	private Status CurrentStatus;
	private Calendar MSdeadline;
	
	
	public Milestone(int _Mid, String mStitle, Status currentStatus,
			Calendar mSdeadline) {
	
		this._Mid = _Mid;
		MStitle = mStitle;
		CurrentStatus = currentStatus;
		MSdeadline = mSdeadline;
	}

	public Milestone() {

		this._Mid = 0;
		MStitle = null;
		CurrentStatus = Status.NOT_STARTED;
		MSdeadline = null;
		
	}

	public int get_Mid() {
		return _Mid;
	}

	public void set_Mid(int _Mid) {
		this._Mid = _Mid;
	}

	public String getMStitle() {
		return MStitle;
	}

	public void setMStitle(String mStitle) {
		MStitle = mStitle;
	}

	public Status getCurrentStatus() {
		return CurrentStatus;
	}

	public void setCurrentStatus(Status currentStatus) {
		CurrentStatus = currentStatus;
	}

	public Calendar getMSdeadline() {
		return MSdeadline;
	}

	public void setMSdeadline(Calendar mSdeadline) {
		MSdeadline = mSdeadline;
	}

	

	 
	
	
	
}
