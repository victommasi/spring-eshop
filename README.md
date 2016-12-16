# spring-eshop

under development 


USAGE:
1.clone or download the project
2.access application at http://localhost:8080/spring-eshop
3.Project is missing application.properties due to personal privacy, 
an example is shown below:

#MySQL properties
jdbc.driverClass=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost/example
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