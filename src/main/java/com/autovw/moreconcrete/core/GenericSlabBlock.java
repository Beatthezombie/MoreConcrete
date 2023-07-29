package com.autovw.moreconcrete.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;

import javax.annotation.Nullable;

public class GenericSlabBlock extends Block implements SimpleWaterloggedBlock {
	
	private final double thickness;
	
	public VoxelShape NORTH;
    public VoxelShape SOUTH;
    public VoxelShape WEST;
    public VoxelShape EAST;
    public VoxelShape TOP;
    public VoxelShape BOTTOM;
    
    public static final EnumProperty<GenericSlabType> GENERIC_TYPE = EnumProperty.create("generic_type", GenericSlabType.class);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    
    
    public GenericSlabBlock(Properties props ) {
        super(props);
        registerDefaultState(getStateDefinition().any().setValue(BlockStateProperties.WATERLOGGED, false).setValue(GENERIC_TYPE, GenericSlabType.NORTH));
        this.thickness = 8;
        
        EAST = Block.box(0,0,0, this.thickness,16,16);
        WEST = Block.box(16 - this.thickness,0,0, 16,16,16);
        NORTH = Block.box(0,0,16 - this.thickness, 16,16,16);
        SOUTH = Block.box(0,0,0, 16,16, this.thickness);
        TOP = Block.box(0,0,0, 16, thickness,16);
        BOTTOM = Block.box(0,16 - thickness,0, 16,16,16);
    }

    
    public boolean useShapeForLightOcclusion(BlockState pState) {
    	return pState.getValue(GENERIC_TYPE) != GenericSlabType.DOUBLE;
     }

     protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(GENERIC_TYPE, WATERLOGGED);
     }

     public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
    	 GenericSlabType slabtype = pState.getValue(GENERIC_TYPE);
        switch (slabtype) {
           case DOUBLE:
              return Shapes.block();
           case TOP:
              return TOP;
           case EAST:
        	   return EAST;
           case WEST:
        	   return WEST;
           case NORTH:
        	   return NORTH;
           case SOUTH:
        	   return SOUTH;
           case BOTTOM:
        
              return BOTTOM;
           default:
        	   return SOUTH;
        }
     }

     private static Direction getEdgeNormalDirection( BlockPos pos, Vec3 clickLoc, Direction faceDir ) {
    	 double edgeWidth = 0.25D;
    	 
    	 double deltaZ = clickLoc.z - (double)pos.getZ();
		 double deltaX = clickLoc.x - (double)pos.getX();
		 double deltaY = clickLoc.y - (double)pos.getY();
		 
		 boolean upY = deltaY > 1.0f - edgeWidth;
		 boolean downY = deltaY < edgeWidth;
		 
		 boolean upX = deltaX > 1.0f - edgeWidth;
		 boolean downX = deltaX < edgeWidth;

		 boolean upZ = deltaZ > 1.0f - edgeWidth;
		 boolean downZ = deltaZ < edgeWidth;
		 
    	 if( faceDir == Direction.DOWN || faceDir == Direction.UP) {
    		 if( upZ ) {
    			 return Direction.NORTH;
    		 }
    		 else if ( downZ) {
    			 return Direction.SOUTH;
    		 }
    		 else if ( upX ) {
    			 return Direction.WEST;
    		 }
    		 else if (downX) {
    			 return Direction.EAST;
    		 }
    		 else {
    			 return faceDir;
    		 }
    		 
    	 }
    	 else {
    		 if( upY ) {
    			 return Direction.DOWN;
    		 }
    		 else if ( downY) {
    			 return Direction.UP;
    		 }
    		 else if ( faceDir == Direction.WEST || faceDir == Direction.EAST ) {
    			 if ( upZ ) {
        			 return Direction.NORTH;
        		 }
        		 else if (downZ ) {
        			 return Direction.SOUTH;
        		 }
    		 }
    		 else if ( faceDir == Direction.NORTH || faceDir == Direction.SOUTH ) {
    			 if ( upX ) {
        			 return Direction.WEST;
        		 }
        		 else if (downX ) {
        			 return Direction.EAST;
        		 }
    		 }
    		 
    		 return faceDir;
    	 } 	 
     }
     
     
     
     @Nullable
     public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockpos = pContext.getClickedPos();
        BlockState blockstate = pContext.getLevel().getBlockState(blockpos);
        // boolean sneaking = pContext.getPlayer().getPose() == Pose.CROUCHING;
        Direction direction = pContext.getClickedFace();
        
        if (blockstate.is(this)) {
        	return blockstate.setValue(GENERIC_TYPE, GenericSlabType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
        } 
        else {
           FluidState fluidstate = pContext.getLevel().getFluidState(blockpos);
           BlockState blockstate1 = this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
           direction = getEdgeNormalDirection( blockpos, pContext.getClickLocation(),direction  );
           switch( direction ) {
    	   case UP:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.TOP);
    		  break;
    	   case DOWN:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.BOTTOM);
    		   break;
    	   case SOUTH:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.SOUTH);
    		   break;
    	   case NORTH:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.NORTH);
    		   break;
    	   case WEST:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.WEST);
    		   break;
    	   case EAST:
    		   blockstate1 = blockstate1.setValue(GENERIC_TYPE, GenericSlabType.EAST);
    		   break;
    			  
           }
           return blockstate1;
        }
     }

     public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        ItemStack itemstack = pUseContext.getItemInHand();
        GenericSlabType slabtype = pState.getValue(GENERIC_TYPE);
        if (slabtype != GenericSlabType.DOUBLE && itemstack.is(this.asItem())) {
           if (pUseContext.replacingClickedOnBlock()) {
              Direction direction = pUseContext.getClickedFace();
              switch( slabtype ) {
              	case TOP:
              		return direction == Direction.UP;
				case WEST:
					return direction == Direction.WEST;
				case SOUTH:
					return direction == Direction.SOUTH;
				case NORTH:
					return direction == Direction.NORTH;
				case BOTTOM:
					return direction == Direction.DOWN;
				case EAST:
					return direction == Direction.EAST;
				case DOUBLE:
				default:
					return false;
              }
           } 
           else {
              return true;
           }
        } 
        else {
           return false;
        }
     }

     @SuppressWarnings("deprecation")
	public FluidState getFluidState(BlockState pState) {
        return pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
     }

     public boolean placeLiquid(LevelAccessor pLevel, BlockPos pPos, BlockState pState, FluidState pFluidState) {
        return pState.getValue(GENERIC_TYPE) != GenericSlabType.DOUBLE ? SimpleWaterloggedBlock.super.placeLiquid(pLevel, pPos, pState, pFluidState) : false;
     }

     public boolean canPlaceLiquid(BlockGetter pLevel, BlockPos pPos, BlockState pState, Fluid pFluid) {
        return pState.getValue(GENERIC_TYPE) != GenericSlabType.DOUBLE ? SimpleWaterloggedBlock.super.canPlaceLiquid(pLevel, pPos, pState, pFluid) : false;
     }

     /**
      * Update the provided state given the provided neighbor direction and neighbor state, returning a new state.
      * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
      * returns its solidified counterpart.
      * Note that this method should ideally consider only the specific direction passed in.
      */
     @SuppressWarnings("deprecation")
	public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        if (pState.getValue(WATERLOGGED)) {
           pLevel.scheduleTick(pCurrentPos, Fluids.WATER, Fluids.WATER.getTickDelay(pLevel));
        }

        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
     }

     public boolean isPathfindable(BlockState pState, BlockGetter pLevel, BlockPos pPos, PathComputationType pType) {
        switch (pType) {
           case LAND:
              return false;
           case WATER:
              return pLevel.getFluidState(pPos).is(FluidTags.WATER);
           case AIR:
              return false;
           default:
              return false;
        }
     }


}