package ncs4.test3;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		MapTest mT = new MapTest();
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7",new GregorianCalendar(2016,3,15).getTime(), 30));
		map.put("LG G5", new Inventory("LG G5",new GregorianCalendar(2016,2,25).getTime(), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro",new GregorianCalendar(2016,1,23).getTime(), 15));
		
		Set<Map.Entry<String, Inventory>> entries = map.entrySet();
		Inventory []iV = new Inventory[entries.size()];
		Iterator<Map.Entry<String, Inventory>> sit = entries.iterator();
		
		int k = 0;
		
		while(sit.hasNext()) {
			Map.Entry<String, Inventory> entry = sit.next();
			String key = entry.getKey();
			Inventory b = entry.getValue();
			System.out.println(b);
			
			String pName = b.getProductName();
			Date pDate = b.getPutDate();
			int pAmount = b.getPutAmount();
			
			iV[k] = new Inventory(pName, pDate, pAmount);
			iV[k].setGetDate(new Date());
			
			try {
				iV[k].setGetaAmount(10);	
			} catch(AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
			
			k ++;
		}
		System.out.println("\n==출고 수량 10 적용시 =====================================");
		int i = 0;
		while(i < iV.length) {
			System.out.println(iV[i]);
			i ++;
		}
		
		System.out.println("\n==출고 수량 부족시 ========================================");
		iV[0].setPutAmount(0);
		try {
			iV[0].setGetaAmount(20);
		} catch(AmountNotEnough e1) {
			System.out.println(e1.getMessage());
		}
		
	}

}
