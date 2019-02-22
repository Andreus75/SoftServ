package rada;

public class Deputat extends People{
	private String name;
	private String surname;
	private int age;
	private boolean grafter;
	private int sizeOfTheBribe;
	private People people;
	
	public Deputat() {
		super();
	}
	
	public Deputat(int weight, int growth, String name, String surname, int age, boolean grafter, int sizeOfTheBribe) {
		super(weight, growth);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.grafter = grafter;
		this.sizeOfTheBribe = sizeOfTheBribe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}
	
	public int getSizeOfTheBribe() {
		return sizeOfTheBribe;
	}

	public void setSizeOfTheBribe(int sizeOfTheBribe) {
		this.sizeOfTheBribe = sizeOfTheBribe;
	}

	public void getGrafter() {
		if(grafter == false) {
			 System.out.println("не бере хабарів");
		}else if(sizeOfTheBribe > 500000) {
			System.out.println("вагається");
		}else {
			System.out.println("дешевше розстріляти");
		}
	}

	@Override
	public String toString() {
		return "Deputat [name=" + name + ", surname=" + surname + ", age=" + age + ", grafter=" + grafter
				+ ", sizeOfTheBribe=" + sizeOfTheBribe + "]" + super.toString();
	}

	
	
	
	
}
