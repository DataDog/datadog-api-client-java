/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>The type of call to perform. Used by gRPC steps (<code>healthcheck</code>, <code>unary</code>)
   * and MCP steps (<code>init</code>, <code>tool_list</code>, <code>tool_call</code>). Valid values depend on
   * the parent step's <code>subtype</code>.</p>
 */
@JsonSerialize(using = SyntheticsTestCallType.SyntheticsTestCallTypeSerializer.class)
public class SyntheticsTestCallType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("healthcheck", "unary", "init", "tool_list", "tool_call"));

  public static final SyntheticsTestCallType HEALTHCHECK = new SyntheticsTestCallType("healthcheck");
  public static final SyntheticsTestCallType UNARY = new SyntheticsTestCallType("unary");
  public static final SyntheticsTestCallType INIT = new SyntheticsTestCallType("init");
  public static final SyntheticsTestCallType TOOL_LIST = new SyntheticsTestCallType("tool_list");
  public static final SyntheticsTestCallType TOOL_CALL = new SyntheticsTestCallType("tool_call");


  SyntheticsTestCallType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestCallTypeSerializer extends StdSerializer<SyntheticsTestCallType> {
      public SyntheticsTestCallTypeSerializer(Class<SyntheticsTestCallType> t) {
          super(t);
      }

      public SyntheticsTestCallTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsTestCallType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsTestCallType fromValue(String value) {
    return new SyntheticsTestCallType(value);
  }
}
