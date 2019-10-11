package a.b;

public class SingBar {
	private static SingBar singBar;

	private SingBar() {
		
	}

	public static SingBar getInstance() {
		if (singBar == null)
			singBar = new SingBar();
		return singBar;
	}
}
