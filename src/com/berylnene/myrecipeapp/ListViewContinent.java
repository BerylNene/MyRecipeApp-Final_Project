package com.berylnene.myrecipeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewContinent extends Activity {
     ListView listView;
     
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.list_item_continent);
         
         // Get ListView object from xml
         listView = (ListView) findViewById(R.id.list);
         
         // Defined Array values to show in ListView
         String[] continents = new String[] { "Africa", 
                                          "Antarctica",
                                          "Asia",
                                          "Australia", 
                                           "Europe", 
                                          "North America", 
                                          "South America"
                                          
                                         };
         
         // Define a new Adapter
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                 android.R.layout.simple_list_item_1, android.R.id.text1, continents);
           
       
       
               // Assign adapter to ListView
               listView.setAdapter(adapter); 
               
               // ListView Item Click Listener
                   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            	   
                     public void onItemClick(AdapterView<?> parent, View view,
                        int position, long id ) {
                    	 
                    	// selected item 
                   	  String recipe = ((TextView) view).getText().toString();
                   	  
                   	  // Launching new Activity on selecting single List Item
                   	  Intent i; 
                   	 

                   	  // sending data to new activity
                   	  //on click on a new list item
                   	  switch (position)
                   	  {
                   	  case 0:
                   	  i = new Intent(getApplicationContext(), AfricaMainActivity.class);
                   	  startActivity(i);
                   	  break;
                   	  
                   	 case 1:
                      	  i = new Intent(getApplicationContext(), AntarcticaMainActivity.class);
                      	  startActivity(i);
                      	  break;
                      	  
                   	 case 2:
                      	  i = new Intent(getApplicationContext(), AsiaMainActivity.class);
                      	  startActivity(i);
                      	  break;	
                   	 case 3:
                      	  i = new Intent(getApplicationContext(), AustraliaMainActivity.class);
                      	  startActivity(i);
                      	  break; 
                   	 case 4:
                      	  i = new Intent(getApplicationContext(), EuropeMainActivity.class);
                      	  startActivity(i);
                      	  break;	
                   	 case 5:
                      	  i = new Intent(getApplicationContext(), NorthAmericaMainActivity.class);
                      	  startActivity(i);
                      	  break;	
                   	 case 6:
                      	  i = new Intent(getApplicationContext(), SouthAmericaMainActivity.class);
                      	  startActivity(i);
                      	  break;	  
                   	  }
                   	
                       
                      
                    
                     }
       
                }); 
           }
       
       }

