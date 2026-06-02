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

/** The source of the last update to a hardcoded retention filter. */
@JsonSerialize(
    using =
        RumHardcodedRetentionFilterMetaSource.RumHardcodedRetentionFilterMetaSourceSerializer.class)
public class RumHardcodedRetentionFilterMetaSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "ui", "terraform"));

  public static final RumHardcodedRetentionFilterMetaSource DEFAULT =
      new RumHardcodedRetentionFilterMetaSource("default");
  public static final RumHardcodedRetentionFilterMetaSource UI =
      new RumHardcodedRetentionFilterMetaSource("ui");
  public static final RumHardcodedRetentionFilterMetaSource TERRAFORM =
      new RumHardcodedRetentionFilterMetaSource("terraform");

  RumHardcodedRetentionFilterMetaSource(String value) {
    super(value, allowedValues);
  }

  public static class RumHardcodedRetentionFilterMetaSourceSerializer
      extends StdSerializer<RumHardcodedRetentionFilterMetaSource> {
    public RumHardcodedRetentionFilterMetaSourceSerializer(
        Class<RumHardcodedRetentionFilterMetaSource> t) {
      super(t);
    }

    public RumHardcodedRetentionFilterMetaSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumHardcodedRetentionFilterMetaSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumHardcodedRetentionFilterMetaSource fromValue(String value) {
    return new RumHardcodedRetentionFilterMetaSource(value);
  }
}
