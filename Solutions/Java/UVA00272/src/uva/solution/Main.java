
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String line = null;
		
		while(read.hasNext())
		{
			System.out.println(replaceQuotes(read.nextLine()));
		}
		
		read.close();
	}
	
	private static int countReplaced = 0;
	
	private static String replaceQuotes(String line){
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < line.length(); i++)
		{
			if(line.charAt(i) == '"')
			{
				result.append( (countReplaced % 2 == 1 ? "''" : "``"));
				countReplaced++;
			}else
			{
				result.append(line.charAt(i));
			}
			
		}
		
		return result.toString();
	}

}
