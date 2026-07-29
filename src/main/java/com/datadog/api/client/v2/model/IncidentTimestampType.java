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

/** The type of timestamp to override. */
@JsonSerialize(using = IncidentTimestampType.IncidentTimestampTypeSerializer.class)
public class IncidentTimestampType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("detected", "resolved", "declared"));

  public static final IncidentTimestampType DETECTED = new IncidentTimestampType("detected");
  public static final IncidentTimestampType RESOLVED = new IncidentTimestampType("resolved");
  public static final IncidentTimestampType DECLARED = new IncidentTimestampType("declared");

  IncidentTimestampType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentTimestampTypeSerializer extends StdSerializer<IncidentTimestampType> {
    public IncidentTimestampTypeSerializer(Class<IncidentTimestampType> t) {
      super(t);
    }

    public IncidentTimestampTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentTimestampType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentTimestampType fromValue(String value) {
    return new IncidentTimestampType(value);
  }
}
