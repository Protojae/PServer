package com.aelous.model.items.container.shop;

import com.aelous.utility.ItemIdentifiers;

//import static net.aelous.util.CustomItemIdentifiers.FROST_IMBUED_MAX_HOOD;
import static com.aelous.utility.ItemIdentifiers.*;

/**
 * @author Patrick van Elderen | March, 23, 2021, 23:18
 * @see <a href="https://www.rune-server.ee/members/Zerikoth/">Rune-Server profile</a>
 */
public enum SkillcapeHoods {

    ATTACK_CAPE(ATTACK_HOOD, ItemIdentifiers.ATTACK_CAPE, ATTACK_CAPET),
    DEFENCE_CAPE(DEFENCE_HOOD, ItemIdentifiers.DEFENCE_CAPE, DEFENCE_CAPET),
    STRENGTH_CAPE(STRENGTH_HOOD, ItemIdentifiers.STRENGTH_CAPE, STRENGTH_CAPET),
    HITPOINTS_CAPE(HITPOINTS_HOOD, ItemIdentifiers.HITPOINTS_CAPE, HITPOINTS_CAPET),
    RANGED_CAPE(RANGING_HOOD, ItemIdentifiers.RANGING_CAPE, RANGING_CAPET),
    PRAYER_CAPE(PRAYER_HOOD, ItemIdentifiers.PRAYER_CAPE, PRAYER_CAPET),
    MAGIC_CAPE(MAGIC_HOOD, ItemIdentifiers.MAGIC_CAPE, MAGIC_CAPET),
    COOKING_CAPE(COOKING_HOOD, ItemIdentifiers.COOKING_CAPE, COOKING_CAPET),
    WOODCUTTING_CAPE(WOODCUTTING_HOOD, ItemIdentifiers.WOODCUTTING_CAPE, WOODCUT_CAPET),
    FLETCHING_CAPE(FLETCHING_HOOD, ItemIdentifiers.FLETCHING_CAPE, FLETCHING_CAPET),
    FISHING_CAPE(FISHING_HOOD, ItemIdentifiers.FISHING_CAPE, FISHING_CAPET),
    FIREMAKING_CAPE(FIREMAKING_HOOD, ItemIdentifiers.FIREMAKING_CAPE, FIREMAKING_CAPET),
    CRAFTING_CAPE(CRAFTING_HOOD, ItemIdentifiers.CRAFTING_CAPE, CRAFTING_CAPET),
    SMITHING_CAPE(SMITHING_HOOD, ItemIdentifiers.SMITHING_CAPE, SMITHING_CAPET),
    MINING_CAPE(MINING_HOOD, ItemIdentifiers.MINING_CAPE, MINING_CAPET),
    HERBLORE_CAPE(HERBLORE_HOOD, ItemIdentifiers.HERBLORE_CAPE, HERBLORE_CAPET),
    AGILITY_CAPE(AGILITY_HOOD, ItemIdentifiers.AGILITY_CAPE, AGILITY_CAPET),
    THIEVING_CAPE(THIEVING_HOOD, ItemIdentifiers.THIEVING_CAPE, THIEVING_CAPET),
    SLAYER_CAPE(SLAYER_HOOD, ItemIdentifiers.SLAYER_CAPE, SLAYER_CAPET),
    FARMING_CAPE(FARMING_HOOD, ItemIdentifiers.FARMING_CAPE, FARMING_CAPET),
    RUNECRAFTING_CAPE(RUNECRAFT_HOOD, RUNECRAFT_CAPE, RUNECRAFT_CAPET),
    HUNTER_CAPE(HUNTER_HOOD, ItemIdentifiers.HUNTER_CAPE, HUNTER_CAPET),
    CONSTRUCTION_CAPE(CONSTRUCT_HOOD, CONSTRUCT_CAPE, CONSTRUCT_CAPET),
    QUEST_CAPE(QUEST_POINT_HOOD, QUEST_POINT_CAPE),
    MUSIC_CAPE(MUSIC_HOOD, MUSIC_CAPET),
    ACHIEVEMENT_CAPE(ACHIEVEMENT_DIARY_HOOD, ACHIEVEMENT_DIARY_CAPE, ACHIEVEMENT_DIARY_CAPE_T),
    MAX_CAPE(MAX_HOOD, ItemIdentifiers.MAX_CAPE, MAX_CAPE_13342),
    FIRE_MAX_CAPE(FIRE_MAX_HOOD, ItemIdentifiers.FIRE_MAX_CAPE),
    SARADOMIN_MAX_CAPE(SARADOMIN_MAX_HOOD, ItemIdentifiers.SARADOMIN_MAX_CAPE),
    ZAMORAK_MAX_CAPE(ZAMORAK_MAX_HOOD, ItemIdentifiers.ZAMORAK_MAX_CAPE),
    GUTHIX_MAX_CAPE(ZAMORAK_MAX_HOOD, ItemIdentifiers.GUTHIX_MAX_CAPE),
    ACCUMULATOR_MAX_CAPE(ACCUMULATOR_MAX_HOOD, ItemIdentifiers.ACCUMULATOR_MAX_CAPE),
    ARDOUGNE_MAX_CAPE(ARDOUGNE_MAX_HOOD, ItemIdentifiers.ARDOUGNE_MAX_CAPE),
    INFERNAL_MAX_CAPE_21285(INFERNAL_MAX_HOOD, ItemIdentifiers.INFERNAL_MAX_CAPE_21285),
    IMBUED_SARADOMIN_MAX_CAPE(IMBUED_SARADOMIN_MAX_HOOD, ItemIdentifiers.IMBUED_SARADOMIN_MAX_CAPE),
    IMBUED_ZAMORAK_MAX_CAPE(IMBUED_ZAMORAK_MAX_HOOD, ItemIdentifiers.IMBUED_ZAMORAK_MAX_CAPE),
    IMBUED_GUTHIX_MAX_CAPE(IMBUED_GUTHIX_MAX_HOOD, ItemIdentifiers.IMBUED_GUTHIX_MAX_CAPE),
    ASSEMBLER_MAX_CAPE(ASSEMBLER_MAX_HOOD, ItemIdentifiers.ASSEMBLER_MAX_CAPE),
    MYTHICAL_MAX_CAPE(MYTHICAL_MAX_HOOD, ItemIdentifiers.MYTHICAL_MAX_CAPE),
   // FROST_IMBUED_MAX_CAPE(FROST_IMBUED_MAX_HOOD, CustomItemIdentifiers.FROST_IMBUED_MAX_CAPE)
    ;

    private final int hood;
    private final int[] capes;

    SkillcapeHoods(int hood, int... capes) {
        this.hood = hood;
        this.capes = capes;
    }

    public int getHood() {
        return hood;
    }

    public int[] getCapes() {
        return capes;
    }
}