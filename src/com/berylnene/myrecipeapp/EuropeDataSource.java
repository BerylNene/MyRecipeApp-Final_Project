package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class EuropeDataSource {
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
	public EuropeDataSource(){
		photoPool = new ArrayList<Integer>();
		descriptionPool = new ArrayList<Integer>();
		dishesPool = new ArrayList<Integer>();


		setupPhotoPool();
		setupDescriptionPool();
		setupDishesPool();
	}
	
	//method to put all the individual photos in each list item
	public void setupPhotoPool(){
		photoPool.add(R.drawable.hearty_meatball_sandwich);
		photoPool.add(R.drawable.parmesan_chicken_bake);
		photoPool.add(R.drawable.chicken_scallopini);
		photoPool.add(R.drawable.english_sausage_rolls);
		photoPool.add(R.drawable.yorkshire_pudding);
		photoPool.add(R.drawable.beef_wellington);
		photoPool.add(R.drawable.english_butter_tarts);
		photoPool.add(R.drawable.scotch_shortbread);
		photoPool.add(R.drawable.baklava);
		
	}
	
	//method to put all the individual dish titles in each list item
	public void setupDishesPool(){
		dishesPool.add(R.string.europe_recipe1);
		dishesPool.add(R.string.europe_recipe2);
		dishesPool.add(R.string.europe_recipe3);
		dishesPool.add(R.string.europe_recipe4);
		dishesPool.add(R.string.europe_recipe5);
		dishesPool.add(R.string.europe_recipe6);
		dishesPool.add(R.string.europe_recipe7);
		dishesPool.add(R.string.europe_recipe8);
		dishesPool.add(R.string.europe_recipe9);
		
	}
	
	//description of the each item
	public void setupDescriptionPool(){
		descriptionPool.add(R.string.description_europe_recipe1);
		descriptionPool.add(R.string.description_europe_recipe2);
		descriptionPool.add(R.string.description_europe_recipe3);
		descriptionPool.add(R.string.description_europe_recipe4);
		descriptionPool.add(R.string.description_europe_recipe5);
		descriptionPool.add(R.string.description_europe_recipe6);
		descriptionPool.add(R.string.description_europe_recipe7);
		descriptionPool.add(R.string.description_europe_recipe8);
		descriptionPool.add(R.string.description_europe_recipe9);
		
	}

	//returns the lengths of the photos
	public int getDataSourceLength(){
		return photoPool.size();
	}


	}


