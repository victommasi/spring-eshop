# Spring-eshop
### Under development[...] 
E-commerce shoes store built with Java and Spring framework. This Spring application was configured using only Java and Annotations, no .XML needed. Technologies:
* Java 8
* Spring MVC
* JPA/Hibernate
* Spring Security
* JSP
* Bootstrap
* jQuery
* MySQL

### USAGE:
1. Clone or download the project
2. Deploy application into tomcat 8 or 9.		
3. Access application at http://localhost:8080/eshop		
4. Project is missing application.properties due to personal privacy, 	
so you need to create it yourself, a nice example is shown below.
5. Put the file at src/main/resources

```sh
#MySQL properties
jdbc.driverClass=com.mysql.jdbc.Driver	
jdbc.url=jdbc:mysql://localhost/exampleSchema		
jdbc.username=root		
jdbc.password=root

#Hibernate properties
packages.to.scan=com.victommasi.eshop.model		
hibernate.dialect=org.hibernate.dialect.MySQL5Dialect	
hibernate.show_sql=true		
hibernate.format_sql=true		
hibernate.hbm2ddl.auto=update  		

#Email properties
login=example		
password=example		
emailUser=example@example.com		
emailPassword=example	
```



