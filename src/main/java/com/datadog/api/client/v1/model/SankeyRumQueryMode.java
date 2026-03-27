/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Sankey mode for RUM queries. */
@JsonSerialize(using = SankeyRumQueryMode.SankeyRumQueryModeSerializer.class)
public class SankeyRumQueryMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("source", "target"));

  public static final SankeyRumQueryMode SOURCE = new SankeyRumQueryMode("source");
  public static final SankeyRumQueryMode TARGET = new SankeyRumQueryMode("target");

  SankeyRumQueryMode(String value) {
    super(value, allowedValues);
  }

  public static class SankeyRumQueryModeSerializer extends StdSerializer<SankeyRumQueryMode> {
    public SankeyRumQueryModeSerializer(Class<SankeyRumQueryMode> t) {
      super(t);
    }

    public SankeyRumQueryModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SankeyRumQueryMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SankeyRumQueryMode fromValue(String value) {
    return new SankeyRumQueryMode(value);
  }
}
