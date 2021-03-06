package ru.vovamaster99.oblocks2.items;

import ru.vovamaster99.oblocks2.OB;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class OBItems {

	public static Item crystal;
	public static Item polymer;
	public static Item matter;
	
	public static void items() {
		
		crystal = new Effect().setUnlocalizedName("crystal").setTextureName("oblocks2:crystal").setCreativeTab(OB.obitems);
		polymer = new Item().setUnlocalizedName("polymer").setTextureName("oblocks2:polymer").setCreativeTab(OB.obitems);
		matter = new Effect().setUnlocalizedName("matter").setTextureName("oblocks2:matter").setCreativeTab(OB.obitems);
		
		GameRegistry.registerItem(crystal, "crystal");
		GameRegistry.registerItem(polymer, "polymer");
		GameRegistry.registerItem(matter, "matter");
		
	}
}
