package set;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> hset = new HashSet<Double>();
		// ajouter des éléments
		hset.add(1.5);
		hset.add(8.25);
		hset.add(-7.32);
		hset.add(13.3);
		hset.add(-12.45);
		hset.add(48.5);
		hset.add(0.01);

		// parcourir HashSet
//	      for(Double valeur : hset)
//	        System.out.println(valeur);

		Double maxDouble = Double.MIN_VALUE;
		Double minDouble = Double.MAX_VALUE;

		for (Double valeurf : hset) {
			if (valeurf > maxDouble) {
				maxDouble = valeurf;
			}
			if (valeurf< minDouble) {
				minDouble = valeurf;
			}
		}

		System.out.println(maxDouble);
		System.out.println(minDouble);
		hset.remove(minDouble);
		System.out.println("Hset sans le minimun -12.43");
	      for(Double valeur : hset)
        System.out.println(valeur);

	}

}
