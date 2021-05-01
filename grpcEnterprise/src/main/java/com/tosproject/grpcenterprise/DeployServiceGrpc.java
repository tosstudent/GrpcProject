package com.tosproject.grpcenterprise;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Define Mobile Ambulance Delpoyment – client stream 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: deploy.proto")
public final class DeployServiceGrpc {

  private DeployServiceGrpc() {}

  public static final String SERVICE_NAME = "tosproject.DeployService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.LongDeployRequest,
      com.tosproject.grpcenterprise.LongDeployResponse> getLongDeployMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongDeploy",
      requestType = com.tosproject.grpcenterprise.LongDeployRequest.class,
      responseType = com.tosproject.grpcenterprise.LongDeployResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.LongDeployRequest,
      com.tosproject.grpcenterprise.LongDeployResponse> getLongDeployMethod() {
    io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.LongDeployRequest, com.tosproject.grpcenterprise.LongDeployResponse> getLongDeployMethod;
    if ((getLongDeployMethod = DeployServiceGrpc.getLongDeployMethod) == null) {
      synchronized (DeployServiceGrpc.class) {
        if ((getLongDeployMethod = DeployServiceGrpc.getLongDeployMethod) == null) {
          DeployServiceGrpc.getLongDeployMethod = getLongDeployMethod = 
              io.grpc.MethodDescriptor.<com.tosproject.grpcenterprise.LongDeployRequest, com.tosproject.grpcenterprise.LongDeployResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "tosproject.DeployService", "LongDeploy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.LongDeployRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.LongDeployResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeployServiceMethodDescriptorSupplier("LongDeploy"))
                  .build();
          }
        }
     }
     return getLongDeployMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeployServiceStub newStub(io.grpc.Channel channel) {
    return new DeployServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeployServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeployServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeployServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeployServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Define Mobile Ambulance Delpoyment – client stream 
   * </pre>
   */
  public static abstract class DeployServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.LongDeployRequest> longDeploy(
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.LongDeployResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLongDeployMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLongDeployMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.tosproject.grpcenterprise.LongDeployRequest,
                com.tosproject.grpcenterprise.LongDeployResponse>(
                  this, METHODID_LONG_DEPLOY)))
          .build();
    }
  }

  /**
   * <pre>
   *Define Mobile Ambulance Delpoyment – client stream 
   * </pre>
   */
  public static final class DeployServiceStub extends io.grpc.stub.AbstractStub<DeployServiceStub> {
    private DeployServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeployServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeployServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.LongDeployRequest> longDeploy(
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.LongDeployResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLongDeployMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Define Mobile Ambulance Delpoyment – client stream 
   * </pre>
   */
  public static final class DeployServiceBlockingStub extends io.grpc.stub.AbstractStub<DeployServiceBlockingStub> {
    private DeployServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeployServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeployServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *Define Mobile Ambulance Delpoyment – client stream 
   * </pre>
   */
  public static final class DeployServiceFutureStub extends io.grpc.stub.AbstractStub<DeployServiceFutureStub> {
    private DeployServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeployServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeployServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeployServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LONG_DEPLOY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeployServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeployServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_DEPLOY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longDeploy(
              (io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.LongDeployResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeployServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tosproject.grpcenterprise.grpcEnterpriseServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeployService");
    }
  }

  private static final class DeployServiceFileDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier {
    DeployServiceFileDescriptorSupplier() {}
  }

  private static final class DeployServiceMethodDescriptorSupplier
      extends DeployServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeployServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeployServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeployServiceFileDescriptorSupplier())
              .addMethod(getLongDeployMethod())
              .build();
        }
      }
    }
    return result;
  }
}
