# helloWorld 项目简介

-------
### spring boot基本启动项目
####  注解
1 SpringBootApplication 开启组件扫描和自动配置 包含以下三个注解
- EnableAutoConfiguration 启用自动配置
- ComponentScan 启用组件扫描
- Configuration 表明该使用spring基于java的配置

2 @restcontroller控制层注解
  controller 控制器（注入服务）

3 @service 服务（注入Dao）
标注服务层，进行业务的逻辑处理

4 @repository（实现dao访问）
用于标注数据访问层，也可以说用于标注数据访问组件，即DAO组件.

5 @component （把普通pojo实例化到spring容器中，相当于配置文件中的 <bean id="" class=""/>）
泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。    

3 http请求方式注解
#### 配置项
1 配置文件获取
- @Value
- @ConfigurationProperties

2 配置文件优先级
3 常用基础外部配置
####  结构


#### logback
