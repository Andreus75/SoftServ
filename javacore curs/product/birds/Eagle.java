package birds;

public class Eagle extends FlyingBird{

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);

	}

	@Override
	public void fly() {
		System.out.println("Eagle fly");
		
	}

}
