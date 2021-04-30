/**
 * 
 */

/**
 * @author flb
 *
 */
public class ArrayCount {
	static Integer [] baseArray = {1,5,2,1,10};
	static Integer iLess = 0;
	static Integer iMore = 0;
	static Integer iEqual = 0;
	static Integer iNull = 0;
	static Integer [] array;
	static Integer chk;

	/** Parameters 
	 * 
	 * @param args[0] must be supplied and must be an integer
	 * @param args[1-n] is optional and should be a list of valid integers
	 * 						if not supplied will use default list {1,5,2,1,10}
	 */
	public static void main(String[] args) {
			
		try {
			chk = Integer.parseInt(args[0]);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		if (args.length >= 2) {
			int x = args.length - 1;
			array = new Integer[x];
			
			for (int i = 0; i < array.length; i++) {
				try {
					array[i] = Integer.parseInt(args[i + 1]);
				} catch (Exception e) {
					array[i] = null;
				}
			}
		} else {
			array = baseArray;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i] < chk) {
					iLess = iLess + 1;
				} else if (array[i] > chk) {
					iMore = iMore + 1;
				} else {
					iEqual = iEqual + 1;
				}
			} else {
				iNull = iNull + 1;
			}
		};
		
		System.out.println("above: " + iMore + ", below: " + iLess + ", equal: " + iEqual + " null: " + iNull);
	}
}
