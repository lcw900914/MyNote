# AOP使用方法

​	pom.xml載入Spring AOP，插入後記得案右上角的M。

![image-20241009203720453](../images/image-20241009203720453.png)

​			<img src="../images/image-20241010003820300.png" alt="image-20241010003820300" style="zoom:80%;" />



​	![image-20241010003738285](../images/image-20241010003738285.png

## 	@Aspect

​		在class前一列加入@Aspect就可以成功創造切面。注意只有Bean才可以是一個切面，所以記得也要加@Component

![image-20241010002821143](../images/image-20241010002821143.png)

## 	@Before(切入點) & @After(切入點)

​		這兩個annotation代表某個函式執行前的切面以及執行後的切面。注意只能寫在@Aspect @Component 的class。

![image-20241010002811724](../images/image-20241010002811724.png)

## 	@Around(切入點)

​		這個annotation代表某個函式執行前後的切面。(之後去理解一下原理)

![image-20241010003717379](../images/image-20241010003717379.png)

## 	所謂參數-切入點...

```
"execution(* com.example.demo.HpPrinter.print())"  //切入點為 com.example.demo.HpPrinter的print()方法
```

```
"execution(* com.example.demo.HpPrinter.*(..))"  //切入點為 com.example.demo.HpPrinter 底下的所有方法
```

```
"execution(* com.example.demo.*(..))"  //切入點為 com.example.demo 此package下所有方法 不含子package
```

```
"execution(* com.example.demo..*(..))"  //切入點為 com.example.demo.HpPrinter 此package下所有方法 含子package
```

```
@annotation(com.example.demo.MyAnnotation) //切入點為帶有@MyAnnotation的方法 -> 我認為重要的
```

