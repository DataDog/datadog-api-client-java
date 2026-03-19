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

/** The type of a segment based on its data query configuration. */
@JsonSerialize(using = RumSegmentSegmentType.RumSegmentSegmentTypeSerializer.class)
public class RumSegmentSegmentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "static",
              "event_platform",
              "combination",
              "journeys",
              "reference_table",
              "templates"));

  public static final RumSegmentSegmentType STATIC = new RumSegmentSegmentType("static");
  public static final RumSegmentSegmentType EVENT_PLATFORM =
      new RumSegmentSegmentType("event_platform");
  public static final RumSegmentSegmentType COMBINATION = new RumSegmentSegmentType("combination");
  public static final RumSegmentSegmentType JOURNEYS = new RumSegmentSegmentType("journeys");
  public static final RumSegmentSegmentType REFERENCE_TABLE =
      new RumSegmentSegmentType("reference_table");
  public static final RumSegmentSegmentType TEMPLATES = new RumSegmentSegmentType("templates");

  RumSegmentSegmentType(String value) {
    super(value, allowedValues);
  }

  public static class RumSegmentSegmentTypeSerializer extends StdSerializer<RumSegmentSegmentType> {
    public RumSegmentSegmentTypeSerializer(Class<RumSegmentSegmentType> t) {
      super(t);
    }

    public RumSegmentSegmentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumSegmentSegmentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSegmentSegmentType fromValue(String value) {
    return new RumSegmentSegmentType(value);
  }
}
