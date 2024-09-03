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

/** supported include types. */
@JsonSerialize(using = IncludeType.IncludeTypeSerializer.class)
public class IncludeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("schema", "raw_schema", "oncall", "incident", "relation"));

  public static final IncludeType SCHEMA = new IncludeType("schema");
  public static final IncludeType RAW_SCHEMA = new IncludeType("raw_schema");
  public static final IncludeType ONCALL = new IncludeType("oncall");
  public static final IncludeType INCIDENT = new IncludeType("incident");
  public static final IncludeType RELATION = new IncludeType("relation");

  IncludeType(String value) {
    super(value, allowedValues);
  }

  public static class IncludeTypeSerializer extends StdSerializer<IncludeType> {
    public IncludeTypeSerializer(Class<IncludeType> t) {
      super(t);
    }

    public IncludeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IncludeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncludeType fromValue(String value) {
    return new IncludeType(value);
  }
}
