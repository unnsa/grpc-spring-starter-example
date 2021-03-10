package com.unn.fuck.server;

import com.unn.grpc.examples.lib.FuckGrpcStarterGrpc;
import com.unn.grpc.examples.lib.FuckRequest;
import com.unn.grpc.examples.lib.FuckResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class FuckService extends FuckGrpcStarterGrpc.FuckGrpcStarterImplBase {

    @Override
    public void fuck(FuckRequest fuckRequest, StreamObserver<FuckResponse> responseObserver) {
        FuckResponse fuckResponse = FuckResponse.newBuilder()
                .setFuckWho("fuck->" + fuckRequest.getFirstName() + fuckRequest.getName() + fuckRequest.getLaseName())
                .build();
        responseObserver.onNext(fuckResponse);
        responseObserver.onCompleted();
    }
}
