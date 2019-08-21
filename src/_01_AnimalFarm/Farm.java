package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Pig());
		animals.add(new Cow());
		animals.add(new Sheep());
		animals.add(new Chicken());
		animals.add(new Cow());
		animals.add(new Sheep());
		for(Animal animal: animals) {
			animal.makeNoise();
			if(animal.tryToBreakOut()) {
				System.out.println("a " + animal.getClass().toString().substring(21) + " escaped");
			}
		}
	}

}
