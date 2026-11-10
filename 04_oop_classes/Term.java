package chatbot;

public class Term {


		   private int coeff;
		   private int degree;
		
		
	
	   
	   public Term(int c, int d) 
	   { 
	      coeff = c; 
	      degree = d; 
	   }
	   
	   /**
	       Adds a term. Assumes that powers are equal
	      @param other the other term
	      @return the new term after addition  
	      
	   */
	  
	   public Term add(Term other)
	   {  
	      return new Term(this.getCoeff() + other.getCoeff(), this.getDegree());
	   }
	   
	    /**
	      Multiplies a term.
	      @param other the other term
	      @return the new term after multiplication   
	      
	   */
	   
	   public Term multiply(Term other)
	   {  
	      return new Term(coeff * other.coeff, degree + other.degree);
	   }
	   /**
	      Adds a coefficient.
	      @param c the coefficient to add
	   */
	   //public void add(double c)
	   { 
	    //  coeff += c;
	   } 
	   /**
	      Gets the coefficient.
	      @return the coefficient
	   */
	   public int getCoeff() 
	   { 
	      return coeff; 
	   }
	   
	   /**
	      Gets the degree.
	      @return the degree
	   */
	   public int getDegree() 
	   { 
	      return degree; 
	   }
	   public String toString()
	    {
	        return coeff+"x^"+degree;
	    }

	}

