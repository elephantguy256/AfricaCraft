/*    */ package entity.baby;
/*    */ 
/*    */ import entity.EntitySpottedHyena;
import entity.ModelSpottedHyena;
import entity.RenderSpottedHyena;
/*    */ import net.minecraft.client.renderer.entity.layers.LayerRenderer;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraftforge.fml.relauncher.Side;
/*    */ import net.minecraftforge.fml.relauncher.SideOnly;
/*    */ 
@SideOnly(Side.CLIENT)
public class LayerHyena implements LayerRenderer<EntitySpottedHyena>
{
	  private static final ResourceLocation TEXTURE = new ResourceLocation("wildanimals:textures/entity/hyena/spottedhyenacub.png");
	    private final RenderSpottedHyena render;
	    private final ModelSpottedHyena pigModel = new ModelSpottedHyena();

	    public LayerHyena(RenderSpottedHyena pigRendererIn)
	    {
	        this.render = pigRendererIn;
	    }

	    public void doRenderLayer(EntitySpottedHyena e, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	    {
	        if (e.isChild())
	        {
	            this.render.bindTexture(TEXTURE);
	            this.pigModel.setModelAttributes(this.render.getMainModel());
	            this.pigModel.render(e, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	            this.pigModel.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, e);
	        }
	    }

	    public boolean shouldCombineTextures()
	    {
	        return false;
	    }
}