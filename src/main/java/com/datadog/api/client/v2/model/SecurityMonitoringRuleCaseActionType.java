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

/** The action type. */
@JsonSerialize(
    using =
        SecurityMonitoringRuleCaseActionType.SecurityMonitoringRuleCaseActionTypeSerializer.class)
public class SecurityMonitoringRuleCaseActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("block_ip", "block_user", "user_behavior", "flag_ip"));

  public static final SecurityMonitoringRuleCaseActionType BLOCK_IP =
      new SecurityMonitoringRuleCaseActionType("block_ip");
  public static final SecurityMonitoringRuleCaseActionType BLOCK_USER =
      new SecurityMonitoringRuleCaseActionType("block_user");
  public static final SecurityMonitoringRuleCaseActionType USER_BEHAVIOR =
      new SecurityMonitoringRuleCaseActionType("user_behavior");
  public static final SecurityMonitoringRuleCaseActionType FLAG_IP =
      new SecurityMonitoringRuleCaseActionType("flag_ip");

  SecurityMonitoringRuleCaseActionType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleCaseActionTypeSerializer
      extends StdSerializer<SecurityMonitoringRuleCaseActionType> {
    public SecurityMonitoringRuleCaseActionTypeSerializer(
        Class<SecurityMonitoringRuleCaseActionType> t) {
      super(t);
    }

    public SecurityMonitoringRuleCaseActionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleCaseActionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleCaseActionType fromValue(String value) {
    return new SecurityMonitoringRuleCaseActionType(value);
  }
}
