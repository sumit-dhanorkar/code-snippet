package collection;

import java.util.Comparator;

public class PQTComparator implements Comparator<Order> {


	@Override
	public int compare(Order firstOrder, Order secondOrder) {
		int comparisionResult = 0;
		if (firstOrder.getSide() == "BUY") {
			// fwd auc
			comparisionResult = Util.compareTo(secondOrder.getPrice(), firstOrder.getPrice());

		} else {
			// rev auc

			comparisionResult = Util.compareTo(firstOrder.getPrice(), secondOrder.getPrice());

		}

		if (comparisionResult == 0) {
			comparisionResult = Util.compareTo(secondOrder.getQty(), firstOrder.getQty());

			if (comparisionResult == 0) {
				comparisionResult = firstOrder.getTime().compareTo(secondOrder.getTime());
			}

		}

		return comparisionResult;
	}

}
