# Java-Spring依赖属性的构造函数注入

1. 新建一个Java Project
![](images/1.png)

2. Java工程导jar包

+ 创建一个lib文件夹
![](images/2.png)
![](images/3.png)
**如图所示新建完成**
![](images/4.png)

+ 导入jar包
![](images/5.png)
![](images/6.png)

+ 新建或导入配置文件
![](images/7.png)
**beans.xml**
```
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd 
       http://www.springframework.org/schema/tx 
       http://www.springframework.org/schema/tx/spring-tx.xsd 
       http://www.springframework.org/schema/context 
       http://www.springframework.org/schema/context/spring-context.xsd">
</beans>
```
3. 新建test/MyController  test/MyService test/MyDao
![](images/8.png)
