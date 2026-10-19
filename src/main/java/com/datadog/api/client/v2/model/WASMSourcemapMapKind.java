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

/** The type of source map. Always <code>wasm</code> for WebAssembly symbol files. */
@JsonSerialize(using = WASMSourcemapMapKind.WASMSourcemapMapKindSerializer.class)
public class WASMSourcemapMapKind extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("wasm"));

  public static final WASMSourcemapMapKind WASM = new WASMSourcemapMapKind("wasm");

  WASMSourcemapMapKind(String value) {
    super(value, allowedValues);
  }

  public static class WASMSourcemapMapKindSerializer extends StdSerializer<WASMSourcemapMapKind> {
    public WASMSourcemapMapKindSerializer(Class<WASMSourcemapMapKind> t) {
      super(t);
    }

    public WASMSourcemapMapKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WASMSourcemapMapKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WASMSourcemapMapKind fromValue(String value) {
    return new WASMSourcemapMapKind(value);
  }
}
