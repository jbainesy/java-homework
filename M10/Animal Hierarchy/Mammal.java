class Mammal extends Animal {
		
		protected double avgWeight;
		
		public Mammal (int legs, int eyes, double avgWeight) {
			super(legs, eyes);
			this.avgWeight = avgWeight;
		}
		
		public void setAvgWeight(double avgWeight) {
			this.avgWeight = avgWeight;
		}
		
		public double getAvgWeight() {
			return avgWeight;
		}
		
		public String toString() {
			return String.format("\nis a Mammal with average weight " +
				getAvgWeight() + super.toString());
		}
}