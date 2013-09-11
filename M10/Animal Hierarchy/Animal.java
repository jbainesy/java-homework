class Animal {
		
		protected int legs;
		protected int eyes;
		
		public Animal(int legs, int eyes) {
			this.legs = legs;
			this.eyes = eyes;
		}
		
		public void setLegs(int legs) {
			this.legs = legs;
		}
		
		public void setEyes(int eyes) {
			this.eyes = eyes;
		}
		
		public int getLegs() {
			return legs;
		}
		
		public int getEyes() {
			return eyes;
		}
		
		public String toString() {
			return String.format("\nis an Animal with " + getEyes() +
				" eyes and " + getLegs() + " legs.");
		}
}