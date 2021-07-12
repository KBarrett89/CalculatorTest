package CalculatorTeamOne;

import java.util.ArrayList;
import java.util.Collections;

public class TeamOneM {

	public String calculatorOne(int a, int b, int c) {

		String x = " ";

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);

		if (a + b == c || b + c == a || a + c == b) {
			x = Collections.min(list) + "+"
					+ (Collections.max(list) - Collections.min(list) + "=" + Collections.max(list));

		} else if (a * b == c || b * c == a || a * c == b) {
			x = Collections.min(list) + "x"
					+ (Collections.max(list) / Collections.min(list) + "=" + Collections.max(list));

		} else {
			x = "No relationship found!";
		}

		System.out.println(x);
		return x + "yo";
	}

}
