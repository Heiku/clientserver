// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ljh/clientdemo/proto/Message.proto

package com.ljh.clientdemo.proto;

public final class MessageBase {
  private MessageBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code RequestType}
   */
  public enum RequestType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 常规业务消息
     * </pre>
     *
     * <code>NORMAL = 0;</code>
     */
    NORMAL(0),
    /**
     * <pre>
     * 客户端心跳信息
     * </pre>
     *
     * <code>HEARTBEAT_REQUEST = 1;</code>
     */
    HEARTBEAT_REQUEST(1),
    /**
     * <pre>
     * 服务端心跳信息
     * </pre>
     *
     * <code>HEARTBEAT_RESPONSE = 2;</code>
     */
    HEARTBEAT_RESPONSE(2),
    /**
     * <pre>
     * 获取当前的日期
     * </pre>
     *
     * <code>DATE = 3;</code>
     */
    DATE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 常规业务消息
     * </pre>
     *
     * <code>NORMAL = 0;</code>
     */
    public static final int NORMAL_VALUE = 0;
    /**
     * <pre>
     * 客户端心跳信息
     * </pre>
     *
     * <code>HEARTBEAT_REQUEST = 1;</code>
     */
    public static final int HEARTBEAT_REQUEST_VALUE = 1;
    /**
     * <pre>
     * 服务端心跳信息
     * </pre>
     *
     * <code>HEARTBEAT_RESPONSE = 2;</code>
     */
    public static final int HEARTBEAT_RESPONSE_VALUE = 2;
    /**
     * <pre>
     * 获取当前的日期
     * </pre>
     *
     * <code>DATE = 3;</code>
     */
    public static final int DATE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestType valueOf(int value) {
      return forNumber(value);
    }

    public static RequestType forNumber(int value) {
      switch (value) {
        case 0: return NORMAL;
        case 1: return HEARTBEAT_REQUEST;
        case 2: return HEARTBEAT_RESPONSE;
        case 3: return DATE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RequestType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
            public RequestType findValueByNumber(int number) {
              return RequestType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.ljh.clientdemo.proto.MessageBase.getDescriptor().getEnumTypes().get(0);
    }

    private static final RequestType[] VALUES = values();

    public static RequestType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RequestType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RequestType)
  }

  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string requestId = 1;</code>
     */
    java.lang.String getRequestId();
    /**
     * <code>string requestId = 1;</code>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    /**
     * <code>string content = 2;</code>
     */
    java.lang.String getContent();
    /**
     * <code>string content = 2;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>int32 result = 3;</code>
     */
    int getResult();

    /**
     * <code>int64 userId = 4;</code>
     */
    long getUserId();

    /**
     * <code>.RequestType type = 5;</code>
     */
    int getTypeValue();
    /**
     * <code>.RequestType type = 5;</code>
     */
    com.ljh.clientdemo.proto.MessageBase.RequestType getType();
  }
  /**
   * Protobuf type {@code Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
      requestId_ = "";
      content_ = "";
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Message();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              requestId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
            case 24: {

              result_ = input.readInt32();
              break;
            }
            case 32: {

              userId_ = input.readInt64();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return com.ljh.clientdemo.proto.MessageBase.internal_static_Message_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljh.clientdemo.proto.MessageBase.internal_static_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljh.clientdemo.proto.MessageBase.Message.class, com.ljh.clientdemo.proto.MessageBase.Message.Builder.class);
    }

    public static final int REQUESTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object requestId_;
    /**
     * <code>string requestId = 1;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      }
    }
    /**
     * <code>string requestId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 2;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 2;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESULT_FIELD_NUMBER = 3;
    private int result_;
    /**
     * <code>int32 result = 3;</code>
     */
    public int getResult() {
      return result_;
    }

    public static final int USERID_FIELD_NUMBER = 4;
    private long userId_;
    /**
     * <code>int64 userId = 4;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_;
    /**
     * <code>.RequestType type = 5;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.RequestType type = 5;</code>
     */
    public com.ljh.clientdemo.proto.MessageBase.RequestType getType() {
      @SuppressWarnings("deprecation")
      com.ljh.clientdemo.proto.MessageBase.RequestType result = com.ljh.clientdemo.proto.MessageBase.RequestType.valueOf(type_);
      return result == null ? com.ljh.clientdemo.proto.MessageBase.RequestType.UNRECOGNIZED : result;
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
      if (!getRequestIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
      }
      if (!getContentBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
      }
      if (result_ != 0) {
        output.writeInt32(3, result_);
      }
      if (userId_ != 0L) {
        output.writeInt64(4, userId_);
      }
      if (type_ != com.ljh.clientdemo.proto.MessageBase.RequestType.NORMAL.getNumber()) {
        output.writeEnum(5, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRequestIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
      }
      if (!getContentBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
      }
      if (result_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, result_);
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, userId_);
      }
      if (type_ != com.ljh.clientdemo.proto.MessageBase.RequestType.NORMAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, type_);
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
      if (!(obj instanceof com.ljh.clientdemo.proto.MessageBase.Message)) {
        return super.equals(obj);
      }
      com.ljh.clientdemo.proto.MessageBase.Message other = (com.ljh.clientdemo.proto.MessageBase.Message) obj;

      if (!getRequestId()
          .equals(other.getRequestId())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (getResult()
          != other.getResult()) return false;
      if (getUserId()
          != other.getUserId()) return false;
      if (type_ != other.type_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUserId());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.MessageBase.Message parseFrom(
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
    public static Builder newBuilder(com.ljh.clientdemo.proto.MessageBase.Message prototype) {
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
     * Protobuf type {@code Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message)
        com.ljh.clientdemo.proto.MessageBase.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljh.clientdemo.proto.MessageBase.internal_static_Message_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljh.clientdemo.proto.MessageBase.internal_static_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljh.clientdemo.proto.MessageBase.Message.class, com.ljh.clientdemo.proto.MessageBase.Message.Builder.class);
      }

      // Construct using com.ljh.clientdemo.proto.MessageBase.Message.newBuilder()
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
        requestId_ = "";

        content_ = "";

        result_ = 0;

        userId_ = 0L;

        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljh.clientdemo.proto.MessageBase.internal_static_Message_descriptor;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.MessageBase.Message getDefaultInstanceForType() {
        return com.ljh.clientdemo.proto.MessageBase.Message.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.MessageBase.Message build() {
        com.ljh.clientdemo.proto.MessageBase.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.MessageBase.Message buildPartial() {
        com.ljh.clientdemo.proto.MessageBase.Message result = new com.ljh.clientdemo.proto.MessageBase.Message(this);
        result.requestId_ = requestId_;
        result.content_ = content_;
        result.result_ = result_;
        result.userId_ = userId_;
        result.type_ = type_;
        onBuilt();
        return result;
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
        if (other instanceof com.ljh.clientdemo.proto.MessageBase.Message) {
          return mergeFrom((com.ljh.clientdemo.proto.MessageBase.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljh.clientdemo.proto.MessageBase.Message other) {
        if (other == com.ljh.clientdemo.proto.MessageBase.Message.getDefaultInstance()) return this;
        if (!other.getRequestId().isEmpty()) {
          requestId_ = other.requestId_;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.getResult() != 0) {
          setResult(other.getResult());
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
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
        com.ljh.clientdemo.proto.MessageBase.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljh.clientdemo.proto.MessageBase.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object requestId_ = "";
      /**
       * <code>string requestId = 1;</code>
       */
      public java.lang.String getRequestId() {
        java.lang.Object ref = requestId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          requestId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        java.lang.Object ref = requestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder setRequestId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder clearRequestId() {
        
        requestId_ = getDefaultInstance().getRequestId();
        onChanged();
        return this;
      }
      /**
       * <code>string requestId = 1;</code>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requestId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 2;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private int result_ ;
      /**
       * <code>int32 result = 3;</code>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>int32 result = 3;</code>
       */
      public Builder setResult(int value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 result = 3;</code>
       */
      public Builder clearResult() {
        
        result_ = 0;
        onChanged();
        return this;
      }

      private long userId_ ;
      /**
       * <code>int64 userId = 4;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>int64 userId = 4;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 userId = 4;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.RequestType type = 5;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.RequestType type = 5;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RequestType type = 5;</code>
       */
      public com.ljh.clientdemo.proto.MessageBase.RequestType getType() {
        @SuppressWarnings("deprecation")
        com.ljh.clientdemo.proto.MessageBase.RequestType result = com.ljh.clientdemo.proto.MessageBase.RequestType.valueOf(type_);
        return result == null ? com.ljh.clientdemo.proto.MessageBase.RequestType.UNRECOGNIZED : result;
      }
      /**
       * <code>.RequestType type = 5;</code>
       */
      public Builder setType(com.ljh.clientdemo.proto.MessageBase.RequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RequestType type = 5;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:Message)
    }

    // @@protoc_insertion_point(class_scope:Message)
    private static final com.ljh.clientdemo.proto.MessageBase.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljh.clientdemo.proto.MessageBase.Message();
    }

    public static com.ljh.clientdemo.proto.MessageBase.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      @java.lang.Override
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljh.clientdemo.proto.MessageBase.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4src/main/java/com/ljh/clientdemo/proto" +
      "/Message.proto\"i\n\007Message\022\021\n\trequestId\030\001" +
      " \001(\t\022\017\n\007content\030\002 \001(\t\022\016\n\006result\030\003 \001(\005\022\016\n" +
      "\006userId\030\004 \001(\003\022\032\n\004type\030\005 \001(\0162\014.RequestTyp" +
      "e*R\n\013RequestType\022\n\n\006NORMAL\020\000\022\025\n\021HEARTBEA" +
      "T_REQUEST\020\001\022\026\n\022HEARTBEAT_RESPONSE\020\002\022\010\n\004D" +
      "ATE\020\003B\'\n\030com.ljh.clientdemo.protoB\013Messa" +
      "geBaseb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "RequestId", "Content", "Result", "UserId", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
