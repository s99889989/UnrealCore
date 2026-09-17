package com.daxton.unrealcore.server.entity.content;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UnrealEntity {

    //實體
    private Entity entity;

    public UnrealEntity(Entity entity) {
        this.entity = entity;
    }

    public Location getLocation() {
        return entity.getLocation();
    }

}
