package Adapter;

public class TestEnemyAttacks {

	public static void main(String[] args) {
		EnemyTank rx7Tank = new EnemyTank();
		
		EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		
		System.out.println("The enemy tank");
		
		rx7Tank.assginDriver("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		System.out.println("The robot with adapter");
		
		robotAdapter.assginDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
