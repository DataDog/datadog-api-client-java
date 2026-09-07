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

/** For TCP tests, the TCP traceroute strategy. */
@JsonSerialize(
    using =
        SyntheticsNetworkTestRequestTCPMethod.SyntheticsNetworkTestRequestTCPMethodSerializer.class)
public class SyntheticsNetworkTestRequestTCPMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("prefer_sack", "syn", "sack"));

  public static final SyntheticsNetworkTestRequestTCPMethod PREFER_SACK =
      new SyntheticsNetworkTestRequestTCPMethod("prefer_sack");
  public static final SyntheticsNetworkTestRequestTCPMethod SYN =
      new SyntheticsNetworkTestRequestTCPMethod("syn");
  public static final SyntheticsNetworkTestRequestTCPMethod SACK =
      new SyntheticsNetworkTestRequestTCPMethod("sack");

  SyntheticsNetworkTestRequestTCPMethod(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkTestRequestTCPMethodSerializer
      extends StdSerializer<SyntheticsNetworkTestRequestTCPMethod> {
    public SyntheticsNetworkTestRequestTCPMethodSerializer(
        Class<SyntheticsNetworkTestRequestTCPMethod> t) {
      super(t);
    }

    public SyntheticsNetworkTestRequestTCPMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkTestRequestTCPMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkTestRequestTCPMethod fromValue(String value) {
    return new SyntheticsNetworkTestRequestTCPMethod(value);
  }
}
