package me.brunosantana.exam2.package1;

import java.time.LocalDate;

class Xpto{}

class Xpto2{
	
	private String x;
	
	public Xpto2(String x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Xpto2 other = (Xpto2) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		return true;
	}
}

public class Test17 {
     public static void main(String [] args) {
         LocalDate d1 = LocalDate.parse("1999-09-09");
         LocalDate d2 = LocalDate.parse("1999-09-09");
         LocalDate d3 = LocalDate.of(1999, 9, 9);
         LocalDate d4 = LocalDate.of(1999, 9, 9);
         System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
         System.out.println((d1.equals(d2)) + ":" + (d2.equals(d3)) + ":" + (d3.equals(d4)));
         
         System.out.println(new Xpto().equals(new Xpto()));
         System.out.println(new Xpto2("").equals(new Xpto2("")));
     }
}

/*
 * "parse" and "of" methods create new instances, 
 * so in this case you get 4 different instance of LocalDate stored at 4 different memory addresses. 
 */
