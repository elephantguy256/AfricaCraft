/*    */ package entity;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.math.MathHelper;
/*    */ 
/*    */ 
/*    */ public class ModelAfricanWildDog
/*    */   extends ModelBase
/*    */ {
/*    */   public ModelRenderer wolfLeg4;
/*    */   public ModelRenderer wolfMane;
/*    */   public ModelRenderer wolfBody;
/*    */   public ModelRenderer wolfLeg2;
/*    */   public ModelRenderer wolfLeg1;
/*    */   public ModelRenderer wolfLeg3;
/*    */   public ModelRenderer wolfTail;
/*    */   public ModelRenderer field_78185_a0;
/*    */   public ModelRenderer field_78185_a1;
/*    */   public ModelRenderer field_78185_a2;
/*    */   public ModelRenderer field_78185_a3;
/*    */   
/*    */   public ModelAfricanWildDog()
/*    */   {
/* 26 */     this.textureWidth = 64;
/* 27 */     this.textureHeight = 32;
/* 28 */     this.wolfLeg1 = new ModelRenderer(this, 0, 18);
/* 29 */     this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 4.8F);
/* 30 */     this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 31 */     this.field_78185_a0 = new ModelRenderer(this, 0, 0);
/* 32 */     this.field_78185_a0.setRotationPoint(-1.0F, 11.9F, -6.9F);
/* 33 */     this.field_78185_a0.addBox(-3.0F, -3.0F, -2.0F, 6, 5, 4, 0.0F);
/* 34 */     this.wolfTail = new ModelRenderer(this, 9, 18);
/* 35 */     this.wolfTail.setRotationPoint(-1.0F, 12.6F, 5.3F);
/* 36 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
/* 37 */     setRotateAngle(this.wolfTail, 0.4553564F, 0.0F, 0.0F);
/* 38 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/* 39 */     this.field_78185_a2.setRotationPoint(-0.6F, 12.2F, -7.0F);
/* 40 */     this.field_78185_a2.addBox(1.0F, -5.0F, 0.0F, 3, 3, 1, 0.0F);
/* 41 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/* 42 */     this.field_78185_a1.setRotationPoint(-2.3F, 12.2F, -7.0F);
/* 43 */     this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 3, 3, 1, 0.0F);
/* 44 */     this.wolfMane = new ModelRenderer(this, 21, 0);
/* 45 */     this.wolfMane.setRotationPoint(0.5F, 11.8F, -4.9F);
/* 46 */     this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
/* 47 */     setRotateAngle(this.wolfMane, 2.3675392F, 0.0F, 0.0F);
/* 48 */     this.wolfLeg3 = new ModelRenderer(this, 0, 18);
/* 49 */     this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -3.4F);
/* 50 */     this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 51 */     this.wolfBody = new ModelRenderer(this, 18, 14);
/* 52 */     this.wolfBody.setRotationPoint(0.0F, 14.6F, -2.8F);
/* 53 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 11, 6, 0.0F);
/* 54 */     setRotateAngle(this.wolfBody, 1.5707964F, 0.0F, 0.0F);
/* 55 */     this.wolfLeg4 = new ModelRenderer(this, 0, 18);
/* 56 */     this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -3.2F);
/* 57 */     this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 58 */     this.wolfLeg2 = new ModelRenderer(this, 0, 18);
/* 59 */     this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 4.8F);
/* 60 */     this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 61 */     this.field_78185_a3 = new ModelRenderer(this, 0, 10);
/* 62 */     this.field_78185_a3.setRotationPoint(-1.0F, 10.7F, -6.7F);
/* 63 */     this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 3, 3, 3, 0.0F);
/*    */   }
/*    */   
/*    */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*    */   {
/* 68 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 69 */     this.wolfLeg1.render(f5);
/* 70 */     this.field_78185_a0.render(f5);
/* 71 */     this.wolfTail.render(f5);
/* 72 */     this.field_78185_a2.render(f5);
/* 73 */     this.field_78185_a1.render(f5);
/* 74 */     this.wolfMane.render(f5);
/* 75 */     this.wolfLeg3.render(f5);
/* 76 */     this.wolfBody.render(f5);
/* 77 */     this.wolfLeg4.render(f5);
/* 78 */     this.wolfLeg2.render(f5);
/* 79 */     this.field_78185_a3.render(f5);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*    */   {
/* 86 */     modelRenderer.rotateAngleX = x;
/* 87 */     modelRenderer.rotateAngleY = y;
/* 88 */     modelRenderer.rotateAngleZ = z;
/*    */   }
/*    */   
/*    */ 
/*    */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
/*    */   {
/* 94 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 95 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/* 96 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 97 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanWildDog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */