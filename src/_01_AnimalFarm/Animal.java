package _01_AnimalFarm;

import java.util.Random;

public abstract class Animal {
	public abstract void makeNoise();
		
	
	public boolean tryToBreakOut() {
		Random random = new Random();
		return random.nextInt(5000) > 4000;
	}
}
