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

/** On-demand concurrency cap type. */
@JsonSerialize(using = OnDemandConcurrencyCapType.OnDemandConcurrencyCapTypeSerializer.class)
public class OnDemandConcurrencyCapType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("on_demand_concurrency_cap"));

  public static final OnDemandConcurrencyCapType ON_DEMAND_CONCURRENCY_CAP =
      new OnDemandConcurrencyCapType("on_demand_concurrency_cap");

  OnDemandConcurrencyCapType(String value) {
    super(value, allowedValues);
  }

  public static class OnDemandConcurrencyCapTypeSerializer
      extends StdSerializer<OnDemandConcurrencyCapType> {
    public OnDemandConcurrencyCapTypeSerializer(Class<OnDemandConcurrencyCapType> t) {
      super(t);
    }

    public OnDemandConcurrencyCapTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OnDemandConcurrencyCapType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnDemandConcurrencyCapType fromValue(String value) {
    return new OnDemandConcurrencyCapType(value);
  }
}
