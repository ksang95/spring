package x.y;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("action") // 빈으로 등록. 기본 이름 foo. 이름 변경하려면 @Component("myFoo")
public class Foo {
	private String name;
	
	public Foo() {
		System.out.println("Foo");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void doFoo() {
		System.out.println("Foo.doFoo");
	}
	
	@PostConstruct //라이프 사이클
	public void start() {
		System.out.println("start");
	}
	
	@PreDestroy //라이프 사이클
	public void stop() {
		System.out.println("stop");
	}
}
