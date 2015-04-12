package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class AntarcticaDataSource {

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
public AntarcticaDataSource(){
	photoPool = new ArrayList<Integer>();
	descriptionPool = new ArrayList<Integer>();
	dishesPool = new ArrayList<Integer>();


	setupPhotoPool();
	setupDescriptionPool();
	setupDishesPool();
}

//method to put all the individual photos in each list item
public void setupPhotoPool(){
	photoPool.add(R.drawable.herby_toad_in_the_hole);
	photoPool.add(R.drawable.cassoulet_au_canard);
	photoPool.add(R.drawable.gambas_pil_pil);
	photoPool.add(R.drawable.kumara_bread_with_pecan);
	photoPool.add(R.drawable.norwagian_rice);
	photoPool.add(R.drawable.churros);
	photoPool.add(R.drawable.argentine_rice_veggie_salad);
	photoPool.add(R.drawable.empanadas);
	photoPool.add(R.drawable.chicken_and_red_bell_pepper_salad_sandwich);
	
}

//method to put all the individual dish titles in each list item
public void setupDishesPool(){
	dishesPool.add(R.string.antarctica_recipe1);
	dishesPool.add(R.string.antarctica_recipe2);
	dishesPool.add(R.string.antarctica_recipe3);
	dishesPool.add(R.string.antarctica_recipe4);
	dishesPool.add(R.string.antarctica_recipe5);
	dishesPool.add(R.string.antarctica_recipe6);
	dishesPool.add(R.string.antarctica_recipe7);
	dishesPool.add(R.string.antarctica_recipe8);
	dishesPool.add(R.string.antarctica_recipe9);
	
}

//description of the each item
public void setupDescriptionPool(){
	descriptionPool.add(R.string.description_antarctica_recipe1);
	descriptionPool.add(R.string.description_antarctica_recipe2);
	descriptionPool.add(R.string.description_antarctica_recipe3);
	descriptionPool.add(R.string.description_antarctica_recipe4);
	descriptionPool.add(R.string.description_antarctica_recipe5);
	descriptionPool.add(R.string.description_antarctica_recipe6);
	descriptionPool.add(R.string.description_antarctica_recipe7);
	descriptionPool.add(R.string.description_antarctica_recipe8);
	descriptionPool.add(R.string.description_antarctica_recipe9);
	
}

//returns the lengths of the photos
public int getDataSourceLength(){
	return photoPool.size();
}


}
