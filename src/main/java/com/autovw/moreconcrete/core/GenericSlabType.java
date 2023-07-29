package com.autovw.moreconcrete.core;

import net.minecraft.util.StringRepresentable;


public enum GenericSlabType implements StringRepresentable {
   TOP("top"),
   BOTTOM("bottom"),
   NORTH("north"),
   SOUTH("south"),
   WEST("west"),
   EAST("east"),
   DOUBLE("double");

   private final String name;

   private GenericSlabType(String pName) {
      this.name = pName;
   }

   public String toString() {
      return this.name;
   }

   public String getSerializedName() {
      return this.name;
   }
}