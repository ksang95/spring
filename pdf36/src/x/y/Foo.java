package x.y;

public class Foo {
	private Bar bar;
	private Baz baz;
	public Foo(Bar bar, Baz baz) {
		this.bar=bar;
		this.baz=baz;
	}
	public String out() {
		return bar.getStr()+"/"+baz.getStr();
	}
}
