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

public class NorthAmericaMainActivity extends Activity {
	private NorthAmericaDataSource nas;
	private ListView recipesListView;
	int itemPosition ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nas = new NorthAmericaDataSource();
		recipesListView = (ListView)findViewById(R.id.listView1);
		recipesListView.setAdapter(new NorthAmericaDataSourceAdapter(this,nas));
		
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
			  		    	 Uri uri = Uri.parse("http://allrecipes.com/recipe/fun-karnal-beef-and-broccoli/");
			  		    	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			  		    	 startActivity(intent);
			               }
			               
			  		    	if(itemPosition==1) {
				  		    	 Uri uri1 = Uri.parse("http://allrecipes.com/recipe/mamma-ritas-eggs-and-tomato-sauce/");
				  		    	 Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
				  		    	 startActivity(intent1);
			  		    	}
			  		    	
			  		    	if(itemPosition==2) {
				  		    	 Uri uri2 = Uri.parse("http://allrecipes.com/recipe/new-orleans-barbeque-shrimp/");
				  		    	 Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
				  		    	 startActivity(intent2);
			  		    	}
			  		    	
			  		    	if(itemPosition==3) {
				  		    	 Uri uri3 = Uri.parse("http://allrecipes.com/recipe/real-poutine/");
				  		    	 Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
				  		    	 startActivity(intent3);
			  		    	}
			  		    	

			  		    	if(itemPosition==4) {
				  		    	 Uri uri4 = Uri.parse("http://allrecipes.com/recipe/sucre-a-la-creme/");
				  		    	 Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
				  		    	 startActivity(intent4);
			  		    	}
			  		    	
			  		    	
			  		    	if(itemPosition==5) {
				  		    	 Uri uri5 = Uri.parse("http://allrecipes.com/recipe/french-onion-soup-xi/");
				  		    	 Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
				  		    	 startActivity(intent5);
			  		    	}
			  		    	
			  		    	if(itemPosition==6) {
				  		    	 Uri uri6 = Uri.parse("http://allrecipes.com/recipe/pollock-montreal/");
				  		    	 Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
				  		    	 startActivity(intent6);
			  		    	}
			  		    	
			  		    	if(itemPosition==7) {
				  		    	 Uri uri7 = Uri.parse("http://allrecipes.com/recipe/meat-pie-tourtiere/");
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
