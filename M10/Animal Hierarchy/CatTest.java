class CatTest {
	public static void main(String args[]) {
		
		Cat missy = new Cat(5.8, "Torty", "Domestic Short Hair");
		Mammal boris = new Mammal(4, 2, 5.2);
		Animal daisy = new Animal(4, 2);
		
		System.out.printf("\n\nMissy:\n%s", missy);
		System.out.printf("\n\nBoris:\n%s", boris);
		System.out.printf("\n\nDaisy:\n%s", daisy);
	}
}