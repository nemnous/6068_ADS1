import java.util.Scanner;
class HelpingHarold {
	private LinearProbingHashST<String, Integer> Magazine = new LinearProbingHashST<String, Integer>();
	private LinearProbingHashST<String, Integer> RansomNote = new LinearProbingHashST<String, Integer>();

	HelpingHarold(LinearProbingHashST MagST, LinearProbingHashST NoteST) {
		this.Magazine = MagST;
		this.RansomNote = NoteST;
	}

	
	boolean isUntraceable() {
		for(String ranWord : RansomNote.keys()) {
			if(!Magazine.contains(ranWord) || Magazine.get(ranWord) < RansomNote.get(ranWord)){
				return false;
			}
		}
		return true;
	}
}


class Solution2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinearProbingHashST<String, Integer> Magazine = new LinearProbingHashST<String, Integer>();
		LinearProbingHashST<String, Integer> RansomNote = new LinearProbingHashST<String, Integer>();
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
		// System.out.println(theKidnapper.isUntraceable());
		if(theKidnapper.isUntraceable()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}