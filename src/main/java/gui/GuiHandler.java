/*    */ package gui;
/*    */ 
/*    */ import com.example.examplemod.mainRegistry;

/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.fml.common.network.IGuiHandler;
/*    */ import net.minecraftforge.fml.common.network.NetworkRegistry;
/*    */ 
/*    */ public class GuiHandler
/*    */   implements IGuiHandler
/*    */ {
/*    */   public static void init()
/*    */   {
/* 15 */     NetworkRegistry.INSTANCE.registerGuiHandler(mainRegistry.instance, new GuiHandler());
/*    */   }
/*    */   
/*    */   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 20 */     switch (ID) {
/* 21 */     case 1:  return new GuiSavannaPedia();
/*    */     }
/*    */     
/* 24 */     return null;
/*    */   }
/*    */   
/*    */   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
/*    */   {
/* 29 */     String name = "Unavailable";
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */     switch (ID) {
/* 36 */     case 1:  return new GuiSavannaPedia();
/*    */     }
/*    */     
/* 39 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\net\minecraft\entity\ai\gui\GuiHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */