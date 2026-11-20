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
@JsonSerialize(using = OccurrenceFilterValue.OccurrenceFilterValueSerializer.class)
public class OccurrenceFilterValue extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("1", "2", "3", "4", "5"));

  public static final OccurrenceFilterValue ONE = new OccurrenceFilterValue("1");
  public static final OccurrenceFilterValue TWO = new OccurrenceFilterValue("2");
  public static final OccurrenceFilterValue THREE = new OccurrenceFilterValue("3");
  public static final OccurrenceFilterValue FOUR = new OccurrenceFilterValue("4");
  public static final OccurrenceFilterValue FIVE = new OccurrenceFilterValue("5");

  OccurrenceFilterValue(String value) {
    super(value, allowedValues);
  }

  public static class OccurrenceFilterValueSerializer extends StdSerializer<OccurrenceFilterValue> {
    public OccurrenceFilterValueSerializer(Class<OccurrenceFilterValue> t) {
      super(t);
    }

    public OccurrenceFilterValueSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OccurrenceFilterValue value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OccurrenceFilterValue fromValue(String value) {
    return new OccurrenceFilterValue(value);
  }
}
