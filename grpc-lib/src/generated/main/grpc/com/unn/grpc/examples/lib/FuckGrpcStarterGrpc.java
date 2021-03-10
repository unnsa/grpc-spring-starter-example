package com.unn.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: fuck.proto")
public final class FuckGrpcStarterGrpc {

  private FuckGrpcStarterGrpc() {}

  public static final String SERVICE_NAME = "FuckGrpcStarter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.unn.grpc.examples.lib.FuckRequest,
      com.unn.grpc.examples.lib.FuckResponse> getFuckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fuck",
      requestType = com.unn.grpc.examples.lib.FuckRequest.class,
      responseType = com.unn.grpc.examples.lib.FuckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.unn.grpc.examples.lib.FuckRequest,
      com.unn.grpc.examples.lib.FuckResponse> getFuckMethod() {
    io.grpc.MethodDescriptor<com.unn.grpc.examples.lib.FuckRequest, com.unn.grpc.examples.lib.FuckResponse> getFuckMethod;
    if ((getFuckMethod = FuckGrpcStarterGrpc.getFuckMethod) == null) {
      synchronized (FuckGrpcStarterGrpc.class) {
        if ((getFuckMethod = FuckGrpcStarterGrpc.getFuckMethod) == null) {
          FuckGrpcStarterGrpc.getFuckMethod = getFuckMethod =
              io.grpc.MethodDescriptor.<com.unn.grpc.examples.lib.FuckRequest, com.unn.grpc.examples.lib.FuckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fuck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.unn.grpc.examples.lib.FuckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.unn.grpc.examples.lib.FuckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FuckGrpcStarterMethodDescriptorSupplier("fuck"))
              .build();
        }
      }
    }
    return getFuckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FuckGrpcStarterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterStub>() {
        @java.lang.Override
        public FuckGrpcStarterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuckGrpcStarterStub(channel, callOptions);
        }
      };
    return FuckGrpcStarterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FuckGrpcStarterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterBlockingStub>() {
        @java.lang.Override
        public FuckGrpcStarterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuckGrpcStarterBlockingStub(channel, callOptions);
        }
      };
    return FuckGrpcStarterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FuckGrpcStarterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FuckGrpcStarterFutureStub>() {
        @java.lang.Override
        public FuckGrpcStarterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FuckGrpcStarterFutureStub(channel, callOptions);
        }
      };
    return FuckGrpcStarterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class FuckGrpcStarterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void fuck(com.unn.grpc.examples.lib.FuckRequest request,
        io.grpc.stub.StreamObserver<com.unn.grpc.examples.lib.FuckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFuckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFuckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.unn.grpc.examples.lib.FuckRequest,
                com.unn.grpc.examples.lib.FuckResponse>(
                  this, METHODID_FUCK)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FuckGrpcStarterStub extends io.grpc.stub.AbstractAsyncStub<FuckGrpcStarterStub> {
    private FuckGrpcStarterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuckGrpcStarterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuckGrpcStarterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void fuck(com.unn.grpc.examples.lib.FuckRequest request,
        io.grpc.stub.StreamObserver<com.unn.grpc.examples.lib.FuckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFuckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FuckGrpcStarterBlockingStub extends io.grpc.stub.AbstractBlockingStub<FuckGrpcStarterBlockingStub> {
    private FuckGrpcStarterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuckGrpcStarterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuckGrpcStarterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.unn.grpc.examples.lib.FuckResponse fuck(com.unn.grpc.examples.lib.FuckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFuckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class FuckGrpcStarterFutureStub extends io.grpc.stub.AbstractFutureStub<FuckGrpcStarterFutureStub> {
    private FuckGrpcStarterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FuckGrpcStarterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FuckGrpcStarterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.unn.grpc.examples.lib.FuckResponse> fuck(
        com.unn.grpc.examples.lib.FuckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFuckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FUCK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FuckGrpcStarterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FuckGrpcStarterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FUCK:
          serviceImpl.fuck((com.unn.grpc.examples.lib.FuckRequest) request,
              (io.grpc.stub.StreamObserver<com.unn.grpc.examples.lib.FuckResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FuckGrpcStarterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FuckGrpcStarterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.unn.grpc.examples.lib.FuckProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FuckGrpcStarter");
    }
  }

  private static final class FuckGrpcStarterFileDescriptorSupplier
      extends FuckGrpcStarterBaseDescriptorSupplier {
    FuckGrpcStarterFileDescriptorSupplier() {}
  }

  private static final class FuckGrpcStarterMethodDescriptorSupplier
      extends FuckGrpcStarterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FuckGrpcStarterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FuckGrpcStarterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FuckGrpcStarterFileDescriptorSupplier())
              .addMethod(getFuckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
