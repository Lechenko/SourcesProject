package testMetod;

import mainList.AList0;
import mainList.AList1;
import mainList.AList2;
import mainList.LList1;

public class lstMaim {

	public static void main(String[] args) {
		int[] ini = {10, 55, 47, 45, 12, 23, 26, 30, 98, 15};
		AList0 lst0 = new AList0();
		AList1 lst1 = new AList1();
		AList2 lst2 = new AList2();
		LList1 ls1  = new LList1();
		
		lst0.init(ini);
		lst1.init(ini);
		lst2.init(ini);
		ls1.init(ini);
		
		for(Integer i : ls1)
		{
			System.out.print(i + " ");
		}
	}

}
