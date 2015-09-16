// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 27:1
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class Redacted extends Message<Redacted> {
  public static final ProtoAdapter<Redacted> ADAPTER = ProtoAdapter.newMessageAdapter(Redacted.class);

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, true)
      .build();

  public static final FieldOptions FIELD_OPTIONS_B = new FieldOptions.Builder()
      .setExtension(Ext_redacted_test.redacted, false)
      .build();

  public static final String DEFAULT_A = "";

  public static final String DEFAULT_B = "";

  public static final String DEFAULT_C = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      redacted = true
  )
  public final String a;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String b;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String c;

  public Redacted(String a, String b, String c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  private Redacted(Builder builder) {
    this(builder.a, builder.b, builder.c);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Redacted)) return false;
    Redacted o = (Redacted) other;
    if (!extensionsEqual(o)) return false;
    return equals(a, o.a)
        && equals(b, o.b)
        && equals(c, o.c);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (a != null ? a.hashCode() : 0);
      result = result * 37 + (b != null ? b.hashCode() : 0);
      result = result * 37 + (c != null ? c.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Redacted, Builder> {
    public String a;

    public String b;

    public String c;

    public Builder() {
    }

    public Builder(Redacted message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
      this.b = message.b;
      this.c = message.c;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(String b) {
      this.b = b;
      return this;
    }

    public Builder c(String c) {
      this.c = c;
      return this;
    }

    @Override
    public Redacted build() {
      return new Redacted(this);
    }
  }
}
