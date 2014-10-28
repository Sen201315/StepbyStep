package com.staticvars.stepbystep;


import java.util.List;

import com.staticvars.stepbystep.adapter.GoalArrayAdapter;
import com.staticvars.stepbystep.model.Goal;
import com.staticvars.stepbystep.model.Goaldata;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class GoalList extends ListFragment {
	
	public GoalList(){}
	
	List<Goal> goalslist=new Goaldata().getGoladata();
	


	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	
		FragmentTransaction ft= getFragmentManager().beginTransaction();
		ft.replace(R.id.frame_container, new MilestoneView());
		ft.addToBackStack("GoalsList");
		ft.commit();
		getActivity().setTitle(goalslist.get(position).getGoalTitle());
		
	
	}





	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		GoalArrayAdapter adapter=new GoalArrayAdapter(getActivity(), R.layout.goal_list_row, goalslist);
		
		setListAdapter(adapter);
		
		
	}





	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		getActivity().getActionBar().setTitle("Goal");
		
		super.onResume();
		
	}





	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_viewgoal, container, false);
         
        return rootView;
    }
}
