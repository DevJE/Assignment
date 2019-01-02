package month;

public class Months {
	//workshop03 -3
	public int getDays(int months) {
		int daysNum = 0;
		switch(months) {
		case 2 : daysNum = 28;	break;
		case 4 : case 6 : case 9 : case 11 :
			daysNum = 30;	break;
			default : daysNum = 31;
		}
		return daysNum;
	}

}
