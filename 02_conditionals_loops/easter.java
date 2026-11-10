package unit3;

public class easter {
private int y , a , b , c , d, e, f, g , h , i ,r , k , m , n , p;

public easter(int y) {
	this.y = y;
	
}

public String eastercalcualtor() {
	a = y % 19;
	b = y / 100;
	c = y % 100;
	d= b / 4;
	e = b % 4;
	f = (b + 8) / 25;
	g = ((b - f) + 1)/3;
	h = ((19 * a + b -d -g) + 15) % 30;
	i = c / 4;
	k = c % 4;
	r = (32 + 2 * e + 2 * i - h -k) % 7;
	m = (a + 11  * h + 22 * r) / 451;
	n = (h + r + -7 *m + 114 )  / 31;
	p = (h + r + -7 *m + 114 ) % 31;
	return  n + "/" + (p + 1);
}
public static void main(String[] args) {
	easter one = new easter(2024);
	one.eastercalcualtor();
}
}
