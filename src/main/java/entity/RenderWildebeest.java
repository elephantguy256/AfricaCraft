package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderWildebeest extends RenderLiving<EntityWildebeest> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/prey/wildebeest.png");

    public static final Factory FACTORY = new Factory();

    public RenderWildebeest(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelWildebeest(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityWildebeest entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityWildebeest> {

        @Override
        public Render<? super EntityWildebeest> createRenderFor(RenderManager manager) {
            return new RenderWildebeest(manager);
        }

    }

}