package com.aleksey.merchants.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.aleksey.merchants.Core.CoinInfo;
import com.aleksey.merchants.Core.Constants;
import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Items.ItemTerra;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFlan extends ItemTerra
{
    public ItemFlan()
    {
        super();
        
        setMaxDamage(0);
        setCreativeTab(TFCTabs.TFCMisc);
        setHasSubtypes(true);
        
        MetaNames = new String[Constants.Coins.length];
        
        for(int i = 0; i < Constants.Coins.length; i++)
            MetaNames[i] = Constants.Coins[i].CoinName;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registerer)
    {
        MetaIcons = new IIcon[MetaNames.length];

        for(int i = 0; i < MetaNames.length; i++)
            MetaIcons[i] = registerer.registerIcon("merchants:flans/Flan" + MetaNames[i]);
        
        this.itemIcon = MetaIcons[0];
    }
    
    @Override
    public EnumSize getSize(ItemStack is)
    {
        return EnumSize.SMALL;
    }

    @Override
    public EnumWeight getWeight(ItemStack is)
    {
        return EnumWeight.MEDIUM;
    }
    
    @Override
    public boolean canStack()
    {
      return true;
    }
}