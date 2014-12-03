// Copyright 2013 Square, Inc.
package com.squareup.protoparser;

import com.google.auto.value.AutoValue;
import java.util.List;

import static com.squareup.protoparser.Utils.appendDocumentation;
import static com.squareup.protoparser.Utils.appendIndented;
import static com.squareup.protoparser.Utils.immutableCopyOf;

@AutoValue
public abstract class ServiceElement {
  public static ServiceElement create(String name, String qualifiedName, String documentation,
      List<OptionElement> options, List<RpcElement> rpcs) {
    return new AutoValue_ServiceElement(name, qualifiedName, documentation,
        immutableCopyOf(options, "options"), immutableCopyOf(rpcs, "rpcs"));
  }

  public abstract String name();
  public abstract String qualifiedName();
  public abstract String documentation();
  public abstract List<OptionElement> options();
  public abstract List<RpcElement> rpcs();

  ServiceElement() {
  }

  @Override public final String toString() {
    StringBuilder builder = new StringBuilder();
    appendDocumentation(builder, documentation());
    builder.append("service ")
        .append(name())
        .append(" {");
    if (!options().isEmpty()) {
      builder.append('\n');
      for (OptionElement option : options()) {
        appendIndented(builder, option.toDeclaration());
      }
    }
    if (!rpcs().isEmpty()) {
      builder.append('\n');
      for (RpcElement rpc : rpcs()) {
        appendIndented(builder, rpc.toString());
      }
    }
    return builder.append("}\n").toString();
  }
}
