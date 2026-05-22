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

/** How long the subscription should remain active before expiring. */
@JsonSerialize(using = SampleLogGenerationDuration.SampleLogGenerationDurationSerializer.class)
public class SampleLogGenerationDuration extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1h", "1d", "3d", "7d"));

  public static final SampleLogGenerationDuration ONE_HOUR = new SampleLogGenerationDuration("1h");
  public static final SampleLogGenerationDuration ONE_DAY = new SampleLogGenerationDuration("1d");
  public static final SampleLogGenerationDuration THREE_DAYS =
      new SampleLogGenerationDuration("3d");
  public static final SampleLogGenerationDuration SEVEN_DAYS =
      new SampleLogGenerationDuration("7d");

  SampleLogGenerationDuration(String value) {
    super(value, allowedValues);
  }

  public static class SampleLogGenerationDurationSerializer
      extends StdSerializer<SampleLogGenerationDuration> {
    public SampleLogGenerationDurationSerializer(Class<SampleLogGenerationDuration> t) {
      super(t);
    }

    public SampleLogGenerationDurationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SampleLogGenerationDuration value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SampleLogGenerationDuration fromValue(String value) {
    return new SampleLogGenerationDuration(value);
  }
}
