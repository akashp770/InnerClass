class Var{

	int x=10;		//instance Variable
	static int y=11;  // Static Variable
	class B{
		
		int x=20;		//instance Variable
		public void show() {
			
			int x=30;   //local Variable
			
			
			System.out.println("X is "+ x);    //30  First  Local Variable will show OP bcz t Is nearest
			
			System.out.println("X is "+this.x); //20  This Keyword will point Instance Variable of itss class  (i.e class B) 
			
			System.out.println("X is "+Var.this.x); //10   In this it willpoint outer class Var  instance Variable
			
			System.out.println("Y is "+ y);
		}
	}
	public static void main (String args[]) {
			
			new Var().new B().show();	   	
	}
}