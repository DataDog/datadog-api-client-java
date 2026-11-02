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

/** Whether to count unique journeys or all journeys. */
@JsonSerialize(using = JourneyMapCountingMethod.JourneyMapCountingMethodSerializer.class)
public class JourneyMapCountingMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("uniques", "totals"));

  public static final JourneyMapCountingMethod UNIQUES = new JourneyMapCountingMethod("uniques");
  public static final JourneyMapCountingMethod TOTALS = new JourneyMapCountingMethod("totals");

  JourneyMapCountingMethod(String value) {
    super(value, allowedValues);
  }

  public static class JourneyMapCountingMethodSerializer
      extends StdSerializer<JourneyMapCountingMethod> {
    public JourneyMapCountingMethodSerializer(Class<JourneyMapCountingMethod> t) {
      super(t);
    }

    public JourneyMapCountingMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JourneyMapCountingMethod value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JourneyMapCountingMethod fromValue(String value) {
    return new JourneyMapCountingMethod(value);
  }
}
