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
 * Where the change was made: <code>UI</code> for the Datadog app, or <code>MCP</code> for a Model
 * Context Protocol (MCP) client.
 */
@JsonSerialize(
    using =
        FeatureFlagChangeEventCreationSource.FeatureFlagChangeEventCreationSourceSerializer.class)
public class FeatureFlagChangeEventCreationSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("UI", "MCP"));

  public static final FeatureFlagChangeEventCreationSource UI =
      new FeatureFlagChangeEventCreationSource("UI");
  public static final FeatureFlagChangeEventCreationSource MCP =
      new FeatureFlagChangeEventCreationSource("MCP");

  FeatureFlagChangeEventCreationSource(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventCreationSourceSerializer
      extends StdSerializer<FeatureFlagChangeEventCreationSource> {
    public FeatureFlagChangeEventCreationSourceSerializer(
        Class<FeatureFlagChangeEventCreationSource> t) {
      super(t);
    }

    public FeatureFlagChangeEventCreationSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventCreationSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventCreationSource fromValue(String value) {
    return new FeatureFlagChangeEventCreationSource(value);
  }
}
