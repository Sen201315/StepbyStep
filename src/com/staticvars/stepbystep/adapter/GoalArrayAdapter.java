package com.staticvars.stepbystep.adapter;

import java.util.Calendar;
import java.util.List;

import com.staticvars.stepbystep.R;
import com.staticvars.stepbystep.R.drawable;
import com.staticvars.stepbystep.R.id;
import com.staticvars.stepbystep.R.layout;
import com.staticvars.stepbystep.model.Goal;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class GoalArrayAdapter extends ArrayAdapter<Goal>{

	private Context context;
	private List<Goal> Goalobjects;
	public GoalArrayAdapter(Context context, int ViewResourceId,
			List<Goal> objects) {
		super(context, ViewResourceId, objects);
		
		this.context=context;
		this.Goalobjects=objects;
		// TODO Auto-generated constructor stub
	}
	
	
	public Goal getItem(int position){
		return Goalobjects.get(position);
		
	}
	@Override
	public int getCount(){
		
		return Goalobjects.size();
	}
	
	
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}


	@SuppressWarnings("deprecation")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		Goal goal=Goalobjects.get(position);
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if(convertView==null)
			convertView=inflater.inflate(R.layout.goal_list_row, null);
		ImageView ImgPriority=(ImageView)convertView.findViewById(R.id.goalpriroity);
		TextView TxtGoalTitle=(TextView)convertView.findViewById(R.id.goaltitle);
		ProgressBar PrgbarGoalProgress=(ProgressBar)convertView.findViewById(R.id.goalprogress);
		TextView TxtRole=(TextView)convertView.findViewById(R.id.goalrole);
		TextView TxtDeadline=(TextView)convertView.findViewById(R.id.goaldeadline);
		TextView TxtStepscompleted=(TextView)convertView.findViewById(R.id.stepscompleted);
		
		
		String goalpriority=goal.getGoalPriority().toLowerCase();
		int priority_imgname=getPriorityImage(goalpriority);
		if(priority_imgname>0){
			
			ImgPriority.setImageResource(priority_imgname);
		}
		else{
			ImgPriority.setImageResource(R.drawable.ic_home);
		}
		
		TxtGoalTitle.setText(goal.getGoalTitle());
		TxtRole.setText(goal.getGoalrole());
		if(!(goal.getDeadline()==null))// check for null deadlines for Daily tasks
		{
			TxtDeadline.setText(goal.getDeadline().toString());
		}else{TxtDeadline.setText("");}// assign Empty Space for null deadlines
			
		
		TxtStepscompleted.setText(goal.getCompleted_milestones()+"/"+goal.getTot_milestones());
		PrgbarGoalProgress.setMax(100);
		PrgbarGoalProgress.setProgress((int)goal.getGoalProgresspercent());
		
		
		return convertView;
		
		
		
	}


	private int getPriorityImage(String goalpriority) {
		// TODO Auto-generated method stub
		
		int priority_imgname=0;
		if(goalpriority.equals("high"))
		{
			
			priority_imgname=R.drawable.high;
		}
		if(goalpriority.equals("normal"))
		{
			priority_imgname=R.drawable.normal;
		}
		if(goalpriority.equals("low"))
		{
			priority_imgname=R.drawable.low;
		}
		return priority_imgname;
		
	}

	
	

}
