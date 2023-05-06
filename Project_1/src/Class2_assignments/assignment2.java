package Class2_assignments;
//(((((10*2)-2)+2)-2)/2)
public class assignment2 {
	public int sum(int a,int b) {
		int res=a+b;
		System.out.println(res);
		return res;
	}
	public int sub(int a,int b) {
		int res=a-b;
		System.out.println(res);
		return res;
	}
	public int mul(int a,int b) {
		int res=a*b;
		System.out.println(res);
		return res;
	}
	public int div(int a,int b) {
		int res=a/b;
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		assignment2 obj=new assignment2();
		int mulres=obj.mul(10, 2);
		int subres=obj.sub(mulres, 2);
		int sumres=obj.sum(subres, 2);
		subres=obj.sub(sumres, 2);
		obj.div(subres, 2);
	}
}
