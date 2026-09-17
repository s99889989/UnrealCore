package com.daxton.unrealcore.server.entity.content;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bukkit.entity.Player;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class UnrealPlayer extends UnrealEntity{

    public UnrealPlayer(Player player) {
        super(player);
    }

}
