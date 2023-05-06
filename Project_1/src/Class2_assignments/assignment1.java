package Class2_assignments;
//   (((((10+2)+2)-2)*2)/2)
public class assignment1 {
	public int sum(int a,int b) {
		int res1=a+b;
		System.out.println(res1);
		return res1;
	}
	public int sub(int a,int b) {
		int res2=a-b;
		System.out.println(res2);
		return res2;
	}
	public int mul(int a,int b) {
		int res3=a*b;
		System.out.println(res3);
		return res3;
	}
	public int div(int a,int b) {
		int res4=a/b;
		System.out.println(res4);
		return res4;
	}
	public static void main(String[] args) {
		assignment1 obj=new assignment1();
		int sumres=obj.sum(10, 2);
		sumres=obj.sum(sumres, 2);
		int subres=obj.sub(sumres, 2);
		int mulres=obj.mul(subres,2);
		obj.div(mulres, 2);
	}
}
