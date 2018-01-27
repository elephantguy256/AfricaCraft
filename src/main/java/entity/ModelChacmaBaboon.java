/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelChacmaBaboon
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer shape1;
/*     */   public ModelRenderer leg1;
/*     */   public ModelRenderer leg2;
/*     */   public ModelRenderer leg3;
/*     */   public ModelRenderer leg4;
/*     */   public ModelRenderer shape6;
/*     */   public ModelRenderer shape8;
/*     */   public ModelRenderer shape6_1;
/*     */   public ModelRenderer shape8_1;
/*     */   public ModelRenderer shape8_2;
/*     */   public ModelRenderer shape8_3;
/*     */   public ModelRenderer shape13;
/*     */   public ModelRenderer shape14;
/*     */   public ModelRenderer shape14_1;
/*     */   public ModelRenderer shape13_1;
/*     */   public ModelRenderer shape14_2;
/*     */   public ModelRenderer shape14_3;
/*     */   public ModelRenderer shape25;
/*     */   public ModelRenderer shape25_1;
/*     */   public ModelRenderer shape25_2;
/*     */   public ModelRenderer shape25_3;
/*     */   
/*     */   public ModelChacmaBaboon()
/*     */   {
/*  36 */     this.textureWidth = 64;
/*  37 */     this.textureHeight = 32;
/*  38 */     this.shape8 = new ModelRenderer(this, 0, 0);
/*  39 */     this.shape8.setRotationPoint(0.0F, 4.2F, 1.2F);
/*  40 */     this.shape8.addBox(-3.0F, 0.2F, -2.2F, 6, 7, 7, 0.0F);
/*  41 */     setRotateAngle(this.shape8, 2.6406832F, 0.0F, 0.0F);
/*  42 */     this.shape25_2 = new ModelRenderer(this, 47, 11);
/*  43 */     this.shape25_2.setRotationPoint(0.8F, 10.0F, -2.1F);
/*  44 */     this.shape25_2.addBox(-0.8F, -0.4F, 0.0F, 3, 1, 3, 0.0F);
/*  45 */     this.shape6 = new ModelRenderer(this, 0, 0);
/*  46 */     this.shape6.setRotationPoint(-0.8F, 11.3F, 1.3F);
/*  47 */     this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/*  48 */     this.shape14_1 = new ModelRenderer(this, 26, 0);
/*  49 */     this.shape14_1.setRotationPoint(0.0F, 0.0F, 2.9F);
/*  50 */     this.shape14_1.addBox(0.1F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/*  51 */     this.shape13_1 = new ModelRenderer(this, 26, 0);
/*  52 */     this.shape13_1.setRotationPoint(0.5F, 1.7F, 6.1F);
/*  53 */     this.shape13_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/*  54 */     setRotateAngle(this.shape13_1, 0.0F, 1.548107F, 0.0F);
/*  55 */     this.shape25_3 = new ModelRenderer(this, 47, 11);
/*  56 */     this.shape25_3.setRotationPoint(0.0F, 9.9F, -2.0F);
/*  57 */     this.shape25_3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  58 */     this.leg2 = new ModelRenderer(this, 0, 0);
/*  59 */     this.leg2.setRotationPoint(-0.7F, 13.1F, -8.2F);
/*  60 */     this.leg2.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
/*  61 */     this.shape6_1 = new ModelRenderer(this, 0, 0);
/*  62 */     this.shape6_1.setRotationPoint(0.0F, 9.2F, -0.1F);
/*  63 */     this.shape6_1.addBox(0.0F, -1.9F, -1.1F, 2, 7, 2, 0.0F);
/*  64 */     setRotateAngle(this.shape6_1, -1.0471976F, -0.0017453292F, 0.0F);
/*  65 */     this.leg4 = new ModelRenderer(this, 0, 0);
/*  66 */     this.leg4.setRotationPoint(-4.7F, 13.2F, 3.0F);
/*  67 */     this.leg4.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
/*  68 */     this.shape13 = new ModelRenderer(this, 26, 0);
/*  69 */     this.shape13.setRotationPoint(0.6F, 1.7F, 6.1F);
/*  70 */     this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
/*  71 */     setRotateAngle(this.shape13, 0.0F, 1.548107F, 0.0F);
/*  72 */     this.shape14_3 = new ModelRenderer(this, 26, 0);
/*  73 */     this.shape14_3.setRotationPoint(0.0F, 0.0F, 2.9F);
/*  74 */     this.shape14_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/*  75 */     this.leg3 = new ModelRenderer(this, 36, 0);
/*  76 */     this.leg3.setRotationPoint(-0.6F, 13.4F, 3.1F);
/*  77 */     this.leg3.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
/*  78 */     this.shape8_1 = new ModelRenderer(this, 28, 19);
/*  79 */     this.shape8_1.setRotationPoint(-2.0F, 5.3F, -0.2F);
/*  80 */     this.shape8_1.addBox(-1.0F, 0.3F, -2.7F, 6, 5, 7, 0.0F);
/*  81 */     setRotateAngle(this.shape8_1, 0.5462881F, 0.0F, 0.0F);
/*  82 */     this.shape8_3 = new ModelRenderer(this, 42, 8);
/*  83 */     this.shape8_3.setRotationPoint(4.0F, 3.9F, -0.1F);
/*  84 */     this.shape8_3.addBox(0.0F, -0.8F, -0.8F, 4, 3, 7, 0.0F);
/*  85 */     setRotateAngle(this.shape8_3, 1.4114478F, 0.0F, 3.1415927F);
/*  86 */     this.shape25_1 = new ModelRenderer(this, 47, 11);
/*  87 */     this.shape25_1.setRotationPoint(0.0F, 10.0F, -1.8F);
/*  88 */     this.shape25_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  89 */     this.shape14 = new ModelRenderer(this, 26, 0);
/*  90 */     this.shape14.setRotationPoint(0.1F, 0.0F, -0.5F);
/*  91 */     this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/*  92 */     this.shape25 = new ModelRenderer(this, 47, 11);
/*  93 */     this.shape25.setRotationPoint(0.0F, 10.0F, -1.7F);
/*  94 */     this.shape25.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  95 */     this.shape1 = new ModelRenderer(this, 0, 13);
/*  96 */     this.shape1.setRotationPoint(-1.1F, 13.7F, -7.5F);
/*  97 */     this.shape1.addBox(-3.5F, -0.6F, -2.6F, 7, 13, 6, 0.0F);
/*  98 */     setRotateAngle(this.shape1, 1.5025539F, 0.0F, 0.0F);
/*  99 */     this.leg1 = new ModelRenderer(this, 0, 0);
/* 100 */     this.leg1.setRotationPoint(-4.4F, 13.1F, -8.3F);
/* 101 */     this.leg1.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
/* 102 */     setRotateAngle(this.leg1, 0.045553092F, 0.0F, 0.0F);
/* 103 */     this.shape8_2 = new ModelRenderer(this, 45, 8);
/* 104 */     this.shape8_2.setRotationPoint(0.0F, 2.5F, 3.4F);
/* 105 */     this.shape8_2.addBox(0.1F, 0.0F, 0.4F, 4, 2, 6, 0.0F);
/* 106 */     setRotateAngle(this.shape8_2, -1.0927507F, 0.0F, 0.0F);
/* 107 */     this.shape14_2 = new ModelRenderer(this, 26, 0);
/* 108 */     this.shape14_2.setRotationPoint(0.1F, 0.0F, -0.5F);
/* 109 */     this.shape14_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/* 110 */     this.shape1.addChild(this.shape8);
/* 111 */     this.leg3.addChild(this.shape25_2);
/* 112 */     this.shape1.addChild(this.shape6);
/* 113 */     this.shape14.addChild(this.shape14_1);
/* 114 */     this.shape8_3.addChild(this.shape13_1);
/* 115 */     this.leg4.addChild(this.shape25_3);
/* 116 */     this.shape6.addChild(this.shape6_1);
/* 117 */     this.shape8_2.addChild(this.shape13);
/* 118 */     this.shape14_2.addChild(this.shape14_3);
/* 119 */     this.shape8.addChild(this.shape8_1);
/* 120 */     this.shape8_1.addChild(this.shape8_3);
/* 121 */     this.leg2.addChild(this.shape25_1);
/* 122 */     this.shape13.addChild(this.shape14);
/* 123 */     this.leg1.addChild(this.shape25);
/* 124 */     this.shape8_1.addChild(this.shape8_2);
/* 125 */     this.shape13_1.addChild(this.shape14_2);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 130 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 131 */     this.leg2.render(f5);
/* 132 */     this.leg4.render(f5);
/* 133 */     this.leg3.render(f5);
/* 134 */     this.shape1.render(f5);
/* 135 */     this.leg1.render(f5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 142 */     modelRenderer.rotateAngleX = x;
/* 143 */     modelRenderer.rotateAngleY = y;
/* 144 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 151 */     float f6 = 57.295776F;
/* 152 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 153 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 154 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 155 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelChacmaBaboon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */