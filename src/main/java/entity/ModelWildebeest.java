/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelWildebeest
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer shape1;
/*     */   public ModelRenderer shape2;
/*     */   public ModelRenderer leg1;
/*     */   public ModelRenderer leg2;
/*     */   public ModelRenderer neck;
/*     */   public ModelRenderer leg4;
/*     */   public ModelRenderer leg3;
/*     */   public ModelRenderer shape8;
/*     */   public ModelRenderer head;
/*     */   public ModelRenderer shape11;
/*     */   public ModelRenderer shape17;
/*     */   public ModelRenderer shape12;
/*     */   public ModelRenderer shape14;
/*     */   public ModelRenderer shape12_1;
/*     */   public ModelRenderer shape14_1;
/*     */   public ModelRenderer shape13;
/*     */   public ModelRenderer shape13_1;
/*     */   public ModelRenderer shape1baby;
/*     */   public ModelRenderer shape2baby;
/*     */   public ModelRenderer leg1baby;
/*     */   public ModelRenderer leg2baby;
/*     */   public ModelRenderer neckbaby;
/*     */   public ModelRenderer leg3baby;
/*     */   public ModelRenderer leg4baby;
/*     */   public ModelRenderer shape8baby;
/*     */   public ModelRenderer headbaby;
/*     */   public ModelRenderer shape11baby;
/*     */   public ModelRenderer shape17baby;
/*     */   public ModelRenderer shape14baby;
/*     */   public ModelRenderer shape14baby_1;
/*     */   private int state;
/*     */   private float headRotationAngleX;
/*     */   
/*     */   public ModelWildebeest()
/*     */   {
/*  53 */     this.textureWidth = 64;
/*  54 */     this.textureHeight = 64;
/*  55 */     this.shape12_1 = new ModelRenderer(this, 30, 0);
/*  56 */     this.shape12_1.setRotationPoint(5.0F, -0.8F, 0.0F);
/*  57 */     this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
/*  58 */     setRotateAngle(this.shape12_1, 0.0F, -2.3675392F, -0.31869712F);
/*  59 */     this.shape13_1 = new ModelRenderer(this, 0, 2);
/*  60 */     this.shape13_1.setRotationPoint(0.0F, 0.1F, 0.0F);
/*  61 */     this.shape13_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
/*  62 */     setRotateAngle(this.shape13_1, 0.0F, 0.0F, -1.7301449F);
/*  63 */     this.shape17 = new ModelRenderer(this, 5, 34);
/*  64 */     this.shape17.setRotationPoint(0.9F, -1.4F, -3.1F);
/*  65 */     this.shape17.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
/*  66 */     this.head = new ModelRenderer(this, 27, 25);
/*  67 */     this.head.setRotationPoint(-0.9F, 0.0F, 4.6F);
/*  68 */     this.head.addBox(0.0F, 0.0F, 0.0F, 4, 8, 3, 0.0F);
/*  69 */     this.neck = new ModelRenderer(this, 0, 16);
/*  70 */     this.neck.setRotationPoint(3.2F, 0.0F, 5.7F);
/*  71 */     this.neck.addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
/*  72 */     setRotateAngle(this.neck, 0.045553092F, 0.0F, 0.0F);
/*  73 */     this.shape2 = new ModelRenderer(this, 32, 0);
/*  74 */     this.shape2.setRotationPoint(0.9F, 0.5F, -5.7F);
/*  75 */     this.shape2.addBox(0.0F, 0.0F, 0.0F, 6, 8, 6, 0.0F);
/*  76 */     setRotateAngle(this.shape2, 0.045553092F, 0.0F, 0.0F);
/*  77 */     this.leg2 = new ModelRenderer(this, 30, 14);
/*  78 */     this.leg2.setRotationPoint(4.8F, 6.7F, 3.7F);
/*  79 */     this.leg2.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/*  80 */     this.shape14_1 = new ModelRenderer(this, 24, 0);
/*  81 */     this.shape14_1.setRotationPoint(3.6F, 0.4F, 0.0F);
/*  82 */     this.shape14_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
/*  83 */     this.leg3 = new ModelRenderer(this, 46, 14);
/*  84 */     this.leg3.setRotationPoint(3.7F, 6.3F, 0.0F);
/*  85 */     this.leg3.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/*  86 */     this.shape13 = new ModelRenderer(this, 50, 0);
/*  87 */     this.shape13.setRotationPoint(0.0F, 0.1F, 0.0F);
/*  88 */     this.shape13.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
/*  89 */     setRotateAngle(this.shape13, 0.0F, -0.045553092F, -1.7301449F);
/*  90 */     this.leg1 = new ModelRenderer(this, 46, 14);
/*  91 */     this.leg1.setRotationPoint(1.0F, 6.9F, 3.9F);
/*  92 */     this.leg1.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/*  93 */     this.shape14 = new ModelRenderer(this, 24, 0);
/*  94 */     this.shape14.setRotationPoint(-1.5F, 0.5F, -0.5F);
/*  95 */     this.shape14.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
/*  96 */     this.shape1 = new ModelRenderer(this, 0, 0);
/*  97 */     this.shape1.setRotationPoint(3.8F, 8.2F, -0.1F);
/*  98 */     this.shape1.addBox(0.9F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
/*  99 */     setRotateAngle(this.shape1, 0.0F, -3.1415927F, 0.0F);
/* 100 */     this.leg4 = new ModelRenderer(this, 38, 14);
/* 101 */     this.leg4.setRotationPoint(0.3F, 6.4F, 0.0F);
/* 102 */     this.leg4.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/* 103 */     setRotateAngle(this.leg4, -0.045553092F, 0.0F, 0.0F);
/* 104 */     this.shape12 = new ModelRenderer(this, 0, 0);
/* 105 */     this.shape12.setRotationPoint(-1.1F, -1.1F, -0.2F);
/* 106 */     this.shape12.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
/* 107 */     setRotateAngle(this.shape12, 0.0F, -0.5462881F, 0.5009095F);
/* 108 */     this.shape8 = new ModelRenderer(this, 11, 40);
/* 109 */     this.shape8.setRotationPoint(1.7F, 0.5F, -0.4F);
/* 110 */     this.shape8.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
/* 111 */     setRotateAngle(this.shape8, -0.045553092F, 0.0F, 0.0F);
/* 112 */     this.shape11 = new ModelRenderer(this, 45, 38);
/* 113 */     this.shape11.setRotationPoint(1.1F, 3.9F, -0.4F);
/* 114 */     this.shape11.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
/* 115 */     this.head.addChild(this.shape12_1);
/* 116 */     this.shape12_1.addChild(this.shape13_1);
/* 117 */     this.neck.addChild(this.shape17);
/* 118 */     this.neck.addChild(this.head);
/* 119 */     this.shape1.addChild(this.neck);
/* 120 */     this.shape1.addChild(this.shape2);
/* 121 */     this.shape1.addChild(this.leg2);
/* 122 */     this.head.addChild(this.shape14_1);
/* 123 */     this.shape2.addChild(this.leg3);
/* 124 */     this.shape12.addChild(this.shape13);
/* 125 */     this.shape1.addChild(this.leg1);
/* 126 */     this.head.addChild(this.shape14);
/* 127 */     this.shape2.addChild(this.leg4);
/* 128 */     this.head.addChild(this.shape12);
/* 129 */     this.shape2.addChild(this.shape8);
/* 130 */     this.neck.addChild(this.shape11);
/*     */     
/*     */ 
/* 133 */     this.textureWidth = 64;
/* 134 */     this.textureHeight = 64;
/* 135 */     this.shape1baby = new ModelRenderer(this, 0, 0);
/* 136 */     this.shape1baby.setRotationPoint(3.8F, 8.2F, -0.1F);
/* 137 */     this.shape1baby.addBox(1.0F, 0.0F, 0.0F, 6, 8, 8, 0.0F);
/* 138 */     setRotateAngle(this.shape1baby, 0.0F, -3.1415927F, 0.0F);
/* 139 */     this.leg3baby = new ModelRenderer(this, 38, 14);
/* 140 */     this.leg3baby.setRotationPoint(0.3F, 6.4F, 0.0F);
/* 141 */     this.leg3baby.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/* 142 */     setRotateAngle(this.leg3baby, -0.045553092F, 0.0F, 0.0F);
/* 143 */     this.neckbaby = new ModelRenderer(this, 0, 16);
/* 144 */     this.neckbaby.setRotationPoint(3.2F, 0.0F, 5.7F);
/* 145 */     this.neckbaby.addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
/* 146 */     setRotateAngle(this.neckbaby, 0.045553092F, 0.0F, 0.0F);
/* 147 */     this.shape11baby = new ModelRenderer(this, 45, 34);
/* 148 */     this.shape11baby.setRotationPoint(1.4F, 3.9F, -0.4F);
/* 149 */     this.shape11baby.addBox(0.0F, 0.0F, 0.0F, 0, 4, 5, 0.0F);
/* 150 */     this.shape14baby = new ModelRenderer(this, 24, 0);
/* 151 */     this.shape14baby.setRotationPoint(-1.5F, 0.5F, -0.5F);
/* 152 */     this.shape14baby.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
/* 153 */     this.leg1baby = new ModelRenderer(this, 46, 14);
/* 154 */     this.leg1baby.setRotationPoint(1.2F, 6.9F, 3.9F);
/* 155 */     this.leg1baby.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/* 156 */     this.shape8baby = new ModelRenderer(this, 11, 40);
/* 157 */     this.shape8baby.setRotationPoint(1.7F, 0.5F, -0.4F);
/* 158 */     this.shape8baby.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
/* 159 */     setRotateAngle(this.shape8baby, -0.045553092F, 0.0F, 0.0F);
/* 160 */     this.leg2baby = new ModelRenderer(this, 30, 14);
/* 161 */     this.leg2baby.setRotationPoint(4.7F, 6.7F, 3.7F);
/* 162 */     this.leg2baby.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/* 163 */     this.shape2baby = new ModelRenderer(this, 32, 0);
/* 164 */     this.shape2baby.setRotationPoint(0.9F, 0.5F, -5.7F);
/* 165 */     this.shape2baby.addBox(0.0F, 0.0F, 0.0F, 6, 8, 6, 0.0F);
/* 166 */     setRotateAngle(this.shape2baby, 0.045553092F, 0.0F, 0.0F);
/* 167 */     this.headbaby = new ModelRenderer(this, 27, 25);
/* 168 */     this.headbaby.setRotationPoint(-0.9F, 0.0F, 4.6F);
/* 169 */     this.headbaby.addBox(0.0F, 0.0F, 0.0F, 4, 8, 3, 0.0F);
/* 170 */     this.leg4baby = new ModelRenderer(this, 46, 14);
/* 171 */     this.leg4baby.setRotationPoint(3.7F, 6.3F, 0.0F);
/* 172 */     this.leg4baby.addBox(0.0F, 0.0F, 0.0F, 2, 9, 2, 0.0F);
/* 173 */     this.shape17baby = new ModelRenderer(this, 5, 34);
/* 174 */     this.shape17baby.setRotationPoint(1.3F, -1.4F, -3.1F);
/* 175 */     this.shape17baby.addBox(0.0F, 0.0F, 0.0F, 0, 2, 9, 0.0F);
/* 176 */     this.shape14baby_1 = new ModelRenderer(this, 24, 0);
/* 177 */     this.shape14baby_1.setRotationPoint(3.6F, 0.4F, 0.0F);
/* 178 */     this.shape14baby_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
/* 179 */     this.shape2baby.addChild(this.leg3baby);
/* 180 */     this.shape1baby.addChild(this.neckbaby);
/* 181 */     this.neckbaby.addChild(this.shape11baby);
/* 182 */     this.headbaby.addChild(this.shape14baby);
/* 183 */     this.shape1baby.addChild(this.leg1baby);
/* 184 */     this.shape2baby.addChild(this.shape8baby);
/* 185 */     this.shape1baby.addChild(this.leg2baby);
/* 186 */     this.shape1baby.addChild(this.shape2baby);
/* 187 */     this.neckbaby.addChild(this.headbaby);
/* 188 */     this.shape2baby.addChild(this.leg4baby);
/* 189 */     this.neckbaby.addChild(this.shape17baby);
/* 190 */     this.headbaby.addChild(this.shape14baby_1);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 195 */     if (this.isChild)
/*     */     {
/* 197 */       float scaleFactor = 0.8F;
/* 198 */       GL11.glPushMatrix();
/* 199 */       GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 200 */       GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 201 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 202 */       this.shape1baby.render(f5);
/* 203 */       GL11.glPopMatrix();
/*     */     }
/*     */     else
/*     */     {
/* 207 */       float scaleFactor = 1.6F;
/* 208 */       GL11.glPushMatrix();
/* 209 */       GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 210 */       GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 211 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 212 */       this.shape1.render(f5);
/* 213 */       GL11.glPopMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 223 */     modelRenderer.rotateAngleX = x;
/* 224 */     modelRenderer.rotateAngleY = y;
/* 225 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
/*     */   {
/* 230 */     super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 231 */     this.leg1.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 232 */     this.leg2.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 233 */     this.leg3.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 234 */     this.leg4.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/*     */     
/* 236 */     this.leg1baby.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 237 */     this.leg2baby.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 238 */     this.leg3baby.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 239 */     this.leg4baby.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/*     */   }
/*     */   
/*     */ 
/*     */   public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
/*     */   {
/* 245 */     EntityWildebeest entitywolf = (EntityWildebeest)entitylivingbaseIn;
/*     */     
/* 247 */     if (entitywolf.isSprinting())
/*     */     {
/* 249 */       this.shape8.rotateAngleX = 1.5707964F;
/* 250 */       this.state = 2;
/*     */     }
/*     */     else
/*     */     {
/* 254 */       this.state = 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\entity\ModelWildebeest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */