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

/** The source of the last change to a RUM retention filter. */
@JsonSerialize(using = RumRetentionFilterMetaSource.RumRetentionFilterMetaSourceSerializer.class)
public class RumRetentionFilterMetaSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "ui", "terraform", "unknown"));

  public static final RumRetentionFilterMetaSource DEFAULT =
      new RumRetentionFilterMetaSource("default");
  public static final RumRetentionFilterMetaSource UI = new RumRetentionFilterMetaSource("ui");
  public static final RumRetentionFilterMetaSource TERRAFORM =
      new RumRetentionFilterMetaSource("terraform");
  public static final RumRetentionFilterMetaSource UNKNOWN =
      new RumRetentionFilterMetaSource("unknown");

  RumRetentionFilterMetaSource(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterMetaSourceSerializer
      extends StdSerializer<RumRetentionFilterMetaSource> {
    public RumRetentionFilterMetaSourceSerializer(Class<RumRetentionFilterMetaSource> t) {
      super(t);
    }

    public RumRetentionFilterMetaSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterMetaSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterMetaSource fromValue(String value) {
    return new RumRetentionFilterMetaSource(value);
  }
}
