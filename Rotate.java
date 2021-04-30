
/**
 * @author flb
 *
 */
public class Rotate {
	static Integer pos;
	static String str;
	static String outStr;
	
	/** Parameters 
	 * 
	 * @param args[0] is the starting position for the rotate, must be supplied 
	 * 					and must be an integer
	 * @param args[1] is the string that is to be acted upon
	 */
	public static void main(String[] args) {
		try {
			pos = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("You must supply an integer for the parameter");
		}
		
		if (args.length >= 1) {
			str = args[1];
			
			if (pos <= str.length()) {
				outStr = str.substring(str.length() - pos) + str.substring(0,str.length() - pos);
				System.out.print(outStr);
			} else {
				System.out.println("Starting position out of range");
			}
		} else {
			System.out.println("You must supply a string to act upon.");
		}
	}
}
