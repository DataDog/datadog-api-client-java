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
 * When to count updatable events. "match" when the event is first seen, or "end" when the event is
 * complete.
 */
@JsonSerialize(
    using = RumMetricResponseUniquenessWhen.RumMetricResponseUniquenessWhenSerializer.class)
public class RumMetricResponseUniquenessWhen extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("match", "end"));

  public static final RumMetricResponseUniquenessWhen MATCH =
      new RumMetricResponseUniquenessWhen("match");
  public static final RumMetricResponseUniquenessWhen END =
      new RumMetricResponseUniquenessWhen("end");

  RumMetricResponseUniquenessWhen(String value) {
    super(value, allowedValues);
  }

  public static class RumMetricResponseUniquenessWhenSerializer
      extends StdSerializer<RumMetricResponseUniquenessWhen> {
    public RumMetricResponseUniquenessWhenSerializer(Class<RumMetricResponseUniquenessWhen> t) {
      super(t);
    }

    public RumMetricResponseUniquenessWhenSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumMetricResponseUniquenessWhen value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumMetricResponseUniquenessWhen fromValue(String value) {
    return new RumMetricResponseUniquenessWhen(value);
  }
}
