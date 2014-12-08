package com.aleksey.merchants;

import com.aleksey.merchants.Handlers.GuiHandler;
import com.aleksey.merchants.TileEntities.TileEntityStall;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
    public void registerRenderInformation()
    {
    }
    
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityStall.class, "TileEntityStall");
    }
    
    public void registerGuiHandler()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(MerchantsMod.instance, new GuiHandler());
    }

    public boolean isRemote()
    {
        return false;
    }
}