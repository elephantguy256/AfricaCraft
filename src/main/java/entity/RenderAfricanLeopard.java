package entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderAfricanLeopard extends RenderLiving<EntityAfricanLeopard> {

	private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/leopard.png");
    private ResourceLocation mobTexture1 = new ResourceLocation("wildanimals:textures/entity/predator/blackleopard.png");
    
    public static final Factory FACTORY = new Factory();

    public RenderAfricanLeopard(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAfricanLeopard(), 0.5F);
    }



    public static class Factory implements IRenderFactory<EntityAfricanLeopard> {

        @Override
        public Render<? super EntityAfricanLeopard> createRenderFor(RenderManager manager) {
            return new RenderAfricanLeopard(manager);
        }

    }

	@Override
    protected ResourceLocation getEntityTexture(EntityAfricanLeopard entity)
    {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());

        if (s != null && "Toast".equals(s))
        {
            return mobTexture;
        }
        else
        {
            switch (entity.getRabbitType())
            {
                case 0:
                default:
                    return mobTexture;
                case 1:
                    return mobTexture1;
                case 2:
                    return mobTexture1;
                case 3:
                    return mobTexture;
                case 4:
                    return mobTexture1;
                case 5:
                    return mobTexture;
                case 99:
                    return mobTexture1;
            }
        }
    }
}