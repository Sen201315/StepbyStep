package com.staticvars.stepbystep.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.staticvars.stepbystep.R;
import com.staticvars.stepbystep.model.Milestone;
import com.staticvars.stepbystep.model.Status;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class MilestoneArrayAdapter extends ArrayAdapter<Milestone>{

	private Context _Mscontext;
	private List<Milestone> msobjects;
	CheckBox chkmilestonechk;
	TextView txtmilestonetitle;
	TextView txtmilestonedeadline;
	TextView txtmilestonestartdate;
	
	public MilestoneArrayAdapter(Context context, int textViewResourceId,
			List<Milestone> objects) {
		super(context, textViewResourceId, objects);
		this._Mscontext=context;
		this.msobjects=objects;
		
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return super.getCount();
	}


	@Override
	public Milestone getItem(int position) {
		// TODO Auto-generated method stub
		return msobjects.get(position);
	}


	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Milestone milestone=msobjects.get(position);
		
		LayoutInflater inflator=(LayoutInflater) _Mscontext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE); 
		if(convertView==null)
			convertView=inflator.inflate(R.layout.milestone_list_row, null);
			
			initializeviews(convertView);
			if(milestone.getCurrentStatus()==Status.COMPLETED){
				chkmilestonechk.setChecked(true);
				
			}
			else
				chkmilestonechk.setChecked(false);
			
			
			txtmilestonetitle.setText(milestone.getMStitle());
			Calendar cal=milestone.getMSdeadline();
			txtmilestonedeadline.setText(new SimpleDateFormat("dd MMM yyyy hh:mm a").format(cal.getTime()));
			
			
			
		
		
		return convertView;
	
	}


	private void initializeviews(View convertView) {
		// TODO Auto-generated method stub
		
		chkmilestonechk=(CheckBox)convertView.findViewById(R.id.Milestonecheckbox);
		txtmilestonetitle=(TextView) convertView.findViewById(R.id.Milestonetitle);
		txtmilestonedeadline=(TextView) convertView.findViewById(R.id.MilestoneDeadline);
		txtmilestonestartdate=(TextView) convertView.findViewById(R.id.MilestoneStartdate);
	}

	
	
	
}
