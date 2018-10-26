import java.util.Scanner;
/**
 * Class for helping harold.
 * Harold is a kidnapper who wrote a ransom note.
 * Given the words in the magazine and the words in
 * the ransom note, print Yes if he can replicate his
 * ransom note exactly using whole words from the
 * magazine; otherwise, print No.
 */
class HelpingHarold {
	private LinearProbingHashST<String, Integer> Magazine
		= new LinearProbingHashST<String, Integer>();
	private LinearProbingHashST<String, Integer> RansomNote 
		= new LinearProbingHashST<String, Integer>();
	/**
	 * Constructs the object for class Helping Harold.
	 *
	 * @param      MagST   Magazine Symbol Table.
	 * @param      NoteST  The note Symbol Table.
	 */
	HelpingHarold(LinearProbingHashST MagST, LinearProbingHashST NoteST) {
		this.Magazine = MagST;
		this.RansomNote = NoteST;
	}

/**
 * Determines if untraceable.
 *
 * @return     True if untraceable, False otherwise.
 */
	boolean isUntraceable() {
		for(String ranWord : RansomNote.keys()) {
			if(!Magazine.contains(ranWord) || Magazine.get(ranWord) < RansomNote.get(ranWord)){
				return false;
			}
		}
		return true;
	}
}
/**
 * Class for solution 2.
 * Handles all the inputs of from console.
 * returns the answer to console.
 */
class Solution2 {
	/**
	 * the main function.
	 * excecution starts here.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinearProbingHashST<String, Integer> Magazine
			 = new LinearProbingHashST<String, Integer>();
		LinearProbingHashST<String, Integer> RansomNote
			 = new LinearProbingHashST<String, Integer>();
		int magWords = scan.nextInt();
        int ransomWords = scan.nextInt();
        for(int i = 0; i < magWords ; i++) {
            String key = scan.next();
            if(!Magazine.contains(key)) {
            	Magazine.put(key, 1);
            	continue;
            }
            Magazine.put(key, Magazine.get(key) + 1);
        }
        for(int i = 0; i <ransomWords ; i++) {
            String key = scan.next();
            if(!RansomNote.contains(key)) {
            	RansomNote.put(key, 1);
            	continue;
            }
            RansomNote.put(key, RansomNote.get(key) + 1);
        }
        HelpingHarold theKidnapper = new HelpingHarold(Magazine, RansomNote);
		if(theKidnapper.isUntraceable()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}