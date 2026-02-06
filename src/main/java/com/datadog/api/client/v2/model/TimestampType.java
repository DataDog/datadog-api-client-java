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

/** The type of timestamp being overridden. */
@JsonSerialize(using = TimestampType.TimestampTypeSerializer.class)
public class TimestampType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("created", "detected", "resolved", "declared"));

  public static final TimestampType CREATED = new TimestampType("created");
  public static final TimestampType DETECTED = new TimestampType("detected");
  public static final TimestampType RESOLVED = new TimestampType("resolved");
  public static final TimestampType DECLARED = new TimestampType("declared");

  TimestampType(String value) {
    super(value, allowedValues);
  }

  public static class TimestampTypeSerializer extends StdSerializer<TimestampType> {
    public TimestampTypeSerializer(Class<TimestampType> t) {
      super(t);
    }

    public TimestampTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(TimestampType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TimestampType fromValue(String value) {
    return new TimestampType(value);
  }
}
