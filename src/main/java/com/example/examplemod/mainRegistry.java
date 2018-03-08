package com.example.examplemod;

import com.africacraft.item.AfricaCraftItemsTab;
import com.africacraft.item.ModItems;
import com.hyeanmod.proxy.CommonProxy;
import com.hyeanmod.proxy.SoundEvents2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.ai.gui.GuiHandler;
import net.minecraft.entity.ai.gui.type.GuiSavannaPedia;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = mainRegistry.MODID, version = mainRegistry.VERSION, name = mainRegistry.NAME)
public class mainRegistry {
    public static final String MODID = "wildanimals";
    public static final String VERSION = "1.0";
    public static final String NAME = "AfricaCraft";

    @SidedProxy(clientSide = "com.hyeanmod.proxy.ClientProxy", serverSide = "com.hyeanmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static mainRegistry instance;

    public static CreativeTabs acItems;
	public static boolean useLocalSkin;
	public static boolean displayNameTag;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	acItems = new AfricaCraftItemsTab(CreativeTabs.getNextID(), "acItems");
        ModItems.init();
        proxy.preInit(event);
        proxy.registerRenders();
        ModEntities.registerEntity();
        SoundEvents2.registerSounds();
        GuiHandler.init();
    } 

	@EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
        proxy.init(event);
        ACConfig.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new GuiSavannaPedia());
        proxy.postInit(event);
		WorldType OPEN_PLAINS = new WorldTypeOpenPlains();
    }

	public static mainRegistry getInstance(){
		return instance;
	}
}