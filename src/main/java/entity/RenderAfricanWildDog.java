package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderAfricanWildDog extends RenderLiving<EntityAfricanWildDog> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/africanwilddog.png");

    public static final Factory FACTORY = new Factory();

    public RenderAfricanWildDog(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAfricanWildDog(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityAfricanWildDog entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityAfricanWildDog> {

        @Override
        public Render<? super EntityAfricanWildDog> createRenderFor(RenderManager manager) {
            return new RenderAfricanWildDog(manager);
        }

    }

}