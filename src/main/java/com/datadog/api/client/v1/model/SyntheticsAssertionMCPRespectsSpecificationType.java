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

/** Type of the assertion. */
@JsonSerialize(
    using =
        SyntheticsAssertionMCPRespectsSpecificationType
            .SyntheticsAssertionMCPRespectsSpecificationTypeSerializer.class)
public class SyntheticsAssertionMCPRespectsSpecificationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("mcpRespectsSpecification"));

  public static final SyntheticsAssertionMCPRespectsSpecificationType MCP_RESPECTS_SPECIFICATION =
      new SyntheticsAssertionMCPRespectsSpecificationType("mcpRespectsSpecification");

  SyntheticsAssertionMCPRespectsSpecificationType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsAssertionMCPRespectsSpecificationTypeSerializer
      extends StdSerializer<SyntheticsAssertionMCPRespectsSpecificationType> {
    public SyntheticsAssertionMCPRespectsSpecificationTypeSerializer(
        Class<SyntheticsAssertionMCPRespectsSpecificationType> t) {
      super(t);
    }

    public SyntheticsAssertionMCPRespectsSpecificationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsAssertionMCPRespectsSpecificationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsAssertionMCPRespectsSpecificationType fromValue(String value) {
    return new SyntheticsAssertionMCPRespectsSpecificationType(value);
  }
}
