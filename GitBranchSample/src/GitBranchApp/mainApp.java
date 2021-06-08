package GitBranchApp;

public class mainApp {
	public static void main(String[] args) {
		System.out.println("1");
		Math cMath =new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
	}
}
class Math{
	int add(int a,int b) {
		return a+b;
	}
}