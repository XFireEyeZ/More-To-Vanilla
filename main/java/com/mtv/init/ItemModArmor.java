package com.mtv.init;

import java.util.Iterator;

import com.mtv.Reference;
import com.mtv.handler.AchievementHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {
	
	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		int zincArmorPeices = 0;
		if(player.getArmorInventoryList() != null) {
			Iterator<ItemStack> iterator = player.getArmorInventoryList().iterator();
			while(iterator.hasNext()) {
				ItemStack stack = iterator.next();
				if(stack != null) {
					if(stack.getItem() instanceof ItemModArmor) {
						ItemModArmor item = (ItemModArmor) stack.getItem();
						if(item.getArmorMaterial() == ModArmor.zincMaterial) {
							zincArmorPeices++;
							continue;
					
						}
					}
				}
			}
		}
	
		if(zincArmorPeices == 4) {
			if(!player.hasAchievement(AchievementHandler.achievementZincArmor)) {
				player.addStat(AchievementHandler.achievementZincArmor);
			}
		}
	}
}
