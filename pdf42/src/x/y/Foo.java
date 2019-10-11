package x.y;

public class Foo {
	private Bar bar;

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void doBar() {
		Bar bar = getBar();
		bar.doIt();
	}

	protected Bar getBar() {
		return null;
	}
}