package collections;

import java.util.ArrayList;

public class CodeCollections {
	public void testCollectionDelete() {
		ArrayList<Integer> testAL = new ArrayList<Integer>();
		testAL.add(15);
		testAL.add(21);
		testAL.add(100);
		testAL.add(12);
		testAL.add(101);

		System.out.println("testAl size B4 ==== " + testAL.size());
		
		testAL.remove(2);
		
		System.out.println("testAl size A4 ==== " + testAL.size());

	}
}
