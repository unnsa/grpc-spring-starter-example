
package com.unn.fuck.client;

import com.unn.grpc.examples.lib.FuckGrpcStarterGrpc;
import com.unn.grpc.examples.lib.FuckRequest;
import com.unn.grpc.examples.lib.FuckResponse;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    @GrpcClient("cloud-grpc-server")
    private FuckGrpcStarterGrpc.FuckGrpcStarterBlockingStub fuckGrpcStarterBlockingStub;

    public String sendMessage(final String name) {
        try {
            FuckResponse fuckResponse = fuckGrpcStarterBlockingStub.fuck(FuckRequest.newBuilder()
                    .setFirstName("first Name")
                    .setName(name)
                    .setLaseName("last Name")
                    .build());
            return fuckResponse.getFuckWho();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode();
        }
    }

}
