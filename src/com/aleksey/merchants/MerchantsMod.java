package com.aleksey.merchants;

import com.aleksey.merchants.Core.BlockList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="MerchantsTFC", name="Merchants", version="1.0.0", dependencies="after:TerraFirmaCraft")
public class MerchantsMod
{
    @Instance("MerchantsTFC")
    public static MerchantsMod instance;

    @SidedProxy(clientSide = "com.aleksey.merchants.ClientProxy", serverSide = "com.aleksey.merchants.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //LanternConfig.loadConfig(event);
        
        BlockList.loadBlocks();
        BlockList.registerBlocks();

        //proxy.registerTickHandler();
        proxy.registerTileEntities();
                
        //ItemList.Setup();
        
        proxy.registerGuiHandler();
    }
  
    @EventHandler
    public void initialize(FMLInitializationEvent event)
    {
        //TerraFirmaCraft.packetPipeline.registerPacket(InitClientWorldPacket.class);
        
        //FMLCommonHandler.instance().bus().register(new PlayerTracker());
        
        // Register the Chunk Load/Save Handler
        //MinecraftForge.EVENT_BUS.register(new ChunkEventHandler());
        
        proxy.registerRenderInformation();
        
        //Recipes.registerRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}