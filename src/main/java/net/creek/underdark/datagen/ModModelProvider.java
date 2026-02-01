package net.creek.underdark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Use blockStateModelGenerator.registerSimpleCubeAll() for simple block models
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Use itemModelGenerator() for simple item models
    }
}
