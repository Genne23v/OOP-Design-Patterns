package AbstractFactory;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = MakeUFOs.orderShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderShip("UFO BOSS");
		System.out.println(theBoss + "\n");
	}

}
