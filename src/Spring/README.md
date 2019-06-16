# Spring 装配bean
> 装配bean有三种可选方案，一是注解，二是java代码，三是通过xml装配。demo1,demo2,demo3分别是这三种方案的示例代码。

## 自动化装配bean-通过注解
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

## 通过java代码装配bean
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
## 通过xml方式实现装配
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