package com.unn.fuck.client;

import com.alibaba.csp.sentinel.adapter.grpc.SentinelGrpcClientInterceptor;
import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.LOWEST_PRECEDENCE)
@Configuration(proxyBeanMethods = false)
public class GlobalClientInterceptorConfiguration {

    @GrpcGlobalClientInterceptor
    ClientInterceptor logClientInterceptor() {
        return new SentinelGrpcClientInterceptor();
    }

}
