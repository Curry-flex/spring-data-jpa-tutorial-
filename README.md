# spring-data-jpa-tutorial-

tutorial to teach spring data jpa

Requirements
1.eclipse
2.mysql

open src->main->resoureces->application file modify database string depend on your databse configuration setting

application file
spring.datasource.url=jdbc:mysql://localhost:3307/test?useSSL=false
spring.datasource.username=root
spring.datasource.password="your password"


#Hbibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=DEBUG

spring.jpa.show-sql=true
