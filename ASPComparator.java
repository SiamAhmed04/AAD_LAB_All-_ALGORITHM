package Activity.Problem;

import java.util.Comparator;

public class ASPComparator implements Comparator<ItemValues> {

	@Override
	public int compare(ItemValues o1, ItemValues o2) {
		 return o1.getFinish()-o2.getFinish();
	
	}



}
