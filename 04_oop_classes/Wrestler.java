public class Wrestler
{
	private String name;
	private int weight;

	public Wrestler( String theName, int theWeight)
	{
		name= theName;
		weight=theWeight;
	}
	public int getWeight()
	{
		return weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int hashCode() {
		return this.name.hashCode() + ((Integer)this.weight).hashCode();
	}
	public boolean equals(Wrestler another) {
		if(this.hashCode()==another.hashCode()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "name: " + this.getName() + " weight: " + this.getWeight();
	} 
	

}