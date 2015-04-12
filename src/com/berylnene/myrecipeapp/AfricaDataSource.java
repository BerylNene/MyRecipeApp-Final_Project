package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class AfricaDataSource {
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
public AfricaDataSource(){
	photoPool = new ArrayList<Integer>();
	descriptionPool = new ArrayList<Integer>();
	dishesPool = new ArrayList<Integer>();


	setupPhotoPool();
	setupDescriptionPool();
	setupDishesPool();
}

//method to put all the individual photos in each list item
public void setupPhotoPool(){
	photoPool.add(R.drawable.egusi_soup);
	photoPool.add(R.drawable.okra_soup);
	photoPool.add(R.drawable.ogbono_soup);
	photoPool.add(R.drawable.banga_soup);
	photoPool.add(R.drawable.edikaikong_soup);
	photoPool.add(R.drawable.fried_rice);
	photoPool.add(R.drawable.jollof_rice);
	photoPool.add(R.drawable.concoction_rice);
}

//method to put all the individual dish titles in each list item
public void setupDishesPool(){
	dishesPool.add(R.string.african_recipe1);
	dishesPool.add(R.string.african_recipe2);
	dishesPool.add(R.string.african_recipe3);
	dishesPool.add(R.string.african_recipe4);
	dishesPool.add(R.string.african_recipe5);
	dishesPool.add(R.string.african_recipe6);
	dishesPool.add(R.string.african_recipe7);
	dishesPool.add(R.string.african_recipe8);
}

//description of the each item
public void setupDescriptionPool(){
	descriptionPool.add(R.string.description_african_recipe1);
	descriptionPool.add(R.string.description_african_recipe2);
	descriptionPool.add(R.string.description_african_recipe3);
	descriptionPool.add(R.string.description_african_recipe4);
	descriptionPool.add(R.string.description_african_recipe5);
	descriptionPool.add(R.string.description_african_recipe6);
	descriptionPool.add(R.string.description_african_recipe7);
	descriptionPool.add(R.string.description_african_recipe8);
}

//returns the lengths of the photos
public int getDataSourceLength(){
	return photoPool.size();
}

}
