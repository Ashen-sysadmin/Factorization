package factorization.migration;

import net.minecraft.nbt.NBTTagCompound;

import factorization.common.FactoryType;
import factorization.shared.TileEntityCommon;
import factorization.sockets.TileEntitySocketBase;

public class MigrationHelper {

    public static boolean migrate(byte oldVersion, FactoryType ft, TileEntityCommon tec, NBTTagCompound tag) {
        boolean any = false;
        if (tec instanceof TileEntitySocketBase && oldVersion < 2) {
            TileEntitySocketBase tesb = (TileEntitySocketBase) tec;
            tesb.migrate1to2();
            any = true;
        }
        return any;
    }
}
