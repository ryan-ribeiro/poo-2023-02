
public class TestaLivro {
	
	public static void main(String[] args) {
		
		Livro best1 = new Livro("Iron Flame (The Empyrean, 2)", 
								"Rebecca Yarros",
								2023,
								"Entangled: Red Tower Books");
		
		Livro best2 = new Livro("Going Infinite: The Rise and Fall of a New Tycoon",
								"Michael Lewis",
								2023,
								"W. W. Norton & Company");
		
		Livro best3 = new Livro("8 Little Planets: A Solar System Book for Kids with Unique Planet Cutouts",
								"Chris Ferrie",
								2018,
								"Sourcebooks Explore");
		
		System.out.println(best1.toString() + "\n");
		System.out.println(best2.toString() + "\n");
		System.out.println(best3.toString() + "\n");
		
	}
}
