package Strategy;

import java.util.LinkedList;

import Singleton.Singleton;

public class GetTiles implements Runnable {

	@Override
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Plyaer 1: " + playerOneTiles);
		
		System.out.println("Got Tiles");
	}

}
