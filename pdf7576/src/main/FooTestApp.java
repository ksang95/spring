package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x.y.Bar;

public class FooTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext(new String[] {"config/applicationContext.xml"});
		Bar bar = (Bar)factory.getBean("bar");
		bar.doBar();
		
		/*
		 * @Required
		 * 속성 또는 setter메서드에 필수 속성이 되게 함 
		 * 
		 * @Autowired
		 * 속성,생성자,setter메서드에 타입에 의존하는 객체를 삽입해 줌
		 * 
		 * @Qualifier
		 * @Autowired 와 같이 사용
		 * 같은 타입의 빈 객체들이 있을 경우 특정 빈을 사용하도록 함
		 * 설정파일의 <qualifier>태그의 value 속성의 값을 아노테이션 값으로 사용 -> 같은 값의 id갖는 객체 찾기
		 * 
		 * <bean id="foo" class="x.y.Foo">
		 * 	<qualifier value="action"/>
		 * </bean>
		 * @Qualifier("action")
		 * public void setFoo(@Qualifier("action")Foo foo){}
		 * 
		 * @Resource
		 *필요한 자원을 자동으로 연결시켜 줌
		 *name속성을 이용하면 속성과 이름이 틀릴 때 사용 @Resource(name="myFoo")
		 *
		 *@PostConstruct,@PreDestroy
		 *life cycle annotation
		 * 
		 * */
	}

}
