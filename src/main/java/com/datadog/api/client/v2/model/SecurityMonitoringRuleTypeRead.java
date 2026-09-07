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
   * <p>The rule type.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleTypeRead.SecurityMonitoringRuleTypeReadSerializer.class)
public class SecurityMonitoringRuleTypeRead extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("log_detection", "infrastructure_configuration", "workload_security", "cloud_configuration", "application_security", "api_security", "workload_activity"));

  public static final SecurityMonitoringRuleTypeRead LOG_DETECTION = new SecurityMonitoringRuleTypeRead("log_detection");
  public static final SecurityMonitoringRuleTypeRead INFRASTRUCTURE_CONFIGURATION = new SecurityMonitoringRuleTypeRead("infrastructure_configuration");
  public static final SecurityMonitoringRuleTypeRead WORKLOAD_SECURITY = new SecurityMonitoringRuleTypeRead("workload_security");
  public static final SecurityMonitoringRuleTypeRead CLOUD_CONFIGURATION = new SecurityMonitoringRuleTypeRead("cloud_configuration");
  public static final SecurityMonitoringRuleTypeRead APPLICATION_SECURITY = new SecurityMonitoringRuleTypeRead("application_security");
  public static final SecurityMonitoringRuleTypeRead API_SECURITY = new SecurityMonitoringRuleTypeRead("api_security");
  public static final SecurityMonitoringRuleTypeRead WORKLOAD_ACTIVITY = new SecurityMonitoringRuleTypeRead("workload_activity");


  SecurityMonitoringRuleTypeRead(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleTypeReadSerializer extends StdSerializer<SecurityMonitoringRuleTypeRead> {
      public SecurityMonitoringRuleTypeReadSerializer(Class<SecurityMonitoringRuleTypeRead> t) {
          super(t);
      }

      public SecurityMonitoringRuleTypeReadSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleTypeRead value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleTypeRead fromValue(String value) {
    return new SecurityMonitoringRuleTypeRead(value);
  }
}
