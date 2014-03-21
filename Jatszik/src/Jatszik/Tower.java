package Jatszik;

public class Tower implements Stoneable {

	public int stone;
	public int distance;
	public int frequency;
	public int power;

	public void SetField() {
		// TODO - implement Tower.SetField
		System.out.println("Operation SetField have been called");
	}

	public void Shoot() {
		// TODO - implement Tower.Shoot
		System.out.println("Operation Shoot have been called");
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