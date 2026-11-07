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
 * Which attributes of the retention filter can be edited. <code>complete</code>: all attributes can
 * be edited. <code>limited</code>: only the sample rates can be edited; the name, event type, and
 * query are fixed and the filter cannot be reordered (for example, default filters). <code>unknown
 * </code>: the edition mode is not set.
 */
@JsonSerialize(
    using = RumRetentionFilterMetaEditionMode.RumRetentionFilterMetaEditionModeSerializer.class)
public class RumRetentionFilterMetaEditionMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("unknown", "complete", "limited"));

  public static final RumRetentionFilterMetaEditionMode UNKNOWN =
      new RumRetentionFilterMetaEditionMode("unknown");
  public static final RumRetentionFilterMetaEditionMode COMPLETE =
      new RumRetentionFilterMetaEditionMode("complete");
  public static final RumRetentionFilterMetaEditionMode LIMITED =
      new RumRetentionFilterMetaEditionMode("limited");

  RumRetentionFilterMetaEditionMode(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterMetaEditionModeSerializer
      extends StdSerializer<RumRetentionFilterMetaEditionMode> {
    public RumRetentionFilterMetaEditionModeSerializer(Class<RumRetentionFilterMetaEditionMode> t) {
      super(t);
    }

    public RumRetentionFilterMetaEditionModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterMetaEditionMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterMetaEditionMode fromValue(String value) {
    return new RumRetentionFilterMetaEditionMode(value);
  }
}
