package Huffman.Coding;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HMMain {
	public static int ans=0;
	public static void print_code(HMNode root,String s) {
		if(root.left==null&&root.right==null&&Character.isLetter(root.c.charAt(0))) {
			System.out.println(root.c+" "+s);
			ans+=s.length();
			return;
		}
		print_code(root.left,s+"0");
		print_code(root.right,s+"1");
	}

	public static void main(String[] args) {
		
           System.out.println("How many character:");
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           PriorityQueue<HMNode>q=new PriorityQueue<HMNode>(n,new HMComparator());
           int prv_freq=0;
           System.out.println("Enter charcter and frequency:");
           for(int i=0;i<n;i++) {
        	   HMNode hn=new  HMNode();
        	   hn.c=sc.next();
        	   hn.data=sc.nextInt();
        	   prv_freq+=hn.data;
        	   hn.left=null;
        	   hn.right=null;
        	   q.add(hn);
           }
           HMNode root=null;
           while(q.size()>1) {
        	   HMNode x=q.peek();
        	   q.poll();
        	   HMNode y=q.peek();
        	   q.poll();
        	   HMNode f=new HMNode();
        	   f.c=" ";
        	   f.data=x.data+y.data;
        	   f.left=x;
        	   f.right=y;
        	   root=f;
        	   q.add(f);
           }
           System.out.println("Before Huffman coding required bit = "+prv_freq);
           print_code(root,"");
           System.out.println("After Huffman coding required bit = "+ans);
           System.out.println("Bit saved = "+(1.0*(prv_freq-ans)/prv_freq)*100);
	}

}
