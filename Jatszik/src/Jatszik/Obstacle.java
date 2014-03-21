package Jatszik;

public class Obstacle implements Stoneable {

	public int stone;
	public int slowDown;

	public void getSlowDown() {
		// TODO - implement Obstacle.getSlowDown		
		System.out.println("Operation getSlowDown have been called");

	}

	@Override
	public void PlaceStone() {
		// TODO Auto-generated method stub
		System.out.println("Operation PlaceStone have been called");

		
	}

	@Override
	public void UpdateStats() {
		// TODO Auto-generated method stub
		System.out.println("Operation UpdateStats have been called");

		
	}

}