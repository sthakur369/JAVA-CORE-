package p1;

public class TestGarbage1{  
	
	void fun()
	{
		 System.out.println("hi");
	}
	 protected void finalize()
	 {
		 System.out.println("object is garbage collected");
	 }  
	 public static void main(String args[]){  
	// new TestGarbage1();  
		  TestGarbage1 s1=new TestGarbage1();  

		 TestGarbage1 s2=new TestGarbage1();  
	 s2=s1;  
		  s2.finalize();

	System.gc();  
	// s2.fun();  
	 }  
	}  