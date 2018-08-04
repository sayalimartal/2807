//Remove extra spaces and a word with its word position specified from a given sentence 
import java.util.Scanner;

public class ModifySentence {
	public static void main(String args[]) {
		int position,count=0,flag=0;	
		String sentence=new String();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		sentence=scanner.nextLine();
		
		System.out.println("Word to be deleted:");
		String wordDelete=new String();
		wordDelete=scanner.nextLine();
		int wordLen=wordDelete.length();
		
		System.out.println("Word position in the sentence:");
		position=scanner.nextInt();
		
		sentence=sentence.replaceAll("( )+"," ");  //Remove all extra spaces
		int len = sentence.length();
		StringBuffer sent=new StringBuffer(sentence);
		
		for (int i = 0; i < len; i++) {
			if (sentence.charAt(i) == ' ')
				count++;
			if (count == position-1 && sent.substring(i+1,i+wordLen+1).equals(wordDelete)) {
				sent.delete(i+1, i+wordLen+2);  //Delete word at specified position if it is present at that position
				sentence=sent.toString();
				flag=1;
				break;
			}		
		}
		
		if(flag==0)
			System.out.println("Word at position "+position+" and word to be deleted do not match");
		System.out.println("Modified sentence is ");
		System.out.println(sentence);  //Display modified sentence
	}
}
