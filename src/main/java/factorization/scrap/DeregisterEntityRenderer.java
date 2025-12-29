package factorization.scrap;

import java.util.Scanner;

import net.minecraft.client.renderer.entity.RenderManager;

public class DeregisterEntityRenderer extends AbstractMapDeregister {

    public DeregisterEntityRenderer(Scanner in) {
        super(RenderManager.instance.entityRenderMap, ScannerHelper.nextClass(in));
    }
}
