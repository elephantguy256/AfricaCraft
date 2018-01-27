/*     */ package entity.baby;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelSpottedHyenaBaby
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer shape1;
/*     */   public ModelRenderer shape2;
/*     */   public ModelRenderer shape4;
/*     */   public ModelRenderer neck11;
/*     */   public ModelRenderer leg11;
/*     */   public ModelRenderer leg22;
/*     */   public ModelRenderer shape3;
/*     */   public ModelRenderer leg44;
/*     */   public ModelRenderer leg33;
/*     */   public ModelRenderer tail11;
/*     */   public ModelRenderer shape11;
/*     */   public ModelRenderer shape12;
/*     */   public ModelRenderer shape13;
/*     */   public ModelRenderer shape11_1;
/*     */   public ModelRenderer shape12_1;
/*     */   public ModelRenderer shape13_1;
/*     */   public ModelRenderer shape31;
/*     */   public ModelRenderer shape32;
/*     */   public ModelRenderer head11;
/*     */   public ModelRenderer shape7;
/*     */   public ModelRenderer shape18;
/*     */   public ModelRenderer shape18_1;
/*     */   public ModelRenderer shape8;
/*     */   public ModelRenderer shape9;
/*     */   public ModelRenderer shape11_2;
/*     */   public ModelRenderer shape12_2;
/*     */   public ModelRenderer shape13_2;
/*     */   public ModelRenderer shape11_3;
/*     */   public ModelRenderer shape12_3;
/*     */   public ModelRenderer shape13_3;
/*     */   
/*     */   public ModelSpottedHyenaBaby()
/*     */   {
/*  45 */     this.textureWidth = 64;
/*  46 */     this.textureHeight = 32;
/*  47 */     this.shape13 = new ModelRenderer(this, 32, 0);
/*  48 */     this.shape13.setRotationPoint(-0.5F, 1.8F, -1.0F);
/*  49 */     this.shape13.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
/*  50 */     this.shape31 = new ModelRenderer(this, 49, 14);
/*  51 */     this.shape31.setRotationPoint(-0.5F, 2.1F, -0.2F);
/*  52 */     this.shape31.addBox(0.0F, 0.0F, -0.4F, 2, 3, 2, 0.0F);
/*  53 */     setRotateAngle(this.shape31, 0.18203785F, 0.0F, 0.0F);
/*  54 */     this.leg11 = new ModelRenderer(this, 54, 0);
/*  55 */     this.leg11.setRotationPoint(-0.3F, 1.3F, 0.2F);
/*  56 */     this.leg11.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
/*  57 */     setRotateAngle(this.leg11, 0.13665928F, 0.0F, 0.0F);
/*  58 */     this.shape18_1 = new ModelRenderer(this, 32, 3);
/*  59 */     this.shape18_1.setRotationPoint(3.2F, -1.3F, 1.6F);
/*  60 */     this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
/*  61 */     this.shape13_1 = new ModelRenderer(this, 26, 14);
/*  62 */     this.shape13_1.setRotationPoint(-0.5F, 2.0F, -1.0F);
/*  63 */     this.shape13_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
/*  64 */     this.neck11 = new ModelRenderer(this, 33, 7);
/*  65 */     this.neck11.setRotationPoint(0.4F, -0.3F, -2.0F);
/*  66 */     this.neck11.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
/*  67 */     setRotateAngle(this.neck11, -0.18203785F, 0.0F, 0.0F);
/*  68 */     this.leg33 = new ModelRenderer(this, 18, 10);
/*  69 */     this.leg33.setRotationPoint(1.9F, 0.9F, -1.0F);
/*  70 */     this.leg33.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
/*  71 */     setRotateAngle(this.leg33, 0.22759093F, 0.0F, 0.0F);
/*  72 */     this.shape13_2 = new ModelRenderer(this, 23, 17);
/*  73 */     this.shape13_2.setRotationPoint(-0.5F, 2.6F, -1.0F);
/*  74 */     this.shape13_2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
/*  75 */     this.shape7 = new ModelRenderer(this, 31, 16);
/*  76 */     this.shape7.setRotationPoint(0.5F, 1.4F, -2.0F);
/*  77 */     this.shape7.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  78 */     setRotateAngle(this.shape7, 0.3642502F, 0.0F, 0.0F);
/*  79 */     this.shape4 = new ModelRenderer(this, 0, 0);
/*  80 */     this.shape4.setRotationPoint(1.2F, 3.1F, 3.2F);
/*  81 */     this.shape4.addBox(0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F);
/*  82 */     this.shape2 = new ModelRenderer(this, 18, 0);
/*  83 */     this.shape2.setRotationPoint(0.6F, 0.0F, 2.8F);
/*  84 */     this.shape2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
/*  85 */     setRotateAngle(this.shape2, -0.13665928F, 0.0F, 0.0F);
/*  86 */     this.shape1 = new ModelRenderer(this, 0, 0);
/*  87 */     this.shape1.setRotationPoint(0.0F, 14.1F, -0.1F);
/*  88 */     this.shape1.addBox(0.0F, 0.0F, 0.0F, 5, 5, 4, 0.0F);
/*  89 */     this.shape9 = new ModelRenderer(this, 40, 17);
/*  90 */     this.shape9.setRotationPoint(0.0F, 1.4F, 0.0F);
/*  91 */     this.shape9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
/*  92 */     this.tail11 = new ModelRenderer(this, 0, 0);
/*  93 */     this.tail11.setRotationPoint(1.1F, 0.4F, 1.4F);
/*  94 */     this.tail11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/*  95 */     setRotateAngle(this.tail11, 0.27314404F, 0.0F, 0.0F);
/*  96 */     this.shape32 = new ModelRenderer(this, 38, 0);
/*  97 */     this.shape32.setRotationPoint(0.5F, 2.7F, 0.2F);
/*  98 */     this.shape32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
/*  99 */     this.leg44 = new ModelRenderer(this, 10, 9);
/* 100 */     this.leg44.setRotationPoint(-0.5F, 1.0F, -0.7F);
/* 101 */     this.leg44.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
/* 102 */     setRotateAngle(this.leg44, 0.22759093F, 0.0F, 0.0F);
/* 103 */     this.leg22 = new ModelRenderer(this, 0, 0);
/* 104 */     this.leg22.setRotationPoint(3.4F, 1.5F, 0.2F);
/* 105 */     this.leg22.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
/* 106 */     setRotateAngle(this.leg22, 0.13665928F, 0.0F, 0.0F);
/* 107 */     this.shape12_2 = new ModelRenderer(this, 46, 7);
/* 108 */     this.shape12_2.setRotationPoint(0.0F, 1.1F, 0.5F);
/* 109 */     this.shape12_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/* 110 */     setRotateAngle(this.shape12_2, -0.045553092F, 0.0F, 0.0F);
/* 111 */     this.shape13_3 = new ModelRenderer(this, 0, 0);
/* 112 */     this.shape13_3.setRotationPoint(-0.5F, 2.6F, -1.0F);
/* 113 */     this.shape13_3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
/* 114 */     this.shape8 = new ModelRenderer(this, 14, 17);
/* 115 */     this.shape8.setRotationPoint(0.0F, -0.1F, 0.0F);
/* 116 */     this.shape8.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
/* 117 */     setRotateAngle(this.shape8, -0.31869712F, 0.0F, 0.0F);
/* 118 */     this.shape12 = new ModelRenderer(this, 18, 0);
/* 119 */     this.shape12.setRotationPoint(0.0F, 1.6F, 0.1F);
/* 120 */     this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/* 121 */     setRotateAngle(this.shape12, -0.4098033F, 0.0F, 0.0F);
/* 122 */     this.shape11_2 = new ModelRenderer(this, 26, 10);
/* 123 */     this.shape11_2.setRotationPoint(0.3F, 4.0F, 0.1F);
/* 124 */     this.shape11_2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
/* 125 */     setRotateAngle(this.shape11_2, -0.091106184F, 0.0F, 0.0F);
/* 126 */     this.shape12_3 = new ModelRenderer(this, 0, 0);
/* 127 */     this.shape12_3.setRotationPoint(0.1F, 1.0F, 0.5F);
/* 128 */     this.shape12_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
/* 129 */     setRotateAngle(this.shape12_3, -0.045553092F, 0.0F, 0.0F);
/* 130 */     this.shape12_1 = new ModelRenderer(this, 39, 2);
/* 131 */     this.shape12_1.setRotationPoint(0.0F, 1.6F, 0.1F);
/* 132 */     this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/* 133 */     setRotateAngle(this.shape12_1, -0.4098033F, 0.0F, 0.0F);
/* 134 */     this.head11 = new ModelRenderer(this, 0, 16);
/* 135 */     this.head11.setRotationPoint(0.0F, 0.4F, -2.2F);
/* 136 */     this.head11.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
/* 137 */     setRotateAngle(this.head11, 0.18203785F, 0.0F, 0.0F);
/* 138 */     this.shape3 = new ModelRenderer(this, 0, 9);
/* 139 */     this.shape3.setRotationPoint(0.5F, 0.0F, 6.0F);
/* 140 */     this.shape3.addBox(0.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F);
/* 141 */     setRotateAngle(this.shape3, -0.13665928F, 0.0F, 0.0F);
/* 142 */     this.shape11 = new ModelRenderer(this, 14, 0);
/* 143 */     this.shape11.setRotationPoint(0.3F, 4.2F, 0.1F);
/* 144 */     this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/* 145 */     setRotateAngle(this.shape11, 0.5009095F, 0.0F, 0.0F);
/* 146 */     this.shape18 = new ModelRenderer(this, 18, 3);
/* 147 */     this.shape18.setRotationPoint(-1.1F, -1.3F, 1.4F);
/* 148 */     this.shape18.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
/* 149 */     this.shape11_3 = new ModelRenderer(this, 0, 0);
/* 150 */     this.shape11_3.setRotationPoint(0.6F, 3.9F, 0.1F);
/* 151 */     this.shape11_3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
/* 152 */     setRotateAngle(this.shape11_3, -0.091106184F, 0.0F, 0.0F);
/* 153 */     this.shape11_1 = new ModelRenderer(this, 49, 0);
/* 154 */     this.shape11_1.setRotationPoint(0.6F, 4.2F, 0.1F);
/* 155 */     this.shape11_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
/* 156 */     setRotateAngle(this.shape11_1, 0.5009095F, 0.0F, 0.0F);
/* 157 */     this.shape12.addChild(this.shape13);
/* 158 */     this.tail11.addChild(this.shape31);
/* 159 */     this.shape1.addChild(this.leg11);
/* 160 */     this.head11.addChild(this.shape18_1);
/* 161 */     this.shape12_1.addChild(this.shape13_1);
/* 162 */     this.shape1.addChild(this.neck11);
/* 163 */     this.shape3.addChild(this.leg33);
/* 164 */     this.shape12_2.addChild(this.shape13_2);
/* 165 */     this.head11.addChild(this.shape7);
/* 166 */     this.shape1.addChild(this.shape4);
/* 167 */     this.shape1.addChild(this.shape2);
/* 168 */     this.shape8.addChild(this.shape9);
/* 169 */     this.shape3.addChild(this.tail11);
/* 170 */     this.shape31.addChild(this.shape32);
/* 171 */     this.shape3.addChild(this.leg44);
/* 172 */     this.shape1.addChild(this.leg22);
/* 173 */     this.shape11_2.addChild(this.shape12_2);
/* 174 */     this.shape12_3.addChild(this.shape13_3);
/* 175 */     this.shape7.addChild(this.shape8);
/* 176 */     this.shape11.addChild(this.shape12);
/* 177 */     this.leg11.addChild(this.shape11_2);
/* 178 */     this.shape11_3.addChild(this.shape12_3);
/* 179 */     this.shape11_1.addChild(this.shape12_1);
/* 180 */     this.neck11.addChild(this.head11);
/* 181 */     this.shape2.addChild(this.shape3);
/* 182 */     this.leg44.addChild(this.shape11);
/* 183 */     this.head11.addChild(this.shape18);
/* 184 */     this.leg22.addChild(this.shape11_3);
/* 185 */     this.leg33.addChild(this.shape11_1);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 190 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 191 */     this.shape1.render(f5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 198 */     modelRenderer.rotateAngleX = x;
/* 199 */     modelRenderer.rotateAngleY = y;
/* 200 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
/*     */   {
/* 206 */     super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 207 */     this.tail11.rotateAngleY = (f4 / 57.295776F);
/* 208 */     this.tail11.rotateAngleX = (f5 / 57.295776F);
/* 209 */     this.head11.rotateAngleY = (f4 / 57.295776F);
/* 210 */     this.head11.rotateAngleX = (f5 / 57.295776F);
/* 211 */     this.leg11.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 212 */     this.leg22.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 213 */     this.leg33.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 214 */     this.leg44.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 215 */     this.tail11.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\entity\baby\ModelSpottedHyenaBaby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */