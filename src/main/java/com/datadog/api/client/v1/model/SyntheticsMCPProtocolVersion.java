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

/** The MCP protocol version used by the step. See https://modelcontextprotocol.io/specification. */
@JsonSerialize(using = SyntheticsMCPProtocolVersion.SyntheticsMCPProtocolVersionSerializer.class)
public class SyntheticsMCPProtocolVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("2025-06-18"));

  public static final SyntheticsMCPProtocolVersion VERSION_2025_06_18 =
      new SyntheticsMCPProtocolVersion("2025-06-18");

  SyntheticsMCPProtocolVersion(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMCPProtocolVersionSerializer
      extends StdSerializer<SyntheticsMCPProtocolVersion> {
    public SyntheticsMCPProtocolVersionSerializer(Class<SyntheticsMCPProtocolVersion> t) {
      super(t);
    }

    public SyntheticsMCPProtocolVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMCPProtocolVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMCPProtocolVersion fromValue(String value) {
    return new SyntheticsMCPProtocolVersion(value);
  }
}
