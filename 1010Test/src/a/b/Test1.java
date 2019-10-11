package a.b;

public class Test1 {

	public static void main(String[] args) {
		Bar bar1 = new Bar();
		Bar bar2 = new Bar();
		Bar bar3 = new Bar();
		Bar bar4 = new Bar();
		System.out.println(bar1 + "\n" + bar2 + "\n" + bar3 + "\n" + bar4);

		SingBar singBar1 = SingBar.getInstance();
		SingBar singBar2 = SingBar.getInstance();
		SingBar singBar3 = SingBar.getInstance();
		System.out.println(singBar1 + "\n" + singBar2 + "\n" + singBar3);
	}
}
