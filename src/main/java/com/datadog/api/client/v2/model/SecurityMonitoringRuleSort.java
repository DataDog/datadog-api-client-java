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
   * <p>The sort parameters used for querying security monitoring rules.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleSort.SecurityMonitoringRuleSortSerializer.class)
public class SecurityMonitoringRuleSort extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("name", "creation_date", "update_date", "enabled", "type", "highest_severity", "source", "-name", "-creation_date", "-update_date", "-enabled", "-type", "-highest_severity", "-source"));

  public static final SecurityMonitoringRuleSort NAME = new SecurityMonitoringRuleSort("name");
  public static final SecurityMonitoringRuleSort CREATION_DATE = new SecurityMonitoringRuleSort("creation_date");
  public static final SecurityMonitoringRuleSort UPDATE_DATE = new SecurityMonitoringRuleSort("update_date");
  public static final SecurityMonitoringRuleSort ENABLED = new SecurityMonitoringRuleSort("enabled");
  public static final SecurityMonitoringRuleSort TYPE = new SecurityMonitoringRuleSort("type");
  public static final SecurityMonitoringRuleSort HIGHEST_SEVERITY = new SecurityMonitoringRuleSort("highest_severity");
  public static final SecurityMonitoringRuleSort SOURCE = new SecurityMonitoringRuleSort("source");
  public static final SecurityMonitoringRuleSort NAME_DESCENDING = new SecurityMonitoringRuleSort("-name");
  public static final SecurityMonitoringRuleSort CREATION_DATE_DESCENDING = new SecurityMonitoringRuleSort("-creation_date");
  public static final SecurityMonitoringRuleSort UPDATE_DATE_DESCENDING = new SecurityMonitoringRuleSort("-update_date");
  public static final SecurityMonitoringRuleSort ENABLED_DESCENDING = new SecurityMonitoringRuleSort("-enabled");
  public static final SecurityMonitoringRuleSort TYPE_DESCENDING = new SecurityMonitoringRuleSort("-type");
  public static final SecurityMonitoringRuleSort HIGHEST_SEVERITY_DESCENDING = new SecurityMonitoringRuleSort("-highest_severity");
  public static final SecurityMonitoringRuleSort SOURCE_DESCENDING = new SecurityMonitoringRuleSort("-source");


  SecurityMonitoringRuleSort(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleSortSerializer extends StdSerializer<SecurityMonitoringRuleSort> {
      public SecurityMonitoringRuleSortSerializer(Class<SecurityMonitoringRuleSort> t) {
          super(t);
      }

      public SecurityMonitoringRuleSortSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleSort value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleSort fromValue(String value) {
    return new SecurityMonitoringRuleSort(value);
  }
}
