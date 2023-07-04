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

/** The type of compute. */
@JsonSerialize(using = SpansComputeType.SpansComputeTypeSerializer.class)
public class SpansComputeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries", "total"));

  public static final SpansComputeType TIMESERIES = new SpansComputeType("timeseries");
  public static final SpansComputeType TOTAL = new SpansComputeType("total");

  SpansComputeType(String value) {
    super(value, allowedValues);
  }

  public static class SpansComputeTypeSerializer extends StdSerializer<SpansComputeType> {
    public SpansComputeTypeSerializer(Class<SpansComputeType> t) {
      super(t);
    }

    public SpansComputeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SpansComputeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansComputeType fromValue(String value) {
    return new SpansComputeType(value);
  }
}
