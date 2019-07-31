// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Boss.proto

package com.ljh.clientdemo.proto.protoc;

public final class BossProto {
  private BossProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BossOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Boss)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <code>string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int64 hp = 3;</code>
     */
    long getHp();

    /**
     * <code>.Spell spell = 4;</code>
     */
    boolean hasSpell();
    /**
     * <code>.Spell spell = 4;</code>
     */
    com.ljh.clientdemo.proto.protoc.SpellProto.Spell getSpell();
    /**
     * <code>.Spell spell = 4;</code>
     */
    com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder getSpellOrBuilder();
  }
  /**
   * Protobuf type {@code Boss}
   */
  public  static final class Boss extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Boss)
      BossOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Boss.newBuilder() to construct.
    private Boss(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Boss() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Boss();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Boss(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 24: {

              hp_ = input.readInt64();
              break;
            }
            case 34: {
              com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder subBuilder = null;
              if (spell_ != null) {
                subBuilder = spell_.toBuilder();
              }
              spell_ = input.readMessage(com.ljh.clientdemo.proto.protoc.SpellProto.Spell.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spell_);
                spell_ = subBuilder.buildPartial();
              }

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
      return com.ljh.clientdemo.proto.protoc.BossProto.internal_static_Boss_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljh.clientdemo.proto.protoc.BossProto.internal_static_Boss_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljh.clientdemo.proto.protoc.BossProto.Boss.class, com.ljh.clientdemo.proto.protoc.BossProto.Boss.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
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
     * <code>string name = 2;</code>
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

    public static final int HP_FIELD_NUMBER = 3;
    private long hp_;
    /**
     * <code>int64 hp = 3;</code>
     */
    public long getHp() {
      return hp_;
    }

    public static final int SPELL_FIELD_NUMBER = 4;
    private com.ljh.clientdemo.proto.protoc.SpellProto.Spell spell_;
    /**
     * <code>.Spell spell = 4;</code>
     */
    public boolean hasSpell() {
      return spell_ != null;
    }
    /**
     * <code>.Spell spell = 4;</code>
     */
    public com.ljh.clientdemo.proto.protoc.SpellProto.Spell getSpell() {
      return spell_ == null ? com.ljh.clientdemo.proto.protoc.SpellProto.Spell.getDefaultInstance() : spell_;
    }
    /**
     * <code>.Spell spell = 4;</code>
     */
    public com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder getSpellOrBuilder() {
      return getSpell();
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (hp_ != 0L) {
        output.writeInt64(3, hp_);
      }
      if (spell_ != null) {
        output.writeMessage(4, getSpell());
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
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (hp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, hp_);
      }
      if (spell_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getSpell());
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
      if (!(obj instanceof com.ljh.clientdemo.proto.protoc.BossProto.Boss)) {
        return super.equals(obj);
      }
      com.ljh.clientdemo.proto.protoc.BossProto.Boss other = (com.ljh.clientdemo.proto.protoc.BossProto.Boss) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (getHp()
          != other.getHp()) return false;
      if (hasSpell() != other.hasSpell()) return false;
      if (hasSpell()) {
        if (!getSpell()
            .equals(other.getSpell())) return false;
      }
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + HP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHp());
      if (hasSpell()) {
        hash = (37 * hash) + SPELL_FIELD_NUMBER;
        hash = (53 * hash) + getSpell().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss parseFrom(
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
    public static Builder newBuilder(com.ljh.clientdemo.proto.protoc.BossProto.Boss prototype) {
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
     * Protobuf type {@code Boss}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Boss)
        com.ljh.clientdemo.proto.protoc.BossProto.BossOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.ljh.clientdemo.proto.protoc.BossProto.internal_static_Boss_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.ljh.clientdemo.proto.protoc.BossProto.internal_static_Boss_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.ljh.clientdemo.proto.protoc.BossProto.Boss.class, com.ljh.clientdemo.proto.protoc.BossProto.Boss.Builder.class);
      }

      // Construct using com.ljh.clientdemo.proto.protoc.BossProto.Boss.newBuilder()
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

        name_ = "";

        hp_ = 0L;

        if (spellBuilder_ == null) {
          spell_ = null;
        } else {
          spell_ = null;
          spellBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.ljh.clientdemo.proto.protoc.BossProto.internal_static_Boss_descriptor;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.BossProto.Boss getDefaultInstanceForType() {
        return com.ljh.clientdemo.proto.protoc.BossProto.Boss.getDefaultInstance();
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.BossProto.Boss build() {
        com.ljh.clientdemo.proto.protoc.BossProto.Boss result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.ljh.clientdemo.proto.protoc.BossProto.Boss buildPartial() {
        com.ljh.clientdemo.proto.protoc.BossProto.Boss result = new com.ljh.clientdemo.proto.protoc.BossProto.Boss(this);
        result.id_ = id_;
        result.name_ = name_;
        result.hp_ = hp_;
        if (spellBuilder_ == null) {
          result.spell_ = spell_;
        } else {
          result.spell_ = spellBuilder_.build();
        }
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
        if (other instanceof com.ljh.clientdemo.proto.protoc.BossProto.Boss) {
          return mergeFrom((com.ljh.clientdemo.proto.protoc.BossProto.Boss)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.ljh.clientdemo.proto.protoc.BossProto.Boss other) {
        if (other == com.ljh.clientdemo.proto.protoc.BossProto.Boss.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getHp() != 0L) {
          setHp(other.getHp());
        }
        if (other.hasSpell()) {
          mergeSpell(other.getSpell());
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
        com.ljh.clientdemo.proto.protoc.BossProto.Boss parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.ljh.clientdemo.proto.protoc.BossProto.Boss) e.getUnfinishedMessage();
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
       * <code>int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
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
       * <code>string name = 2;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
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

      private long hp_ ;
      /**
       * <code>int64 hp = 3;</code>
       */
      public long getHp() {
        return hp_;
      }
      /**
       * <code>int64 hp = 3;</code>
       */
      public Builder setHp(long value) {
        
        hp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 hp = 3;</code>
       */
      public Builder clearHp() {
        
        hp_ = 0L;
        onChanged();
        return this;
      }

      private com.ljh.clientdemo.proto.protoc.SpellProto.Spell spell_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.SpellProto.Spell, com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder, com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder> spellBuilder_;
      /**
       * <code>.Spell spell = 4;</code>
       */
      public boolean hasSpell() {
        return spellBuilder_ != null || spell_ != null;
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public com.ljh.clientdemo.proto.protoc.SpellProto.Spell getSpell() {
        if (spellBuilder_ == null) {
          return spell_ == null ? com.ljh.clientdemo.proto.protoc.SpellProto.Spell.getDefaultInstance() : spell_;
        } else {
          return spellBuilder_.getMessage();
        }
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public Builder setSpell(com.ljh.clientdemo.proto.protoc.SpellProto.Spell value) {
        if (spellBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spell_ = value;
          onChanged();
        } else {
          spellBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public Builder setSpell(
          com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder builderForValue) {
        if (spellBuilder_ == null) {
          spell_ = builderForValue.build();
          onChanged();
        } else {
          spellBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public Builder mergeSpell(com.ljh.clientdemo.proto.protoc.SpellProto.Spell value) {
        if (spellBuilder_ == null) {
          if (spell_ != null) {
            spell_ =
              com.ljh.clientdemo.proto.protoc.SpellProto.Spell.newBuilder(spell_).mergeFrom(value).buildPartial();
          } else {
            spell_ = value;
          }
          onChanged();
        } else {
          spellBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public Builder clearSpell() {
        if (spellBuilder_ == null) {
          spell_ = null;
          onChanged();
        } else {
          spell_ = null;
          spellBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder getSpellBuilder() {
        
        onChanged();
        return getSpellFieldBuilder().getBuilder();
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      public com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder getSpellOrBuilder() {
        if (spellBuilder_ != null) {
          return spellBuilder_.getMessageOrBuilder();
        } else {
          return spell_ == null ?
              com.ljh.clientdemo.proto.protoc.SpellProto.Spell.getDefaultInstance() : spell_;
        }
      }
      /**
       * <code>.Spell spell = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.ljh.clientdemo.proto.protoc.SpellProto.Spell, com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder, com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder> 
          getSpellFieldBuilder() {
        if (spellBuilder_ == null) {
          spellBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.ljh.clientdemo.proto.protoc.SpellProto.Spell, com.ljh.clientdemo.proto.protoc.SpellProto.Spell.Builder, com.ljh.clientdemo.proto.protoc.SpellProto.SpellOrBuilder>(
                  getSpell(),
                  getParentForChildren(),
                  isClean());
          spell_ = null;
        }
        return spellBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Boss)
    }

    // @@protoc_insertion_point(class_scope:Boss)
    private static final com.ljh.clientdemo.proto.protoc.BossProto.Boss DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.ljh.clientdemo.proto.protoc.BossProto.Boss();
    }

    public static com.ljh.clientdemo.proto.protoc.BossProto.Boss getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Boss>
        PARSER = new com.google.protobuf.AbstractParser<Boss>() {
      @java.lang.Override
      public Boss parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Boss(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Boss> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Boss> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.ljh.clientdemo.proto.protoc.BossProto.Boss getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Boss_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Boss_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nBoss.proto\032\013Spell.proto\"C\n\004Boss\022\n\n\002id\030" +
      "\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\n\n\002hp\030\003 \001(\003\022\025\n\005spell" +
      "\030\004 \001(\0132\006.SpellB,\n\037com.ljh.clientdemo.pro" +
      "to.protocB\tBossProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ljh.clientdemo.proto.protoc.SpellProto.getDescriptor(),
        });
    internal_static_Boss_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Boss_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Boss_descriptor,
        new java.lang.String[] { "Id", "Name", "Hp", "Spell", });
    com.ljh.clientdemo.proto.protoc.SpellProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
