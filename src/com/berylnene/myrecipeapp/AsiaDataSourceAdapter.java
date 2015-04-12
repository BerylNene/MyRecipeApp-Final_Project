package com.berylnene.myrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AsiaDataSourceAdapter extends BaseAdapter {
	private Context myContext;
	private LayoutInflater myFlater;
	private AsiaDataSource myDataSource;
	
	public AsiaDataSourceAdapter(Context ctx,AsiaDataSource as){
		myContext = ctx;
		myDataSource = as;
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
			convertView = myFlater.inflate(R.layout.asia_item_layout, parent, false);
			thumbnail = (ImageView)convertView.findViewById(R.id.list_thumb1);
			thumbnail.setImageResource(myDataSource.getPhotoPool().get(position));
			name = (TextView)convertView.findViewById(R.id.list_text1);
			name.setText(myDataSource.getDishesPool().get(position));
			return convertView;
	}
}

