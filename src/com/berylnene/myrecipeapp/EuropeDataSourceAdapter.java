package com.berylnene.myrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EuropeDataSourceAdapter extends BaseAdapter {
	private Context myContext;
	private LayoutInflater myFlater;
	private EuropeDataSource myDataSource;
	
	public EuropeDataSourceAdapter(Context ctx,EuropeDataSource es){
		myContext = ctx;
		myDataSource = es;
		myFlater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myDataSource.getDataSourceLength();
	}

	
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView thumbnail;
		TextView name;
		
		
		//to put each recipe and text to each list view
		if(convertView==null)
			convertView = myFlater.inflate(R.layout.europe_item_layout, parent, false);
			thumbnail = (ImageView)convertView.findViewById(R.id.list_thumb4);
			thumbnail.setImageResource(myDataSource.getPhotoPool().get(position));
			name = (TextView)convertView.findViewById(R.id.list_text4);
			name.setText(myDataSource.getDishesPool().get(position));
			return convertView;
	}
}

