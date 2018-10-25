import java.util.Scanner;
class HelpingHarold {
	private LinearProbingHashST<String, Integer> Magazine = new LinearProbingHashST<String, Integer>();
	private LinearProbingHashST<String, Integer> RansomNote = new LinearProbingHashST<String, Integer>();

	HelpingHarold(String[] MagStr, String[] NoteStr) {
		this.setMag(MagStr);
		this.setNote(NoteStr);
	}

	private void setMag(String[] MagStr) {
		for (String Key : MagStr) {
			if(!Magazine.contains(Key)) {
				Magazine.put(Key, 1);
			} else {
				Magazine.put(Key, Magazine.get(Key) + 1);
			}
		}
	}

	private void setNote(String[] NoteStr) {
		for (String Key : NoteStr) {
			if(!RansomNote.contains(Key)) {
				RansomNote.put(Key, 1);
			} else {
				RansomNote.put(Key, RansomNote.get(Key) + 1);
			}
		}
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


class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int magWords = scan.nextInt();
		int ranWords = scan.nextInt();
		String[] magArr = scan.nextLine().split(" ");
		String[] ranArr = scan.nextLine().split(" ");
		HelpingHarold theKidnapper = new HelpingHarold(magArr, ranArr);
		System.out.println(theKidnapper.isUntraceable());
		if(theKidnapper.isUntraceable()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}