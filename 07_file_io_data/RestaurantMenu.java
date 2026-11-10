package RestaurantMenu;
import java.util.*;
import java.io.*;
public class RestaurantMenu {
	
	public static void main(String[] args) throws IOException{
		File a=new File("CountryPlaceMenu.dat");
		Scanner b=new Scanner(a);
		Map<String,ArrayList<String>> foods=new HashMap<>();
		
		while(b.hasNext()) {
			String[] list=b.nextLine().trim().split(" ");
			String item="";
			for(int i=1;i<list.length;i++) {
				item=item+list[i]+" ";
			}
			item=item.trim();
			if(foods.containsKey(list[0])) {
				foods.get(list[0]).add(item);
			}
			else {
				foods.put(list[0], new ArrayList<String>());
				foods.get(list[0]).add(item);
			}
		}
	//	prints(foods);
		System.out.println(cheese(foods));
	}
	public static void prints(Map<String,ArrayList<String>> a) {
		for(String type:a.keySet()) {
			System.out.println(type+":");
			for(String x:a.get(type)) {
				System.out.print(x+", ");
			}
			System.out.println();
		}
	}
	
	public static Set<String> print2(Map<String,ArrayList<String>> a) {
		Set<String> one = new HashSet();
		for(String x : a.keySet()) {
			for(String y : a.get(x)) {
				String[] number = y.split(" ");
				if(number.length == 2) {
					one.add(y);
				}
			}
		}
	return one;
	}
	
	public static Set<String> cheese(Map<String,ArrayList<String>> a){
		
		Set<String> one = new HashSet();
		for(String x : a.keySet()) {
			for(String y : a.get(x)) {
				
				if(y.toLowerCase().indexOf("cheese")>=0) {
					one.add(y);
				}
			}
		}
	return one;
		
	}
	
	
}
