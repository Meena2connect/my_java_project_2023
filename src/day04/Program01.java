package day04;


public class Program01 {
	
	public static void main(String[] args) {
		Program01 meena = new Program01();
		meena.addMethod(10,20);
		meena.subMethod(20,5);
		meena.mulMethod(20,5);
	}
    public void addMethod (int a,int b) {
    	System.out.println( a+b);
    }
    private void subMethod (int a,int b) {
    	System.out.println( a-b);
    }
    protected void mulMethod (int a,int b) {
    	System.out.println( a*b);
    }
    void sqrMethod (int a) {
    	System.out.println(a*a);
    }
}


