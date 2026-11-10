package unit3;

public class RunningRace {
	private String winner;
	private String runnerup;
	private String bronze;

	void position(Runner a, Runner b, Runner c) {
		if(a.gettime() > b.gettime() && a.gettime() > c.gettime()) 
			if(b.gettime() > c.gettime())
			  System.out.println(a.getname() +  + a.gettime() + " is the winner , " +b.getname() + b.gettime() + " , is second" + c.getname() + c.gettime() + " , third" );
			else
				System.out.println(a.getname() +  + a.gettime() + " is the winner , " +c.getname() + c.gettime() + " , is second" + b.getname() + b.gettime() + " , third" );
                winner = a.getname();
              
		
		else if(b.gettime() > c.gettime()  )
			if(a.gettime() > c.gettime())
				  System.out.println(b.getname()   + b.gettime() + " is the winner , " +a.getname() + a.gettime() + " , is second" + c.getname() + c.gettime() + " , third" );
				else
					System.out.println(b.getname()   + b.gettime() + " is the winner , " +c.getname() + c.gettime() + " , is second" + a.getname() + a.gettime() + " , third" );

		else
			if(b.gettime() > a.gettime())
			System.out.println(c.getname()   + c.gettime() + " is the winner , " +b.getname() + b.gettime() + " , is second" + a.getname() + a.gettime() + " , third" );
		    else
			System.out.println(c.getname()   + c.gettime() + " is the winner , " +a.getname() + a.gettime() + " , is second" + b.getname() + b.gettime() + " , third" );
		
			  
			
	}
	void runnerUp(Runner a, Runner b, Runner c)
}
