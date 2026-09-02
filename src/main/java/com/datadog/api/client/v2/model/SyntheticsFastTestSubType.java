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
@JsonSerialize(using = SyntheticsFastTestSubType.SyntheticsFastTestSubTypeSerializer.class)
public class SyntheticsFastTestSubType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("dns", "grpc", "http", "icmp", "mcp", "multi", "ssl", "tcp", "udp", "websocket"));

  public static final SyntheticsFastTestSubType DNS = new SyntheticsFastTestSubType("dns");
  public static final SyntheticsFastTestSubType GRPC = new SyntheticsFastTestSubType("grpc");
  public static final SyntheticsFastTestSubType HTTP = new SyntheticsFastTestSubType("http");
  public static final SyntheticsFastTestSubType ICMP = new SyntheticsFastTestSubType("icmp");
  public static final SyntheticsFastTestSubType MCP = new SyntheticsFastTestSubType("mcp");
  public static final SyntheticsFastTestSubType MULTI = new SyntheticsFastTestSubType("multi");
  public static final SyntheticsFastTestSubType SSL = new SyntheticsFastTestSubType("ssl");
  public static final SyntheticsFastTestSubType TCP = new SyntheticsFastTestSubType("tcp");
  public static final SyntheticsFastTestSubType UDP = new SyntheticsFastTestSubType("udp");
  public static final SyntheticsFastTestSubType WEBSOCKET = new SyntheticsFastTestSubType("websocket");


  SyntheticsFastTestSubType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsFastTestSubTypeSerializer extends StdSerializer<SyntheticsFastTestSubType> {
      public SyntheticsFastTestSubTypeSerializer(Class<SyntheticsFastTestSubType> t) {
          super(t);
      }

      public SyntheticsFastTestSubTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsFastTestSubType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsFastTestSubType fromValue(String value) {
    return new SyntheticsFastTestSubType(value);
  }
}
