package entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Gerenuk AC - Bolcko
 * Created using Tabula 7.0.0
 */
public class ModelGerenuk extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer leg2;
    public ModelRenderer leg1;
    public ModelRenderer shape7;
    public ModelRenderer shape1_1;
    public ModelRenderer shape7_1;
    public ModelRenderer shape7_2;
    public ModelRenderer shape15;
    public ModelRenderer shape15_1;
    public ModelRenderer shape15_2;
    public ModelRenderer shape15_3;
    public ModelRenderer shape7_3;
    public ModelRenderer shape15_4;
    public ModelRenderer shape15_5;
    public ModelRenderer shape15_6;
    public ModelRenderer shape15_7;
    public ModelRenderer leg3;
    public ModelRenderer leg4;
    public ModelRenderer shape24;
    public ModelRenderer shape24_1;

    public ModelGerenuk() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape1_1 = new ModelRenderer(this, 21, 13);
        this.shape1_1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shape1_1.addBox(-2.5F, -3.5F, 0.0F, 5, 7, 7, 0.0F);
        this.shape7 = new ModelRenderer(this, 44, 0);
        this.shape7.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shape7.addBox(-1.5F, -10.0F, 0.0F, 3, 10, 3, 0.0F);
        this.setRotateAngle(shape7, 0.4363323129985824F, 0.0F, 0.0F);
        this.leg3 = new ModelRenderer(this, 28, 0);
        this.leg3.mirror = true;
        this.leg3.setRotationPoint(1.4F, 3.5F, 5.5F);
        this.leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape24_1 = new ModelRenderer(this, 42, 13);
        this.shape24_1.setRotationPoint(0.0F, 5.0F, -1.0F);
        this.shape24_1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape24_1, 0.17453292519943295F, 0.0F, 0.0F);
        this.shape7_2 = new ModelRenderer(this, 0, 15);
        this.shape7_2.setRotationPoint(0.0F, 1.5F, -4.0F);
        this.shape7_2.addBox(-1.0F, 0.0F, -3.0F, 2, 2, 3, 0.0F);
        this.leg2 = new ModelRenderer(this, 28, 0);
        this.leg2.setRotationPoint(1.9F, 3.5F, -2.5F);
        this.leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape15_5 = new ModelRenderer(this, 20, 4);
        this.shape15_5.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.shape15_5.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_5, 0.6108652381980153F, 0.0F, 0.0F);
        this.shape15_6 = new ModelRenderer(this, 56, 4);
        this.shape15_6.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.shape15_6.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape15_6, -0.6108652381980153F, 0.0F, -0.08726646259971647F);
        this.shape24 = new ModelRenderer(this, 38, 13);
        this.shape24.setRotationPoint(0.0F, -2.5F, 7.0F);
        this.shape24.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape24, 0.28493458845121317F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 28, 0);
        this.leg1.mirror = true;
        this.leg1.setRotationPoint(-1.9F, 3.5F, -2.5F);
        this.leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape15_2 = new ModelRenderer(this, 0, 4);
        this.shape15_2.setRotationPoint(-2.0F, 1.0F, -2.6F);
        this.shape15_2.addBox(0.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15_2, -0.4363323129985824F, 0.0F, -0.17453292519943295F);
        this.shape15_7 = new ModelRenderer(this, 20, 4);
        this.shape15_7.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.shape15_7.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(shape15_7, 0.6108652381980153F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 9.5F, -3.0F);
        this.shape1.addBox(-3.0F, -3.5F, -4.0F, 6, 7, 8, 0.0F);
        this.shape15_1 = new ModelRenderer(this, 0, 4);
        this.shape15_1.setRotationPoint(2.0F, 1.0F, -2.6F);
        this.shape15_1.addBox(-2.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(shape15_1, -0.4363323129985824F, 0.0F, 0.17453292519943295F);
        this.shape15 = new ModelRenderer(this, 0, 0);
        this.shape15.setRotationPoint(2.0F, 1.5F, -1.0F);
        this.shape15.addBox(-2.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape15, -0.2617993877991494F, 0.0F, 0.7853981633974483F);
        this.shape15_3 = new ModelRenderer(this, 0, 0);
        this.shape15_3.mirror = true;
        this.shape15_3.setRotationPoint(-2.0F, 1.5F, -1.0F);
        this.shape15_3.addBox(0.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(shape15_3, -0.2617993877991494F, 0.0F, -0.7853981633974483F);
        this.shape7_3 = new ModelRenderer(this, 10, 15);
        this.shape7_3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.shape7_3.addBox(-0.5F, 0.0F, -0.1F, 1, 2, 4, 0.0F);
        this.setRotateAngle(shape7_3, 0.2354449160940351F, 0.0F, 0.0F);
        this.shape15_4 = new ModelRenderer(this, 56, 4);
        this.shape15_4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.shape15_4.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(shape15_4, -0.6108652381980153F, 0.0F, 0.08726646259971647F);
        this.leg4 = new ModelRenderer(this, 28, 0);
        this.leg4.setRotationPoint(-1.4F, 3.5F, 5.5F);
        this.leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F);
        this.shape7_1 = new ModelRenderer(this, 45, 13);
        this.shape7_1.setRotationPoint(0.0F, -10.0F, 3.0F);
        this.shape7_1.addBox(-2.0F, 0.0F, -4.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(shape7_1, -0.4363323129985824F, 0.0F, 0.0F);
        this.shape1.addChild(this.shape1_1);
        this.shape1.addChild(this.shape7);
        this.shape1_1.addChild(this.leg3);
        this.shape24.addChild(this.shape24_1);
        this.shape7_1.addChild(this.shape7_2);
        this.shape1.addChild(this.leg2);
        this.shape15_4.addChild(this.shape15_5);
        this.shape15_2.addChild(this.shape15_6);
        this.shape1_1.addChild(this.shape24);
        this.shape1.addChild(this.leg1);
        this.shape7_1.addChild(this.shape15_2);
        this.shape15_6.addChild(this.shape15_7);
        this.shape7_1.addChild(this.shape15_1);
        this.shape7_1.addChild(this.shape15);
        this.shape7_1.addChild(this.shape15_3);
        this.shape7_2.addChild(this.shape7_3);
        this.shape15_1.addChild(this.shape15_4);
        this.shape1_1.addChild(this.leg4);
        this.shape7.addChild(this.shape7_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


/*    */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*    */   {
/* 94 */     float f6 = 57.295776F;
/*    */     
/* 96 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 97 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 98 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 99 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/*    */   }
/*    */ }
