package fi.samip.test.items;

import fi.samip.test.Reference;
import net.minecraft.item.ItemFood;

public class ItemSamipFood extends ItemFood {

	public final float saturation;

    public ItemSamipFood(int healAmount, float saturation, boolean isWolfFood) {
        super(healAmount, saturation, false);

        this.saturation = saturation;
        this.setUnlocalizedName(unlocalizedName);
    }
}
