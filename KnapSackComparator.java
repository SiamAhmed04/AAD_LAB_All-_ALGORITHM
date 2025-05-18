package Knapsack.Problem;

import java.util.Comparator;

public class KnapSackComparator implements Comparator<KnapSack_Element>{

	@Override
	public int compare(KnapSack_Element o1, KnapSack_Element o2) {
		
		int  cmp1=o1.getProfit()/o1.getWeight();
		int cmp2=o2.getProfit()/o2.getWeight();
		return cmp2-cmp1;
	}
	

}
