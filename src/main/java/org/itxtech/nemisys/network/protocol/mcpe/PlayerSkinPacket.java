package org.itxtech.nemisys.network.protocol.mcpe;

import org.itxtech.nemisys.utils.Skin;

import java.util.UUID;

public class PlayerSkinPacket extends DataPacket {

    public UUID uuid;
    public Skin skin;
    public String newSkinName;
    public String oldSkinName;
    public boolean premium;

    @Override
    public byte pid() {
        return ProtocolInfo.PLAYER_SKIN_PACKET;
    }

    @Override
    public void decode() {
        uuid = getUUID();
        skin = getSkin();
    }

    @Override
    public void encode() {
        reset();
        putUUID(uuid);
        putSkin(skin);
    }
}
