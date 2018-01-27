/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelAfricanElephant
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer shape1;
/*     */   public ModelRenderer shape1_1;
/*     */   public ModelRenderer shape1_2;
/*     */   public ModelRenderer shape16;
/*     */   public ModelRenderer leg1;
/*     */   public ModelRenderer leg2;
/*     */   public ModelRenderer leg4;
/*     */   public ModelRenderer leg3;
/*     */   public ModelRenderer shape18;
/*     */   public ModelRenderer shape18_1;
/*     */   public ModelRenderer shape1_3;
/*     */   public ModelRenderer shape14;
/*     */   public ModelRenderer shape1_4;
/*     */   public ModelRenderer shape16_1;
/*     */   public ModelRenderer shape1_5;
/*     */   public ModelRenderer shape1_6;
/*     */   public ModelRenderer shape14_1;
/*     */   
/*     */   public ModelAfricanElephant()
/*     */   {
/*  35 */     this.textureWidth = 100;
/*  36 */     this.textureHeight = 100;
/*  37 */     this.shape18_1 = new ModelRenderer(this, 0, 43);
/*  38 */     this.shape18_1.setRotationPoint(-1.0F, 6.0F, -1.0F);
/*  39 */     this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
/*  40 */     this.leg3 = new ModelRenderer(this, 0, 72);
/*  41 */     this.leg3.setRotationPoint(1.0F, 7.8F, 3.3F);
/*  42 */     this.leg3.addBox(0.0F, 0.0F, 0.0F, 5, 16, 6, 0.0F);
/*  43 */     setRotateAngle(this.leg3, -0.022514747F, 0.0F, 0.0F);
/*  44 */     this.shape16_1 = new ModelRenderer(this, 35, 46);
/*  45 */     this.shape16_1.setRotationPoint(0.0F, 0.3F, 5.9F);
/*  46 */     this.shape16_1.addBox(0.8F, -0.5F, -0.2F, 2, 11, 10, 0.0F);
/*  47 */     setRotateAngle(this.shape16_1, 0.091106184F, -0.8651597F, -0.091106184F);
/*  48 */     this.shape1_6 = new ModelRenderer(this, 59, 26);
/*  49 */     this.shape1_6.setRotationPoint(0.0F, 3.9F, 0.0F);
/*  50 */     this.shape1_6.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
/*  51 */     setRotateAngle(this.shape1_6, 0.3642502F, 0.0F, 0.0F);
/*  52 */     this.shape1_3 = new ModelRenderer(this, 58, 0);
/*  53 */     this.shape1_3.setRotationPoint(0.0F, 0.0F, -3.0F);
/*  54 */     this.shape1_3.addBox(0.0F, -0.5F, 0.0F, 8, 11, 8, 0.0F);
/*  55 */     this.shape14 = new ModelRenderer(this, 0, 53);
/*  56 */     this.shape14.setRotationPoint(0.0F, 8.0F, -3.0F);
/*  57 */     this.shape14.addBox(0.3F, -0.5F, -0.1F, 2, 9, 2, 0.0F);
/*  58 */     setRotateAngle(this.shape14, -0.27314404F, -0.045553092F, 0.4098033F);
/*  59 */     this.leg1 = new ModelRenderer(this, 0, 72);
/*  60 */     this.leg1.setRotationPoint(-6.0F, 8.7F, -15.9F);
/*  61 */     this.leg1.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
/*  62 */     setRotateAngle(this.leg1, 0.022514747F, 0.0F, 0.0F);
/*  63 */     this.shape14_1 = new ModelRenderer(this, 0, 54);
/*  64 */     this.shape14_1.setRotationPoint(6.0F, -2.1F, -0.8F);
/*  65 */     this.shape14_1.addBox(-0.4F, 0.0F, -0.2F, 2, 9, 2, 0.0F);
/*  66 */     setRotateAngle(this.shape14_1, 0.0F, 0.0F, -0.7285004F);
/*  67 */     this.leg4 = new ModelRenderer(this, 0, 72);
/*  68 */     this.leg4.setRotationPoint(-6.1F, 9.0F, 3.1F);
/*  69 */     this.leg4.addBox(0.0F, 0.0F, 0.0F, 5, 15, 6, 0.0F);
/*  70 */     setRotateAngle(this.leg4, 0.022514747F, 0.0F, 0.0F);
/*  71 */     this.shape1_2 = new ModelRenderer(this, 0, 0);
/*  72 */     this.shape1_2.setRotationPoint(-4.0F, -1.0F, -23.0F);
/*  73 */     this.shape1_2.addBox(0.0F, 0.0F, 4.0F, 8, 9, 10, 0.0F);
/*  74 */     this.leg2 = new ModelRenderer(this, 0, 72);
/*  75 */     this.leg2.setRotationPoint(1.1F, 8.7F, -14.9F);
/*  76 */     this.leg2.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
/*  77 */     setRotateAngle(this.leg2, -0.022514747F, 0.0F, 0.0F);
/*  78 */     this.shape1 = new ModelRenderer(this, 0, 0);
/*  79 */     this.shape1.setRotationPoint(-6.0F, 0.0F, 10.0F);
/*  80 */     this.shape1.addBox(0.0F, 0.8F, -0.4F, 12, 26, 13, 0.0F);
/*  81 */     setRotateAngle(this.shape1, -1.5934856F, 0.0F, 0.0F);
/*  82 */     this.shape1_1 = new ModelRenderer(this, 0, 0);
/*  83 */     this.shape1_1.setRotationPoint(-6.0F, -0.5F, -8.8F);
/*  84 */     this.shape1_1.addBox(0.0F, 0.2F, -0.4F, 12, 6, 12, 0.0F);
/*  85 */     setRotateAngle(this.shape1_1, -1.5934856F, 0.0F, 0.0F);
/*  86 */     this.shape16 = new ModelRenderer(this, 35, 46);
/*  87 */     this.shape16.setRotationPoint(2.7F, -1.4F, -17.2F);
/*  88 */     this.shape16.addBox(0.0F, 0.0F, 0.0F, 2, 11, 10, 0.0F);
/*  89 */     setRotateAngle(this.shape16, -0.091106184F, 0.95609134F, -0.045553092F);
/*  90 */     this.shape1_4 = new ModelRenderer(this, 59, 26);
/*  91 */     this.shape1_4.setRotationPoint(2.6F, 5.0F, 0.0F);
/*  92 */     this.shape1_4.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
/*  93 */     setRotateAngle(this.shape1_4, -0.31869712F, 0.0F, 0.0F);
/*  94 */     this.shape18 = new ModelRenderer(this, 0, 0);
/*  95 */     this.shape18.setRotationPoint(5.0F, 2.0F, 0.3F);
/*  96 */     this.shape18.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
/*  97 */     setRotateAngle(this.shape18, 1.9123572F, 0.0F, 0.0F);
/*  98 */     this.shape1_5 = new ModelRenderer(this, 59, 26);
/*  99 */     this.shape1_5.setRotationPoint(0.0F, 8.0F, 0.0F);
/* 100 */     this.shape1_5.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
/* 101 */     setRotateAngle(this.shape1_5, 0.091106184F, 0.0F, 0.0F);
/* 102 */     this.shape18.addChild(this.shape18_1);
/* 103 */     this.shape1_3.addChild(this.shape16_1);
/* 104 */     this.shape1_5.addChild(this.shape1_6);
/* 105 */     this.shape1_2.addChild(this.shape1_3);
/* 106 */     this.shape1_2.addChild(this.shape14);
/* 107 */     this.shape14.addChild(this.shape14_1);
/* 108 */     this.shape1_3.addChild(this.shape1_4);
/* 109 */     this.shape1.addChild(this.shape18);
/* 110 */     this.shape1_4.addChild(this.shape1_5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 117 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 119 */     float scaleFactor = 2.4F;
/* 120 */     GL11.glPushMatrix();
/* 121 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 122 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);this.leg3.render(f5);
/* 123 */     this.leg3.render(f5);
/* 124 */     this.leg1.render(f5);
/* 125 */     this.leg4.render(f5);
/* 126 */     this.shape1_2.render(f5);
/* 127 */     this.leg2.render(f5);
/* 134 */     this.shape1.render(f5);
/* 136 */     this.shape1_1.render(f5);
/* 137 */     this.shape16.render(f5);
/* 138 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 146 */     modelRenderer.rotateAngleX = x;
/* 147 */     modelRenderer.rotateAngleY = y;
/* 148 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 154 */     float f6 = 57.295776F;
/* 155 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 156 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 157 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 158 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanElephant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */