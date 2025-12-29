package factorization.shared.coremod;

import java.io.IOException;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;

public class FzAccessTransformer extends AccessTransformer {

    public FzAccessTransformer() throws IOException {
        super("META-INF/factorization_at.cfg");
    }

}
