package com.liuqihao.liuqihaomod.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record CrashPayload(String message) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<CrashPayload> TYPE =
            new CustomPacketPayload.Type<>(Identifier.fromNamespaceAndPath("liuqihao", "crash_payload"));

    public static final StreamCodec<FriendlyByteBuf, CrashPayload> STREAM_CODEC =
            CustomPacketPayload.codec(CrashPayload::write, CrashPayload::new);

    public CrashPayload(FriendlyByteBuf buf) {
        this(buf.readUtf());
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeUtf(this.message);
    }

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
