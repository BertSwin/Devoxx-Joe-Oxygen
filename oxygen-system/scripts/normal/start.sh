rm -rf oxygen.log
java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=19000,suspend=n -jar ../../oxygen-service/target/devoxx-joe-oxygen-service-0.0.1-SNAPSHOT.jar -Dsun.net.inetaddr.ttl=0
