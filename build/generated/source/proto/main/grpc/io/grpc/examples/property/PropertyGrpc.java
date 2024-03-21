package io.grpc.examples.property;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: property.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PropertyGrpc {

  private PropertyGrpc() {}

  public static final java.lang.String SERVICE_NAME = "property.Property";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.property.PropertyRequest,
      io.grpc.examples.property.PropertyReply> getSendPropertyInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPropertyInformation",
      requestType = io.grpc.examples.property.PropertyRequest.class,
      responseType = io.grpc.examples.property.PropertyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.property.PropertyRequest,
      io.grpc.examples.property.PropertyReply> getSendPropertyInformationMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.property.PropertyRequest, io.grpc.examples.property.PropertyReply> getSendPropertyInformationMethod;
    if ((getSendPropertyInformationMethod = PropertyGrpc.getSendPropertyInformationMethod) == null) {
      synchronized (PropertyGrpc.class) {
        if ((getSendPropertyInformationMethod = PropertyGrpc.getSendPropertyInformationMethod) == null) {
          PropertyGrpc.getSendPropertyInformationMethod = getSendPropertyInformationMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.property.PropertyRequest, io.grpc.examples.property.PropertyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPropertyInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.property.PropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.property.PropertyReply.getDefaultInstance()))
              .setSchemaDescriptor(new PropertyMethodDescriptorSupplier("SendPropertyInformation"))
              .build();
        }
      }
    }
    return getSendPropertyInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PropertyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyStub>() {
        @java.lang.Override
        public PropertyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyStub(channel, callOptions);
        }
      };
    return PropertyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PropertyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyBlockingStub>() {
        @java.lang.Override
        public PropertyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyBlockingStub(channel, callOptions);
        }
      };
    return PropertyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PropertyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyFutureStub>() {
        @java.lang.Override
        public PropertyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyFutureStub(channel, callOptions);
        }
      };
    return PropertyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendPropertyInformation(io.grpc.examples.property.PropertyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.property.PropertyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPropertyInformationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Property.
   */
  public static abstract class PropertyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PropertyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Property.
   */
  public static final class PropertyStub
      extends io.grpc.stub.AbstractAsyncStub<PropertyStub> {
    private PropertyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyStub(channel, callOptions);
    }

    /**
     */
    public void sendPropertyInformation(io.grpc.examples.property.PropertyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.property.PropertyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPropertyInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Property.
   */
  public static final class PropertyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PropertyBlockingStub> {
    private PropertyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.property.PropertyReply sendPropertyInformation(io.grpc.examples.property.PropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPropertyInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Property.
   */
  public static final class PropertyFutureStub
      extends io.grpc.stub.AbstractFutureStub<PropertyFutureStub> {
    private PropertyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.property.PropertyReply> sendPropertyInformation(
        io.grpc.examples.property.PropertyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPropertyInformationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PROPERTY_INFORMATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PROPERTY_INFORMATION:
          serviceImpl.sendPropertyInformation((io.grpc.examples.property.PropertyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.property.PropertyReply>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendPropertyInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.grpc.examples.property.PropertyRequest,
              io.grpc.examples.property.PropertyReply>(
                service, METHODID_SEND_PROPERTY_INFORMATION)))
        .build();
  }

  private static abstract class PropertyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PropertyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.property.PropertyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Property");
    }
  }

  private static final class PropertyFileDescriptorSupplier
      extends PropertyBaseDescriptorSupplier {
    PropertyFileDescriptorSupplier() {}
  }

  private static final class PropertyMethodDescriptorSupplier
      extends PropertyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PropertyMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PropertyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PropertyFileDescriptorSupplier())
              .addMethod(getSendPropertyInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
