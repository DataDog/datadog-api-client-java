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

/**
 * The source of the last update to the retention filter. The value is <code>unknown</code> if the
 * request doesn't specify a source.
 */
@JsonSerialize(using = RUMRetentionFilterMetaSource.RUMRetentionFilterMetaSourceSerializer.class)
public class RUMRetentionFilterMetaSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "ui", "terraform", "unknown"));

  public static final RUMRetentionFilterMetaSource DEFAULT =
      new RUMRetentionFilterMetaSource("default");
  public static final RUMRetentionFilterMetaSource UI = new RUMRetentionFilterMetaSource("ui");
  public static final RUMRetentionFilterMetaSource TERRAFORM =
      new RUMRetentionFilterMetaSource("terraform");
  public static final RUMRetentionFilterMetaSource UNKNOWN =
      new RUMRetentionFilterMetaSource("unknown");

  RUMRetentionFilterMetaSource(String value) {
    super(value, allowedValues);
  }

  public static class RUMRetentionFilterMetaSourceSerializer
      extends StdSerializer<RUMRetentionFilterMetaSource> {
    public RUMRetentionFilterMetaSourceSerializer(Class<RUMRetentionFilterMetaSource> t) {
      super(t);
    }

    public RUMRetentionFilterMetaSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMRetentionFilterMetaSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMRetentionFilterMetaSource fromValue(String value) {
    return new RUMRetentionFilterMetaSource(value);
  }
}
