/*     */ package entity;
/*     */ import org.lwjgl.opengl.GL11;

/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelTopi
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer Shape1;
/*     */   public ModelRenderer Shape2;
/*     */   public ModelRenderer Shape3;
/*     */   public ModelRenderer Shape4;
/*     */   public ModelRenderer Shape4_1;
/*     */   public ModelRenderer WolfHead;
/*     */   public ModelRenderer Body;
/*     */   public ModelRenderer Mane;
/*     */   public ModelRenderer Leg1;
/*     */   public ModelRenderer Leg2;
/*     */   public ModelRenderer Leg3;
/*     */   public ModelRenderer Leg4;
/*     */   public ModelRenderer Tail;
/*     */   public ModelRenderer Ear1;
/*     */   public ModelRenderer Ear2;
/*     */   public ModelRenderer Nose;
/*     */   public ModelRenderer Tail_1;
/*     */   
/*     */   public ModelTopi()
/*     */   {
/*  35 */     this.textureWidth = 64;
/*  36 */     this.textureHeight = 32;
/*  37 */     this.Leg2 = new ModelRenderer(this, 0, 18);
/*  38 */     this.Leg2.setRotationPoint(0.5F, 13.5F, 7.0F);
/*  39 */     this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  40 */     this.Nose = new ModelRenderer(this, 46, 12);
/*  41 */     this.Nose.setRotationPoint(-0.57F, 4.23F, -8.4F);
/*  42 */     this.Nose.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F);
/*  43 */     setRotateAngle(this.Nose, 0.7285004F, -0.0F, 0.0F);
/*  44 */     this.Shape3 = new ModelRenderer(this, 52, 0);
/*  45 */     this.Shape3.setRotationPoint(-4.07F, 0.1F, -6.87F);
/*  46 */     this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
/*  47 */     setRotateAngle(this.Shape3, 0.0F, -0.0F, -0.2602286F);
/*  48 */     this.Leg3 = new ModelRenderer(this, 0, 18);
/*  49 */     this.Leg3.setRotationPoint(-3.5F, 11.8F, -4.0F);
/*  50 */     this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  51 */     this.Tail = new ModelRenderer(this, 31, 1);
/*  52 */     this.Tail.setRotationPoint(-0.5F, 11.3F, 8.8F);
/*  53 */     this.Tail.addBox(-1.0F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
/*  54 */     setRotateAngle(this.Tail, 0.27314404F, -0.0F, 0.0F);
/*  55 */     this.Ear2 = new ModelRenderer(this, 16, 14);
/*  56 */     this.Ear2.setRotationPoint(-2.27F, 4.2F, -5.73F);
/*  57 */     this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 3, 1, 0.0F);
/*  58 */     setRotateAngle(this.Ear2, -0.11152654F, 0.0F, 0.7806858F);
/*  59 */     this.Tail_1 = new ModelRenderer(this, 9, 24);
/*  60 */     this.Tail_1.setRotationPoint(-1.5F, 4.0F, -1.6F);
/*  61 */     this.Tail_1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
/*  62 */     this.Body = new ModelRenderer(this, 19, 18);
/*  63 */     this.Body.setRotationPoint(0.0F, 12.6F, 2.67F);
/*  64 */     this.Body.addBox(-4.0F, -2.0F, -3.0F, 6, 8, 6, 0.0F);
/*  65 */     setRotateAngle(this.Body, 1.5934856F, -0.0F, 0.0F);
/*  66 */     this.Leg1 = new ModelRenderer(this, 0, 18);
/*  67 */     this.Leg1.setRotationPoint(-2.5F, 14.3F, 7.0F);
/*  68 */     this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  69 */     this.Shape2 = new ModelRenderer(this, 52, 0);
/*  70 */     this.Shape2.setRotationPoint(0.8F, 0.1F, -6.6F);
/*  71 */     this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
/*  72 */     setRotateAngle(this.Shape2, 0.0F, -0.0F, 0.22305308F);
/*  73 */     this.Shape1 = new ModelRenderer(this, 23, 0);
/*  74 */     this.Shape1.setRotationPoint(-3.07F, 9.13F, -7.93F);
/*  75 */     this.Shape1.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
/*  76 */     setRotateAngle(this.Shape1, 0.5204572F, -0.0F, 0.0F);
/*  77 */     this.Shape4 = new ModelRenderer(this, 52, 0);
/*  78 */     this.Shape4.setRotationPoint(0.53F, -2.5F, -5.37F);
/*  79 */     this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
/*  80 */     setRotateAngle(this.Shape4, -0.3413864F, -0.0F, -0.037175514F);
/*  81 */     this.Leg4 = new ModelRenderer(this, 0, 18);
/*  82 */     this.Leg4.setRotationPoint(1.2F, 11.9F, -4.0F);
/*  83 */     this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  84 */     this.Ear1 = new ModelRenderer(this, 16, 14);
/*  85 */     this.Ear1.setRotationPoint(0.33F, 4.13F, -5.47F);
/*  86 */     this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 3, 1, 0.0F);
/*  87 */     setRotateAngle(this.Ear1, 0.0F, -0.0F, -0.81786126F);
/*  88 */     this.Mane = new ModelRenderer(this, 21, 1);
/*  89 */     this.Mane.setRotationPoint(0.0F, 12.47F, -0.83F);
/*  90 */     this.Mane.addBox(-4.0F, -3.0F, -3.0F, 6, 7, 6, 0.0F);
/*  91 */     setRotateAngle(this.Mane, -1.6390387F, -0.0F, 0.0F);
/*  92 */     this.WolfHead = new ModelRenderer(this, 1, 1);
/*  93 */     this.WolfHead.setRotationPoint(-0.6F, 6.07F, -6.67F);
/*  94 */     this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 5, 6, 5, 0.0F);
/*  95 */     setRotateAngle(this.WolfHead, 0.16737707F, -0.0F, 0.0F);
/*  96 */     this.Shape4_1 = new ModelRenderer(this, 52, 0);
/*  97 */     this.Shape4_1.setRotationPoint(-3.8F, -2.63F, -5.6F);
/*  98 */     this.Shape4_1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
/*  99 */     setRotateAngle(this.Shape4_1, -0.31869712F, -0.0F, 0.037175514F);
/* 100 */     this.Tail.addChild(this.Tail_1);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 105 */     float scaleFactor = 1.6F;
/* 106 */     GL11.glPushMatrix();
/* 107 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 108 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 109 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 116 */     this.Leg2.render(f5);
/* 118 */     this.Nose.render(f5);
/* 119 */     this.Shape3.render(f5);
/* 126 */     this.Leg3.render(f5);
/* 128 */     this.Tail.render(f5);
/* 129 */     this.Ear2.render(f5);
/* 136 */     this.Body.render(f5);
/* 144 */     this.Leg1.render(f5);
/* 146 */     this.Shape2.render(f5);
/* 147 */     this.Shape1.render(f5);
/* 148 */     this.Shape4.render(f5);
/* 155 */     this.Leg4.render(f5);
/* 157 */     this.Ear1.render(f5);
/* 164 */     this.Mane.render(f5);
/* 166 */     this.WolfHead.render(f5);
/* 167 */     this.Shape4_1.render(f5);
/* 168 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 175 */     modelRenderer.rotateAngleX = x;
/* 176 */     modelRenderer.rotateAngleY = y;
/* 177 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 183 */     float f6 = 57.295776F;
/* 184 */     this.Leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 185 */     this.Leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 186 */     this.Leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 187 */     this.Leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelTopi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */