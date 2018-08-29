//Generated by flatc compiler (version 1.9.0)
//If you make any local changes, they will be lost
//source: graph.fbs

package nd4j.graph;

import com.google.flatbuffers.grpc.FlatbuffersUtils;

import java.nio.ByteBuffer;
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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: graph.fbs")
public final class GraphInferenceServerGrpc {

  private GraphInferenceServerGrpc() {}
  
  public static final String SERVICE_NAME = "nd4j.graph.GraphInferenceServer";
  
  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisterGraphMethod()} instead. 
  public static final io.grpc.MethodDescriptor<nd4j.graph.FlatGraph,
      nd4j.graph.FlatResponse> METHOD_REGISTER_GRAPH = getRegisterGraphMethod();
  
  private static volatile io.grpc.MethodDescriptor<nd4j.graph.FlatGraph,
      nd4j.graph.FlatResponse> getRegisterGraphMethod;
  
  private static volatile FlatbuffersUtils.FBExtactor<nd4j.graph.FlatGraph> extractorOfFlatGraph;
  private static FlatbuffersUtils.FBExtactor<nd4j.graph.FlatGraph> getExtractorOfFlatGraph() {
      if (extractorOfFlatGraph != null) return extractorOfFlatGraph;
      synchronized (GraphInferenceServerGrpc.class) {
          if (extractorOfFlatGraph != null) return extractorOfFlatGraph;
          extractorOfFlatGraph = new FlatbuffersUtils.FBExtactor<nd4j.graph.FlatGraph>() {
              public nd4j.graph.FlatGraph extract (ByteBuffer buffer) {
                  return nd4j.graph.FlatGraph.getRootAsFlatGraph(buffer);
              }
          };
          return extractorOfFlatGraph;
      }
  }
  
  private static volatile FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResponse> extractorOfFlatResponse;
  private static FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResponse> getExtractorOfFlatResponse() {
      if (extractorOfFlatResponse != null) return extractorOfFlatResponse;
      synchronized (GraphInferenceServerGrpc.class) {
          if (extractorOfFlatResponse != null) return extractorOfFlatResponse;
          extractorOfFlatResponse = new FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResponse>() {
              public nd4j.graph.FlatResponse extract (ByteBuffer buffer) {
                  return nd4j.graph.FlatResponse.getRootAsFlatResponse(buffer);
              }
          };
          return extractorOfFlatResponse;
      }
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<nd4j.graph.FlatGraph,
      nd4j.graph.FlatResponse> getRegisterGraphMethod() {
    io.grpc.MethodDescriptor<nd4j.graph.FlatGraph, nd4j.graph.FlatResponse> getRegisterGraphMethod;
    if ((getRegisterGraphMethod = GraphInferenceServerGrpc.getRegisterGraphMethod) == null) {
      synchronized (GraphInferenceServerGrpc.class) {
        if ((getRegisterGraphMethod = GraphInferenceServerGrpc.getRegisterGraphMethod) == null) {
          GraphInferenceServerGrpc.getRegisterGraphMethod = getRegisterGraphMethod = 
              io.grpc.MethodDescriptor.<nd4j.graph.FlatGraph, nd4j.graph.FlatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "nd4j.graph.GraphInferenceServer", "RegisterGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatGraph.class, getExtractorOfFlatGraph()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatResponse.class, getExtractorOfFlatResponse()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getRegisterGraphMethod;
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getForgetGraphMethod()} instead. 
  public static final io.grpc.MethodDescriptor<nd4j.graph.FlatDropRequest,
      nd4j.graph.FlatResponse> METHOD_FORGET_GRAPH = getForgetGraphMethod();
  
  private static volatile io.grpc.MethodDescriptor<nd4j.graph.FlatDropRequest,
      nd4j.graph.FlatResponse> getForgetGraphMethod;
  
  private static volatile FlatbuffersUtils.FBExtactor<nd4j.graph.FlatDropRequest> extractorOfFlatDropRequest;
  private static FlatbuffersUtils.FBExtactor<nd4j.graph.FlatDropRequest> getExtractorOfFlatDropRequest() {
      if (extractorOfFlatDropRequest != null) return extractorOfFlatDropRequest;
      synchronized (GraphInferenceServerGrpc.class) {
          if (extractorOfFlatDropRequest != null) return extractorOfFlatDropRequest;
          extractorOfFlatDropRequest = new FlatbuffersUtils.FBExtactor<nd4j.graph.FlatDropRequest>() {
              public nd4j.graph.FlatDropRequest extract (ByteBuffer buffer) {
                  return nd4j.graph.FlatDropRequest.getRootAsFlatDropRequest(buffer);
              }
          };
          return extractorOfFlatDropRequest;
      }
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<nd4j.graph.FlatDropRequest,
      nd4j.graph.FlatResponse> getForgetGraphMethod() {
    io.grpc.MethodDescriptor<nd4j.graph.FlatDropRequest, nd4j.graph.FlatResponse> getForgetGraphMethod;
    if ((getForgetGraphMethod = GraphInferenceServerGrpc.getForgetGraphMethod) == null) {
      synchronized (GraphInferenceServerGrpc.class) {
        if ((getForgetGraphMethod = GraphInferenceServerGrpc.getForgetGraphMethod) == null) {
          GraphInferenceServerGrpc.getForgetGraphMethod = getForgetGraphMethod = 
              io.grpc.MethodDescriptor.<nd4j.graph.FlatDropRequest, nd4j.graph.FlatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "nd4j.graph.GraphInferenceServer", "ForgetGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatDropRequest.class, getExtractorOfFlatDropRequest()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatResponse.class, getExtractorOfFlatResponse()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getForgetGraphMethod;
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInferenceRequestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<nd4j.graph.FlatInferenceRequest,
      nd4j.graph.FlatResult> METHOD_INFERENCE_REQUEST = getInferenceRequestMethod();
  
  private static volatile io.grpc.MethodDescriptor<nd4j.graph.FlatInferenceRequest,
      nd4j.graph.FlatResult> getInferenceRequestMethod;
  
  private static volatile FlatbuffersUtils.FBExtactor<nd4j.graph.FlatInferenceRequest> extractorOfFlatInferenceRequest;
  private static FlatbuffersUtils.FBExtactor<nd4j.graph.FlatInferenceRequest> getExtractorOfFlatInferenceRequest() {
      if (extractorOfFlatInferenceRequest != null) return extractorOfFlatInferenceRequest;
      synchronized (GraphInferenceServerGrpc.class) {
          if (extractorOfFlatInferenceRequest != null) return extractorOfFlatInferenceRequest;
          extractorOfFlatInferenceRequest = new FlatbuffersUtils.FBExtactor<nd4j.graph.FlatInferenceRequest>() {
              public nd4j.graph.FlatInferenceRequest extract (ByteBuffer buffer) {
                  return nd4j.graph.FlatInferenceRequest.getRootAsFlatInferenceRequest(buffer);
              }
          };
          return extractorOfFlatInferenceRequest;
      }
  }
  
  private static volatile FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResult> extractorOfFlatResult;
  private static FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResult> getExtractorOfFlatResult() {
      if (extractorOfFlatResult != null) return extractorOfFlatResult;
      synchronized (GraphInferenceServerGrpc.class) {
          if (extractorOfFlatResult != null) return extractorOfFlatResult;
          extractorOfFlatResult = new FlatbuffersUtils.FBExtactor<nd4j.graph.FlatResult>() {
              public nd4j.graph.FlatResult extract (ByteBuffer buffer) {
                  return nd4j.graph.FlatResult.getRootAsFlatResult(buffer);
              }
          };
          return extractorOfFlatResult;
      }
  }
  
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<nd4j.graph.FlatInferenceRequest,
      nd4j.graph.FlatResult> getInferenceRequestMethod() {
    io.grpc.MethodDescriptor<nd4j.graph.FlatInferenceRequest, nd4j.graph.FlatResult> getInferenceRequestMethod;
    if ((getInferenceRequestMethod = GraphInferenceServerGrpc.getInferenceRequestMethod) == null) {
      synchronized (GraphInferenceServerGrpc.class) {
        if ((getInferenceRequestMethod = GraphInferenceServerGrpc.getInferenceRequestMethod) == null) {
          GraphInferenceServerGrpc.getInferenceRequestMethod = getInferenceRequestMethod = 
              io.grpc.MethodDescriptor.<nd4j.graph.FlatInferenceRequest, nd4j.graph.FlatResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "nd4j.graph.GraphInferenceServer", "InferenceRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatInferenceRequest.class, getExtractorOfFlatInferenceRequest()))
              .setResponseMarshaller(FlatbuffersUtils.marshaller(
                  nd4j.graph.FlatResult.class, getExtractorOfFlatResult()))
                  .setSchemaDescriptor(null)
                  .build();
          }
        }
     }
     return getInferenceRequestMethod;
  }
  
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GraphInferenceServerStub newStub(io.grpc.Channel channel) {
    return new GraphInferenceServerStub(channel);
  }
  
  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GraphInferenceServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GraphInferenceServerBlockingStub(channel);
  }
  
  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GraphInferenceServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GraphInferenceServerFutureStub(channel);
  }
  
  /**
   */
  public static abstract class GraphInferenceServerImplBase implements io.grpc.BindableService {
    
    /**
     */
    public     void registerGraph(nd4j.graph.FlatGraph request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse> responseObserver)     {
      asyncUnimplementedUnaryCall(getRegisterGraphMethod(), responseObserver);
    }
    
    /**
     */
    public     void forgetGraph(nd4j.graph.FlatDropRequest request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse> responseObserver)     {
      asyncUnimplementedUnaryCall(getForgetGraphMethod(), responseObserver);
    }
    
    /**
     */
    public     void inferenceRequest(nd4j.graph.FlatInferenceRequest request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResult> responseObserver)     {
      asyncUnimplementedUnaryCall(getInferenceRequestMethod(), responseObserver);
    }
    
    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                nd4j.graph.FlatGraph,
                nd4j.graph.FlatResponse>(
                  this, METHODID_REGISTER_GRAPH)))
          .addMethod(
            getForgetGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                nd4j.graph.FlatDropRequest,
                nd4j.graph.FlatResponse>(
                  this, METHODID_FORGET_GRAPH)))
          .addMethod(
            getInferenceRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                nd4j.graph.FlatInferenceRequest,
                nd4j.graph.FlatResult>(
                  this, METHODID_INFERENCE_REQUEST)))
          .build();
    }
  }
  
  /**
   */
  public static final class GraphInferenceServerStub extends io.grpc.stub.AbstractStub<GraphInferenceServerStub> {
    private GraphInferenceServerStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private GraphInferenceServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected GraphInferenceServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphInferenceServerStub(channel, callOptions);
    }
    
    /**
     */
    public     void registerGraph(nd4j.graph.FlatGraph request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getRegisterGraphMethod(), getCallOptions()), request, responseObserver);
    }
    
    /**
     */
    public     void forgetGraph(nd4j.graph.FlatDropRequest request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getForgetGraphMethod(), getCallOptions()), request, responseObserver);
    }
    
    /**
     */
    public     void inferenceRequest(nd4j.graph.FlatInferenceRequest request,
        io.grpc.stub.StreamObserver<nd4j.graph.FlatResult> responseObserver)     {
      asyncUnaryCall(
          getChannel().newCall(getInferenceRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }
  
  /**
   */
  public static final class GraphInferenceServerBlockingStub extends io.grpc.stub.AbstractStub<GraphInferenceServerBlockingStub> {
    private GraphInferenceServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private GraphInferenceServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected GraphInferenceServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphInferenceServerBlockingStub(channel, callOptions);
    }
    
    /**
     */
    public     nd4j.graph.FlatResponse registerGraph(nd4j.graph.FlatGraph request)     {
      return blockingUnaryCall(
          getChannel(), getRegisterGraphMethod(), getCallOptions(), request);
    }
    
    /**
     */
    public     nd4j.graph.FlatResponse forgetGraph(nd4j.graph.FlatDropRequest request)     {
      return blockingUnaryCall(
          getChannel(), getForgetGraphMethod(), getCallOptions(), request);
    }
    
    /**
     */
    public     nd4j.graph.FlatResult inferenceRequest(nd4j.graph.FlatInferenceRequest request)     {
      return blockingUnaryCall(
          getChannel(), getInferenceRequestMethod(), getCallOptions(), request);
    }
  }
  
  /**
   */
  public static final class GraphInferenceServerFutureStub extends io.grpc.stub.AbstractStub<GraphInferenceServerFutureStub> {
    private GraphInferenceServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }
    
    private GraphInferenceServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }
    
    @java.lang.Override
    protected GraphInferenceServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GraphInferenceServerFutureStub(channel, callOptions);
    }
    
    /**
     */
    public     com.google.common.util.concurrent.ListenableFuture<nd4j.graph.FlatResponse> registerGraph(
        nd4j.graph.FlatGraph request)     {
      return futureUnaryCall(
          getChannel().newCall(getRegisterGraphMethod(), getCallOptions()), request);
    }
    
    /**
     */
    public     com.google.common.util.concurrent.ListenableFuture<nd4j.graph.FlatResponse> forgetGraph(
        nd4j.graph.FlatDropRequest request)     {
      return futureUnaryCall(
          getChannel().newCall(getForgetGraphMethod(), getCallOptions()), request);
    }
    
    /**
     */
    public     com.google.common.util.concurrent.ListenableFuture<nd4j.graph.FlatResult> inferenceRequest(
        nd4j.graph.FlatInferenceRequest request)     {
      return futureUnaryCall(
          getChannel().newCall(getInferenceRequestMethod(), getCallOptions()), request);
    }
  }
  
  private static final int METHODID_REGISTER_GRAPH = 0;
  private static final int METHODID_FORGET_GRAPH = 1;
  private static final int METHODID_INFERENCE_REQUEST = 2;
  
  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GraphInferenceServerImplBase serviceImpl;
    private final int methodId;
  
    MethodHandlers(GraphInferenceServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }
  
    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_GRAPH:
          serviceImpl.registerGraph((nd4j.graph.FlatGraph) request,
              (io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse>) responseObserver);
          break;
        case METHODID_FORGET_GRAPH:
          serviceImpl.forgetGraph((nd4j.graph.FlatDropRequest) request,
              (io.grpc.stub.StreamObserver<nd4j.graph.FlatResponse>) responseObserver);
          break;
        case METHODID_INFERENCE_REQUEST:
          serviceImpl.inferenceRequest((nd4j.graph.FlatInferenceRequest) request,
              (io.grpc.stub.StreamObserver<nd4j.graph.FlatResult>) responseObserver);
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
  
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;
  
  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GraphInferenceServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)              
              .setSchemaDescriptor(null)              
              .addMethod(getRegisterGraphMethod())              
              .addMethod(getForgetGraphMethod())              
              .addMethod(getInferenceRequestMethod())              
              .build();
        }
      }
    }
    return result;
  }
}
