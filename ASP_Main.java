package Activity.Problem;

import java.util.ArrayList;
import java.util.Collections;

public class ASP_Main {
	public static void Calculate(ArrayList<ItemValues>itemvalue) {
		System.out.print(itemvalue.get(0).getActivity());
		int prv=itemvalue.get(0).getFinish();
		for(int i=1;i<itemvalue.size();i++) {
			if(itemvalue.get(i).getStart()>=prv) {
				System.out.print("->"+itemvalue.get(i).getActivity());
				prv=itemvalue.get(i).getFinish();
			}
				
		}
	}
	public static void main(String[] args) {
		   ItemValues ob1=new ItemValues();
		   ob1.setActivity("A1");
		   ob1.setStart(0);
		   ob1.setFinish(6);
		   ItemValues ob2=new ItemValues();
		   ob2.setActivity("A2");
		   ob2.setStart(3);
		   ob2.setFinish(4);
		   ItemValues ob3=new ItemValues();
		   ob3.setActivity("A3");
		   ob3.setStart(1);
		   ob3.setFinish(2);
		   ItemValues ob4=new ItemValues();
		   ob4.setActivity("A4");
		   ob4.setStart(5);
		   ob4.setFinish(9);
		   ItemValues ob5=new ItemValues();
		   ob5.setActivity("A5");
		   ob5.setStart(5);
		   ob5.setFinish(7);
		   ItemValues ob6=new ItemValues();
		   ob6.setActivity("A6");
		   ob6.setStart(8);
		   ob6.setFinish(9);
		   ArrayList<ItemValues>itemvalue=new ArrayList<ItemValues>();
		   itemvalue.add(ob1);
		   itemvalue.add(ob2);
		   itemvalue.add(ob3);
		   itemvalue.add(ob4);
		   itemvalue.add(ob5);
		   itemvalue.add(ob6);
		   System.out.println("ITEM with start and finish time:");
		   
		   
		   for(int i=0;i<itemvalue.size();i++) {
			   System.out.println(itemvalue.get(i));
		   }
		   Collections.sort(itemvalue, new ASPComparator());
		   System.out.println("After sorting:");
		   for(int i=0;i<itemvalue.size();i++) {
			   System.out.println(itemvalue.get(i));
		   }
			Calculate(itemvalue);
	}

}
