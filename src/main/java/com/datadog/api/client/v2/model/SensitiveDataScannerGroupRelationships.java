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


/**
   * <p>Relationships of the group.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerGroupRelationships.JSON_PROPERTY_CONFIGURATION,
  SensitiveDataScannerGroupRelationships.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private SensitiveDataScannerConfigurationData configuration;

  public static final String JSON_PROPERTY_RULES = "rules";
  private SensitiveDataScannerRuleData rules;

  public SensitiveDataScannerGroupRelationships configuration(SensitiveDataScannerConfigurationData configuration) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    return this;
  }

  /**
   * <p>A Sensitive Data Scanner configuration data.</p>
   * @return configuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerConfigurationData getConfiguration() {
        return configuration;
      }
  public void setConfiguration(SensitiveDataScannerConfigurationData configuration) {
    this.configuration = configuration;
  }
  public SensitiveDataScannerGroupRelationships rules(SensitiveDataScannerRuleData rules) {
    this.rules = rules;
    this.unparsed |= rules.unparsed;
    return this;
  }

  /**
   * <p>Rules included in the group.</p>
   * @return rules
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerRuleData getRules() {
        return rules;
      }
  public void setRules(SensitiveDataScannerRuleData rules) {
    this.rules = rules;
  }

  /**
   * Return true if this SensitiveDataScannerGroupRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupRelationships sensitiveDataScannerGroupRelationships = (SensitiveDataScannerGroupRelationships) o;
    return Objects.equals(this.configuration, sensitiveDataScannerGroupRelationships.configuration) && Objects.equals(this.rules, sensitiveDataScannerGroupRelationships.rules);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configuration,rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGroupRelationships {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
