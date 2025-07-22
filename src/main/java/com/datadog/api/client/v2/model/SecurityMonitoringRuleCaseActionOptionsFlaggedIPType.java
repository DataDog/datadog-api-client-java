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
 * Used with the case action of type 'flag_ip'. The value specified in this field is applied as a
 * flag to the IP addresses.
 */
@JsonSerialize(
    using =
        SecurityMonitoringRuleCaseActionOptionsFlaggedIPType
            .SecurityMonitoringRuleCaseActionOptionsFlaggedIPTypeSerializer.class)
public class SecurityMonitoringRuleCaseActionOptionsFlaggedIPType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("SUSPICIOUS", "FLAGGED"));

  public static final SecurityMonitoringRuleCaseActionOptionsFlaggedIPType SUSPICIOUS =
      new SecurityMonitoringRuleCaseActionOptionsFlaggedIPType("SUSPICIOUS");
  public static final SecurityMonitoringRuleCaseActionOptionsFlaggedIPType FLAGGED =
      new SecurityMonitoringRuleCaseActionOptionsFlaggedIPType("FLAGGED");

  SecurityMonitoringRuleCaseActionOptionsFlaggedIPType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleCaseActionOptionsFlaggedIPTypeSerializer
      extends StdSerializer<SecurityMonitoringRuleCaseActionOptionsFlaggedIPType> {
    public SecurityMonitoringRuleCaseActionOptionsFlaggedIPTypeSerializer(
        Class<SecurityMonitoringRuleCaseActionOptionsFlaggedIPType> t) {
      super(t);
    }

    public SecurityMonitoringRuleCaseActionOptionsFlaggedIPTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleCaseActionOptionsFlaggedIPType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleCaseActionOptionsFlaggedIPType fromValue(String value) {
    return new SecurityMonitoringRuleCaseActionOptionsFlaggedIPType(value);
  }
}
