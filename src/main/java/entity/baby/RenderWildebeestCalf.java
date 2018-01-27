/*    */ package entity.baby;
/*    */ 
/*    */ import entity.EntityWildebeest;
/*    */ import entity.ModelWildebeest;
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.client.renderer.entity.layers.LayerRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RenderWildebeestCalf
/*    */   implements LayerRenderer
/*    */ {
/* 19 */   public static final ResourceLocation none = new ResourceLocation("wildanimals:textures/entity/prey/wildebeest_calf.png");
/*    */   private RenderWildebeestCalf render;
/* 21 */   private final ModelWildebeest modelB = new ModelWildebeest();
/*    */   
/*    */   public RenderWildebeestCalf(RenderManager p_i46153_1_, ModelBase p_i46153_2_, float p_i46153_3_) {}
/*    */   
/* 25 */   public void ModelWildebeest(RenderWildebeestCalf re) { this.render = re; }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void func_177141_a(EntityLivingBase p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
/*    */   {
/* 32 */     func_177141_a((EntityWildebeest)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
/* 33 */     this.render.bindTexture(none);
/* 34 */     this.modelB.setRotationAngles(p_177141_8_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_1_);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   private void bindTexture(ResourceLocation none2) {}
/*    */   
/*    */ 
/*    */ 
/*    */   public boolean func_177142_b()
/*    */   {
/* 45 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   protected ResourceLocation getEntityTexture(Entity entity)
/*    */   {
/* 55 */     return none;
/*    */   }
/*    */
@Override
public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount,
		float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
	// TODO Auto-generated method stub
	
}
@Override
public boolean shouldCombineTextures() {
	// TODO Auto-generated method stub
	return false;
} }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\entity\baby\RenderWildebeestCalf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */