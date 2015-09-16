// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/foo.proto at 7:1
package com.squareup.foobar.protos.foo;

import com.squareup.foobar.protos.bar.Bar;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;

public final class Foo extends Message<Foo> {
  public static final ProtoAdapter<Foo> ADAPTER = ProtoAdapter.newMessageAdapter(Foo.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.foobar.protos.bar.Bar$Baz$Moo#ADAPTER"
  )
  public final Bar.Baz.Moo moo;

  public Foo(Bar.Baz.Moo moo) {
    this.moo = moo;
  }

  private Foo(Builder builder) {
    this(builder.moo);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    return equals(moo, ((Foo) other).moo);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = moo != null ? moo.hashCode() : 0);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foo, Builder> {
    public Bar.Baz.Moo moo;

    public Builder() {
    }

    public Builder(Foo message) {
      super(message);
      if (message == null) return;
      this.moo = message.moo;
    }

    public Builder moo(Bar.Baz.Moo moo) {
      this.moo = moo;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(this);
    }
  }
}
