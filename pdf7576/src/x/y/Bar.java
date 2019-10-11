package x.y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component 
public class Bar {
	private Foo foo;
	
	public Bar() {
		System.out.println("Bar");
	}
	
	@Required //필수 속성
	//@Resource //필요한 자원 자동으로 연결. 이름 다르면 @Resource(name="myFoo") 
	@Autowired
	@Qualifier("action") //@Component("action") 자원 연결
	public void setFoo(@Qualifier("action")Foo foo) {
		System.out.println("setFoo");
		this.foo=foo;
	}
	public void doBar() {
		foo.doFoo();
	}
	
}
