// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GuildMember.proto

package com.ljh.clientdemo.proto.protoc;

public final class GuildMemberProto {
  private GuildMemberProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GuildMemberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GuildMember)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    boolean hasRole();
    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    com.ljh.clientdemo.proto.protoc.RoleProto.Role getRole();
    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getRoleOrBuilder();

    /**
     * <pre>
     * 职位
     * </pre>
     *
     * <code>int32 position = 2;</code>
     */
    int getPosition();

    /**
     * <pre>
     * 今日贡献值
     * </pre>
     *
     * <code>int32 today = 3;</code>
     */
    int getToday();

    /**
     * <pre>
     * 总贡献值
     * </pre>
     *
     * <code>int32 all = 4;</code>
     */
    int getAll();
  }
  /**
   * Protobuf type {@code GuildMember}
   */
  public  static final class GuildMember extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GuildMember)
      GuildMemberOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GuildMember.newBuilder() to construct.
    private GuildMember(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GuildMember() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GuildMember();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GuildMember(
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
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder subBuilder = null;
              if (role_ != null) {
                subBuilder = role_.toBuilder();
              }
              role_ = input.readMessage(com.ljh.clientdemo.proto.protoc.RoleProto.Role.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(role_);
                role_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              position_ = input.readInt32();
              break;
            }
            case 24: {

              today_ = input.readInt32();
              break;
            }
            case 32: {

              all_ = input.readInt32();
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
      return com.ljh.clientdemo.proto.protoc.GuildMemberProto.internal_static_GuildMember_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljh.clientdemo.proto.protoc.GuildMemberProto.internal_static_GuildMember_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.class, com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.Builder.class);
    }

    public static final int ROLE_FIELD_NUMBER = 1;
    private com.ljh.clientdemo.proto.protoc.RoleProto.Role role_;
    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    public boolean hasRole() {
      return role_ != null;
    }
    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    public com.ljh.clientdemo.proto.protoc.RoleProto.Role getRole() {
      return role_ == null ? com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : role_;
    }
    /**
     * <pre>
     * 成员的信息
     * </pre>
     *
     * <code>.Role role = 1;</code>
     */
    public com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getRoleOrBuilder() {
      return getRole();
    }

    public static final int POSITION_FIELD_NUMBER = 2;
    private int position_;
    /**
     * <pre>
     * 职位
     * </pre>
     *
     * <code>int32 position = 2;</code>
     */
    public int getPosition() {
      return position_;
    }

    public static final int TODAY_FIELD_NUMBER = 3;
    private int today_;
    /**
     * <pre>
     * 今日贡献值
     * </pre>
     *
     * <code>int32 today = 3;</code>
     */
    public int getToday() {
      return today_;
    }

    public static final int ALL_FIELD_NUMBER = 4;
    private int all_;
    /**
     * <pre>
     * 总贡献值
     * </pre>
     *
     * <code>int32 all = 4;</code>
     */
    public int getAll() {
      return all_;
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
      if (role_ != null) {
        output.writeMessage(1, getRole());
      }
      if (position_ != 0) {
        output.writeInt32(2, position_);
      }
      if (today_ != 0) {
        output.writeInt32(3, today_);
      }
      if (all_ != 0) {
        output.writeInt32(4, all_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (role_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRole());
      }
      if (position_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, position_);
      }
      if (today_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, today_);
      }
      if (all_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, all_);
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
      if (!(obj instanceof com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember)) {
        return super.equals(obj);
      }
      com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember other = (com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember) obj;

      if (hasRole() != other.hasRole()) return false;
      if (hasRole()) {
        if (!getRole()
            .equals(other.getRole())) return false;
      }
      if (getPosition()
          != other.getPosition()) return false;
      if (getToday()
          != other.getToday()) return false;
      if (getAll()
          != other.getAll()) return false;
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
      if (hasRole()) {
        hash = (37 * hash) + ROLE_FIELD_NUMBER;
        hash = (53 * hash) + getRole().hashCode();
      }
      hash = (37 * hash) + POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getPosition();
      hash = (37 * hash) + TODAY_FIELD_NUMBER;
      hash = (53 * hash) + getToday();
      hash = (37 * hash) + ALL_FIELD_NUMBER;
      hash = (53 * hash) + getAll();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parseFrom(
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
    public static Builder newBuilder(com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember prototype) {
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
     * Protobuf type {@code GuildMember}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GuildMember)
        com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMemberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljh.clientdemo.proto.protoc.GuildMemberProto.internal_static_GuildMember_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljh.clientdemo.proto.protoc.GuildMemberProto.internal_static_GuildMember_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.class, com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.Builder.class);
      }

      // Construct using com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.newBuilder()
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
        if (roleBuilder_ == null) {
          role_ = null;
        } else {
          role_ = null;
          roleBuilder_ = null;
        }
        position_ = 0;

        today_ = 0;

        all_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljh.clientdemo.proto.protoc.GuildMemberProto.internal_static_GuildMember_descriptor;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember getDefaultInstanceForType() {
        return com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember build() {
        com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember buildPartial() {
        com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember result = new com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember(this);
        if (roleBuilder_ == null) {
          result.role_ = role_;
        } else {
          result.role_ = roleBuilder_.build();
        }
        result.position_ = position_;
        result.today_ = today_;
        result.all_ = all_;
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
        if (other instanceof com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember) {
          return mergeFrom((com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember other) {
        if (other == com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember.getDefaultInstance()) return this;
        if (other.hasRole()) {
          mergeRole(other.getRole());
        }
        if (other.getPosition() != 0) {
          setPosition(other.getPosition());
        }
        if (other.getToday() != 0) {
          setToday(other.getToday());
        }
        if (other.getAll() != 0) {
          setAll(other.getAll());
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
        com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.ljh.clientdemo.proto.protoc.RoleProto.Role role_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder> roleBuilder_;
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public boolean hasRole() {
        return roleBuilder_ != null || role_ != null;
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.Role getRole() {
        if (roleBuilder_ == null) {
          return role_ == null ? com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : role_;
        } else {
          return roleBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public Builder setRole(com.ljh.clientdemo.proto.protoc.RoleProto.Role value) {
        if (roleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          role_ = value;
          onChanged();
        } else {
          roleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public Builder setRole(
          com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder builderForValue) {
        if (roleBuilder_ == null) {
          role_ = builderForValue.build();
          onChanged();
        } else {
          roleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public Builder mergeRole(com.ljh.clientdemo.proto.protoc.RoleProto.Role value) {
        if (roleBuilder_ == null) {
          if (role_ != null) {
            role_ =
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.newBuilder(role_).mergeFrom(value).buildPartial();
          } else {
            role_ = value;
          }
          onChanged();
        } else {
          roleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public Builder clearRole() {
        if (roleBuilder_ == null) {
          role_ = null;
          onChanged();
        } else {
          role_ = null;
          roleBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder getRoleBuilder() {
        
        onChanged();
        return getRoleFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      public com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder getRoleOrBuilder() {
        if (roleBuilder_ != null) {
          return roleBuilder_.getMessageOrBuilder();
        } else {
          return role_ == null ?
              com.ljh.clientdemo.proto.protoc.RoleProto.Role.getDefaultInstance() : role_;
        }
      }
      /**
       * <pre>
       * 成员的信息
       * </pre>
       *
       * <code>.Role role = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder> 
          getRoleFieldBuilder() {
        if (roleBuilder_ == null) {
          roleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.ljh.clientdemo.proto.protoc.RoleProto.Role, com.ljh.clientdemo.proto.protoc.RoleProto.Role.Builder, com.ljh.clientdemo.proto.protoc.RoleProto.RoleOrBuilder>(
                  getRole(),
                  getParentForChildren(),
                  isClean());
          role_ = null;
        }
        return roleBuilder_;
      }

      private int position_ ;
      /**
       * <pre>
       * 职位
       * </pre>
       *
       * <code>int32 position = 2;</code>
       */
      public int getPosition() {
        return position_;
      }
      /**
       * <pre>
       * 职位
       * </pre>
       *
       * <code>int32 position = 2;</code>
       */
      public Builder setPosition(int value) {
        
        position_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 职位
       * </pre>
       *
       * <code>int32 position = 2;</code>
       */
      public Builder clearPosition() {
        
        position_ = 0;
        onChanged();
        return this;
      }

      private int today_ ;
      /**
       * <pre>
       * 今日贡献值
       * </pre>
       *
       * <code>int32 today = 3;</code>
       */
      public int getToday() {
        return today_;
      }
      /**
       * <pre>
       * 今日贡献值
       * </pre>
       *
       * <code>int32 today = 3;</code>
       */
      public Builder setToday(int value) {
        
        today_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 今日贡献值
       * </pre>
       *
       * <code>int32 today = 3;</code>
       */
      public Builder clearToday() {
        
        today_ = 0;
        onChanged();
        return this;
      }

      private int all_ ;
      /**
       * <pre>
       * 总贡献值
       * </pre>
       *
       * <code>int32 all = 4;</code>
       */
      public int getAll() {
        return all_;
      }
      /**
       * <pre>
       * 总贡献值
       * </pre>
       *
       * <code>int32 all = 4;</code>
       */
      public Builder setAll(int value) {
        
        all_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 总贡献值
       * </pre>
       *
       * <code>int32 all = 4;</code>
       */
      public Builder clearAll() {
        
        all_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GuildMember)
    }

    // @@protoc_insertion_point(class_scope:GuildMember)
    private static final com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember();
    }

    public static com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GuildMember>
        PARSER = new com.google.protobuf.AbstractParser<GuildMember>() {
      @java.lang.Override
      public GuildMember parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GuildMember(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GuildMember> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GuildMember> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljh.clientdemo.proto.protoc.GuildMemberProto.GuildMember getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildMember_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildMember_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GuildMember.proto\032\nRole.proto\"P\n\013Guild" +
      "Member\022\023\n\004role\030\001 \001(\0132\005.Role\022\020\n\010position\030" +
      "\002 \001(\005\022\r\n\005today\030\003 \001(\005\022\013\n\003all\030\004 \001(\005B3\n\037com" +
      ".ljh.clientdemo.proto.protocB\020GuildMembe" +
      "rProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ljh.clientdemo.proto.protoc.RoleProto.getDescriptor(),
        });
    internal_static_GuildMember_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GuildMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildMember_descriptor,
        new java.lang.String[] { "Role", "Position", "Today", "All", });
    com.ljh.clientdemo.proto.protoc.RoleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
