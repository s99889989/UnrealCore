package com.daxton.unrealcore.server.entity.controller.entity;

import com.daxton.unrealcore.server.entity.content.UnrealEntity;
import com.daxton.unrealcore.server.entity.content.UnrealPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EntityController {

    //虛幻實體
    public static Map<Entity, UnrealEntity> unrealEntityMap = new ConcurrentHashMap<>();

    //虛幻顯示實體
    public static Map<Entity, UnrealEntity> unrealDisplayMap = new ConcurrentHashMap<>();

    //獲取虛幻實體 (玩家)
    public UnrealPlayer getUnrealPlayer(Player player) {
        return (UnrealPlayer) getUnrealEntity(player);
    }

    //獲取虛幻實體 ()
    public UnrealEntity getUnrealEntity(Entity entity) {

        if(unrealEntityMap.containsKey(entity)) {
            return unrealEntityMap.get(entity);
        }
        UnrealEntity unrealEntity;
        if(entity instanceof Player) {
            Player player = (Player) entity;
            unrealEntity = new UnrealPlayer(player);
        }else {
            unrealEntity = new UnrealEntity(entity);
        }
        unrealEntityMap.put(entity, unrealEntity);
        return unrealEntity;
    }

}
