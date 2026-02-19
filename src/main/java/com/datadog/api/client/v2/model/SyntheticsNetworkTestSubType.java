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
 * Subtype of the Synthetic Network Path test: <code>tcp</code>, <code>udp</code>, or <code>icmp
 * </code>.
 */
@JsonSerialize(using = SyntheticsNetworkTestSubType.SyntheticsNetworkTestSubTypeSerializer.class)
public class SyntheticsNetworkTestSubType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("tcp", "udp", "icmp"));

  public static final SyntheticsNetworkTestSubType TCP = new SyntheticsNetworkTestSubType("tcp");
  public static final SyntheticsNetworkTestSubType UDP = new SyntheticsNetworkTestSubType("udp");
  public static final SyntheticsNetworkTestSubType ICMP = new SyntheticsNetworkTestSubType("icmp");

  SyntheticsNetworkTestSubType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsNetworkTestSubTypeSerializer
      extends StdSerializer<SyntheticsNetworkTestSubType> {
    public SyntheticsNetworkTestSubTypeSerializer(Class<SyntheticsNetworkTestSubType> t) {
      super(t);
    }

    public SyntheticsNetworkTestSubTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsNetworkTestSubType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsNetworkTestSubType fromValue(String value) {
    return new SyntheticsNetworkTestSubType(value);
  }
}
