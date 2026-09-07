/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The type of source map. */
@JsonSerialize(using = SourcemapMapKind.SourcemapMapKindSerializer.class)
public class SourcemapMapKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("js", "jvm", "ios", "react", "flutter", "elf", "ndk", "il2cpp"));

  public static final SourcemapMapKind JS = new SourcemapMapKind("js");
  public static final SourcemapMapKind JVM = new SourcemapMapKind("jvm");
  public static final SourcemapMapKind IOS = new SourcemapMapKind("ios");
  public static final SourcemapMapKind REACT = new SourcemapMapKind("react");
  public static final SourcemapMapKind FLUTTER = new SourcemapMapKind("flutter");
  public static final SourcemapMapKind ELF = new SourcemapMapKind("elf");
  public static final SourcemapMapKind NDK = new SourcemapMapKind("ndk");
  public static final SourcemapMapKind IL2CPP = new SourcemapMapKind("il2cpp");

  SourcemapMapKind(String value) {
    super(value, allowedValues);
  }

  public static class SourcemapMapKindSerializer extends StdSerializer<SourcemapMapKind> {
    public SourcemapMapKindSerializer(Class<SourcemapMapKind> t) {
      super(t);
    }

    public SourcemapMapKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(SourcemapMapKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SourcemapMapKind fromValue(String value) {
    return new SourcemapMapKind(value);
  }
}
