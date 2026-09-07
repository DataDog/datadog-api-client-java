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
@JsonSerialize(using = RUMComputeType.RUMComputeTypeSerializer.class)
public class RUMComputeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timeseries", "total"));

  public static final RUMComputeType TIMESERIES = new RUMComputeType("timeseries");
  public static final RUMComputeType TOTAL = new RUMComputeType("total");

  RUMComputeType(String value) {
    super(value, allowedValues);
  }

  public static class RUMComputeTypeSerializer extends StdSerializer<RUMComputeType> {
    public RUMComputeTypeSerializer(Class<RUMComputeType> t) {
      super(t);
    }

    public RUMComputeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RUMComputeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMComputeType fromValue(String value) {
    return new RUMComputeType(value);
  }
}
