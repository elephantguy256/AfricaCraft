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
/*     */ public class ModelReticulatedGiraffe
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer shape1;
/*     */   public ModelRenderer leg2;
/*     */   public ModelRenderer leg1;
/*     */   public ModelRenderer leg4;
/*     */   public ModelRenderer leg3;
/*     */   public ModelRenderer shape1_1;
/*     */   public ModelRenderer shape1_2;
/*     */   public ModelRenderer shape1_3;
/*     */   public ModelRenderer shape1_4;
/*     */   public ModelRenderer shape1_5;
/*     */   public ModelRenderer shape1_6;
/*     */   public ModelRenderer shape1_7;
/*     */   public ModelRenderer shape1_8;
/*     */   public ModelRenderer shape1_9;
/*     */   public ModelRenderer shape1_10;
/*     */   public ModelRenderer shape1_11;
/*     */   public ModelRenderer shape1_12;
/*     */   
/*     */   public ModelReticulatedGiraffe()
/*     */   {
/*  34 */     this.textureWidth = 100;
/*  35 */     this.textureHeight = 50;
/*  36 */     this.shape1_8 = new ModelRenderer(this, 0, 0);
/*  37 */     this.shape1_8.setRotationPoint(0.2F, 1.5F, 1.0F);
/*  38 */     this.shape1_8.addBox(0.0F, 0.0F, 0.0F, 4, 10, 3, 0.0F);
/*  39 */     setRotateAngle(this.shape1_8, 0.0F, 0.0F, -0.22759093F);
/*  40 */     this.shape1_12 = new ModelRenderer(this, 0, 0);
/*  41 */     this.shape1_12.setRotationPoint(-4.3F, 0.0F, -1.1F);
/*  42 */     this.shape1_12.addBox(0.5F, 0.1F, 0.6F, 4, 1, 2, 0.0F);
/*  43 */     setRotateAngle(this.shape1_12, -0.13665928F, 1.821251F, 0.0F);
/*  44 */     this.leg2 = new ModelRenderer(this, 58, 20);
/*  45 */     this.leg2.setRotationPoint(-3.0F, -1.0F, 8.0F);
/*  46 */     this.leg2.addBox(0.0F, 0.0F, 0.0F, 4, 25, 3, 0.0F);
/*  47 */     this.shape1_10 = new ModelRenderer(this, 0, 0);
/*  48 */     this.shape1_10.setRotationPoint(0.9F, 0.3F, 1.3F);
/*  49 */     this.shape1_10.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
/*  50 */     setRotateAngle(this.shape1_10, -0.045553092F, 2.2310543F, -0.18203785F);
/*  51 */     this.shape1 = new ModelRenderer(this, 0, 0);
/*  52 */     this.shape1.setRotationPoint(7.0F, 3.0F, -9.0F);
/*  53 */     this.shape1.addBox(0.0F, 2.0F, 0.0F, 11, 20, 10, 0.0F);
/*  54 */     setRotateAngle(this.shape1, 1.5934856F, 0.0F, -1.548107F);
/*  55 */     this.shape1_7 = new ModelRenderer(this, 46, 0);
/*  56 */     this.shape1_7.setRotationPoint(-0.7F, 32.0F, -1.1F);
/*  57 */     this.shape1_7.addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
/*  58 */     setRotateAngle(this.shape1_7, 0.091106184F, 0.0F, -0.91053826F);
/*  59 */     this.shape1_5 = new ModelRenderer(this, 41, 40);
/*  60 */     this.shape1_5.setRotationPoint(-1.0F, 9.0F, 0.0F);
/*  61 */     this.shape1_5.addBox(0.0F, 0.0F, 0.0F, 3, 7, 2, 0.0F);
/*  62 */     this.leg3 = new ModelRenderer(this, 58, 20);
/*  63 */     this.leg3.setRotationPoint(3.0F, -1.0F, -6.6F);
/*  64 */     this.leg3.addBox(0.0F, 0.0F, 0.0F, 4, 25, 3, 0.0F);
/*  65 */     this.leg4 = new ModelRenderer(this, 58, 20);
/*  66 */     this.leg4.setRotationPoint(1.8F, -1.0F, 7.9F);
/*  67 */     this.leg4.addBox(0.0F, 0.0F, 0.0F, 4, 25, 3, 0.0F);
/*  68 */     this.shape1_9 = new ModelRenderer(this, 0, 47);
/*  69 */     this.shape1_9.setRotationPoint(-2.8F, 1.0F, 0.0F);
/*  70 */     this.shape1_9.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
/*  71 */     this.shape1_6 = new ModelRenderer(this, 76, 0);
/*  72 */     this.shape1_6.setRotationPoint(-2.0F, 3.0F, 2.0F);
/*  73 */     this.shape1_6.addBox(0.0F, 0.0F, 0.0F, 3, 28, 1, 0.0F);
/*  74 */     this.shape1_1 = new ModelRenderer(this, 0, 0);
/*  75 */     this.shape1_1.setRotationPoint(4.0F, -4.0F, -0.7F);
/*  76 */     this.shape1_1.addBox(0.0F, 0.2F, 0.0F, 6, 33, 5, 0.0F);
/*  77 */     setRotateAngle(this.shape1_1, -1.6845918F, 1.0927507F, 1.4570009F);
/*  78 */     this.shape1_3 = new ModelRenderer(this, 0, 0);
/*  79 */     this.shape1_3.setRotationPoint(6.9F, -8.0F, -9.9F);
/*  80 */     this.shape1_3.addBox(1.8F, 0.0F, 0.0F, 11, 9, 10, 0.0F);
/*  81 */     setRotateAngle(this.shape1_3, -0.31869712F, -1.548107F, 0.3642502F);
/*  82 */     this.shape1_2 = new ModelRenderer(this, 0, 0);
/*  83 */     this.shape1_2.setRotationPoint(7.0F, -5.0F, -2.0F);
/*  84 */     this.shape1_2.addBox(-2.0F, -4.0F, 0.0F, 11, 10, 10, 0.0F);
/*  85 */     setRotateAngle(this.shape1_2, -1.548107F, 0.045553092F, 1.5934856F);
/*  86 */     this.leg1 = new ModelRenderer(this, 58, 20);
/*  87 */     this.leg1.setRotationPoint(-3.0F, -1.0F, -7.0F);
/*  88 */     this.leg1.addBox(0.0F, 0.0F, 0.0F, 4, 25, 3, 0.0F);
/*  89 */     this.shape1_4 = new ModelRenderer(this, 0, 0);
/*  90 */     this.shape1_4.setRotationPoint(8.0F, 21.7F, 6.0F);
/*  91 */     this.shape1_4.addBox(0.0F, 0.0F, 0.6F, 1, 12, 1, 0.0F);
/*  92 */     setRotateAngle(this.shape1_4, -3.1415927F, 0.0F, -1.775698F);
/*  93 */     this.shape1_11 = new ModelRenderer(this, 0, 47);
/*  94 */     this.shape1_11.setRotationPoint(-0.1F, 0.0F, 4.0F);
/*  95 */     this.shape1_11.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
/*  96 */     this.shape1_7.addChild(this.shape1_8);
/*  97 */     this.shape1_10.addChild(this.shape1_12);
/*  98 */     this.shape1_7.addChild(this.shape1_10);
/*  99 */     this.shape1_1.addChild(this.shape1_7);
/* 100 */     this.shape1_4.addChild(this.shape1_5);
/* 101 */     this.shape1_7.addChild(this.shape1_9);
/* 102 */     this.shape1_1.addChild(this.shape1_6);
/* 103 */     this.shape1.addChild(this.shape1_4);
/* 104 */     this.shape1_9.addChild(this.shape1_11);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 109 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 111 */     float scaleFactor = 1.6F;
/* 112 */     GL11.glPushMatrix();
/* 113 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 114 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 115 */     this.leg3.render(f5);
/* 116 */     this.leg2.render(f5);
/* 117 */     this.shape1_2.render(f5);
/* 118 */     this.leg1.render(f5);
/* 119 */     this.shape1.render(f5);
/* 120 */     this.shape1_1.render(f5);
/* 121 */     this.leg4.render(f5);
/* 122 */     this.shape1_3.render(f5);
/* 123 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 130 */     modelRenderer.rotateAngleX = x;
/* 131 */     modelRenderer.rotateAngleY = y;
/* 132 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 138 */     float f6 = 57.295776F;
/* 139 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 140 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 141 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 142 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelReticulatedGiraffe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */