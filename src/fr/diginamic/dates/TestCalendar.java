package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {


		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 4, 19, 23, 59, 30);
		Date date2 = calendar.getTime();
		System.out.println(date2);
        ///formatage des dates en mode FR par exemple
		SimpleDateFormat formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy h:m:s", Locale.FRANCE);
		System.out.println(formateur.format(new Date()));
		System.out.println(formateur.format(date2));
		SimpleDateFormat formateur1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy h:m:s", Locale.GERMAN);
		System.out.println(formateur1.format(date2));
		SimpleDateFormat formateur2 = new SimpleDateFormat("EEEEE dd MMMMM yyyy h:m:s", Locale.CHINA);
		System.out.println(formateur2.format(date2));
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy h:m:s", Locale.US);
		System.out.println(formateur3.format(date2));
	}

}
