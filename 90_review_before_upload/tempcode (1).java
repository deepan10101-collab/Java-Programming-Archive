package day1projekt;
import java.util.*;
import java.text.*;
import java.io.*;
public class tempcode {
	
	public static void main(String[] args) throws IOException, ParseException{
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy",Locale.US);
		File a=new File("H:\\day1projekt\\supplyOrders.dat");
		Scanner b=new Scanner(a);
		
		Map<Date,LinkedList<Order>> stuffs=new HashMap<>();
		int x=Integer.parseInt(b.nextLine());
		for(int i=0;i<x;i++) {
			String y=b.nextLine();
			String[] one = y.split(" ");
			Date curr=sdf.parse(one[0]);
			
			
				if(!stuffs.containsKey(curr)) {
					LinkedList<Order> m=new LinkedList<>();
					int yo=one[1].indexOf("#");
					Order n=new Order(Integer.parseInt(one[1].substring(yo+1)),one[1].substring(0,yo));
					for(int z=2;z<one.length;z++) {
						int bo=one[z].indexOf("-");
						n.add(one[z].substring(0,bo), Integer.parseInt(one[z].substring(bo+1)));
					}
					m.add(n);
					stuffs.put(curr, m);
					
			}
				else {
					
					int yo=one[1].indexOf("#");
					Order bn=exists(stuffs.get(curr),one[1].substring(0,yo),Integer.parseInt(one[1].substring(yo+1)));
					if(bn!=null) {
						for(int z=2;z<one.length;z++) {
							int bo=one[z].indexOf("-");
							bn.add(one[z].substring(0,bo), Integer.parseInt(one[z].substring(bo+1)));
						}
					}
					else {
						Order n=new Order(Integer.parseInt(one[1].substring(yo+1)),one[1].substring(0,yo));
						for(int z=2;z<one.length;z++) {
							int bo=one[z].indexOf("-");
							n.add(one[z].substring(0,bo), Integer.parseInt(one[z].substring(bo+1)));
						}
						stuffs.get(curr).add(n);
						
					}
					
					
				}
				
		}
		
		for(Date c:stuffs.keySet()) {
			System.out.println("Date: "+sdf.format(c));
			System.out.println(stuffs.get(c));
			
		}
	}
	public static Order exists(LinkedList<Order> temp,String name,int ind) {
		ListIterator<Order> it=temp.listIterator();
		while(it.hasNext()) {
			Order f=it.next();
			if(f.getName().equals(name)&&f.getInd()==ind) {
				return f;
			}
		}
		return null;
	}
	
}


class Order{
	private String name;
	private int ind;
	private Map<String,Integer> objs;
	public Order(int x,String s) {
		objs=new HashMap<>();
		objs.put("napkins", 0);
		objs.put("burgers", 0);
		objs.put("buns", 0);
		objs.put("cokesyrup", 0);
		objs.put("straws", 0);
		objs.put("fries", 0);
		objs.put("cups", 0);
		name=s;
		ind=x;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInd() {
		return ind;
	}
	public void setInd(int ind) {
		this.ind = ind;
	}
	public Map<String, Integer> getObjs() {
		return objs;
	}
	public void setObjs(Map<String, Integer> objs) {
		this.objs = objs;
	}
	public void add(String a,int x) {
		objs.put(a, objs.get(a)+x);
	}
	public String toString() {
		return "Restraunt: "+name+" #"+ind+" "+objs.toString();
	}
	
	
}