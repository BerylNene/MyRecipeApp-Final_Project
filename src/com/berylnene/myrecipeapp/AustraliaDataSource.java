package com.berylnene.myrecipeapp;

import java.util.ArrayList;

public class AustraliaDataSource {
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
	public AustraliaDataSource(){
		photoPool = new ArrayList<Integer>();
		descriptionPool = new ArrayList<Integer>();
		dishesPool = new ArrayList<Integer>();


		setupPhotoPool();
		setupDescriptionPool();
		setupDishesPool();
	}
	
	//method to put all the individual photos in each list item
	public void setupPhotoPool(){
		photoPool.add(R.drawable.wiener_schnitzel);
		photoPool.add(R.drawable.vanille_kipferl);
		photoPool.add(R.drawable.knodel);
		photoPool.add(R.drawable.austrian_chocolate_balls);
		photoPool.add(R.drawable.kaiserschmarrn);
		photoPool.add(R.drawable.dobos_torte);
		photoPool.add(R.drawable.vienna_schnitzel);
		photoPool.add(R.drawable.german_apple_strudel);
		
		
	}
	
	//method to put all the individual dish titles in each list item
	public void setupDishesPool(){
		dishesPool.add(R.string.australia_recipe1);
		dishesPool.add(R.string.australia_recipe2);
		dishesPool.add(R.string.australia_recipe3);
		dishesPool.add(R.string.australia_recipe4);
		dishesPool.add(R.string.australia_recipe5);
		dishesPool.add(R.string.australia_recipe6);
		dishesPool.add(R.string.australia_recipe7);
		dishesPool.add(R.string.australia_recipe8);
		
		
	}
	
	//description of the each item
	public void setupDescriptionPool(){
		descriptionPool.add(R.string.description_australia_recipe1);
		descriptionPool.add(R.string.description_australia_recipe2);
		descriptionPool.add(R.string.description_australia_recipe3);
		descriptionPool.add(R.string.description_australia_recipe4);
		descriptionPool.add(R.string.description_australia_recipe5);
		descriptionPool.add(R.string.description_australia_recipe6);
		descriptionPool.add(R.string.description_australia_recipe7);
		descriptionPool.add(R.string.description_australia_recipe8);
		
	}

	//returns the lengths of the photos
	public int getDataSourceLength(){
		return photoPool.size();
	}


	}


