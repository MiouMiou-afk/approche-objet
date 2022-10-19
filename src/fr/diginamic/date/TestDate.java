package fr.diginamic.date;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);

//		@SuppressWarnings("deprecation")
//		Date date1 = new Date(111, 3, 7, 18,20,00);
//		System.out.println(date1);

		// il faut passer par la classe calendar

		Calendar calendar = Calendar.getInstance();
		calendar.set(2011, 3, 7, 6, 20);
		Date date2 = calendar.getTime();
		System.out.println(date2);
        ///formatage des dates en mode FR par exemple
		SimpleDateFormat formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINA);
		System.out.println(formateur.format(new Date()));
		System.out.println(formateur.format(date2));

	}

}
