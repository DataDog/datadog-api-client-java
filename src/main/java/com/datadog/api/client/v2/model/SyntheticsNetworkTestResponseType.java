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

/** Type of response, <code>network_test</code>. */
@JsonSerialize(
    using = SyntheticsNetworkTestResponseType.SyntheticsNetworkTestResponseTypeSerializer.class)
public class SyntheticsNetworkTestResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("network_test"));

  public static final SyntheticsNetworkTestResponseType NETWORK_TEST =
      new SyntheticsNetworkTestResponseType("network_test");

  SyntheticsNetworkTestResponseType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkTestResponseTypeSerializer
      extends StdSerializer<SyntheticsNetworkTestResponseType> {
    public SyntheticsNetworkTestResponseTypeSerializer(Class<SyntheticsNetworkTestResponseType> t) {
      super(t);
    }

    public SyntheticsNetworkTestResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkTestResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkTestResponseType fromValue(String value) {
    return new SyntheticsNetworkTestResponseType(value);
  }
}
