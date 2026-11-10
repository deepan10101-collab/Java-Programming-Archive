package unit3;

import java.util.*;

public class linky {

	public static void main(String[] args) {
		Polynomial Poly1 = new Polynomial();

		Polynomial Poly2 = new Polynomial();

		Polynomial Poly3 = new Polynomial();

		Poly1.addTerm(3, 4);

		Poly1.addTerm(-2, 0);

		Poly1.addTerm(1, 3);

		Poly2.addTerm(2, 0);

		Poly2.addTerm(1, 2);

		Poly2.addTerm(3, 3);

		Poly2.addTerm(2, 1);

		Poly2.addTerm(1, 5);

		Poly3.addTerm(-3, 3);

		Poly3.addTerm(1, 2);

		Poly3.addTerm(1, 0);

		System.out.println("Poly1");

		System.out.println(Poly1.toString());

		System.out.println("Poly2");

		System.out.println(Poly2);

		System.out.println();

		System.out.println("Poly3");

		System.out.println(Poly3);

		Polynomial r = new Polynomial();

		r = Poly2.add(Poly3);

		System.out.println("Poly2+Poly3");

		System.out.println(r);

		Polynomial u = new Polynomial();

		u = Poly1.add(Poly3);

		System.out.println("Poly1+Poly3");

		System.out.println(u);

		System.out.println("Poly3*Poly3");

		Polynomial s = new Polynomial();

		s = Poly3.multiply(Poly3);

		System.out.println(s);

		System.out.println("Poly1*Poly2");

		Polynomial v = new Polynomial();

		v = Poly1.multiply(Poly2);

		System.out.println(v);

		Polynomial t = new Polynomial();

		System.out.println("Poly2 derivative;");

		t = Poly2.derivative();

		System.out.println(t);

		Polynomial x = new Polynomial();

		System.out.println("Poly1 derivative;");

		x = Poly1.derivative();

		System.out.println(x);

	}
}

class Polynomial {
	public Polynomial derivative() {

		LinkedList<Term> result = new LinkedList<>();
		ListIterator<Term> thisIter = a.listIterator();
		while (thisIter.hasNext()) {
			Term t = thisIter.next();
			result.add(new Term(t.getCoeff(), t.getDegree()));
		}
		thisIter = result.listIterator();
		while (thisIter.hasNext()) {
			Term temp = thisIter.next();
			temp.setCoeff(temp.getCoeff() * temp.getDegree());
			temp.setDegree(temp.getDegree() - 1);
			thisIter.set(temp);
		}

		thisIter = result.listIterator();
		while (thisIter.hasNext()) {
			Term temp = thisIter.next();
			if (temp.getCoeff() == 0) {
				thisIter.remove();
			}
		}
		Polynomial resultPoly = new Polynomial();
		resultPoly.a = result;
		resultPoly.removeZero();
		return resultPoly;

	}

	public Polynomial multiply(Polynomial b) {
		LinkedList<Term> result = new LinkedList<>();

		ListIterator<Term> thisIter = a.listIterator();
		while (thisIter.hasNext()) {
			Term termA = thisIter.next();

			ListIterator<Term> bIter = b.a.listIterator();
			while (bIter.hasNext()) {
				Term termB = bIter.next();
				Term product = termA.multiply(termB);

				boolean found = false;
				ListIterator<Term> resultIter = result.listIterator();
				while (resultIter.hasNext()) {
					Term termResult = resultIter.next();

					if (termResult.getDegree() == product.getDegree()) {

						Term combined = termResult.add(product);
						resultIter.set(combined);
						found = true;
						break;
					}
				}

				if (!found) {
					result.add(product);
				}
			}
		}

		Polynomial resultPoly = new Polynomial();

		resultPoly.a = result;
		resultPoly.removeZero();
		return resultPoly;
	}

	public void removeZero() {

		ListIterator<Term> x = a.listIterator();
		while (x.hasNext()) {
			Term temp = x.next();
			if (temp.getCoeff() == 0) {
				x.remove();
			}
		}
	}

	public Polynomial add(Polynomial b) {

		LinkedList<Term> result = new LinkedList<>();

		ListIterator<Term> thisIter = a.listIterator();
		while (thisIter.hasNext()) {
			Term t = thisIter.next();
			result.add(new Term(t.getCoeff(), t.getDegree()));
		}
		ListIterator<Term> bIter = b.a.listIterator();
		while (bIter.hasNext()) {
			Term termB = bIter.next();
			boolean found = false;
			ListIterator<Term> resultIter = result.listIterator();
			while (resultIter.hasNext()) {
				Term termResult = resultIter.next();

				if (termResult.getDegree() == termB.getDegree()) {

					Term combined = termResult.add(termB);
					resultIter.set(combined);
					found = true;
					break;
				}
			}

			if (!found) {
				result.add(new Term(termB.getCoeff(), termB.getDegree()));
			}
		}

		Polynomial resultPoly = new Polynomial();
		resultPoly.a = result;
		resultPoly.removeZero();
		return resultPoly;

	}

	private LinkedList<Term> a;

	public ListIterator<Term> gListIterator() {
		return a.listIterator();
	}

	public Polynomial() {

		a = new LinkedList<Term>();

	}

	public Polynomial(LinkedList<Term> f) {
		a = f;

	}

	public void addTerm(int c, int d) {
		ListIterator<Term> it = a.listIterator();
		
		while (it.hasNext()) {
			
			Term t = it.next();
			if (t.getDegree() == d) {
				t.add(new Term(c, d));
				return;
			}
			else if(t.getDegree() < d) {
				Term temp = t;
				it.remove();
				it.add(new Term(c,d));
				it.add(temp);
				return;
		}
		
			
		}
		it.add(new Term(c, d));

	}

	public String toString() {

		String b = "";
		ListIterator<Term> it = a.listIterator();
		while (it.hasNext()) {

			b = b + it.next().toString() + "+";

		}

		return b.substring(0, b.length() - 1);

	}

}

class Term {
	private int coeff;
	private int degree;

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	/**
	 * Construct a Term object.
	 * 
	 * @param c the coefficient
	 * @param d the degree
	 */
	public Term(int c, int d) {
		coeff = c;
		degree = d;
	}

	/**
	 * Adds a term. Assumes that powers are equal
	 * 
	 * @param other the other term
	 * @return the new term after addition
	 * 
	 */

	public Term add(Term other) {
		return new Term(this.getCoeff() + other.getCoeff(), this.getDegree());
	}

	/**
	 * Multiplies a term.
	 * 
	 * @param other the other term
	 * @return the new term after multiplication
	 * 
	 */

	public Term multiply(Term other) {
		return new Term(coeff * other.coeff, degree + other.degree);
	}

	/**
	 * Adds a coefficient.
	 * 
	 * @param c the coefficient to add
	 */
	// public void add(double c)
	{
		// coeff += c;
	}

	/**
	 * Gets the coefficient.
	 * 
	 * @return the coefficient
	 */
	public int getCoeff() {
		return coeff;
	}

	/**
	 * Gets the degree.
	 * 
	 * @return the degree
	 */
	public int getDegree() {
		return degree;
	}

	public String toString() {
		return coeff + "x^" + degree;
	}

}
