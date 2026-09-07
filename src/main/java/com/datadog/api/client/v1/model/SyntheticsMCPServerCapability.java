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

/** A capability advertised by an MCP server. */
@JsonSerialize(using = SyntheticsMCPServerCapability.SyntheticsMCPServerCapabilitySerializer.class)
public class SyntheticsMCPServerCapability extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("completions", "experimental", "logging", "prompts", "resources", "tools"));

  public static final SyntheticsMCPServerCapability COMPLETIONS =
      new SyntheticsMCPServerCapability("completions");
  public static final SyntheticsMCPServerCapability EXPERIMENTAL =
      new SyntheticsMCPServerCapability("experimental");
  public static final SyntheticsMCPServerCapability LOGGING =
      new SyntheticsMCPServerCapability("logging");
  public static final SyntheticsMCPServerCapability PROMPTS =
      new SyntheticsMCPServerCapability("prompts");
  public static final SyntheticsMCPServerCapability RESOURCES =
      new SyntheticsMCPServerCapability("resources");
  public static final SyntheticsMCPServerCapability TOOLS =
      new SyntheticsMCPServerCapability("tools");

  SyntheticsMCPServerCapability(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMCPServerCapabilitySerializer
      extends StdSerializer<SyntheticsMCPServerCapability> {
    public SyntheticsMCPServerCapabilitySerializer(Class<SyntheticsMCPServerCapability> t) {
      super(t);
    }

    public SyntheticsMCPServerCapabilitySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMCPServerCapability value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMCPServerCapability fromValue(String value) {
    return new SyntheticsMCPServerCapability(value);
  }
}
