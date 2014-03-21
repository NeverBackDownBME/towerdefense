package Jatszik;

public abstract class Field {

	public int position;
	private boolean built;

	public boolean isBuilt() {
		System.out.println("Operation isBuilt have been called");
		return built;
	}

	public void setBuilt(boolean built) {
		this.built = built;
		System.out.println("Operation setBuilt have been called");

	}

	

	public void CreateField() {
		// TODO - implement Field.CreateField
		System.out.println("Operation CreateField have been called");

		throw new UnsupportedOperationException();
	}

}