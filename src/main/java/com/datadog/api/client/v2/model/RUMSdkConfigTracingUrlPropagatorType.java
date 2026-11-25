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

/** A trace propagator type. */
@JsonSerialize(
    using =
        RUMSdkConfigTracingUrlPropagatorType.RUMSdkConfigTracingUrlPropagatorTypeSerializer.class)
public class RUMSdkConfigTracingUrlPropagatorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("datadog", "b3", "b3multi", "tracecontext"));

  public static final RUMSdkConfigTracingUrlPropagatorType DATADOG =
      new RUMSdkConfigTracingUrlPropagatorType("datadog");
  public static final RUMSdkConfigTracingUrlPropagatorType B3 =
      new RUMSdkConfigTracingUrlPropagatorType("b3");
  public static final RUMSdkConfigTracingUrlPropagatorType B3MULTI =
      new RUMSdkConfigTracingUrlPropagatorType("b3multi");
  public static final RUMSdkConfigTracingUrlPropagatorType TRACECONTEXT =
      new RUMSdkConfigTracingUrlPropagatorType("tracecontext");

  RUMSdkConfigTracingUrlPropagatorType(String value) {
    super(value, allowedValues);
  }

  public static class RUMSdkConfigTracingUrlPropagatorTypeSerializer
      extends StdSerializer<RUMSdkConfigTracingUrlPropagatorType> {
    public RUMSdkConfigTracingUrlPropagatorTypeSerializer(
        Class<RUMSdkConfigTracingUrlPropagatorType> t) {
      super(t);
    }

    public RUMSdkConfigTracingUrlPropagatorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMSdkConfigTracingUrlPropagatorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMSdkConfigTracingUrlPropagatorType fromValue(String value) {
    return new RUMSdkConfigTracingUrlPropagatorType(value);
  }
}
