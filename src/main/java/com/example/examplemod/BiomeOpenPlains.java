package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeOpenPlains extends Biome {

	public BiomeOpenPlains() 
	{
		super(new BiomeProperties("Patagonia").setTemperature(0.8F).setRainfall(0.6F).setWaterColor(3120543).setBaseHeight(0.01F).setHeightVariation(0.02F));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.clear();

		this.theBiomeDecorator.generateLakes = false;
		}

	private static BiomeProperties properties;

	
	//this.spawnableCreatureList.add(new SpawnListEntry(EntityVicuna.class, 20, 5, 15));
}