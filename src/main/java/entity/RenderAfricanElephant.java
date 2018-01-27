package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderAfricanElephant extends RenderLiving<EntityAfricanElephant> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/preyanimal/africanbushelephant.png");

    public static final Factory FACTORY = new Factory();

    public RenderAfricanElephant(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAfricanElephant(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityAfricanElephant entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityAfricanElephant> {

        @Override
        public Render<? super EntityAfricanElephant> createRenderFor(RenderManager manager) {
            return new RenderAfricanElephant(manager);
        }

    }

}