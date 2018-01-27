/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelLion
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer ocelotTail;
/*     */   public ModelRenderer main;
/*     */   public ModelRenderer nose;
/*     */   public ModelRenderer ear1;
/*     */   public ModelRenderer ear2;
/*     */   public ModelRenderer ocelotBody;
/*     */   public ModelRenderer ocelotBackRightLeg;
/*     */   public ModelRenderer ocelotFrontRightLeg;
/*     */   public ModelRenderer ocelotTail2;
/*     */   public ModelRenderer ocelotBackLeftLeg;
/*     */   public ModelRenderer ocelotFrontLeftLeg;
/*     */   
/*     */   public ModelLion()
/*     */   {
/*  28 */     this.textureWidth = 64;
/*  29 */     this.textureHeight = 32;
/*  30 */     this.main = new ModelRenderer(this, 0, 0);
/*  31 */     this.main.setRotationPoint(0.0F, 8.3F, -9.0F);
/*  32 */     this.main.addBox(-2.5F, -2.0F, -3.0F, 6, 6, 6, 0.0F);
/*  33 */     this.ocelotTail2 = new ModelRenderer(this, 25, 13);
/*  34 */     this.ocelotTail2.setRotationPoint(-3.6F, 13.5F, -10.3F);
/*  35 */     this.ocelotTail2.addBox(-0.5F, 0.0F, 0.0F, 9, 9, 10, 0.0F);
/*  36 */     setRotateAngle(this.ocelotTail2, 1.1838568F, 0.0F, 0.0F);
/*  37 */     this.ocelotBody = new ModelRenderer(this, 26, 0);
/*  38 */     this.ocelotBody.setRotationPoint(-0.5F, 7.6F, -10.0F);
/*  39 */     this.ocelotBody.addBox(-2.0F, 3.0F, -8.0F, 6, 18, 7, 0.0F);
/*  40 */     setRotateAngle(this.ocelotBody, 1.5707964F, 0.0F, 0.0F);
/*  41 */     this.ocelotFrontRightLeg = new ModelRenderer(this, 52, 0);
/*  42 */     this.ocelotFrontRightLeg.setRotationPoint(-1.9F, 12.9F, -5.0F);
/*  43 */     this.ocelotFrontRightLeg.addBox(-1.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
/*  44 */     this.ocelotBackLeftLeg = new ModelRenderer(this, 52, 0);
/*  45 */     this.ocelotBackLeftLeg.setRotationPoint(2.0F, 12.8F, 6.7F);
/*  46 */     this.ocelotBackLeftLeg.addBox(-1.0F, 0.0F, 1.0F, 3, 11, 3, 0.0F);
/*  47 */     this.ocelotTail = new ModelRenderer(this, 0, 15);
/*  48 */     this.ocelotTail.setRotationPoint(0.0F, 10.1F, 9.3F);
/*  49 */     this.ocelotTail.addBox(-0.5F, 0.0F, 0.0F, 2, 13, 2, 0.0F);
/*  50 */     setRotateAngle(this.ocelotTail, 0.5009095F, 0.0F, 0.0F);
/*  51 */     this.ocelotBackRightLeg = new ModelRenderer(this, 52, 0);
/*  52 */     this.ocelotBackRightLeg.setRotationPoint(-1.9F, 12.7F, 6.7F);
/*  53 */     this.ocelotBackRightLeg.addBox(-1.0F, 0.0F, 1.0F, 3, 11, 3, 0.0F);
/*  54 */     this.nose = new ModelRenderer(this, 8, 26);
/*  55 */     this.nose.setRotationPoint(0.4F, 8.3F, -10.4F);
/*  56 */     this.nose.addBox(-1.5F, 0.0F, -4.0F, 3, 3, 3, 0.0F);
/*  57 */     this.ear2 = new ModelRenderer(this, 10, 13);
/*  58 */     this.ear2.setRotationPoint(0.8F, 8.2F, -9.0F);
/*  59 */     this.ear2.addBox(1.0F, -3.0F, 0.0F, 1, 2, 2, 0.0F);
/*  60 */     this.ocelotFrontLeftLeg = new ModelRenderer(this, 52, 0);
/*  61 */     this.ocelotFrontLeftLeg.setRotationPoint(1.9F, 12.8F, -5.0F);
/*  62 */     this.ocelotFrontLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
/*  63 */     this.ear1 = new ModelRenderer(this, 10, 13);
/*  64 */     this.ear1.setRotationPoint(0.0F, 8.0F, -8.9F);
/*  65 */     this.ear1.addBox(-2.0F, -3.0F, 0.0F, 1, 2, 2, 0.0F);
/*  66 */     setRotateAngle(this.ear1, -0.0034906585F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/*  71 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*  72 */     float scaleFactor = 1.4F;
/*  73 */     GL11.glPushMatrix();
/*  74 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/*  75 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/*  76 */     this.main.render(f5);
/*  77 */     this.ocelotTail2.render(f5);
/*  78 */     this.ocelotBody.render(f5);
/*  79 */     this.ocelotFrontRightLeg.render(f5);
/*  80 */     this.ocelotBackLeftLeg.render(f5);
/*  81 */     this.ocelotTail.render(f5);
/*  82 */     this.ocelotBackRightLeg.render(f5);
/*  83 */     this.nose.render(f5);
/*  84 */     this.ear2.render(f5);
/*  85 */     this.ocelotFrontLeftLeg.render(f5);
/*  86 */     this.ear1.render(f5);
/*  87 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/*  94 */     modelRenderer.rotateAngleX = x;
/*  95 */     modelRenderer.rotateAngleY = y;
/*  96 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 102 */     float f6 = 57.295776F;
/*     */     
/* 104 */     this.ocelotBackLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 105 */     this.ocelotBackRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 106 */     this.ocelotFrontLeftLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 107 */     this.ocelotFrontRightLeg.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelLion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */