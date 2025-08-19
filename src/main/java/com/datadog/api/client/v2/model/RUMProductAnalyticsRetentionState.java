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

/** Controls the retention policy for Product Analytics data derived from RUM events. */
@JsonSerialize(
    using = RUMProductAnalyticsRetentionState.RUMProductAnalyticsRetentionStateSerializer.class)
public class RUMProductAnalyticsRetentionState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("MAX", "NONE"));

  public static final RUMProductAnalyticsRetentionState MAX =
      new RUMProductAnalyticsRetentionState("MAX");
  public static final RUMProductAnalyticsRetentionState NONE =
      new RUMProductAnalyticsRetentionState("NONE");

  RUMProductAnalyticsRetentionState(String value) {
    super(value, allowedValues);
  }

  public static class RUMProductAnalyticsRetentionStateSerializer
      extends StdSerializer<RUMProductAnalyticsRetentionState> {
    public RUMProductAnalyticsRetentionStateSerializer(Class<RUMProductAnalyticsRetentionState> t) {
      super(t);
    }

    public RUMProductAnalyticsRetentionStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMProductAnalyticsRetentionState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMProductAnalyticsRetentionState fromValue(String value) {
    return new RUMProductAnalyticsRetentionState(value);
  }
}
