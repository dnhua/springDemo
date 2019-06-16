# 一、Spring 装配bean
> 装配bean有三种可选方案，一是注解，二是java代码，三是通过xml装配。demo1,demo2,demo3分别是这三种方案的示例代码。

## 1.1 自动化装配bean-通过注解
* 创建接口类
* 创建接口的实现类并加上@Component注解
* @ComponentScan注解启用组件扫描，如果没有其他配置的话，该注解会自动扫描与配置类相同的包。也可以如下配置：
```java
@Configuration
@ComponentScan(basePackages = "Spring.demo1")
public class StudentConfig {
}
```
* 创建测试类，使用@Autowired注解引入装配的类。

## 1.2 通过java代码装配bean
@Bean的使用
* 创建Person接口
* Student2实现Person接口
* 创建StudentConfig类
```java
@Configuration
public class StudentConfig {
    @Bean
    public Person student2() {
        return new Student2();
    }
}
```
## 1.3 通过xml方式实现装配
这种方式比较简单，关键是.xml，细节请看demo3.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

    <bean id="Student" class="Spring.demo3.Student">
        <property name="favoriteFoods">
            <list>
                <value>大米</value>
                <value>黄焖鸡</value>
                <value>重庆小面</value>
                <value>猪蹄</value>
            </list>
        </property>
        <property name="name" value="李华超" />
        <property name="relationship">
            <map>
                <entry key="老妈" value="涂双平" />
                <entry key="老爸" value="李爱国" />
            </map>
        </property>
    </bean>
</beans>
```

# 二、Spring AOP
## AOP术语
* 通知：在AOP术语中，切面的工作被称之为通知。通知定义了切面是什么以及何时使用。除了描述要完成的工作，通知还解决了何时执行这个工作的问题。<br>
  Spring切面定义了5种类型的通知，
  * 前置通知（Before）
  * 后置通知（After）
  * 返回通知（After-returning）
  * 异常通知（After-throwing）
  * 环绕通知（Around）
 * 连接点：连接点是在应用执行过程中能够插入切面的一个点。这个点可以是调用方法时、抛出异常时、甚至是修改一个字段时。切面代码可以利用这些点插入到应用的正常流程之中，并添加新的行为。
 * 切点：如果说通知定义了切面的“什么”和“何时”的话，那么切点就定义了“何处”。切点的定义会匹配通知所要织入的一个或者多个连接点。
 * 切面：切面是通知和切点的结合。通知和切点共同定义了切面的全部内容--它是什么，在何时和何处完成其功能。
 * 引入：引入允许我们向现有的类添加新方法或属性。
 * 织入：织入是把切面应用到目标对象并创建新的代理对象的过程。切面是在指定的连接点被织入到目标对象中。
 
## AOP实战
* 编写切点
```java
execution(* someclass.somemethod(..))
```
* 使用注解创建切面
    * @Aspect
    * @Before
    * @After
    * @AfterReturing
    * @AfterThrowing
    * Around
 