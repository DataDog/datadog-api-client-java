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

/** The vulnerability tool. */
@JsonSerialize(using = Tool.ToolSerializer.class)
public class Tool extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("IAST", "SCA", "Infra"));

  public static final Tool IAST = new Tool("IAST");
  public static final Tool SCA = new Tool("SCA");
  public static final Tool INFRA = new Tool("Infra");

  Tool(String value) {
    super(value, allowedValues);
  }

  public static class ToolSerializer extends StdSerializer<Tool> {
    public ToolSerializer(Class<Tool> t) {
      super(t);
    }

    public ToolSerializer() {
      this(null);
    }

    @Override
    public void serialize(Tool value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Tool fromValue(String value) {
    return new Tool(value);
  }
}
