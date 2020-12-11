public class SnakeTester {
	public static void main(String[] args) {
		Snake cobra=new Snake();
		cobra.breed="cobra";
		cobra.color="black";
		cobra.isPoisonous=true;
		cobra.lifeSpan=50;
		cobra.lengthInMeters=1;
		System.out.println("details of cobra");
		System.out.println("color of cobra " +cobra.color);
		System.out.println("breed of cobra " +cobra.breed);
		System.out.println("isPoisonous of cobra " +cobra.isPoisonous);
		System.out.println("lifeSpan of cobra " +cobra.lifeSpan);
		System.out.println("lengthInMeters of cobra " +cobra.lengthInMeters);
		Snake rattleSnake=new Snake();
		rattleSnake.breed="rattle";
		rattleSnake.color="dusty";
		rattleSnake.isPoisonous=true;
		rattleSnake.lengthInMeters=1;
		rattleSnake.lifeSpan=25;
		System.out.println("details of rattleSnake");
		System.out.println("color of rattleSnake " +rattleSnake.color);
		System.out.println("breed of rattleSnake " +rattleSnake.breed);
		System.out.println("isPoisonous of rattleSnake " +rattleSnake.isPoisonous);
		System.out.println("lengthInMeters of rattleSnake " +rattleSnake.lengthInMeters);
		System.out.println("lifeSpan of rattleSnake " +rattleSnake.lifeSpan);
	}
}
	
