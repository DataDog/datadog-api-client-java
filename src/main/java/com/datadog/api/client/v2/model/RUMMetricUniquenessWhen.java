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
 * When to count updatable events. <code>match</code> when the event is first seen, or <code>end
 * </code> when the event is complete. Sessions and views are updated over time, and each one is
 * counted once.
 */
@JsonSerialize(using = RUMMetricUniquenessWhen.RUMMetricUniquenessWhenSerializer.class)
public class RUMMetricUniquenessWhen extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("match", "end"));

  public static final RUMMetricUniquenessWhen WHEN_MATCH = new RUMMetricUniquenessWhen("match");
  public static final RUMMetricUniquenessWhen WHEN_END = new RUMMetricUniquenessWhen("end");

  RUMMetricUniquenessWhen(String value) {
    super(value, allowedValues);
  }

  public static class RUMMetricUniquenessWhenSerializer
      extends StdSerializer<RUMMetricUniquenessWhen> {
    public RUMMetricUniquenessWhenSerializer(Class<RUMMetricUniquenessWhen> t) {
      super(t);
    }

    public RUMMetricUniquenessWhenSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMMetricUniquenessWhen value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMMetricUniquenessWhen fromValue(String value) {
    return new RUMMetricUniquenessWhen(value);
  }
}
