package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTopi extends RenderLiving<EntityTopi> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/preyanimal/topi.png");

    public static final Factory FACTORY = new Factory();

    public RenderTopi(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelTopi(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityTopi entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityTopi> {

        @Override
        public Render<? super EntityTopi> createRenderFor(RenderManager manager) {
            return new RenderTopi(manager);
        }

    }

}