package com.example.examplemod;

import entity.EntityAardwolf;
import entity.EntityAfricanElephant;
import entity.EntityAfricanLeopard;
import entity.EntityAfricanWildDog;
import entity.EntityBlackBackedJackal;
import entity.EntityBrownHyena;
import entity.EntityChacmaBaboon;
import entity.EntityCheetah;
import entity.EntityGerenuk;
import entity.EntityLion;
import entity.EntityLioness;
import entity.EntityReticulatedGiraffe;
import entity.EntitySpottedHyena;
import entity.EntityStripedHyena;
import entity.EntityWildebeest;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
  public static void registerEntity()
  {
    int id = 1;
    EntityRegistry.registerModEntity(EntityChacmaBaboon.class, "Chacma Baboon", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    EntityRegistry.registerModEntity(EntityBlackBackedJackal.class, "Black Backed Jackal", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    EntityRegistry.registerModEntity(EntitySpottedHyena.class, "Spotted Hyena", id++, mainRegistry.instance, 64, 3, true, 0xffcc66, 0x7e4e41);
    EntityRegistry.registerModEntity(EntityLion.class, "Masai Lion male", id++, mainRegistry.instance, 64, 3, true, 0xe3bd60, 0x63482e);
    EntityRegistry.registerModEntity(EntityLioness.class, "Masai Lion female", id++, mainRegistry.instance, 64, 3, true, 0xe3bd60, 0x63482e);
    EntityRegistry.registerModEntity(EntityAfricanElephant.class, "African Bush Elephant", id++, mainRegistry.instance, 64, 3, true, 0x606060, 0x363535);
    EntityRegistry.registerModEntity(EntityReticulatedGiraffe.class, "Reticulated Giraffe", id++, mainRegistry.instance, 64, 3, true, 0xffb870, 0x662d10);
    EntityRegistry.registerModEntity(EntityAfricanWildDog.class, "African Wild Dog", id++, mainRegistry.instance, 64, 3, true, 0xff7129, 0x2f2e2e);
    EntityRegistry.registerModEntity(EntityWildebeest.class, "Wildebeest", id++, mainRegistry.instance, 64, 3, true, 0xbf9367, 0x383533);
    EntityRegistry.registerModEntity(EntityStripedHyena.class, "Striped Hyena", id++, mainRegistry.instance, 64, 3, true, 0xfbfbfb, 0x313131);
    EntityRegistry.registerModEntity(EntityAfricanLeopard.class, "African Leopard", id++, mainRegistry.instance, 64, 3, true, 0xd4b793, 0x3e3e3e);
    EntityRegistry.registerModEntity(EntityBrownHyena.class, "Brown Hyena", id++, mainRegistry.instance, 64, 3, true, 0xfbfbfb, 0x313131);
    EntityRegistry.registerModEntity(EntityAardwolf.class, "Aardwolf", id++, mainRegistry.instance, 64, 3, true, 0xf4cb97, 0xd4d4d4);
    EntityRegistry.registerModEntity(EntityCheetah.class, "Cheetah", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    EntityRegistry.registerModEntity(EntityGerenuk.class, "Gerenuk", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);

    addNaturalSpawns();
  }
  
  public static void addNaturalSpawns()
  {
    EntityRegistry.addSpawn(EntitySpottedHyena.class, 1, 2, 5, EnumCreatureType.AMBIENT, new Biome[] { Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA });
  }
}
