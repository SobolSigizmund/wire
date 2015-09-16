// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 196:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Describes a method of a service.
 */
public final class MethodDescriptorProto extends Message<MethodDescriptorProto> {
  public static final ProtoAdapter<MethodDescriptorProto> ADAPTER = ProtoAdapter.newMessageAdapter(MethodDescriptorProto.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_DOC = "";

  public static final String DEFAULT_INPUT_TYPE = "";

  public static final String DEFAULT_OUTPUT_TYPE = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * Doc string for generated code.
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String doc;

  /**
   * Input and output type names.  These are resolved in the same way as
   * FieldDescriptorProto.type_name, but must refer to a message type.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String input_type;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String output_type;

  @WireField(
      tag = 4,
      adapter = "com.google.protobuf.MethodOptions#ADAPTER"
  )
  public final MethodOptions options;

  public MethodDescriptorProto(String name, String doc, String input_type, String output_type, MethodOptions options) {
    this.name = name;
    this.doc = doc;
    this.input_type = input_type;
    this.output_type = output_type;
    this.options = options;
  }

  private MethodDescriptorProto(Builder builder) {
    this(builder.name, builder.doc, builder.input_type, builder.output_type, builder.options);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodDescriptorProto)) return false;
    MethodDescriptorProto o = (MethodDescriptorProto) other;
    return equals(name, o.name)
        && equals(doc, o.doc)
        && equals(input_type, o.input_type)
        && equals(output_type, o.output_type)
        && equals(options, o.options);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (doc != null ? doc.hashCode() : 0);
      result = result * 37 + (input_type != null ? input_type.hashCode() : 0);
      result = result * 37 + (output_type != null ? output_type.hashCode() : 0);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<MethodDescriptorProto, Builder> {
    public String name;

    public String doc;

    public String input_type;

    public String output_type;

    public MethodOptions options;

    public Builder() {
    }

    public Builder(MethodDescriptorProto message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this.doc = message.doc;
      this.input_type = message.input_type;
      this.output_type = message.output_type;
      this.options = message.options;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Doc string for generated code.
     */
    public Builder doc(String doc) {
      this.doc = doc;
      return this;
    }

    /**
     * Input and output type names.  These are resolved in the same way as
     * FieldDescriptorProto.type_name, but must refer to a message type.
     */
    public Builder input_type(String input_type) {
      this.input_type = input_type;
      return this;
    }

    public Builder output_type(String output_type) {
      this.output_type = output_type;
      return this;
    }

    public Builder options(MethodOptions options) {
      this.options = options;
      return this;
    }

    @Override
    public MethodDescriptorProto build() {
      return new MethodDescriptorProto(this);
    }
  }
}
