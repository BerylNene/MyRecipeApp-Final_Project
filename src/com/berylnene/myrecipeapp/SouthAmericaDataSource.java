package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class SouthAmericaDataSource {


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
public SouthAmericaDataSource(){
	photoPool = new ArrayList<Integer>();
	descriptionPool = new ArrayList<Integer>();
	dishesPool = new ArrayList<Integer>();


	setupPhotoPool();
	setupDescriptionPool();
	setupDishesPool();
}

//method to put all the individual photos in each list item
public void setupPhotoPool(){
	photoPool.add(R.drawable.brazilian_black_bean_stew);
	photoPool.add(R.drawable.picadinho_a_brasiliera);
	photoPool.add(R.drawable.chicken_soup_with_root_vegetables);
	photoPool.add(R.drawable.frijoles_colombianos);
	photoPool.add(R.drawable.buffalo_chicken_potato_salad);
	photoPool.add(R.drawable.peruvian_steak_rice_beans);
	photoPool.add(R.drawable.bollos_picantes_vegetarianos);
	photoPool.add(R.drawable.pansitos_de_jamon);
	
}

//method to put all the individual dish titles in each list item
public void setupDishesPool(){
	dishesPool.add(R.string.south_america_recipe1);
	dishesPool.add(R.string.south_america_recipe2);
	dishesPool.add(R.string.south_america_recipe3);
	dishesPool.add(R.string.south_america_recipe4);
	dishesPool.add(R.string.south_america_recipe5);
	dishesPool.add(R.string.south_america_recipe6);
	dishesPool.add(R.string.south_america_recipe7);
	dishesPool.add(R.string.south_america_recipe8);
	
} 

//description of the each item
public void setupDescriptionPool(){
	descriptionPool.add(R.string.description_south_america_recipe1);
	descriptionPool.add(R.string.description_south_america_recipe2);
	descriptionPool.add(R.string.description_south_america_recipe3);
	descriptionPool.add(R.string.description_south_america_recipe4);
	descriptionPool.add(R.string.description_south_america_recipe5);
	descriptionPool.add(R.string.description_south_america_recipe6);
	descriptionPool.add(R.string.description_south_america_recipe7);
	descriptionPool.add(R.string.description_south_america_recipe8);
	
}

//returns the lengths of the photos
public int getDataSourceLength(){
	return photoPool.size();
}


}

