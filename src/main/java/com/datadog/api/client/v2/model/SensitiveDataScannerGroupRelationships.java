/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Relationships of the group. */
@JsonPropertyOrder({
  SensitiveDataScannerGroupRelationships.JSON_PROPERTY_CONFIGURATION,
  SensitiveDataScannerGroupRelationships.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGroupRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private SensitiveDataScannerConfigurationData configuration;

  public static final String JSON_PROPERTY_RULES = "rules";
  private SensitiveDataScannerRuleData rules;

  public SensitiveDataScannerGroupRelationships configuration(
      SensitiveDataScannerConfigurationData configuration) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    return this;
  }

  /**
   * A Sensitive Data Scanner configuration data.
   *
   * @return configuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * Rules included in the group.
   *
   * @return rules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRuleData getRules() {
    return rules;
  }

  public void setRules(SensitiveDataScannerRuleData rules) {
    this.rules = rules;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SensitiveDataScannerGroupRelationships
   */
  @JsonAnySetter
  public SensitiveDataScannerGroupRelationships putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this SensitiveDataScannerGroupRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGroupRelationships sensitiveDataScannerGroupRelationships =
        (SensitiveDataScannerGroupRelationships) o;
    return Objects.equals(this.configuration, sensitiveDataScannerGroupRelationships.configuration)
        && Objects.equals(this.rules, sensitiveDataScannerGroupRelationships.rules)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerGroupRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGroupRelationships {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
