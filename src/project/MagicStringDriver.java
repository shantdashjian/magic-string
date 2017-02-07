package project;

public class MagicStringDriver {
	public static void main(String[] args) {
		MagicString magicString = new MagicString();

		magicString.read(" !\"#$%&'()*+,-./0123" + "456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "[]^abcdefghijklmn"
				+ "opqrstuvwxyz{|}~");
		long startTime = System.nanoTime();
		System.out.println("Is every character unique? " + magicString.isEveryCharacterUniqueN2());
		long endTime = System.nanoTime();

		long totalTimeOld = endTime - startTime;
		System.out.println("Total time using O(n^2) = " + totalTimeOld + " nano seconds");

		magicString.read(" !\"#$%&'()*+,-./0123" + "456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "[]^abcdefghijklmn"
				+ "opqrstuvwxyz{|}~");
		startTime = System.nanoTime();
		System.out.println("Is every character unique? " + magicString.isEveryCharacterUniqueUsingHistogram());
		endTime = System.nanoTime();

		long totalTimeNew = endTime - startTime;
		System.out.println("Total time using O(n+k) = " + totalTimeNew + " nano seconds");

		double ratio = (double) totalTimeNew / totalTimeOld;
		System.out.printf("Ratio of new algorithm time / old algorithm time = %.2f\n", ratio);
		int improvement =(int) ((1-ratio) *100);
		System.out.println("Percentage of improvement = " + improvement + "%");

	}
}
