// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ambulance.proto

package com.tosproject.grpcenterprise;

/**
 * Protobuf type {@code AmbulanceRequest}
 */
public  final class AmbulanceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AmbulanceRequest)
    AmbulanceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AmbulanceRequest.newBuilder() to construct.
  private AmbulanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AmbulanceRequest() {
    ambulancequestion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AmbulanceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ambulancequestion_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tosproject.grpcenterprise.Ambulance.internal_static_AmbulanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tosproject.grpcenterprise.Ambulance.internal_static_AmbulanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tosproject.grpcenterprise.AmbulanceRequest.class, com.tosproject.grpcenterprise.AmbulanceRequest.Builder.class);
  }

  public static final int AMBULANCEQUESTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object ambulancequestion_;
  /**
   * <code>string ambulancequestion = 1;</code>
   */
  public java.lang.String getAmbulancequestion() {
    java.lang.Object ref = ambulancequestion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ambulancequestion_ = s;
      return s;
    }
  }
  /**
   * <code>string ambulancequestion = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAmbulancequestionBytes() {
    java.lang.Object ref = ambulancequestion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ambulancequestion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getAmbulancequestionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ambulancequestion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAmbulancequestionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ambulancequestion_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tosproject.grpcenterprise.AmbulanceRequest)) {
      return super.equals(obj);
    }
    com.tosproject.grpcenterprise.AmbulanceRequest other = (com.tosproject.grpcenterprise.AmbulanceRequest) obj;

    boolean result = true;
    result = result && getAmbulancequestion()
        .equals(other.getAmbulancequestion());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AMBULANCEQUESTION_FIELD_NUMBER;
    hash = (53 * hash) + getAmbulancequestion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tosproject.grpcenterprise.AmbulanceRequest parseFrom(
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
  public static Builder newBuilder(com.tosproject.grpcenterprise.AmbulanceRequest prototype) {
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
   * Protobuf type {@code AmbulanceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AmbulanceRequest)
      com.tosproject.grpcenterprise.AmbulanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tosproject.grpcenterprise.Ambulance.internal_static_AmbulanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tosproject.grpcenterprise.Ambulance.internal_static_AmbulanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tosproject.grpcenterprise.AmbulanceRequest.class, com.tosproject.grpcenterprise.AmbulanceRequest.Builder.class);
    }

    // Construct using com.tosproject.grpcenterprise.AmbulanceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ambulancequestion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tosproject.grpcenterprise.Ambulance.internal_static_AmbulanceRequest_descriptor;
    }

    @java.lang.Override
    public com.tosproject.grpcenterprise.AmbulanceRequest getDefaultInstanceForType() {
      return com.tosproject.grpcenterprise.AmbulanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tosproject.grpcenterprise.AmbulanceRequest build() {
      com.tosproject.grpcenterprise.AmbulanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tosproject.grpcenterprise.AmbulanceRequest buildPartial() {
      com.tosproject.grpcenterprise.AmbulanceRequest result = new com.tosproject.grpcenterprise.AmbulanceRequest(this);
      result.ambulancequestion_ = ambulancequestion_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tosproject.grpcenterprise.AmbulanceRequest) {
        return mergeFrom((com.tosproject.grpcenterprise.AmbulanceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tosproject.grpcenterprise.AmbulanceRequest other) {
      if (other == com.tosproject.grpcenterprise.AmbulanceRequest.getDefaultInstance()) return this;
      if (!other.getAmbulancequestion().isEmpty()) {
        ambulancequestion_ = other.ambulancequestion_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.tosproject.grpcenterprise.AmbulanceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tosproject.grpcenterprise.AmbulanceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ambulancequestion_ = "";
    /**
     * <code>string ambulancequestion = 1;</code>
     */
    public java.lang.String getAmbulancequestion() {
      java.lang.Object ref = ambulancequestion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ambulancequestion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ambulancequestion = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAmbulancequestionBytes() {
      java.lang.Object ref = ambulancequestion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ambulancequestion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ambulancequestion = 1;</code>
     */
    public Builder setAmbulancequestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ambulancequestion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ambulancequestion = 1;</code>
     */
    public Builder clearAmbulancequestion() {
      
      ambulancequestion_ = getDefaultInstance().getAmbulancequestion();
      onChanged();
      return this;
    }
    /**
     * <code>string ambulancequestion = 1;</code>
     */
    public Builder setAmbulancequestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ambulancequestion_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AmbulanceRequest)
  }

  // @@protoc_insertion_point(class_scope:AmbulanceRequest)
  private static final com.tosproject.grpcenterprise.AmbulanceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tosproject.grpcenterprise.AmbulanceRequest();
  }

  public static com.tosproject.grpcenterprise.AmbulanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AmbulanceRequest>
      PARSER = new com.google.protobuf.AbstractParser<AmbulanceRequest>() {
    @java.lang.Override
    public AmbulanceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AmbulanceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AmbulanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AmbulanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tosproject.grpcenterprise.AmbulanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
public String getAddressquestion() {
	// TODO Auto-generated method stub
	return null;
}

}

