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

/** The source of the last update to a permanent retention filter. */
@JsonSerialize(
    using =
        RumPermanentRetentionFilterMetaSource.RumPermanentRetentionFilterMetaSourceSerializer.class)
public class RumPermanentRetentionFilterMetaSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("default", "ui", "terraform"));

  public static final RumPermanentRetentionFilterMetaSource DEFAULT =
      new RumPermanentRetentionFilterMetaSource("default");
  public static final RumPermanentRetentionFilterMetaSource UI =
      new RumPermanentRetentionFilterMetaSource("ui");
  public static final RumPermanentRetentionFilterMetaSource TERRAFORM =
      new RumPermanentRetentionFilterMetaSource("terraform");

  RumPermanentRetentionFilterMetaSource(String value) {
    super(value, allowedValues);
  }

  public static class RumPermanentRetentionFilterMetaSourceSerializer
      extends StdSerializer<RumPermanentRetentionFilterMetaSource> {
    public RumPermanentRetentionFilterMetaSourceSerializer(
        Class<RumPermanentRetentionFilterMetaSource> t) {
      super(t);
    }

    public RumPermanentRetentionFilterMetaSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumPermanentRetentionFilterMetaSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumPermanentRetentionFilterMetaSource fromValue(String value) {
    return new RumPermanentRetentionFilterMetaSource(value);
  }
}
