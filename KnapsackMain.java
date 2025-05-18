package Knapsack.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KnapsackMain {
	public static int ans=0;
	public static void calculate( ArrayList<KnapSack_Element>itemvalue,int knapsack) {
		for(int i=0;i<itemvalue.size();i++) {
			if(knapsack-itemvalue.get(i).getWeight()>=0) {
				ans+=itemvalue.get(i).getProfit();
			     knapsack-=itemvalue.get(i).getWeight();
			}
			else {
				ans+=((itemvalue.get(i).getProfit())/itemvalue.get(i).getWeight())*knapsack;
				 break;
			}
		}
		System.out.println("Total profit: "+ans);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many item and the weight of knapsack:");
         int n=sc.nextInt();
         int knapsack=sc.nextInt();
         ArrayList<KnapSack_Element>itemvalue=new ArrayList<KnapSack_Element>();
         System.out.println("Enter weight and profit:");
         for(int i=0;i<n;i++) {
        	 KnapSack_Element ob=new KnapSack_Element();
        	 int weight=sc.nextInt();
        	 int profit=sc.nextInt();
        	 ob.setItem(i+1);
        	 ob.setWeight(weight);
        	 ob.setProfit(profit);
        	 itemvalue.add(ob);
         }
         for(int i=0;i<n;i++)
        	 System.out.println(itemvalue.get(i));
         Collections.sort(itemvalue, new KnapSackComparator());
         System.out.println("After sorting:");
         for(int i=0;i<n;i++)
        	 System.out.println(itemvalue.get(i));
         calculate(itemvalue,knapsack);
	}

}
