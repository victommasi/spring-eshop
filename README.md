# Spring-eshop

### Under development[...] 


### USAGE:
1. Clone or download the project		
2. Access application at http://localhost:8080/spring-eshop		
3. Project is missing application.properties due to personal privacy, 	
so you need to create one, a nice example is shown below:

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