package com.berylnene.myrecipeapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class AsiaDataSource extends Activity{
private ArrayList<Integer> photoPool;
private ArrayList<Integer> descriptionPool;
private ArrayList<Integer> dishesPool;
private ListView listview;


/**
 * @return the photoPool
 */
public ArrayList<Integer> getPhotoPool() {
	return photoPool;
}
/**
 * @return the descriptionPool
 */
public ArrayList<Integer> getDescriptionPool() {
	return descriptionPool;
}
/**
 * @return the dishesPool
 */
public ArrayList<Integer> getDishesPool() {
	return dishesPool;
}

//arrays for all the pools
public AsiaDataSource(){
	photoPool = new ArrayList<Integer>();
	descriptionPool = new ArrayList<Integer>();
	dishesPool = new ArrayList<Integer>();


	setupPhotoPool();
	setupDescriptionPool();
	setupDishesPool();
}

//method to put all the individual photos in each list item
public void setupPhotoPool(){
	photoPool.add(R.drawable.bourbon_chicken);
	photoPool.add(R.drawable.chicken_tikka_masala);
	photoPool.add(R.drawable.curried_coconut_chicken);
	photoPool.add(R.drawable.naan);
	photoPool.add(R.drawable.general_tso_tofu);
	photoPool.add(R.drawable.egg_drop_soup);
	photoPool.add(R.drawable.indian_butter_chicken);
	photoPool.add(R.drawable.yakisoba);
	photoPool.add(R.drawable.baked_lumpia_rolls);
	photoPool.add(R.drawable.pita_sandwich);
	photoPool.add(R.drawable.peanutty_sesame_noodles);
	
}

//method to put all the individual dish titles in each list item
public void setupDishesPool(){
	dishesPool.add(R.string.asia_recipe1);
	dishesPool.add(R.string.asia_recipe2);
	dishesPool.add(R.string.asia_recipe3);
	dishesPool.add(R.string.asia_recipe4);
	dishesPool.add(R.string.asia_recipe5);
	dishesPool.add(R.string.asia_recipe6);
	dishesPool.add(R.string.asia_recipe7);
	dishesPool.add(R.string.asia_recipe8);
	dishesPool.add(R.string.asia_recipe9);
	dishesPool.add(R.string.asia_recipe10);
	dishesPool.add(R.string.asia_recipe11);
}

//description of the each item
public void setupDescriptionPool(){
	descriptionPool.add(R.string.description_asia_recipe1);
	descriptionPool.add(R.string.description_asia_recipe2);
	descriptionPool.add(R.string.description_asia_recipe3);
	descriptionPool.add(R.string.description_asia_recipe4);
	descriptionPool.add(R.string.description_asia_recipe5);
	descriptionPool.add(R.string.description_asia_recipe6);
	descriptionPool.add(R.string.description_asia_recipe7);
	descriptionPool.add(R.string.description_asia_recipe8);
	descriptionPool.add(R.string.description_asia_recipe9);
	descriptionPool.add(R.string.description_asia_recipe10);
	descriptionPool.add(R.string.description_asia_recipe11);
}


//returns the lengths of the photos
public int getDataSourceLength(){
	return photoPool.size();
}

}