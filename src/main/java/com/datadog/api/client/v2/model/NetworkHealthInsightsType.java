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

/** The resource type for network health insights. Always <code>network-health-insights</code>. */
@JsonSerialize(using = NetworkHealthInsightsType.NetworkHealthInsightsTypeSerializer.class)
public class NetworkHealthInsightsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("network-health-insights"));

  public static final NetworkHealthInsightsType NETWORK_HEALTH_INSIGHTS =
      new NetworkHealthInsightsType("network-health-insights");

  NetworkHealthInsightsType(String value) {
    super(value, allowedValues);
  }

  public static class NetworkHealthInsightsTypeSerializer
      extends StdSerializer<NetworkHealthInsightsType> {
    public NetworkHealthInsightsTypeSerializer(Class<NetworkHealthInsightsType> t) {
      super(t);
    }

    public NetworkHealthInsightsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NetworkHealthInsightsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NetworkHealthInsightsType fromValue(String value) {
    return new NetworkHealthInsightsType(value);
  }
}
