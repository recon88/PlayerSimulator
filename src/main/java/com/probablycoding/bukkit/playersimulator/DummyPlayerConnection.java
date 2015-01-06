package com.probablycoding.bukkit.playersimulator;

import net.minecraft.server.v1_8_R1.EntityPlayer;
import net.minecraft.server.v1_8_R1.EnumProtocol;
import net.minecraft.server.v1_8_R1.IChatBaseComponent;
import net.minecraft.server.v1_8_R1.MinecraftServer;
import net.minecraft.server.v1_8_R1.NetworkManager;
import net.minecraft.server.v1_8_R1.Packet;
import net.minecraft.server.v1_8_R1.PacketPlayInAbilities;
import net.minecraft.server.v1_8_R1.PacketPlayInArmAnimation;
import net.minecraft.server.v1_8_R1.PacketPlayInBlockDig;
import net.minecraft.server.v1_8_R1.PacketPlayInBlockPlace;
import net.minecraft.server.v1_8_R1.PacketPlayInChat;
import net.minecraft.server.v1_8_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_8_R1.PacketPlayInCloseWindow;
import net.minecraft.server.v1_8_R1.PacketPlayInCustomPayload;
import net.minecraft.server.v1_8_R1.PacketPlayInEnchantItem;
import net.minecraft.server.v1_8_R1.PacketPlayInEntityAction;
import net.minecraft.server.v1_8_R1.PacketPlayInFlying;
import net.minecraft.server.v1_8_R1.PacketPlayInHeldItemSlot;
import net.minecraft.server.v1_8_R1.PacketPlayInKeepAlive;
import net.minecraft.server.v1_8_R1.PacketPlayInSetCreativeSlot;
import net.minecraft.server.v1_8_R1.PacketPlayInSettings;
import net.minecraft.server.v1_8_R1.PacketPlayInSteerVehicle;
import net.minecraft.server.v1_8_R1.PacketPlayInTabComplete;
import net.minecraft.server.v1_8_R1.PacketPlayInTransaction;
import net.minecraft.server.v1_8_R1.PacketPlayInUpdateSign;
import net.minecraft.server.v1_8_R1.PacketPlayInUseEntity;
import net.minecraft.server.v1_8_R1.PacketPlayInWindowClick;
import net.minecraft.server.v1_8_R1.PlayerConnection;
import net.minecraft.server.v1_8_R1.WorldServer;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R1.CraftServer;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;

public class DummyPlayerConnection extends PlayerConnection {
    private boolean disconnected = false;

    public DummyPlayerConnection(MinecraftServer minecraftserver, NetworkManager networkmanager, EntityPlayer entityplayer) {
        super(minecraftserver, networkmanager, entityplayer);
    }

    @Override
    public CraftPlayer getPlayer() {
        return (this.player == null) ? null : this.player.getBukkitEntity();
    }

    @Override
    public void a() {
    }

    public NetworkManager b() {
        return this.networkManager;
    }

    public void disconnect(java.lang.String s) {
        WorldServer worldserver = player.r();

        worldserver.kill(player);
        worldserver.getPlayerChunkMap().removePlayer(player);
        ((CraftServer) Bukkit.getServer()).getHandle().players.remove(player);
        this.disconnected = true;
    }

    public void a(PacketPlayInSteerVehicle packetplayinsteervehicle) {
    }

    public void a(PacketPlayInFlying packetplayinflying) {
    }

    public void a(double d0, double d1, double d2, float f, float f1) {
    }

    public void teleport(Location dest) {
    }

    public void a(PacketPlayInBlockDig packetplayinblockdig) {
    }

    public void a(PacketPlayInBlockPlace packetplayinblockplace) {
    }

    public void a(IChatBaseComponent ichatbasecomponent) {
    }

    public void sendPacket(Packet packet) {
    }

    public void a(PacketPlayInHeldItemSlot packetplayinhelditemslot) {
    }

    public void a(PacketPlayInChat packetplayinchat) {
    }

    public void chat(String s, boolean async) {
    }

    public void a(PacketPlayInArmAnimation packetplayinarmanimation) {
    }

    public void a(PacketPlayInEntityAction packetplayinentityaction) {
    }

    public void a(PacketPlayInUseEntity packetplayinuseentity) {
    }

    public void a(PacketPlayInClientCommand packetplayinclientcommand) {
    }

    public void a(PacketPlayInCloseWindow packetplayinclosewindow) {
    }

    public void a(PacketPlayInWindowClick packetplayinwindowclick) {
    }

    public void a(PacketPlayInEnchantItem packetplayinenchantitem) {
    }

    public void a(PacketPlayInSetCreativeSlot packetplayinsetcreativeslot) {
    }

    public void a(PacketPlayInTransaction packetplayintransaction) {
    }

    public void a(PacketPlayInUpdateSign packetplayinupdatesign) {
    }

    public void a(PacketPlayInKeepAlive packetplayinkeepalive) {
    }

    public void a(PacketPlayInAbilities packetplayinabilities) {
    }

    public void a(PacketPlayInTabComplete packetplayintabcomplete) {
    }

    public void a(PacketPlayInSettings packetplayinsettings) {
    }

    public void a(PacketPlayInCustomPayload packetplayincustompayload) {
    }

    public void a(EnumProtocol enumprotocol, EnumProtocol enumprotocol1) {
    }
}
