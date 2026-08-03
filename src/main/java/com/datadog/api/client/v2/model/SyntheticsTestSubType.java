/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Subtype of the Synthetic test that produced this result.</p>
 */
@JsonSerialize(using = SyntheticsTestSubType.SyntheticsTestSubTypeSerializer.class)
public class SyntheticsTestSubType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("dns", "grpc", "http", "icmp", "mcp", "multi", "ssl", "tcp", "udp", "websocket"));

  public static final SyntheticsTestSubType DNS = new SyntheticsTestSubType("dns");
  public static final SyntheticsTestSubType GRPC = new SyntheticsTestSubType("grpc");
  public static final SyntheticsTestSubType HTTP = new SyntheticsTestSubType("http");
  public static final SyntheticsTestSubType ICMP = new SyntheticsTestSubType("icmp");
  public static final SyntheticsTestSubType MCP = new SyntheticsTestSubType("mcp");
  public static final SyntheticsTestSubType MULTI = new SyntheticsTestSubType("multi");
  public static final SyntheticsTestSubType SSL = new SyntheticsTestSubType("ssl");
  public static final SyntheticsTestSubType TCP = new SyntheticsTestSubType("tcp");
  public static final SyntheticsTestSubType UDP = new SyntheticsTestSubType("udp");
  public static final SyntheticsTestSubType WEBSOCKET = new SyntheticsTestSubType("websocket");


  SyntheticsTestSubType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestSubTypeSerializer extends StdSerializer<SyntheticsTestSubType> {
      public SyntheticsTestSubTypeSerializer(Class<SyntheticsTestSubType> t) {
          super(t);
      }

      public SyntheticsTestSubTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsTestSubType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsTestSubType fromValue(String value) {
    return new SyntheticsTestSubType(value);
  }
}
