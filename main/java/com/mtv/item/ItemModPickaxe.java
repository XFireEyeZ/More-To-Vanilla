package com.mtv.item;

import com.mtv.Reference;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe{
	
	public ItemModPickaxe(ToolMaterial material, String unlocalizedName){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}
