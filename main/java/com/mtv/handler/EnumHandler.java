package com.mtv.handler;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum CoreTypes implements IStringSerializable {
		BASIC("basic", 0),
		ADVANCED("advanced", 1);
		
		
		private int ID;
		private String name;
		
		private CoreTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
			
		}
		
	}
	
	public static enum OreType implements IStringSerializable {
		OVERWORLD("overworld", 0),
		NETHER("nether", 1),
		END("end", 2);
		
		private int ID;
		private String name;
		
		private OreType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
	}
	
}
