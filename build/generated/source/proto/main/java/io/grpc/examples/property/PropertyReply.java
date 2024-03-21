// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

// Protobuf Java Version: 3.25.1
package io.grpc.examples.property;

/**
 * Protobuf type {@code property.PropertyReply}
 */
public final class PropertyReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:property.PropertyReply)
    PropertyReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PropertyReply.newBuilder() to construct.
  private PropertyReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PropertyReply() {
    propertyRequest_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PropertyReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.property.PropertyProto.internal_static_property_PropertyReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.property.PropertyProto.internal_static_property_PropertyReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.property.PropertyReply.class, io.grpc.examples.property.PropertyReply.Builder.class);
  }

  public static final int PROPERTYREQUEST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.grpc.examples.property.PropertyRequest> propertyRequest_;
  /**
   * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grpc.examples.property.PropertyRequest> getPropertyRequestList() {
    return propertyRequest_;
  }
  /**
   * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grpc.examples.property.PropertyRequestOrBuilder> 
      getPropertyRequestOrBuilderList() {
    return propertyRequest_;
  }
  /**
   * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
   */
  @java.lang.Override
  public int getPropertyRequestCount() {
    return propertyRequest_.size();
  }
  /**
   * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.property.PropertyRequest getPropertyRequest(int index) {
    return propertyRequest_.get(index);
  }
  /**
   * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
   */
  @java.lang.Override
  public io.grpc.examples.property.PropertyRequestOrBuilder getPropertyRequestOrBuilder(
      int index) {
    return propertyRequest_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < propertyRequest_.size(); i++) {
      output.writeMessage(1, propertyRequest_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < propertyRequest_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, propertyRequest_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.examples.property.PropertyReply)) {
      return super.equals(obj);
    }
    io.grpc.examples.property.PropertyReply other = (io.grpc.examples.property.PropertyReply) obj;

    if (!getPropertyRequestList()
        .equals(other.getPropertyRequestList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPropertyRequestCount() > 0) {
      hash = (37 * hash) + PROPERTYREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getPropertyRequestList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.property.PropertyReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.grpc.examples.property.PropertyReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grpc.examples.property.PropertyReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.property.PropertyReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.property.PropertyReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code property.PropertyReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:property.PropertyReply)
      io.grpc.examples.property.PropertyReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.property.PropertyProto.internal_static_property_PropertyReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.property.PropertyProto.internal_static_property_PropertyReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.property.PropertyReply.class, io.grpc.examples.property.PropertyReply.Builder.class);
    }

    // Construct using io.grpc.examples.property.PropertyReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (propertyRequestBuilder_ == null) {
        propertyRequest_ = java.util.Collections.emptyList();
      } else {
        propertyRequest_ = null;
        propertyRequestBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.property.PropertyProto.internal_static_property_PropertyReply_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.property.PropertyReply getDefaultInstanceForType() {
      return io.grpc.examples.property.PropertyReply.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.property.PropertyReply build() {
      io.grpc.examples.property.PropertyReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.property.PropertyReply buildPartial() {
      io.grpc.examples.property.PropertyReply result = new io.grpc.examples.property.PropertyReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.grpc.examples.property.PropertyReply result) {
      if (propertyRequestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          propertyRequest_ = java.util.Collections.unmodifiableList(propertyRequest_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.propertyRequest_ = propertyRequest_;
      } else {
        result.propertyRequest_ = propertyRequestBuilder_.build();
      }
    }

    private void buildPartial0(io.grpc.examples.property.PropertyReply result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.property.PropertyReply) {
        return mergeFrom((io.grpc.examples.property.PropertyReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.property.PropertyReply other) {
      if (other == io.grpc.examples.property.PropertyReply.getDefaultInstance()) return this;
      if (propertyRequestBuilder_ == null) {
        if (!other.propertyRequest_.isEmpty()) {
          if (propertyRequest_.isEmpty()) {
            propertyRequest_ = other.propertyRequest_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePropertyRequestIsMutable();
            propertyRequest_.addAll(other.propertyRequest_);
          }
          onChanged();
        }
      } else {
        if (!other.propertyRequest_.isEmpty()) {
          if (propertyRequestBuilder_.isEmpty()) {
            propertyRequestBuilder_.dispose();
            propertyRequestBuilder_ = null;
            propertyRequest_ = other.propertyRequest_;
            bitField0_ = (bitField0_ & ~0x00000001);
            propertyRequestBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPropertyRequestFieldBuilder() : null;
          } else {
            propertyRequestBuilder_.addAllMessages(other.propertyRequest_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              io.grpc.examples.property.PropertyRequest m =
                  input.readMessage(
                      io.grpc.examples.property.PropertyRequest.parser(),
                      extensionRegistry);
              if (propertyRequestBuilder_ == null) {
                ensurePropertyRequestIsMutable();
                propertyRequest_.add(m);
              } else {
                propertyRequestBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grpc.examples.property.PropertyRequest> propertyRequest_ =
      java.util.Collections.emptyList();
    private void ensurePropertyRequestIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        propertyRequest_ = new java.util.ArrayList<io.grpc.examples.property.PropertyRequest>(propertyRequest_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.property.PropertyRequest, io.grpc.examples.property.PropertyRequest.Builder, io.grpc.examples.property.PropertyRequestOrBuilder> propertyRequestBuilder_;

    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public java.util.List<io.grpc.examples.property.PropertyRequest> getPropertyRequestList() {
      if (propertyRequestBuilder_ == null) {
        return java.util.Collections.unmodifiableList(propertyRequest_);
      } else {
        return propertyRequestBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public int getPropertyRequestCount() {
      if (propertyRequestBuilder_ == null) {
        return propertyRequest_.size();
      } else {
        return propertyRequestBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public io.grpc.examples.property.PropertyRequest getPropertyRequest(int index) {
      if (propertyRequestBuilder_ == null) {
        return propertyRequest_.get(index);
      } else {
        return propertyRequestBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder setPropertyRequest(
        int index, io.grpc.examples.property.PropertyRequest value) {
      if (propertyRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyRequestIsMutable();
        propertyRequest_.set(index, value);
        onChanged();
      } else {
        propertyRequestBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder setPropertyRequest(
        int index, io.grpc.examples.property.PropertyRequest.Builder builderForValue) {
      if (propertyRequestBuilder_ == null) {
        ensurePropertyRequestIsMutable();
        propertyRequest_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertyRequestBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder addPropertyRequest(io.grpc.examples.property.PropertyRequest value) {
      if (propertyRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyRequestIsMutable();
        propertyRequest_.add(value);
        onChanged();
      } else {
        propertyRequestBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder addPropertyRequest(
        int index, io.grpc.examples.property.PropertyRequest value) {
      if (propertyRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertyRequestIsMutable();
        propertyRequest_.add(index, value);
        onChanged();
      } else {
        propertyRequestBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder addPropertyRequest(
        io.grpc.examples.property.PropertyRequest.Builder builderForValue) {
      if (propertyRequestBuilder_ == null) {
        ensurePropertyRequestIsMutable();
        propertyRequest_.add(builderForValue.build());
        onChanged();
      } else {
        propertyRequestBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder addPropertyRequest(
        int index, io.grpc.examples.property.PropertyRequest.Builder builderForValue) {
      if (propertyRequestBuilder_ == null) {
        ensurePropertyRequestIsMutable();
        propertyRequest_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertyRequestBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder addAllPropertyRequest(
        java.lang.Iterable<? extends io.grpc.examples.property.PropertyRequest> values) {
      if (propertyRequestBuilder_ == null) {
        ensurePropertyRequestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, propertyRequest_);
        onChanged();
      } else {
        propertyRequestBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder clearPropertyRequest() {
      if (propertyRequestBuilder_ == null) {
        propertyRequest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        propertyRequestBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public Builder removePropertyRequest(int index) {
      if (propertyRequestBuilder_ == null) {
        ensurePropertyRequestIsMutable();
        propertyRequest_.remove(index);
        onChanged();
      } else {
        propertyRequestBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public io.grpc.examples.property.PropertyRequest.Builder getPropertyRequestBuilder(
        int index) {
      return getPropertyRequestFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public io.grpc.examples.property.PropertyRequestOrBuilder getPropertyRequestOrBuilder(
        int index) {
      if (propertyRequestBuilder_ == null) {
        return propertyRequest_.get(index);  } else {
        return propertyRequestBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public java.util.List<? extends io.grpc.examples.property.PropertyRequestOrBuilder> 
         getPropertyRequestOrBuilderList() {
      if (propertyRequestBuilder_ != null) {
        return propertyRequestBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(propertyRequest_);
      }
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public io.grpc.examples.property.PropertyRequest.Builder addPropertyRequestBuilder() {
      return getPropertyRequestFieldBuilder().addBuilder(
          io.grpc.examples.property.PropertyRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public io.grpc.examples.property.PropertyRequest.Builder addPropertyRequestBuilder(
        int index) {
      return getPropertyRequestFieldBuilder().addBuilder(
          index, io.grpc.examples.property.PropertyRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .property.PropertyRequest propertyRequest = 1;</code>
     */
    public java.util.List<io.grpc.examples.property.PropertyRequest.Builder> 
         getPropertyRequestBuilderList() {
      return getPropertyRequestFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grpc.examples.property.PropertyRequest, io.grpc.examples.property.PropertyRequest.Builder, io.grpc.examples.property.PropertyRequestOrBuilder> 
        getPropertyRequestFieldBuilder() {
      if (propertyRequestBuilder_ == null) {
        propertyRequestBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grpc.examples.property.PropertyRequest, io.grpc.examples.property.PropertyRequest.Builder, io.grpc.examples.property.PropertyRequestOrBuilder>(
                propertyRequest_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        propertyRequest_ = null;
      }
      return propertyRequestBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:property.PropertyReply)
  }

  // @@protoc_insertion_point(class_scope:property.PropertyReply)
  private static final io.grpc.examples.property.PropertyReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.property.PropertyReply();
  }

  public static io.grpc.examples.property.PropertyReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyReply>
      PARSER = new com.google.protobuf.AbstractParser<PropertyReply>() {
    @java.lang.Override
    public PropertyReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PropertyReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.property.PropertyReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
