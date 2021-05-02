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

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ambulance.proto")
public final class AmbulanceServiceGrpc {

  private AmbulanceServiceGrpc() {}

  public static final String SERVICE_NAME = "AmbulanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AmbulanceRequest,
      com.tosproject.grpcenterprise.ConfirmResponse> getAmbulanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ambulance",
      requestType = com.tosproject.grpcenterprise.AmbulanceRequest.class,
      responseType = com.tosproject.grpcenterprise.ConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AmbulanceRequest,
      com.tosproject.grpcenterprise.ConfirmResponse> getAmbulanceMethod() {
    io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AmbulanceRequest, com.tosproject.grpcenterprise.ConfirmResponse> getAmbulanceMethod;
    if ((getAmbulanceMethod = AmbulanceServiceGrpc.getAmbulanceMethod) == null) {
      synchronized (AmbulanceServiceGrpc.class) {
        if ((getAmbulanceMethod = AmbulanceServiceGrpc.getAmbulanceMethod) == null) {
          AmbulanceServiceGrpc.getAmbulanceMethod = getAmbulanceMethod = 
              io.grpc.MethodDescriptor.<com.tosproject.grpcenterprise.AmbulanceRequest, com.tosproject.grpcenterprise.ConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AmbulanceService", "ambulance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.AmbulanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.ConfirmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AmbulanceServiceMethodDescriptorSupplier("ambulance"))
                  .build();
          }
        }
     }
     return getAmbulanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AddressRequest,
      com.tosproject.grpcenterprise.AddressResponse> getAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "address",
      requestType = com.tosproject.grpcenterprise.AddressRequest.class,
      responseType = com.tosproject.grpcenterprise.AddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AddressRequest,
      com.tosproject.grpcenterprise.AddressResponse> getAddressMethod() {
    io.grpc.MethodDescriptor<com.tosproject.grpcenterprise.AddressRequest, com.tosproject.grpcenterprise.AddressResponse> getAddressMethod;
    if ((getAddressMethod = AmbulanceServiceGrpc.getAddressMethod) == null) {
      synchronized (AmbulanceServiceGrpc.class) {
        if ((getAddressMethod = AmbulanceServiceGrpc.getAddressMethod) == null) {
          AmbulanceServiceGrpc.getAddressMethod = getAddressMethod = 
              io.grpc.MethodDescriptor.<com.tosproject.grpcenterprise.AddressRequest, com.tosproject.grpcenterprise.AddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AmbulanceService", "address"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.AddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tosproject.grpcenterprise.AddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AmbulanceServiceMethodDescriptorSupplier("address"))
                  .build();
          }
        }
     }
     return getAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AmbulanceServiceStub newStub(io.grpc.Channel channel) {
    return new AmbulanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AmbulanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AmbulanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AmbulanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AmbulanceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AmbulanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ambulance(com.tosproject.grpcenterprise.AmbulanceRequest request,
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.ConfirmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAmbulanceMethod(), responseObserver);
    }

    /**
     */
    public void address(com.tosproject.grpcenterprise.AddressRequest request,
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.AddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAmbulanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tosproject.grpcenterprise.AmbulanceRequest,
                com.tosproject.grpcenterprise.ConfirmResponse>(
                  this, METHODID_AMBULANCE)))
          .addMethod(
            getAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tosproject.grpcenterprise.AddressRequest,
                com.tosproject.grpcenterprise.AddressResponse>(
                  this, METHODID_ADDRESS)))
          .build();
    }
  }

  /**
   */
  public static final class AmbulanceServiceStub extends io.grpc.stub.AbstractStub<AmbulanceServiceStub> {
    private AmbulanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AmbulanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmbulanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AmbulanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void ambulance(com.tosproject.grpcenterprise.AmbulanceRequest request,
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.ConfirmResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAmbulanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void address(com.tosproject.grpcenterprise.AddressRequest request,
        io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.AddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AmbulanceServiceBlockingStub extends io.grpc.stub.AbstractStub<AmbulanceServiceBlockingStub> {
    private AmbulanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AmbulanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmbulanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AmbulanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tosproject.grpcenterprise.ConfirmResponse ambulance(String string) {
      return blockingUnaryCall(
          getChannel(), getAmbulanceMethod(), getCallOptions(), string);
    }

    private ConfirmResponse blockingUnaryCall(Channel channel,
			MethodDescriptor<AmbulanceRequest,ConfirmResponse> methodDescriptor, CallOptions callOptions,
			String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     */
    public com.tosproject.grpcenterprise.AddressResponse address(com.tosproject.grpcenterprise.AddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddressMethod(), getCallOptions(), request);
    }

	private AddressResponse blockingUnaryCall(Channel channel,
			MethodDescriptor<AddressRequest, AddressResponse> addressMethod, CallOptions callOptions,
			AddressRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AddressResponse address(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfirmResponse ambulance(AmbulanceRequest ambulancerequest) {
		// TODO Auto-generated method stub
		return null;
	}
  }

  /**
   */
  public static final class AmbulanceServiceFutureStub extends io.grpc.stub.AbstractStub<AmbulanceServiceFutureStub> {
    private AmbulanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AmbulanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AmbulanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AmbulanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tosproject.grpcenterprise.ConfirmResponse> ambulance(
        com.tosproject.grpcenterprise.AmbulanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAmbulanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tosproject.grpcenterprise.AddressResponse> address(
        com.tosproject.grpcenterprise.AddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AMBULANCE = 0;
  private static final int METHODID_ADDRESS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AmbulanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AmbulanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AMBULANCE:
          serviceImpl.ambulance((com.tosproject.grpcenterprise.AmbulanceRequest) request,
              (io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.ConfirmResponse>) responseObserver);
          break;
        case METHODID_ADDRESS:
          serviceImpl.address((com.tosproject.grpcenterprise.AddressRequest) request,
              (io.grpc.stub.StreamObserver<com.tosproject.grpcenterprise.AddressResponse>) responseObserver);
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

  private static abstract class AmbulanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AmbulanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tosproject.grpcenterprise.Ambulance.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AmbulanceService");
    }
  }

  private static final class AmbulanceServiceFileDescriptorSupplier
      extends AmbulanceServiceBaseDescriptorSupplier {
    AmbulanceServiceFileDescriptorSupplier() {}
  }

  private static final class AmbulanceServiceMethodDescriptorSupplier
      extends AmbulanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AmbulanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AmbulanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AmbulanceServiceFileDescriptorSupplier())
              .addMethod(getAmbulanceMethod())
              .addMethod(getAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
