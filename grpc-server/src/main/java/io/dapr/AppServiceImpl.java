package io.dapr;

import com.google.protobuf.Any;
import com.google.protobuf.StringValue;
import io.dapr.DaprGrpc.DaprImplBase;
import io.dapr.DaprProtos.*;

public class AppServiceImpl extends DaprImplBase {

    @Override
    public void invokeService(InvokeServiceEnvelope request,
                              io.grpc.stub.StreamObserver<InvokeServiceResponseEnvelope>
                                      responseObserver) {
        System.out.println(request);
        Any response = Any.pack(StringValue.newBuilder()
                .setValue("Hello, World!").build());
        InvokeServiceResponseEnvelope envelope =
                InvokeServiceResponseEnvelope.newBuilder()
                        .setData(response).build();
        responseObserver.onNext(envelope);
        responseObserver.onCompleted();
    }
}
