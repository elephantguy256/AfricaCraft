package entity;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGerenuk extends RenderLiving<EntityGerenuk> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/preyanimal/gerenuk.png");
    private ResourceLocation mobTexture1 = new ResourceLocation("wildanimals:textures/entity/preyanimal/gerenuk1.png");
    
    public static final Factory FACTORY = new Factory();

    public RenderGerenuk(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelGerenuk(), 0.5F);
    }



    public static class Factory implements IRenderFactory<EntityGerenuk> {

        @Override
        public Render<? super EntityGerenuk> createRenderFor(RenderManager manager) {
            return new RenderGerenuk(manager);
        }

    }

	@Override
    protected ResourceLocation getEntityTexture(EntityGerenuk entity)
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