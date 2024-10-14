package collection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Util {

	String instanceId;
	
	String random = new Random().nextInt(99)+"";
	
	int count=0;
	
	static int maxBigDecimalScale;

	public static int compareTo(BigDecimal a, BigDecimal b) {

		BigDecimal aNew = a.setScale(maxBigDecimalScale, RoundingMode.HALF_DOWN);
		BigDecimal bNew = b.setScale(maxBigDecimalScale, RoundingMode.HALF_DOWN);
		return aNew.compareTo(bNew);

	}

}
