package AbstractFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemyShip = null;
		
		if (typeOfShip.equals("UFO")) {
			EnemyShipFactory shipPartFactory = new UFOEnemyShipFactory();
			theEnemyShip = new UFOEnemyShip(shipPartFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		} else {
			if (typeOfShip.equals("UFO BOSS")) {
				EnemyShipFactory shipPartFactory = new UFOBossEnemyShipFactory();
				theEnemyShip = new UFOBossEnemyShip(shipPartFactory);
				theEnemyShip.setName("UFO Boss Ship");
			}
		}
		return theEnemyShip;
	}
}
