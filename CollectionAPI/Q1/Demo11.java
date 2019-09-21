import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class MyClass implements Serializable
{
	public int num;

	public MyClass(int num) 
	{
		
		this.num = num;
	}

	
	public String toString()
	{
		return "num"+"  "+num;
	}
	
}
public class Demo11 
{

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		MyClass m1 = new MyClass(8);
		MyClass m2 = new MyClass(80);
		MyClass m3 = new MyClass(30);
		MyClass m4 = new MyClass(300);
		MyClass m5 = new MyClass(54);
		List<MyClass> lst =new ArrayList<MyClass>();
		lst.add(m1);
		lst.add(m2);
		lst.add(m3);
		lst.add(m4);
		lst.add(m5);
		
		try(FileOutputStream fos = new FileOutputStream("D:\\abb1.txt"))
		{ 
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(lst);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		List<MyClass> lst1=null;
		//List<MyClass> lst1=null; 
		try(FileInputStream fis = new FileInputStream("D:\\abb1.txt"))
		{ 
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				
				
					lst1=(List<MyClass>) ois.readObject();
					System.out.println(lst1);
			} 
		} 
		catch (Exception e2) 
		{
			
			e2.printStackTrace();
		}
		
		
		Iterator<MyClass> itr=lst1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
