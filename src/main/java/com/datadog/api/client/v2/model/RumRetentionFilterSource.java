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

/** The type of RUM events to filter on. */
@JsonSerialize(using = RumRetentionFilterSource.RumRetentionFilterSourceSerializer.class)
public class RumRetentionFilterSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ui", "terraform", "default", "unknown"));

  public static final RumRetentionFilterSource UI = new RumRetentionFilterSource("ui");
  public static final RumRetentionFilterSource TERRAFORM =
      new RumRetentionFilterSource("terraform");
  public static final RumRetentionFilterSource DEFAULT = new RumRetentionFilterSource("default");
  public static final RumRetentionFilterSource UNKNOWN = new RumRetentionFilterSource("unknown");

  RumRetentionFilterSource(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterSourceSerializer
      extends StdSerializer<RumRetentionFilterSource> {
    public RumRetentionFilterSourceSerializer(Class<RumRetentionFilterSource> t) {
      super(t);
    }

    public RumRetentionFilterSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterSource fromValue(String value) {
    return new RumRetentionFilterSource(value);
  }
}
