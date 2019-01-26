1.@Bean注解时,可以在创建Bean的时候添加参数,Spring会自动发现并装配参数类型的Bean到我们所显示创建的Bean中,但是我们创建的Bean必须有参数类型的Bean的构造器  
2.@Autowire可以使用在SETTER方法,构造器,以及成员属性上  
3.Spring默认的Bean都是单例的  
4.Spring的动态代理是基于接口的（代理类必须实现某一类接口）,CGlib则是可以基于普通类代理  
5.Spring的基于xml配置时可以使用SpEL表达式,该表达式内可以使用任何Java语言中可以使用的表达式
    还可以使用正则表达式匹配 matches
6.SpEL表达式中的T()表示让Spring将括号中的类型视为Java中的类型,使用[]取集合中的元素
    .?[]可以从集合中查询元素 .?[article eq 'ai'] :会从集合中查找到属性article等于ai的值  
7.要注意Java中操作符前置++以及后置++的区别:
    前置++:先执行++操作,在使用
    后置++:在使用,在执行++操作  
8.使用SpringAop代理之后的Bean的父类是：class java.lang.reflect.Proxy