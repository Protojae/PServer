package com.aelous.model.entity.npc.impl;

import com.aelous.model.entity.Entity;
import com.aelous.model.entity.combat.method.impl.MaxHitDummyCombatMethod;
import com.aelous.model.entity.npc.NPC;
import com.aelous.model.entity.player.Player;
import com.aelous.model.map.position.Tile;
import com.aelous.cache.definitions.identifiers.NpcIdentifiers;

public class MaxHitDummyNpc extends NPC {

    public MaxHitDummyNpc(int id, Tile tile) {
        super(id, tile);
        noRetaliation = true;
    }

    public MaxHitDummyNpc(Tile tile) {
        this(NpcIdentifiers.COMBAT_DUMMY, tile);
    }

    @Override
    public Entity setPositionToFace(Tile positionToFace) {
        // Implementation not needed for a dummy NPC
        return this;
    }

    @Override
    public Entity setEntityInteraction(Entity entity) {
        if (entity instanceof Player) {
            // Call the combat method to attack the dummy
            MaxHitDummyCombatMethod combatMethod = new MaxHitDummyCombatMethod();
            combatMethod.prepareAttack(entity, this);
        }
        return this;
    }

    @Override
    public NPC setHitpoints(int hitpoints) {
        // Implementation not needed for a dummy NPC
        return this;
    }
}
