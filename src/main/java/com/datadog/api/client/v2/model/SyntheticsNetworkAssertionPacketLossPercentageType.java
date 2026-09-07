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

/** Type of the packet loss percentage assertion. */
@JsonSerialize(
    using =
        SyntheticsNetworkAssertionPacketLossPercentageType
            .SyntheticsNetworkAssertionPacketLossPercentageTypeSerializer.class)
public class SyntheticsNetworkAssertionPacketLossPercentageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("packetLossPercentage"));

  public static final SyntheticsNetworkAssertionPacketLossPercentageType PACKET_LOSS_PERCENTAGE =
      new SyntheticsNetworkAssertionPacketLossPercentageType("packetLossPercentage");

  SyntheticsNetworkAssertionPacketLossPercentageType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkAssertionPacketLossPercentageTypeSerializer
      extends StdSerializer<SyntheticsNetworkAssertionPacketLossPercentageType> {
    public SyntheticsNetworkAssertionPacketLossPercentageTypeSerializer(
        Class<SyntheticsNetworkAssertionPacketLossPercentageType> t) {
      super(t);
    }

    public SyntheticsNetworkAssertionPacketLossPercentageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkAssertionPacketLossPercentageType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkAssertionPacketLossPercentageType fromValue(String value) {
    return new SyntheticsNetworkAssertionPacketLossPercentageType(value);
  }
}
