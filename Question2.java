import java.io.*;
public class Question2{
	public static void main(String[] args)	throws IOException{
	
		txtCopy("Source.txt", "Dest.txt");
		//editFile("Dest.txt");
		//updateFile("Dest.txt");
	}


	public static void  txtCopy(String a,String b) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("Source.txt"));
		
		String line = null;
		String allLine = "";
		while ((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
	public void updateFile(String word){
		int i;
		FileReader f=new FileReader("word");
		BufferedReader b=new BufferedReader(f);
		while((i=b.read())!=-1){
			System.out.println((char)i);
		}
		b.close();
	}
}