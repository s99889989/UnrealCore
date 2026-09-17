package com.daxton.unrealcore.server.entity.content;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UnrealFake {

    private UUID uuid = UUID.randomUUID();

    private Location location = new Location(Bukkit.getWorld("world"), 0, 0, 0);

    public UnrealFake(UUID uuid, Location location) {
        this.uuid = uuid;
        this.location = location;
    }



}
