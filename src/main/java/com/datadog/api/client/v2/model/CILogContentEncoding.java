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

/** HTTP header used to compress the JSON request body. */
@JsonSerialize(using = CILogContentEncoding.CILogContentEncodingSerializer.class)
public class CILogContentEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("identity", "gzip"));

  public static final CILogContentEncoding IDENTITY = new CILogContentEncoding("identity");
  public static final CILogContentEncoding GZIP = new CILogContentEncoding("gzip");

  CILogContentEncoding(String value) {
    super(value, allowedValues);
  }

  public static class CILogContentEncodingSerializer extends StdSerializer<CILogContentEncoding> {
    public CILogContentEncodingSerializer(Class<CILogContentEncoding> t) {
      super(t);
    }

    public CILogContentEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CILogContentEncoding value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CILogContentEncoding fromValue(String value) {
    return new CILogContentEncoding(value);
  }
}
