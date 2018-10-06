import java.io.*;
class dynamic
{
	public static void main(String[] args)
	{
		File f=new File("C:/Users/DELL/Documents/Dynamic Data Storage assignment/abc.txt");
		try
		{
			FileInputStream f1=new FileInputStream(f);
			int i=f1.read();
			int lineCount=1;
			System.out.print("Path "+lineCount + ": ");
			while(i!=-1)
			{
				if((char)i=='\n')
				{
					System.out.println();
					lineCount++;
					System.out.print("Path "+ lineCount + ": ");
				}
				else
					System.out.print((char)i);
				i=f1.read();
			}
			f1.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("\n");
	}
}