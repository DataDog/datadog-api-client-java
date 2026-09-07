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

/** The type identifier for MCP SCA scan request responses. */
@JsonSerialize(
    using = McpScanRequestResponseDataType.McpScanRequestResponseDataTypeSerializer.class)
public class McpScanRequestResponseDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("mcpscanrequestresponse"));

  public static final McpScanRequestResponseDataType MCPSCANREQUESTRESPONSE =
      new McpScanRequestResponseDataType("mcpscanrequestresponse");

  McpScanRequestResponseDataType(String value) {
    super(value, allowedValues);
  }

  public static class McpScanRequestResponseDataTypeSerializer
      extends StdSerializer<McpScanRequestResponseDataType> {
    public McpScanRequestResponseDataTypeSerializer(Class<McpScanRequestResponseDataType> t) {
      super(t);
    }

    public McpScanRequestResponseDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        McpScanRequestResponseDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static McpScanRequestResponseDataType fromValue(String value) {
    return new McpScanRequestResponseDataType(value);
  }
}
