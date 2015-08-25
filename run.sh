# !/bin/sh

mainclass=org.aksw.simba.quetzal.startup.ExecuteHibiscusQuery

classpath=target/classes/

for jar in bin/*.jar; do classpath=$classpath:$jar; done

# run main class with classpath setting
java -cp $classpath -Xmx6g $mainclass $* 

