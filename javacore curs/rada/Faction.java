package rada;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Faction {
	private List<Deputat> deputats;

	
	public Faction() {

	}

	public Faction(List<Deputat> deputats) {
		this.deputats = deputats;
	}

	public List<Deputat> getDeputat() {
		return deputats;
	}

	public void setDeputat(List<Deputat> deputats) {
		this.deputats = deputats;
	}

	public void addDeputat(BufferedReader br, List<Deputat> deputats){
		System.out.println("Input info  about Deputat");			
			try {
				System.out.println("weight : ");
			int weight = Integer.valueOf(br.readLine());		
			System.out.println("growth : ");
			int growth = Integer.valueOf(br.readLine());
			System.out.println("name : ");
			String name = br.readLine();
			System.out.println("surname : ");
			String surname = br.readLine();
			System.out.println("age : ");
			int age = Integer.valueOf(br.readLine());
			System.out.println("grafter : ");
			boolean grafter = Boolean.valueOf(br.readLine());
			System.out.println("sizeOfTheBribe : ");
			int sizeOfTheBribe = Integer.valueOf(br.readLine());
			Deputat deputat = new Deputat(weight, growth, name, surname, age, grafter, sizeOfTheBribe);	
			System.out.println("111111" + deputat);
			System.out.println("2222222" + deputats);
			deputats.add(deputat);
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
	}
	
	public void deleteDeputat(BufferedReader br, List<Deputat> deputats) {
        System.out.println(deputats);
        try {
		System.out.println("Input name deputat : ");
		String name = br.readLine();
		System.out.println("Input surname deputat : ");
		String surname = br.readLine();
		Iterator<Deputat> i = deputats.iterator();
		while(i.hasNext()) {			
				Deputat d = i.next();
				if(name.equals(d.getName()) && surname.equals(d.getSurname())) {
					i.remove();
				}
				
			
		}
        } catch (IOException e) {
				e.printStackTrace();
			}
	}

	public void deleteAllSizeOfTheBribe() {
		
	}
	
	public void deleteMaxSizeOfTheBribe() {
		
	}

	public void deleteAllDeputat() {
		
	}
	public void allSumSizeOfTheBribe() {
		
	}

	@Override
	public String toString() {
		return "Faction [deputats=" + deputats + "]";
	}
	
	

	

}
