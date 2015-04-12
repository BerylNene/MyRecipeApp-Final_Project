package com.berylnene.myrecipeapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class AsiaMainActivity extends Activity {
	private AsiaDataSource as;
	private ListView recipesListView;
	 int itemPosition ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		as = new AsiaDataSource();
		recipesListView = (ListView)findViewById(R.id.listView1);
		
		recipesListView.setAdapter(new AsiaDataSourceAdapter(this,as));
	
		
         //setting the onClick event 
		recipesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				 // @Override
				  public void onItemClick(AdapterView<?> parent, View view,
				                 int position, long id) {

				       // ListView Clicked item index
				              itemPosition = position;

				        //Each List Item onClick goes to the corresponding web page 
				        //to show the user the ingredients and directions for that recipes
				               
				               if(itemPosition==0) {
				  		    	 Uri uri = Uri.parse("http://www.food.com/recipe/bourbon-chicken-45809");
				  		    	 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				  		    	 startActivity(intent);
				               }
				               
				  		    	if(itemPosition==1) {
					  		    	 Uri uri1 = Uri.parse("http://allrecipes.asia/recipe/662/barbecued-chicken-tikka-masala.aspx");
					  		    	 Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
					  		    	 startActivity(intent1);
				  		    	}
				  		    	
				  		    	if(itemPosition==2) {
					  		    	 Uri uri2 = Uri.parse("http://allrecipes.com/Recipe/Curried-Coconut-Chicken/Detail.aspx?prop24=hn_slide1_Curried-Coconut-Chicken&evt19=1");
					  		    	 Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
					  		    	 startActivity(intent2);
				  		    	}
				  		    	
				  		    	if(itemPosition==3) {
					  		    	 Uri uri3 = Uri.parse("http://fatimasbridalhouse.com/2014/05/03/easy-fluffy-garlic-naan/");
					  		    	 Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
					  		    	 startActivity(intent3);
				  		    	}
				  		    	
				  		  	if(itemPosition==4) {
				  		    	 Uri uri4 = Uri.parse("http://chinese.food.com/recipe/general-tsos-tofu-96563");
				  		    	 Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
				  		    	 startActivity(intent4);
			  		    	}
				  		    	
				  		    	if(itemPosition==5) {
					  		    	 Uri uri4 = Uri.parse("http://www.food.com/recipe/egg-drop-soup-22330");
					  		    	 Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
					  		    	 startActivity(intent4);
				  		    	}
				  		    	
				  		    	if(itemPosition==6) {
					  		    	 Uri uri5 = Uri.parse("http://allrecipes.co.uk/recipe/17202/slow-cooker-butter-chicken.aspx?o_is=LV");
					  		    	 Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
					  		    	 startActivity(intent5);
				  		    	}
				  		    	
				  		    	if(itemPosition==7) {
					  		    	 Uri uri6 = Uri.parse("http://www.food.com/recipe/yakisoba-82262");
					  		    	 Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
					  		    	 startActivity(intent6);
				  		    	}
				  		    	
				  		    	if(itemPosition==8) {
					  		    	 Uri uri7 = Uri.parse("http://www.food.com/recipe/baked-lumpia-rolls-19577");
					  		    	 Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
					  		    	 startActivity(intent7);
				  		    	}
				  		    	
				  		    	if(itemPosition==9) {
					  		    	 Uri uri8 = Uri.parse("http://www.delishar.com/2013/08/tandoori-pita.html");
					  		    	 Intent intent8 = new Intent(Intent.ACTION_VIEW, uri8);
					  		    	 startActivity(intent8);
				  		    	}
				  		    	
				  		    	if(itemPosition==10) {
					  		    	 Uri uri9 = Uri.parse("http://www.food.com/recipe/peanutty-sesame-noodles-112624");
					  		    	 Intent intent9 = new Intent(Intent.ACTION_VIEW, uri9);
					  		    	 startActivity(intent9);
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
