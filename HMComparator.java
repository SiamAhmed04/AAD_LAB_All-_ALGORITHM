package Huffman.Coding;

import java.util.Comparator;

public class HMComparator implements Comparator<HMNode> {

	@Override
	public int compare(HMNode o1, HMNode o2) {
		
		return o1.data-o2.data;
	}
	

}
