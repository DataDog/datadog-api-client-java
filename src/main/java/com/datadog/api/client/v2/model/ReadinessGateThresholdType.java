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

/** The definition of <code>ReadinessGateThresholdType</code> object. */
@JsonSerialize(using = ReadinessGateThresholdType.ReadinessGateThresholdTypeSerializer.class)
public class ReadinessGateThresholdType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ANY", "ALL"));

  public static final ReadinessGateThresholdType ANY = new ReadinessGateThresholdType("ANY");
  public static final ReadinessGateThresholdType ALL = new ReadinessGateThresholdType("ALL");

  ReadinessGateThresholdType(String value) {
    super(value, allowedValues);
  }

  public static class ReadinessGateThresholdTypeSerializer
      extends StdSerializer<ReadinessGateThresholdType> {
    public ReadinessGateThresholdTypeSerializer(Class<ReadinessGateThresholdType> t) {
      super(t);
    }

    public ReadinessGateThresholdTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReadinessGateThresholdType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReadinessGateThresholdType fromValue(String value) {
    return new ReadinessGateThresholdType(value);
  }
}
