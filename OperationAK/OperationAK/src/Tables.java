
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Tables 
{
public static void main(String args[]) throws IOException
{
	
	Properties p = new Properties();
	FileReader file = new FileReader("C:\\Users\\User\\eclipse-workspace\\OperationAK\\src\\Tables.properties");
	p.load(file);
System.out.println(p.getProperty("1"));
p.setProperty("1", "Ashwin");
p.store(new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\OperationAK\\src\\Tables.properties"), null);
System.out.println(p.getProperty("1"));

}

}
