/*    */ package entity;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.math.MathHelper;
/*    */ 
/*    */ 
/*    */ public class ModelAfricanLeopard
/*    */   extends ModelBase
/*    */ {
/*    */   public ModelRenderer ocelotTail;
/*    */   public ModelRenderer main;
/*    */   public ModelRenderer nose;
/*    */   public ModelRenderer ear1;
/*    */   public ModelRenderer ear2;
/*    */   public ModelRenderer ocelotBody;
/*    */   public ModelRenderer ocelotBackRightLeg;
/*    */   public ModelRenderer ocelotFrontRightLeg;
/*    */   public ModelRenderer ocelotTail2;
/*    */   public ModelRenderer ocelotBackLeftLeg;
/*    */   public ModelRenderer ocelotFrontLeftLeg;
/*    */   
/*    */   public ModelAfricanLeopard()
/*    */   {
/* 26 */     this.textureWidth = 64;
/* 27 */     this.textureHeight = 32;
/* 28 */     this.main = new ModelRenderer(this, 0, 0);
/* 29 */     this.main.setRotationPoint(-0.5F, 11.8F, -8.4F);
/* 30 */     this.main.addBox(-2.5F, -2.0F, -3.0F, 6, 5, 6, 0.0F);
/* 31 */     this.ear1 = new ModelRenderer(this, 1, 11);
/* 32 */     this.ear1.setRotationPoint(0.0F, 11.5F, -9.0F);
/* 33 */     this.ear1.addBox(-2.0F, -3.0F, 0.0F, 1, 2, 2, 0.0F);
/* 34 */     this.ocelotTail = new ModelRenderer(this, 0, 15);
/* 35 */     this.ocelotTail.setRotationPoint(0.0F, 11.9F, 8.0F);
/* 36 */     this.ocelotTail.addBox(-0.5F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
/* 37 */     setRotateAngle(this.ocelotTail, 0.9000663F, 0.0F, 0.0F);
/* 38 */     this.ocelotFrontLeftLeg = new ModelRenderer(this, 50, 0);
/* 39 */     this.ocelotFrontLeftLeg.setRotationPoint(1.2F, 13.8F, -5.0F);
/* 40 */     this.ocelotFrontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
/* 41 */     this.ocelotBody = new ModelRenderer(this, 25, 0);
/* 42 */     this.ocelotBody.setRotationPoint(-1.0F, 8.0F, -9.9F);
/* 43 */     this.ocelotBody.addBox(-2.0F, 3.0F, -8.0F, 6, 16, 6, 0.0F);
/* 44 */     setRotateAngle(this.ocelotBody, 1.5707964F, 0.0F, 0.0F);
/* 45 */     this.ocelotBackLeftLeg = new ModelRenderer(this, 16, 20);
/* 46 */     this.ocelotBackLeftLeg.setRotationPoint(1.1F, 14.8F, 5.0F);
/* 47 */     this.ocelotBackLeftLeg.addBox(-1.0F, 0.0F, 1.0F, 3, 9, 3, 0.0F);
/* 48 */     this.ocelotFrontRightLeg = new ModelRenderer(this, 50, 0);
/* 49 */     this.ocelotFrontRightLeg.setRotationPoint(-2.3F, 13.8F, -5.2F);
/* 50 */     this.ocelotFrontRightLeg.addBox(-1.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
/* 51 */     this.ocelotBackRightLeg = new ModelRenderer(this, 16, 20);
/* 52 */     this.ocelotBackRightLeg.setRotationPoint(-2.3F, 14.8F, 5.0F);
/* 53 */     this.ocelotBackRightLeg.addBox(-1.0F, 0.0F, 1.0F, 3, 9, 3, 0.0F);
/* 54 */     this.nose = new ModelRenderer(this, 0, 25);
/* 55 */     this.nose.setRotationPoint(0.0F, 11.3F, -9.7F);
/* 56 */     this.nose.addBox(-1.5F, 0.0F, -4.0F, 3, 3, 3, 0.0F);
/* 57 */     this.ear2 = new ModelRenderer(this, 1, 11);
/* 58 */     this.ear2.setRotationPoint(0.0F, 11.5F, -9.0F);
/* 59 */     this.ear2.addBox(1.0F, -3.0F, 0.0F, 1, 2, 2, 0.0F);
/* 60 */     this.ocelotTail2 = new ModelRenderer(this, 8, 15);
/* 61 */     this.ocelotTail2.setRotationPoint(0.0F, 16.8F, 14.0F);
/* 62 */     this.ocelotTail2.addBox(-0.5F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
/* 63 */     setRotateAngle(this.ocelotTail2, 1.727876F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*    */   {
/* 68 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 69 */     this.main.render(f5);
/* 70 */     this.ear1.render(f5);
/* 71 */     this.ocelotTail.render(f5);
/* 72 */     this.ocelotFrontLeftLeg.render(f5);
/* 73 */     this.ocelotBody.render(f5);
/* 74 */     this.ocelotBackLeftLeg.render(f5);
/* 75 */     this.ocelotFrontRightLeg.render(f5);
/* 76 */     this.ocelotBackRightLeg.render(f5);
/* 77 */     this.nose.render(f5);
/* 78 */     this.ear2.render(f5);
/* 79 */     this.ocelotTail2.render(f5);
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
/*    */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*    */   {
/* 93 */     float f6 = 57.295776F;
/*    */     
/* 95 */     this.ocelotBackLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 96 */     this.ocelotBackRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 97 */     this.ocelotFrontLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 98 */     this.ocelotFrontRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanLeopard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */