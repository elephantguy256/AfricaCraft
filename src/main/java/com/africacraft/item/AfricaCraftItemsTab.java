package com.africacraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AfricaCraftItemsTab extends CreativeTabs {

	   public AfricaCraftItemsTab(int i, String label) { 
		   super(label);
		   this.setBackgroundImageName("africa.png");
	   }
	   
	   public Item getTabIconItem() {
		   return ModItems.animalencyclopedia;
	   }
	}


