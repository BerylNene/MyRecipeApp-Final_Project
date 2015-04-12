package com.berylnene.myrecipeapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AfricaMainActivity extends Activity {

	private AfricaDataSource ds;
	private ListView recipesListView;
	int itemPosition ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ds = new AfricaDataSource();
		recipesListView = (ListView)findViewById(R.id.listView1);
		recipesListView.setAdapter(new AfricaDataSourceAdapter(this,ds));
		
	

		//setting the onClick event 
	recipesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		 // @Override
		  public void onItemClick(AdapterView<?> parent, View view,
		                 int position, long id){
			  
			// ListView Clicked item index
			     itemPosition = position;
		               
			     
			     //Each List Item onClick goes to the corresponding web page 
			        //to show the user the ingredients and directions for that recipes
		               if(itemPosition==0) {
		  		    	 Uri uri = Uri.parse("http://www.allnigerianrecipes.com/soups/egusi-soup.html");
		  		    	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		  		    	 startActivity(intent);
		               }
		               
		               else 
		  		    	if(itemPosition==1) {
			  		    	 Uri uri1 = Uri.parse("http://www.allnigerianrecipes.com/soups/okra-okro-soup.html");
			  		    	 Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
			  		    	 startActivity(intent1);
		  		    	}
		               else
		               
		  		    	if(itemPosition==2) {
			  		    	 Uri uri2 = Uri.parse("http://www.allnigerianrecipes.com/soups/ogbono-soup.html");
			  		    	 Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
			  		    	 startActivity(intent2);
		  		    	}
		  		    	else
		  		    	if(itemPosition==3) {
			  		    	 Uri uri3 = Uri.parse("http://www.allnigerianrecipes.com/soups/banga-soup.html");
			  		    	 Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
			  		    	 startActivity(intent3);
		  		    	}
		  		    	else
		  		    	if(itemPosition==4) {
			  		    	 Uri uri4 = Uri.parse("http://www.allnigerianrecipes.com/soups/edikaikong-soup.html");
			  		    	 Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
			  		    	 startActivity(intent4);
		  		    	}
		  		    	else
		  		    	if(itemPosition==5) {
			  		    	 Uri uri5 = Uri.parse("http://www.allnigerianrecipes.com/rice/nigerian-fried-rice.html");
			  		    	 Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
			  		    	 startActivity(intent5);
		  		    	}
		  		    	else
		  		    	if(itemPosition==6) {
			  		    	 Uri uri6 = Uri.parse("http://www.allnigerianrecipes.com/rice/nigerian-jollof-rice.html");
			  		    	 Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
			  		    	 startActivity(intent6);
		  		    	}
		  		    	else
		  		    	if(itemPosition==7) {
			  		    	 Uri uri7 = Uri.parse("http://www.allnigerianrecipes.com/rice/concoction-rice.html");
			  		    	 Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
			  		    	 startActivity(intent7);
		  		    	}
		  		    	
		  }
		        });

				}
			
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
