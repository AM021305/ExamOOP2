public class Question2{
	public static void main(String[] args){
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
}