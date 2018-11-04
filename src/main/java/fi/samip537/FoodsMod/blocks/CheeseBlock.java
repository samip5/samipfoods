package fi.samip537.FoodsMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CheeseBlock extends BlockBase  {

    public CheeseBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(1.5f);
        setResistance(15.0f);
    }
}
