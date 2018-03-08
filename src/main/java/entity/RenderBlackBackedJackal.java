package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBlackBackedJackal extends RenderLiving<EntityBlackBackedJackal> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/bbjackal.png");

    public static final Factory FACTORY = new Factory();

    public RenderBlackBackedJackal(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelBlackBackedJackal(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBlackBackedJackal entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityBlackBackedJackal> {

        @Override
        public Render<? super EntityBlackBackedJackal> createRenderFor(RenderManager manager) {
            return new RenderBlackBackedJackal(manager);
        }

    }

}