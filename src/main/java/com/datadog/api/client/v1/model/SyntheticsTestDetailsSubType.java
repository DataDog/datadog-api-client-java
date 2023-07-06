/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * The subtype of the Synthetic API test, <code>http</code>, <code>ssl</code>, <code>tcp</code>,
 * <code>dns</code>, <code>icmp</code>, <code>udp</code>, <code>websocket</code>, <code>grpc</code>
 * or <code>multi</code>.
 */
@JsonSerialize(using = SyntheticsTestDetailsSubType.SyntheticsTestDetailsSubTypeSerializer.class)
public class SyntheticsTestDetailsSubType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("http", "ssl", "tcp", "dns", "multi", "icmp", "udp", "websocket", "grpc"));

  public static final SyntheticsTestDetailsSubType HTTP = new SyntheticsTestDetailsSubType("http");
  public static final SyntheticsTestDetailsSubType SSL = new SyntheticsTestDetailsSubType("ssl");
  public static final SyntheticsTestDetailsSubType TCP = new SyntheticsTestDetailsSubType("tcp");
  public static final SyntheticsTestDetailsSubType DNS = new SyntheticsTestDetailsSubType("dns");
  public static final SyntheticsTestDetailsSubType MULTI =
      new SyntheticsTestDetailsSubType("multi");
  public static final SyntheticsTestDetailsSubType ICMP = new SyntheticsTestDetailsSubType("icmp");
  public static final SyntheticsTestDetailsSubType UDP = new SyntheticsTestDetailsSubType("udp");
  public static final SyntheticsTestDetailsSubType WEBSOCKET =
      new SyntheticsTestDetailsSubType("websocket");
  public static final SyntheticsTestDetailsSubType GRPC = new SyntheticsTestDetailsSubType("grpc");

  SyntheticsTestDetailsSubType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestDetailsSubTypeSerializer
      extends StdSerializer<SyntheticsTestDetailsSubType> {
    public SyntheticsTestDetailsSubTypeSerializer(Class<SyntheticsTestDetailsSubType> t) {
      super(t);
    }

    public SyntheticsTestDetailsSubTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestDetailsSubType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestDetailsSubType fromValue(String value) {
    return new SyntheticsTestDetailsSubType(value);
  }
}
