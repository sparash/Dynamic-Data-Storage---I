import java.io.*;
class filehandle
{
    public static void main(String[] args) throws IOException
    {
        File f2=new File("MyFolder"); //Representing not creating a file in MyFolder
        f2.mkdir();
        File f1=new File(f2,"MyFile.txt");
        f1.createNewFile();
        File f3=new File("myFolder2/test/FileHandling");
        f3.mkdirs();
    }
}