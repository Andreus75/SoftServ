package rada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Faction> verhovnaRada = new HashMap<>();
        

		
		

		
		Deputat deputat1 = new Deputat(65, 154, "Vasya", "Pupkin", 34, false, 1000);
		Deputat deputat2 = new Deputat(90, 180, "Ivan", "Dolya", 45, true, 10000);
		Deputat deputat3 = new Deputat(80, 175, "Kolya", "Baraban", 44, false, 3000);
		Deputat deputat4 = new Deputat(85, 182, "Olya", "Suslova", 38, true, 50000);
		Deputat deputat5 = new Deputat(55, 164, "Inna", "Grim", 30, false, 1000);
		Deputat deputat6 = new Deputat(72, 168, "Kolya", "Kvas", 40, false, 0);
		Deputat deputat7 = new Deputat(65, 164, "Andriy", "Kolobok", 33, false, 100);
		Deputat deputat8 = new Deputat(55, 166, "Gulia", "Tumoshenko", 32, true, 1000);
		Deputat deputat9 = new Deputat(74, 174, "Volodia", "Popo", 35, true, 50000);
		Deputat deputat10 = new Deputat(55, 154, "Sergiy", "Kvas", 28, false, 1000);
		Deputat deputat11 = new Deputat(78, 164, "Alisa", "Kiva", 34, true, 2500);
		
List<Deputat> deputatsleft = new ArrayList<Deputat>();
deputatsleft.add(deputat3);
deputatsleft.add(deputat5);
deputatsleft.add(deputat7);
deputatsleft.add(deputat9);		
Faction factionleft = new Faction(deputatsleft);


List<Deputat> deputatsright = new ArrayList<Deputat>();
deputatsright.add(deputat2);
deputatsright.add(deputat4);
deputatsright.add(deputat6);
deputatsright.add(deputat8);
Faction factionright = new Faction(deputatsright);


List<Deputat> deputatscenter = new ArrayList<Deputat>();
deputatscenter.add(deputat10);
deputatscenter.add(deputat11);
Faction factioncenter = new Faction(deputatscenter);
		
		
		verhovnaRada.put("left", factionleft);
		verhovnaRada.put("right", factionright);
//		System.out.println(verhovnaRada);
//		faction.delete(br);
      while(true) {    
      int z = menu(br);
      switch (z) {
          case 1:
              int x = menu1(br);
              switch (x) {
                  case 1:
                       System.out.println("виберіть фракцію");
                      int p = menu2(br);                  
                      switch (p){                  
                          case 1:
                        	  if(verhovnaRada.get("left") != factionleft) {
                        	  verhovnaRada.put("left", factionleft);
                        	  }else {
                        		  System.out.println("Ця фракція вже присутня в ВР");
                        	  }
                        	  System.out.println("VR : " + verhovnaRada);
                        	  break;
                          case 2:
                        	  if(verhovnaRada.get("right") != factionright) {
                        	  verhovnaRada.put("right", factionright);
                        	  }else{
                        		  System.out.println("Ця фракція вже присутня в ВР");
                        	  }
                        	  System.out.println("VR : " + verhovnaRada);
                              break;
                          case 3:
                        	  if(verhovnaRada.get("centr") != factioncenter) {
                        	  verhovnaRada.put("centr", factioncenter);
                        	  }else {
                        		  System.out.println("Ця фракція присутня в ВР");
                        	  }
                        	  System.out.println("VR : " + verhovnaRada);
                              break;
                      }
                      break;
                  case 2:
                      System.out.println("видаліть фракцію");
                       int w = menu2(br);
                       switch (w) {
                       case 1:
                    	   if(verhovnaRada.get("left") == factionleft) {
                         	  verhovnaRada.remove("left");
                    	   }else {
                    		   System.out.println("Такої фракції вже немає");
                         	  }
                         	  System.out.println("VR : " + verhovnaRada);
                    	   break;
                       case 2:
                    	   if(verhovnaRada.get("right") == factionright) {
                          	  verhovnaRada.remove("right");
                     	   }else {
                     		   System.out.println("Такої фракції вже немає");
                          	  }
                          	  System.out.println("VR : " + verhovnaRada);
                    	   break;
                       case 3:
                    	   if(verhovnaRada.get("centr") == factioncenter) {
                           	  verhovnaRada.remove("centr");
                      	   }else {
                      		   System.out.println("Такої фракції вже немає");
                           	  }
                           	  System.out.println("VR : " + verhovnaRada);
                    	   break;
                       }
                      break;
                  case 3:
                      System.out.println("Вивести найбільшого хабарника");
              		int max = 0;
            		Deputat habarnuk = null;	
            		Iterator i = verhovnaRada.entrySet().iterator();
            		while( i.hasNext()) {
            			Map.Entry<String, Faction> entryi = (Entry<String, Faction>) i.next();
            			for(Deputat d : entryi.getValue().getDeputat()) {
            				if(d.getSizeOfTheBribe() > max) {
            					max = d.getSizeOfTheBribe();
            					habarnuk = d;
            				}
            			}
            		}
            		System.out.println("max habar = " + max + " habarnuk - " + habarnuk);

                      break;
              }
              break;
          case 2:
              int y = menu2(br);
              int r = menu3(br);
              switch (y){
              case 1:
                  System.out.println("Pravi");
                  switch (r){
                      case 1:
                          System.out.println("Додати депутата");
                          factionright.addDeputat(br, deputatsright);
                          System.out.println(deputatsright);
                          break;
                      case 2:
                          System.out.println("Видалити депутата");
                          factionright.deleteDeputat(br, deputatsright);
                          System.out.println(deputatsright);
                          break;
                  }
                  break;
              case 2:
                  System.out.println("Livi");
                  switch (r){
                      case 1:
                          System.out.println("Додати депутата");
                          factionleft.addDeputat(br, deputatsleft);
                          System.out.println(deputatsleft);
                          break;
                      case 2:
                    	  System.out.println("Видалити депутата");
                          factionleft.deleteDeputat(br, deputatsleft);
                          System.out.println(deputatsleft);
                          break;
                  }
                  break;
              case 3:
                  System.out.println("Center");
                  switch (r){
                      case 1:
                          System.out.println("Додати депутата");
                          factioncenter.addDeputat(br, deputatscenter);
                          System.out.println(deputatscenter);
                          break;
                      case 2:
                    	  System.out.println("Видалити депутата");
                          factioncenter.deleteDeputat(br, deputatscenter);
                          System.out.println(deputatscenter);
                          break;
                  }
                  break;
          }
              break;
          case 3:
        	  int l = menu2(br);
        	  switch (l) {
        	  case 1:
        		  System.out.println("Livi : ");
        		  int count = 1;
        		  for(Deputat d : deputatsleft) {
        			  System.out.println(count++ + ". " + d.getName() + " " + d.getSurname());
        			  d.getGrafter();
        		  }     		  
        		  break;
        		case 2:
          		  System.out.println("Pravi");
          		int count1 = 1;
      		  for(Deputat d : deputatsright) {
      			  System.out.println(count1++ + ". " + d.getName() + " " + d.getSurname());
      			  d.getGrafter();
      		  }
              break; 
        		case 3:
        			System.out.println("Center");
        			int count2 = 1;
          		  for(Deputat d : deputatscenter) {
          			  System.out.println(count2++ + ". " + d.getName() + " " + d.getSurname());
          			  d.getGrafter();
          		  }
        			break;
        		default:
              System.out.println(" Нема такого пункту");
              break;	
        	  }
          	 
      }
      }
	}
	
	
	
	
	
	
	
    public static int menu(BufferedReader br) throws NumberFormatException, IOException {
        System.out.println("        МЕНЮ        ");
        System.out.println("1. Верховна Рада");
        System.out.println("2. Фракції");
        System.out.println("3. Подивитись депутатів");
        System.out.println("Виберіть пунк меню");

        int m = Integer.valueOf(br.readLine());
        return m;
    }
	
    public static int menu1(BufferedReader br) throws NumberFormatException, IOException {
        System.out.println("        МЕНЮ        ");
        System.out.println("1. Додати фракцію");
        System.out.println("2. Вивести фракції");
        System.out.println("3. Вивести найбільшого хабарника");
        System.out.println("Виберіть пунк меню");

        int n = Integer.valueOf(br.readLine());
        return n;
    }

    public static int menu2(BufferedReader br) throws NumberFormatException, IOException {
        System.out.println("        МЕНЮ        ");
        System.out.println("1. Праві");
        System.out.println("2. Ліві");
        System.out.println("3. Центристи");
        System.out.println("Виберіть пунк меню");

//        int h = in.nextInt();
        int h = Integer.valueOf(br.readLine());
        return h;
    }
    public static int menu3(BufferedReader br) throws NumberFormatException, IOException {
        System.out.println("        МЕНЮ        ");
        System.out.println("1. Додати депутата");
        System.out.println("2. Видалити депутата");
        System.out.println("Виберіть пунк меню");

//        int k = in.nextInt();
        int k = Integer.valueOf(br.readLine());
        return k;
    }
    
    public static int menu4(BufferedReader br) throws NumberFormatException, IOException {
        System.out.println("        Вибрати депутата        ");
        System.out.println("1. Дати хабаря");


//        int p = in.nextInt();
        int p = Integer.valueOf(br.readLine());
        return p;
    }


}
