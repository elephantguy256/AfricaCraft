/*    */ package entity;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.math.MathHelper;
/*    */ 
/*    */ 
/*    */ public class ModelCheetah
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
/*    */   public ModelCheetah()
/*    */   {
/* 26 */     this.textureWidth = 64;
/* 27 */     this.textureHeight = 32;
/* 28 */     this.ocelotBody = new ModelRenderer(this, 20, 0);
/* 29 */     this.ocelotBody.setRotationPoint(0.0F, 7.6F, -10.1F);
/* 30 */     this.ocelotBody.addBox(-2.0F, 3.0F, -8.0F, 4, 16, 5, 0.0F);
/* 31 */     setRotateAngle(this.ocelotBody, 1.548107F, 0.0F, 0.0F);
/* 32 */     this.main = new ModelRenderer(this, 0, 0);
/* 33 */     this.main.setRotationPoint(0.0F, 11.1F, -8.4F);
/* 34 */     this.main.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 5, 0.0F);
/* 35 */     this.nose = new ModelRenderer(this, 0, 24);
/* 36 */     this.nose.setRotationPoint(0.0F, 10.8F, -9.0F);
/* 37 */     this.nose.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 2, 0.0F);
/* 38 */     this.ocelotTail = new ModelRenderer(this, 0, 15);
/* 39 */     this.ocelotTail.setRotationPoint(0.0F, 12.6F, 8.0F);
/* 40 */     this.ocelotTail.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
/* 41 */     setRotateAngle(this.ocelotTail, 0.8651597F, 0.0F, 0.0F);
/* 42 */     this.ear2 = new ModelRenderer(this, 6, 10);
/* 43 */     this.ear2.setRotationPoint(0.0F, 11.1F, -9.0F);
/* 44 */     this.ear2.addBox(1.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
/* 45 */     this.ocelotFrontRightLeg = new ModelRenderer(this, 40, 0);
/* 46 */     this.ocelotFrontRightLeg.setRotationPoint(-1.2F, 11.9F, -5.0F);
/* 47 */     this.ocelotFrontRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
/* 48 */     this.ear1 = new ModelRenderer(this, 0, 10);
/* 49 */     this.ear1.setRotationPoint(0.0F, 11.1F, -9.0F);
/* 50 */     this.ear1.addBox(-2.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
/* 51 */     this.ocelotBackRightLeg = new ModelRenderer(this, 8, 13);
/* 52 */     this.ocelotBackRightLeg.setRotationPoint(-1.1F, 13.9F, 5.0F);
/* 53 */     this.ocelotBackRightLeg.addBox(-1.0F, 0.0F, 1.0F, 2, 10, 2, 0.0F);
/* 54 */     this.ocelotTail2 = new ModelRenderer(this, 4, 15);
/* 55 */     this.ocelotTail2.setRotationPoint(0.0F, 18.0F, 14.0F);
/* 56 */     this.ocelotTail2.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
/* 57 */     setRotateAngle(this.ocelotTail2, 1.727876F, 0.0F, 0.0F);
/* 58 */     this.ocelotBackLeftLeg = new ModelRenderer(this, 8, 13);
/* 59 */     this.ocelotBackLeftLeg.setRotationPoint(1.1F, 14.0F, 5.0F);
/* 60 */     this.ocelotBackLeftLeg.addBox(-1.0F, 0.0F, 1.0F, 2, 10, 2, 0.0F);
/* 61 */     this.ocelotFrontLeftLeg = new ModelRenderer(this, 40, 0);
/* 62 */     this.ocelotFrontLeftLeg.setRotationPoint(1.2F, 11.9F, -5.0F);
/* 63 */     this.ocelotFrontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 12, 2, 0.0F);
/*    */   }
/*    */   
/*    */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*    */   {
/* 68 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 69 */     this.ocelotBody.render(f5);
/* 70 */     this.main.render(f5);
/* 71 */     this.nose.render(f5);
/* 72 */     this.ocelotTail.render(f5);
/* 73 */     this.ear2.render(f5);
/* 74 */     this.ocelotFrontRightLeg.render(f5);
/* 75 */     this.ear1.render(f5);
/* 76 */     this.ocelotBackRightLeg.render(f5);
/* 77 */     this.ocelotTail2.render(f5);
/* 78 */     this.ocelotBackLeftLeg.render(f5);
/* 79 */     this.ocelotFrontLeftLeg.render(f5);
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
/*    */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*    */   {
/* 94 */     float f6 = 57.295776F;
/*    */     
/* 96 */     this.ocelotBackLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 97 */     this.ocelotBackRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 98 */     this.ocelotFrontLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 99 */     this.ocelotFrontRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelCheetah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */