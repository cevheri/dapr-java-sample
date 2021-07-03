package io.dapr;
import io.grpc.*;

public class App {
    public static void main( String[] args ) throws Exception {
        Server server = ServerBuilder.forPort(8090)
                .addService(new AppServiceImpl())
                .build();
        server.start();
        System.out.println("Server started.");
        server.awaitTermination();
    }
}
