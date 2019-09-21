package Q4;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class Emp implements Serializable
{
	int empid;
	String empname; 
	String desig; 
	int basic;
	
	public Emp(int empid, String empname, String desig, int basic) 
	{
		super();
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.basic = basic;
	}
	
	
	public void disp()
	{
		System.out.println(empid+"  "+empname+"  "+desig+"  "+basic);
	}
}
public class Demo44 
{

	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1, "empname", "desig", 89);
		Emp e2 = new Emp(2, "empjname", "dehgsig", 65);
		Emp e3 = new Emp(3, "empjoname", "desfig", 12);
		Emp e4 = new Emp(4, "oempname", "desdig", 74);

		
		List <Emp> lsst = new ArrayList <Emp> ();
		lsst.add(e1);
		lsst.add(e4);
		lsst.add(e2);
		lsst.add(e3);
		
		try(FileOutputStream fos = new FileOutputStream("D:\\abb1.txt"))
		{ 
			try(ObjectOutputStream oos = new ObjectOutputStream(fos))
			{
				oos.writeObject(lsst);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		List<Emp> lsst1=null;
		//List<MyClass> lst1=null; 
		try(FileInputStream fis = new FileInputStream("D:\\abb1.txt"))
		{ 
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				
				
					lsst1=(List<Emp>) ois.readObject();
					
			} 
		} 
		catch (Exception e31) 
		{
			
			e31.printStackTrace();
		}
		
		
		Iterator <Emp> itr =  lsst1.iterator();
		while (itr.hasNext()) 
		{
			Emp emp = (Emp) itr.next();
			emp.disp();
		}
		
	}

}
