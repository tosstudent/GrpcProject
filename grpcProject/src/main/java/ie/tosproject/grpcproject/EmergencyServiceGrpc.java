package ie.tosproject.grpcproject;

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
 *Define Service - Unary
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: grpcproject.proto")
public final class EmergencyServiceGrpc {

  private EmergencyServiceGrpc() {}

  public static final String SERVICE_NAME = "tosproject.EmergencyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ie.tosproject.grpcproject.LoginRequest,
      ie.tosproject.grpcproject.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = ie.tosproject.grpcproject.LoginRequest.class,
      responseType = ie.tosproject.grpcproject.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.tosproject.grpcproject.LoginRequest,
      ie.tosproject.grpcproject.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<ie.tosproject.grpcproject.LoginRequest, ie.tosproject.grpcproject.LoginResponse> getLoginMethod;
    if ((getLoginMethod = EmergencyServiceGrpc.getLoginMethod) == null) {
      synchronized (EmergencyServiceGrpc.class) {
        if ((getLoginMethod = EmergencyServiceGrpc.getLoginMethod) == null) {
          EmergencyServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<ie.tosproject.grpcproject.LoginRequest, ie.tosproject.grpcproject.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tosproject.EmergencyService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.tosproject.grpcproject.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.tosproject.grpcproject.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmergencyServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmergencyServiceStub newStub(io.grpc.Channel channel) {
    return new EmergencyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmergencyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmergencyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmergencyServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Define Service - Unary
   * </pre>
   */
  public static abstract class EmergencyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(ie.tosproject.grpcproject.LoginRequest request,
        io.grpc.stub.StreamObserver<ie.tosproject.grpcproject.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.tosproject.grpcproject.LoginRequest,
                ie.tosproject.grpcproject.LoginResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   * <pre>
   *Define Service - Unary
   * </pre>
   */
  public static final class EmergencyServiceStub extends io.grpc.stub.AbstractStub<EmergencyServiceStub> {
    private EmergencyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(ie.tosproject.grpcproject.LoginRequest request,
        io.grpc.stub.StreamObserver<ie.tosproject.grpcproject.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Define Service - Unary
   * </pre>
   */
  public static final class EmergencyServiceBlockingStub extends io.grpc.stub.AbstractStub<EmergencyServiceBlockingStub> {
    private EmergencyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ie.tosproject.grpcproject.LoginResponse login(ie.tosproject.grpcproject.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Define Service - Unary
   * </pre>
   */
  public static final class EmergencyServiceFutureStub extends io.grpc.stub.AbstractStub<EmergencyServiceFutureStub> {
    private EmergencyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmergencyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmergencyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmergencyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.tosproject.grpcproject.LoginResponse> login(
        ie.tosproject.grpcproject.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmergencyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmergencyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((ie.tosproject.grpcproject.LoginRequest) request,
              (io.grpc.stub.StreamObserver<ie.tosproject.grpcproject.LoginResponse>) responseObserver);
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

  private static abstract class EmergencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmergencyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ie.tosproject.grpcproject.grpcProjectServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmergencyService");
    }
  }

  private static final class EmergencyServiceFileDescriptorSupplier
      extends EmergencyServiceBaseDescriptorSupplier {
    EmergencyServiceFileDescriptorSupplier() {}
  }

  private static final class EmergencyServiceMethodDescriptorSupplier
      extends EmergencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmergencyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmergencyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmergencyServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
