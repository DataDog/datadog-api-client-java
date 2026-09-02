/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for bulk converting security monitoring rules to Terraform. */
@JsonPropertyOrder({SecurityMonitoringRuleConvertBulkAttributes.JSON_PROPERTY_RULE_IDS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleConvertBulkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RULE_IDS = "ruleIds";
  private List<String> ruleIds = new ArrayList<>();

  public SecurityMonitoringRuleConvertBulkAttributes() {}

  @JsonCreator
  public SecurityMonitoringRuleConvertBulkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_IDS) List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }

  public SecurityMonitoringRuleConvertBulkAttributes ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }

  public SecurityMonitoringRuleConvertBulkAttributes addRuleIdsItem(String ruleIdsItem) {
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

  /**
   * List of rule IDs to convert. Each rule will be included in the resulting ZIP file as a separate
   * Terraform file.
   *
   * @return ruleIds
   */
  @JsonProperty(JSON_PROPERTY_RULE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRuleIds() {
    return ruleIds;
  }

  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
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
   * @return SecurityMonitoringRuleConvertBulkAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringRuleConvertBulkAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleConvertBulkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleConvertBulkAttributes securityMonitoringRuleConvertBulkAttributes =
        (SecurityMonitoringRuleConvertBulkAttributes) o;
    return Objects.equals(this.ruleIds, securityMonitoringRuleConvertBulkAttributes.ruleIds)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringRuleConvertBulkAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleConvertBulkAttributes {\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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
