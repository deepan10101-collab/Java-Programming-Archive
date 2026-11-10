package chatbot;



import java.util.*;


 abstract class Athlete {
	private double milesRaced;
	private int races;
	private String firstName;
	private String lastName;
	private String sport;
	private double hoursTraining;

	/**
	 * Constructs an athlete with a specified name and sport; hoursTraining is
	 * Allow sport & hoursTraining to be initialized to default values;
	 * 
	 * @param fname
	 *            first name of athlete
	 * @param lname
	 *            last name of athlete
	 */
	public Athlete(String fname,String lname,String sprt,double training) {
		setFirstName(fname);
		setLastName(lname);
		setSport(sprt);
		setHoursTraining(training);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public double getHoursTraining() {
		return hoursTraining;
	}
	public void setHoursTraining(double hoursTraining) {
		this.hoursTraining = hoursTraining;
	}
	public Athlete(String fname, String lname) {
		setFirstName(fname);
		setLastName(lname);
		setHoursTraining(0);
		setSport("");
		
	}


	public String toString() {
		return (getFirstName()+" "+getLastName()+" "+getSport()+" "+getHoursTraining());
	}

	/**
	 * Increments hours of training.
	 * 
	 * @param hours   number of hours athlete trained
	 */
	public abstract void train(double hours);

	
	/**
	 * Calculates the number of calories burned
	 * based on the number of hours athlete trained
	 * 
	 */
	public abstract int caloriesBurned();
	public abstract void race(double x);


}
	

	class Runner extends Athlete{
		private String firstName;
		private double milesRaced;
		private int races;
		public double getMilesRaced() {
			return milesRaced;
		}
		public void setMilesRaced(double milesRaced) {
			this.milesRaced = milesRaced;
		}
		public int getRaces() {
			return races;
		}
		public void setRaces(int races) {
			this.races = races;
		}
		private String lastName;
		private String sport;
		private double hoursTraining;
		public Runner(String fname,String lname,String sprt,double training) {
			super(fname,lname,sprt,training);
			setMilesRaced(0);
			setRaces(0);
			
		}
		public Runner(String fname, String lname) {
			super(fname,lname);
			setMilesRaced(0);
			setRaces(0);
			
			
		}
	
		public void train(double hours) {
			setHoursTraining(getHoursTraining()+hours);
			
		}
		
		public int caloriesBurned() {
			
			return ((int)getHoursTraining()*400);
		}
		
		public void race(double x) {
			setRaces(getRaces()+1);
			setMilesRaced(getMilesRaced()+x);
			
			
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public double getHoursTraining() {
			return hoursTraining;
		}
		public void setHoursTraining(double hoursTraining) {
			this.hoursTraining = hoursTraining;
		}
		public String toString() {
			return (getFirstName()+" "+getLastName()+" "+getSport()+" "+getHoursTraining()+" "+getRaces()+" "+getMilesRaced());
		}
	}
	class Marathoner extends Runner{
        private String firstName;
		private double milesRaced;
		private int races;
		public double getMilesRaced() {
			return milesRaced;
		}
		public void setMilesRaced(double milesRaced) {
			this.milesRaced = milesRaced;
		}
		public int getRaces() {
			return races;
		}
		public void setRaces(int races) {
			this.races = races;
		}
		private String lastName;
		private String sport;
		private double hoursTraining;
		public Marathoner(String fname,String lname,String sprt,double training) {
			super(fname,lname,sprt,training);
			
			
		}
		public Marathoner(String fname, String lname) {
			super(fname,lname);
		
			
			
		}
	
		public void train(double hours) {
			setHoursTraining(getHoursTraining()+hours);
			
		}
		
		public int caloriesBurned() {
			
			return ((int)getHoursTraining()*400);
		}
		
		public void race(double x) {
            if(x>=10){
                setRaces(getRaces()+1);
			    setMilesRaced(getMilesRaced()+x);
            }
            else{
                train(x*(8.5/60));
            }
			
			
			
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public double getHoursTraining() {
			return hoursTraining;
		}
		public void setHoursTraining(double hoursTraining) {
			this.hoursTraining = hoursTraining;
		}
		public String toString() {
			return (getFirstName()+" "+getLastName()+" "+getSport()+" "+getHoursTraining()+" "+getRaces()+" "+getMilesRaced());
		}
    }
	class Wrestler extends Athlete {
		
		private String firstName;
		private String lastName;
		private String sport;
		private double hoursTraining;
		public Wrestler(String fname,String lname,String sprt,double training) {
			super(fname,lname,sprt,training);
		}
		public Wrestler(String fname, String lname) {
			super(fname,lname);
			
		}
	
		public void train(double hours) {
			setHoursTraining(getHoursTraining()+hours);
			
		}
		
		public int caloriesBurned() {
			
			return (int)getHoursTraining()*600;
		}
		
		
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public double getHoursTraining() {
			return hoursTraining;
		}
		public void setHoursTraining(double hoursTraining) {
			this.hoursTraining = hoursTraining;
		}
        public void race(double x){
           return;
        }
	}
 	


    


       



   
