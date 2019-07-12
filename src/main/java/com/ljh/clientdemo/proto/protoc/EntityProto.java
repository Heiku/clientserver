// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/ljh/clientdemo/proto/Entity.proto

package com.ljh.clientdemo.proto.protoc;

public final class EntityProto {
  private EntityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Entity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 实体id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <pre>
     * 实体类型
     * </pre>
     *
     * <code>int32 type = 2;</code>
     */
    int getType();

    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 level = 4;</code>
     */
    int getLevel();

    /**
     * <pre>
     * 状态：1：存活，0：死亡
     * </pre>
     *
     * <code>int32 alive = 5;</code>
     */
    int getAlive();
  }
  /**
   * Protobuf type {@code Entity}
   */
  public  static final class Entity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Entity)
      EntityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Entity.newBuilder() to construct.
    private Entity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Entity() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Entity();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Entity(
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
            case 16: {

              type_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 32: {

              level_ = input.readInt32();
              break;
            }
            case 40: {

              alive_ = input.readInt32();
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
      return com.ljh.clientdemo.proto.protoc.EntityProto.internal_static_Entity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljh.clientdemo.proto.protoc.EntityProto.internal_static_Entity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljh.clientdemo.proto.protoc.EntityProto.Entity.class, com.ljh.clientdemo.proto.protoc.EntityProto.Entity.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <pre>
     * 实体id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <pre>
     * 实体类型
     * </pre>
     *
     * <code>int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 名称
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LEVEL_FIELD_NUMBER = 4;
    private int level_;
    /**
     * <pre>
     * 等级
     * </pre>
     *
     * <code>int32 level = 4;</code>
     */
    public int getLevel() {
      return level_;
    }

    public static final int ALIVE_FIELD_NUMBER = 5;
    private int alive_;
    /**
     * <pre>
     * 状态：1：存活，0：死亡
     * </pre>
     *
     * <code>int32 alive = 5;</code>
     */
    public int getAlive() {
      return alive_;
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
      if (type_ != 0) {
        output.writeInt32(2, type_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      if (level_ != 0) {
        output.writeInt32(4, level_);
      }
      if (alive_ != 0) {
        output.writeInt32(5, alive_);
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
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, level_);
      }
      if (alive_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, alive_);
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
      if (!(obj instanceof com.ljh.clientdemo.proto.protoc.EntityProto.Entity)) {
        return super.equals(obj);
      }
      com.ljh.clientdemo.proto.protoc.EntityProto.Entity other = (com.ljh.clientdemo.proto.protoc.EntityProto.Entity) obj;

      if (getId()
          != other.getId()) return false;
      if (getType()
          != other.getType()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (getAlive()
          != other.getAlive()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + getAlive();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity parseFrom(
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
    public static Builder newBuilder(com.ljh.clientdemo.proto.protoc.EntityProto.Entity prototype) {
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
     * Protobuf type {@code Entity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Entity)
        com.ljh.clientdemo.proto.protoc.EntityProto.EntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljh.clientdemo.proto.protoc.EntityProto.internal_static_Entity_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljh.clientdemo.proto.protoc.EntityProto.internal_static_Entity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljh.clientdemo.proto.protoc.EntityProto.Entity.class, com.ljh.clientdemo.proto.protoc.EntityProto.Entity.Builder.class);
      }

      // Construct using com.ljh.clientdemo.proto.protoc.EntityProto.Entity.newBuilder()
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

        type_ = 0;

        name_ = "";

        level_ = 0;

        alive_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljh.clientdemo.proto.protoc.EntityProto.internal_static_Entity_descriptor;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.EntityProto.Entity getDefaultInstanceForType() {
        return com.ljh.clientdemo.proto.protoc.EntityProto.Entity.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.EntityProto.Entity build() {
        com.ljh.clientdemo.proto.protoc.EntityProto.Entity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.EntityProto.Entity buildPartial() {
        com.ljh.clientdemo.proto.protoc.EntityProto.Entity result = new com.ljh.clientdemo.proto.protoc.EntityProto.Entity(this);
        result.id_ = id_;
        result.type_ = type_;
        result.name_ = name_;
        result.level_ = level_;
        result.alive_ = alive_;
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
        if (other instanceof com.ljh.clientdemo.proto.protoc.EntityProto.Entity) {
          return mergeFrom((com.ljh.clientdemo.proto.protoc.EntityProto.Entity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljh.clientdemo.proto.protoc.EntityProto.Entity other) {
        if (other == com.ljh.clientdemo.proto.protoc.EntityProto.Entity.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getAlive() != 0) {
          setAlive(other.getAlive());
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
        com.ljh.clientdemo.proto.protoc.EntityProto.Entity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljh.clientdemo.proto.protoc.EntityProto.Entity) e.getUnfinishedMessage();
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
       * 实体id
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       * 实体id
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
       * 实体id
       * </pre>
       *
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       * 实体类型
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 实体类型
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 实体类型
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * 名称
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 名称
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 名称
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 名称
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 名称
       * </pre>
       *
       * <code>string name = 3;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <pre>
       * 等级
       * </pre>
       *
       * <code>int32 level = 4;</code>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <pre>
       * 等级
       * </pre>
       *
       * <code>int32 level = 4;</code>
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 等级
       * </pre>
       *
       * <code>int32 level = 4;</code>
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int alive_ ;
      /**
       * <pre>
       * 状态：1：存活，0：死亡
       * </pre>
       *
       * <code>int32 alive = 5;</code>
       */
      public int getAlive() {
        return alive_;
      }
      /**
       * <pre>
       * 状态：1：存活，0：死亡
       * </pre>
       *
       * <code>int32 alive = 5;</code>
       */
      public Builder setAlive(int value) {
        
        alive_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 状态：1：存活，0：死亡
       * </pre>
       *
       * <code>int32 alive = 5;</code>
       */
      public Builder clearAlive() {
        
        alive_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Entity)
    }

    // @@protoc_insertion_point(class_scope:Entity)
    private static final com.ljh.clientdemo.proto.protoc.EntityProto.Entity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljh.clientdemo.proto.protoc.EntityProto.Entity();
    }

    public static com.ljh.clientdemo.proto.protoc.EntityProto.Entity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Entity>
        PARSER = new com.google.protobuf.AbstractParser<Entity>() {
      @java.lang.Override
      public Entity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Entity(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Entity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Entity> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljh.clientdemo.proto.protoc.EntityProto.Entity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Entity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Entity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3src/main/java/com/ljh/clientdemo/proto" +
      "/Entity.proto\"N\n\006Entity\022\n\n\002id\030\001 \001(\003\022\014\n\004t" +
      "ype\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\r\n\005level\030\004 \001(\005\022\r" +
      "\n\005alive\030\005 \001(\005B.\n\037com.ljh.clientdemo.prot" +
      "o.protocB\013EntityProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Entity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Entity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Entity_descriptor,
        new java.lang.String[] { "Id", "Type", "Name", "Level", "Alive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}