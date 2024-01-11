package ch12.sec11.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dt = dd.format(now);
		System.out.println(dt);

	}

}