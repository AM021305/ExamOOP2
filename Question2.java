import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question2{
	public static void main(String[] args){
		//txtCopy("Source.txt", "Dest.txt");
		editFile("Source.txt");
		//updateFile("Dest.txt");
	}
	public static void editFile(String a)throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("Source.txt"));
		
		br=br.replace('a', ' ');
		br=br.replace('e', ' ');
		br=br.replace('i', ' ');
		br=br.replace('o', ' ');
		br=br.replace('u', ' ');
		br=br.replace('A', ' ');
		br=br.replace('E', ' ');
		br=br.replace('I', ' ');
		br=br.replace('O', ' ');
		br=br.replace('U', ' ');
		
		String line = null;
		while((line=br.line())!= null)
		{
			System.out.println(line);
		}
		
	}
}