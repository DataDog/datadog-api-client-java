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

/** Governance console config resource type. */
@JsonSerialize(
    using = GovernanceConsoleConfigResourceType.GovernanceConsoleConfigResourceTypeSerializer.class)
public class GovernanceConsoleConfigResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("governance_console_config"));

  public static final GovernanceConsoleConfigResourceType GOVERNANCE_CONSOLE_CONFIG =
      new GovernanceConsoleConfigResourceType("governance_console_config");

  GovernanceConsoleConfigResourceType(String value) {
    super(value, allowedValues);
  }

  public static class GovernanceConsoleConfigResourceTypeSerializer
      extends StdSerializer<GovernanceConsoleConfigResourceType> {
    public GovernanceConsoleConfigResourceTypeSerializer(
        Class<GovernanceConsoleConfigResourceType> t) {
      super(t);
    }

    public GovernanceConsoleConfigResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GovernanceConsoleConfigResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GovernanceConsoleConfigResourceType fromValue(String value) {
    return new GovernanceConsoleConfigResourceType(value);
  }
}
