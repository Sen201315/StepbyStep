package com.staticvars.stepbystep;


import java.util.List;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.staticvars.stepbystep.adapter.MilestoneArrayAdapter;
import com.staticvars.stepbystep.model.Milestone;
import com.staticvars.stepbystep.model.Milestonedata;

public class MilestoneView extends ListFragment{
	
	public MilestoneView(){}
	
	List<Milestone> mslist=new Milestonedata().getMilestoneData();

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		View rootview=inflater.inflate(R.layout.fragment_viewmilestones, container,false);
		
		return rootview;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		MilestoneArrayAdapter milestoneadapter=new MilestoneArrayAdapter(getActivity(), R.layout.milestone_list_row, mslist);
		setListAdapter(milestoneadapter);
	}
	
	
	

}
