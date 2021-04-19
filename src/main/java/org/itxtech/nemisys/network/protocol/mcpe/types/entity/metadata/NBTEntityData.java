package org.itxtech.nemisys.network.protocol.mcpe.types.entity.metadata;

import org.itxtech.nemisys.nbt.tag.CompoundTag;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class NBTEntityData extends EntityData<CompoundTag> {
    public CompoundTag tag;

    public NBTEntityData(int id, CompoundTag tag) {
        super(id);
        this.tag = tag;
    }

    @Override
    public CompoundTag getData() {
        return this.tag;
    }

    @Override
    public void setData(CompoundTag tag) {
        this.tag = tag;
    }

    @Override
    public int getType() {
        return EntityMetadata.DATA_TYPE_NBT;
    }
}
