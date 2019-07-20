package fr.frenchuranoscopidae.moreslabs;

import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class TestBlock extends SlabBlock
{
    public TestBlock()
    {
        super(Properties.create(Material.ANVIL));
        setRegistryName(new ResourceLocation(MoreSlabs.MODID, "testblock"));
    }
}
