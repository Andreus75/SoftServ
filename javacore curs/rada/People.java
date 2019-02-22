package rada;

public class People {
	private int weight;
	private int growth;
	
	
	public People() {
	}


	public People(int weight, int growth) {
		this.weight = weight;
		this.growth = growth;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getGrowth() {
		return growth;
	}


	public void setGrowth(int growth) {
		this.growth = growth;
	}


	@Override
	public String toString() {
		return "People [weight=" + weight + ", growth=" + growth + "]";
	}
	
	
	

}
