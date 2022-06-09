			//Inner Class  
class A{
	class B{
		public void show() {
			System.out.println("I m in Inner B class");
		}
	}
	public static void main (String args[]) {
		A ao=new A();        
		A.B bo = ao.new B();  // THIS ARE SIMPLYFICATION		//we can use on place of ao ==> A.B bo=new A().new B();
		bo.show();		//new A().new B().show()		   								 //on place bo ==> new A().new B().show();
	}
}
