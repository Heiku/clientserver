// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GuildApply.proto

package com.ljh.clientdemo.proto.protoc;

public final class GuildApplyProto {
  private GuildApplyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GuildApplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GuildApply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 申请号
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    boolean hasApplicant();
    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    com.ljh.clientdemo.proto.protoc.RoleProto.Role getApplicant();
    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getApplicantOrBuilder();

    /**
     * <pre>
     * 申请时间
     * </pre>
     *
     * <code>string applyTime = 3;</code>
     */
    java.lang.String getApplyTime();
    /**
     * <pre>
     * 申请时间
     * </pre>
     *
     * <code>string applyTime = 3;</code>
     */
    com.google.protobuf.ByteString
        getApplyTimeBytes();
  }
  /**
   * Protobuf type {@code GuildApply}
   */
  public  static final class GuildApply extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GuildApply)
      GuildApplyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GuildApply.newBuilder() to construct.
    private GuildApply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GuildApply() {
      applyTime_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GuildApply();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GuildApply(
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
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder subBuilder = null;
              if (applicant_ != null) {
                subBuilder = applicant_.toBuilder();
              }
              applicant_ = input.readMessage(com.ljh.clientdemo.proto.protoc.RoleProto.Role.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(applicant_);
                applicant_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              applyTime_ = s;
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
      return com.ljh.clientdemo.proto.protoc.GuildApplyProto.internal_static_GuildApply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljh.clientdemo.proto.protoc.GuildApplyProto.internal_static_GuildApply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.class, com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <pre>
     * 申请号
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int APPLICANT_FIELD_NUMBER = 2;
    private com.ljh.clientdemo.proto.protoc.RoleProto.Role applicant_;
    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    public boolean hasApplicant() {
      return applicant_ != null;
    }
    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    public com.ljh.clientdemo.proto.protoc.RoleProto.Role getApplicant() {
      return applicant_ == null ? com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : applicant_;
    }
    /**
     * <pre>
     * 申请人
     * </pre>
     *
     * <code>.Role applicant = 2;</code>
     */
    public com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getApplicantOrBuilder() {
      return getApplicant();
    }

    public static final int APPLYTIME_FIELD_NUMBER = 3;
    private volatile java.lang.Object applyTime_;
    /**
     * <pre>
     * 申请时间
     * </pre>
     *
     * <code>string applyTime = 3;</code>
     */
    public java.lang.String getApplyTime() {
      java.lang.Object ref = applyTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applyTime_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 申请时间
     * </pre>
     *
     * <code>string applyTime = 3;</code>
     */
    public com.google.protobuf.ByteString
        getApplyTimeBytes() {
      java.lang.Object ref = applyTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applyTime_ = b;
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (applicant_ != null) {
        output.writeMessage(2, getApplicant());
      }
      if (!getApplyTimeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, applyTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (applicant_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getApplicant());
      }
      if (!getApplyTimeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, applyTime_);
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
      if (!(obj instanceof com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply)) {
        return super.equals(obj);
      }
      com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply other = (com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply) obj;

      if (getId()
          != other.getId()) return false;
      if (hasApplicant() != other.hasApplicant()) return false;
      if (hasApplicant()) {
        if (!getApplicant()
            .equals(other.getApplicant())) return false;
      }
      if (!getApplyTime()
          .equals(other.getApplyTime())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      if (hasApplicant()) {
        hash = (37 * hash) + APPLICANT_FIELD_NUMBER;
        hash = (53 * hash) + getApplicant().hashCode();
      }
      hash = (37 * hash) + APPLYTIME_FIELD_NUMBER;
      hash = (53 * hash) + getApplyTime().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parseFrom(
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
    public static Builder newBuilder(com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply prototype) {
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
     * Protobuf type {@code GuildApply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GuildApply)
        com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljh.clientdemo.proto.protoc.GuildApplyProto.internal_static_GuildApply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljh.clientdemo.proto.protoc.GuildApplyProto.internal_static_GuildApply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.class, com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.Builder.class);
      }

      // Construct using com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.newBuilder()
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
        id_ = 0L;

        if (applicantBuilder_ == null) {
          applicant_ = null;
        } else {
          applicant_ = null;
          applicantBuilder_ = null;
        }
        applyTime_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljh.clientdemo.proto.protoc.GuildApplyProto.internal_static_GuildApply_descriptor;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply getDefaultInstanceForType() {
        return com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply build() {
        com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply buildPartial() {
        com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply result = new com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply(this);
        result.id_ = id_;
        if (applicantBuilder_ == null) {
          result.applicant_ = applicant_;
        } else {
          result.applicant_ = applicantBuilder_.build();
        }
        result.applyTime_ = applyTime_;
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
        if (other instanceof com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply) {
          return mergeFrom((com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply other) {
        if (other == com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.hasApplicant()) {
          mergeApplicant(other.getApplicant());
        }
        if (!other.getApplyTime().isEmpty()) {
          applyTime_ = other.applyTime_;
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
        com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <pre>
       * 申请号
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       * 申请号
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 申请号
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private com.ljh.clientdemo.proto.protoc.RoleProto.Role applicant_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder> applicantBuilder_;
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public boolean hasApplicant() {
        return applicantBuilder_ != null || applicant_ != null;
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.Role getApplicant() {
        if (applicantBuilder_ == null) {
          return applicant_ == null ? com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : applicant_;
        } else {
          return applicantBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public Builder setApplicant(com.ljh.clientdemo.proto.protoc.RoleProto.Role value) {
        if (applicantBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          applicant_ = value;
          onChanged();
        } else {
          applicantBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public Builder setApplicant(
          com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder builderForValue) {
        if (applicantBuilder_ == null) {
          applicant_ = builderForValue.build();
          onChanged();
        } else {
          applicantBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public Builder mergeApplicant(com.ljh.clientdemo.proto.protoc.RoleProto.Role value) {
        if (applicantBuilder_ == null) {
          if (applicant_ != null) {
            applicant_ =
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.newBuilder(applicant_).mergeFrom(value).buildPartial();
          } else {
            applicant_ = value;
          }
          onChanged();
        } else {
          applicantBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public Builder clearApplicant() {
        if (applicantBuilder_ == null) {
          applicant_ = null;
          onChanged();
        } else {
          applicant_ = null;
          applicantBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder getApplicantBuilder() {
        
        onChanged();
        return getApplicantFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getApplicantOrBuilder() {
        if (applicantBuilder_ != null) {
          return applicantBuilder_.getMessageOrBuilder();
        } else {
          return applicant_ == null ?
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : applicant_;
        }
      }
      /**
       * <pre>
       * 申请人
       * </pre>
       *
       * <code>.Role applicant = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder> 
          getApplicantFieldBuilder() {
        if (applicantBuilder_ == null) {
          applicantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder>(
                  getApplicant(),
                  getParentForChildren(),
                  isClean());
          applicant_ = null;
        }
        return applicantBuilder_;
      }

      private java.lang.Object applyTime_ = "";
      /**
       * <pre>
       * 申请时间
       * </pre>
       *
       * <code>string applyTime = 3;</code>
       */
      public java.lang.String getApplyTime() {
        java.lang.Object ref = applyTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          applyTime_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 申请时间
       * </pre>
       *
       * <code>string applyTime = 3;</code>
       */
      public com.google.protobuf.ByteString
          getApplyTimeBytes() {
        java.lang.Object ref = applyTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          applyTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 申请时间
       * </pre>
       *
       * <code>string applyTime = 3;</code>
       */
      public Builder setApplyTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        applyTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 申请时间
       * </pre>
       *
       * <code>string applyTime = 3;</code>
       */
      public Builder clearApplyTime() {
        
        applyTime_ = getDefaultInstance().getApplyTime();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 申请时间
       * </pre>
       *
       * <code>string applyTime = 3;</code>
       */
      public Builder setApplyTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        applyTime_ = value;
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


      // @@protoc_insertion_point(builder_scope:GuildApply)
    }

    // @@protoc_insertion_point(class_scope:GuildApply)
    private static final com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply();
    }

    public static com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GuildApply>
        PARSER = new com.google.protobuf.AbstractParser<GuildApply>() {
      @java.lang.Override
      public GuildApply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GuildApply(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GuildApply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GuildApply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljh.clientdemo.proto.protoc.GuildApplyProto.GuildApply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildApply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildApply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GuildApply.proto\032\nRole.proto\"E\n\nGuildA" +
      "pply\022\n\n\002id\030\001 \001(\003\022\030\n\tapplicant\030\002 \001(\0132\005.Ro" +
      "le\022\021\n\tapplyTime\030\003 \001(\tB2\n\037com.ljh.clientd" +
      "emo.proto.protocB\017GuildApplyProtob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ljh.clientdemo.proto.protoc.RoleProto.getDescriptor(),
        });
    internal_static_GuildApply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GuildApply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildApply_descriptor,
        new java.lang.String[] { "Id", "Applicant", "ApplyTime", });
    com.ljh.clientdemo.proto.protoc.RoleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
