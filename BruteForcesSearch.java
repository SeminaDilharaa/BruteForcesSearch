package SubstringSearch;


public class  BruteForcesSearch{
	
	public static void main(String[] args){
		System.out.println(search(System.out.println(search("CTTCACCATCAACTTCGCTCGAAGCTGCCTTCCACTCCAACTTCACAACTTCCTCAACTTCCTCACCAACTTCAGCAACTTCTCTAGGGCCAACTTCCAACTTCTCAACTTCTCAACTTCCAACTTCCGACAACTTAACTTCTACACGCAACTTCCAACTTCTGGTCCCAACTTCATAACTTCAGTCAACTTC","TCCA"));
	}
	
	public static int search(String text,String pattern){
		
		int lengthofpattern = pattern.length();
		int lengthoftext =text.length();
		
		
		for(int i=0;i <=lengthoftext - lengthofpattern;i++){
			int j;
			
			for(j = 0;j<lengthofpattern;j++){
				if(text.charAt(i+j) != pattern.charAt(j))
				break;
			}
			
			if(j == lengthofpattern){
				return i;
			}
				
		}
		return lengthoftext;
	}
}