package ru.vovamaster99.oblocks2.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import ru.vovamaster99.oblocks2.OB;
import ru.vovamaster99.oblocks2.items.OBItems;

public class CrystalOre extends Block {
	
	public CrystalOre() {
		super(Material.rock);
		setCreativeTab(OB.obblocks);
	}
	
	@Override
    public int quantityDroppedWithBonus(int par1, Random rand) {
        return MathHelper.clamp_int(this.quantityDropped(rand) + rand.nextInt(par1 + 1), 1, 4);
    }

    @Override
    public int quantityDropped(Random rand) {
        return 2 + rand.nextInt(3);
    }
    
	@Override
	public Item getItemDropped(int par1, Random rand, int par2) {
		return OBItems.crystal;
	}
	

	
}
