# Dapr Java Example



mvn -DskipTests clean package

mvn -DskipTests package exec:java -Dexec.mainClass=io.dapr.App

dapr --app-id hello-dapr --app-port 8090 --protocol grpc -dapr-grpc-port 3500 echo a
