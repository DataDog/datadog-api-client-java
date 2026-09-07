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

/** The type of SLO definition being queried. */
@JsonSerialize(using = SlosQueryType.SlosQueryTypeSerializer.class)
public class SlosQueryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric", "time_slice", "monitor"));

  public static final SlosQueryType METRIC = new SlosQueryType("metric");
  public static final SlosQueryType TIME_SLICE = new SlosQueryType("time_slice");
  public static final SlosQueryType MONITOR = new SlosQueryType("monitor");

  SlosQueryType(String value) {
    super(value, allowedValues);
  }

  public static class SlosQueryTypeSerializer extends StdSerializer<SlosQueryType> {
    public SlosQueryTypeSerializer(Class<SlosQueryType> t) {
      super(t);
    }

    public SlosQueryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SlosQueryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SlosQueryType fromValue(String value) {
    return new SlosQueryType(value);
  }
}
