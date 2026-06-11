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

/**
 * Specific failure type within the insight category. For DNS insights: <code>timeout</code>, <code>
 * nxdomain</code>, <code>servfail</code>, or <code>general_failure</code>. For TLS certificate
 * insights: <code>expired</code> or <code>expiring_soon</code>. For security group insights: <code>
 * denied</code>.
 */
@JsonSerialize(
    using = NetworkHealthInsightFailureType.NetworkHealthInsightFailureTypeSerializer.class)
public class NetworkHealthInsightFailureType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "timeout",
              "nxdomain",
              "servfail",
              "general_failure",
              "expired",
              "expiring_soon",
              "denied"));

  public static final NetworkHealthInsightFailureType TIMEOUT =
      new NetworkHealthInsightFailureType("timeout");
  public static final NetworkHealthInsightFailureType NXDOMAIN =
      new NetworkHealthInsightFailureType("nxdomain");
  public static final NetworkHealthInsightFailureType SERVFAIL =
      new NetworkHealthInsightFailureType("servfail");
  public static final NetworkHealthInsightFailureType GENERAL_FAILURE =
      new NetworkHealthInsightFailureType("general_failure");
  public static final NetworkHealthInsightFailureType EXPIRED =
      new NetworkHealthInsightFailureType("expired");
  public static final NetworkHealthInsightFailureType EXPIRING_SOON =
      new NetworkHealthInsightFailureType("expiring_soon");
  public static final NetworkHealthInsightFailureType DENIED =
      new NetworkHealthInsightFailureType("denied");

  NetworkHealthInsightFailureType(String value) {
    super(value, allowedValues);
  }

  public static class NetworkHealthInsightFailureTypeSerializer
      extends StdSerializer<NetworkHealthInsightFailureType> {
    public NetworkHealthInsightFailureTypeSerializer(Class<NetworkHealthInsightFailureType> t) {
      super(t);
    }

    public NetworkHealthInsightFailureTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NetworkHealthInsightFailureType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NetworkHealthInsightFailureType fromValue(String value) {
    return new NetworkHealthInsightFailureType(value);
  }
}
