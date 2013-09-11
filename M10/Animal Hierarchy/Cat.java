class Cat extends Mammal {
		
		protected String colour;
		protected String breed;
		
		public Cat (double avgWeight,
			String colour, String breed) {
			super(4, 2, avgWeight);
			this.colour = colour;
			this.breed = breed;
		}
		
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		public void setBreed(String breed) {
			this.breed = breed;
		}
		
		public String getColour() {
			return colour;
		}
		
		public String getBreed() {
			return breed;
		}
		
		public String toString() {
			return String.format("\nis a " + getBreed() + " Cat with "
				+ getColour() + " colour fur" + super.toString());
		}
}