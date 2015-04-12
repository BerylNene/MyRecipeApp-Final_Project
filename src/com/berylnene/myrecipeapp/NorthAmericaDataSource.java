package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class NorthAmericaDataSource {


private ArrayList<Integer> photoPool;
private ArrayList<Integer> descriptionPool;
private ArrayList<Integer> dishesPool;
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
public NorthAmericaDataSource(){
	photoPool = new ArrayList<Integer>();
	descriptionPool = new ArrayList<Integer>();
	dishesPool = new ArrayList<Integer>();


	setupPhotoPool();
	setupDescriptionPool();
	setupDishesPool();
}

//method to put all the individual photos in each list item
public void setupPhotoPool(){
	photoPool.add(R.drawable.fun_karnal);
	photoPool.add(R.drawable.eggs_and_tomato_sauce);
	photoPool.add(R.drawable.new_orleans_barbeque_shrimp);
	photoPool.add(R.drawable.poutine);
	photoPool.add(R.drawable.sucre_a_la_creme);
	photoPool.add(R.drawable.french_onion_soup);
	photoPool.add(R.drawable.pollock_montreal);
	photoPool.add(R.drawable.meat_pie);
	
}

//method to put all the individual dish titles in each list item
public void setupDishesPool(){
	dishesPool.add(R.string.north_america_recipe1);
	dishesPool.add(R.string.north_america_recipe2);
	dishesPool.add(R.string.north_america_recipe3);
	dishesPool.add(R.string.north_america_recipe4);
	dishesPool.add(R.string.north_america_recipe5);
	dishesPool.add(R.string.north_america_recipe6);
	dishesPool.add(R.string.north_america_recipe7);
	dishesPool.add(R.string.north_america_recipe8);
	
}

//description of the each item
public void setupDescriptionPool(){
	descriptionPool.add(R.string.description_north_america_recipe1);
	descriptionPool.add(R.string.description_north_america_recipe2);
	descriptionPool.add(R.string.description_north_america_recipe3);
	descriptionPool.add(R.string.description_north_america_recipe4);
	descriptionPool.add(R.string.description_north_america_recipe5);
	descriptionPool.add(R.string.description_north_america_recipe6);
	descriptionPool.add(R.string.description_north_america_recipe7);
	descriptionPool.add(R.string.description_north_america_recipe8);
	
	
}

//returns the lengths of the photos
public int getDataSourceLength(){
	return photoPool.size();
}


}

