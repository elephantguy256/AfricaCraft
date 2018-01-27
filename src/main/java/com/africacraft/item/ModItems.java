package com.africacraft.item;

import com.example.examplemod.mainRegistry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ACItemBook animalencyclopedia;
	 
	 public static void init() {
		 animalencyclopedia = register(new ACItemBook("animalencyclopedia").setCreativeTab(mainRegistry.acItems));
	 }
	 
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		return item;
	}
}