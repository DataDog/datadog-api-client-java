/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = SloTimeWindow.SloTimeWindowSerializer.class)
public class SloTimeWindow extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("7d", "30d", "90d"));

  public static final SloTimeWindow SEVEN_D = new SloTimeWindow("7d");
  public static final SloTimeWindow THIRTY_D = new SloTimeWindow("30d");
  public static final SloTimeWindow NINETY_D = new SloTimeWindow("90d");

  SloTimeWindow(String value) {
    super(value, allowedValues);
  }

  public static class SloTimeWindowSerializer extends StdSerializer<SloTimeWindow> {
    public SloTimeWindowSerializer(Class<SloTimeWindow> t) {
      super(t);
    }

    public SloTimeWindowSerializer() {
      this(null);
    }

    @Override
    public void serialize(SloTimeWindow value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SloTimeWindow fromValue(String value) {
    return new SloTimeWindow(value);
  }
}
