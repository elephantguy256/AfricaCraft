package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderAardwolf extends RenderLiving<EntityAardwolf> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/aardwolf.png");

    public static final Factory FACTORY = new Factory();

    public RenderAardwolf(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAardwolf(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityAardwolf entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityAardwolf> {

        @Override
        public Render<? super EntityAardwolf> createRenderFor(RenderManager manager) {
            return new RenderAardwolf(manager);
        }

    }

}