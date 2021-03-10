package com.unn.fuck.server;

import com.alibaba.csp.sentinel.adapter.grpc.SentinelGrpcServerInterceptor;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class GlobalInterceptorConfiguration {

    @GrpcGlobalServerInterceptor
    ServerInterceptor logServerInterceptor() {
        return new SentinelGrpcServerInterceptor();
    }

}
