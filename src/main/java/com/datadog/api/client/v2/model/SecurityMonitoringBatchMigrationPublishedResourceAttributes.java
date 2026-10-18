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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of the publication outcome of a batch migration resource. */
@JsonPropertyOrder({
  SecurityMonitoringBatchMigrationPublishedResourceAttributes.JSON_PROPERTY_ERROR,
  SecurityMonitoringBatchMigrationPublishedResourceAttributes.JSON_PROPERTY_RULE_ID,
  SecurityMonitoringBatchMigrationPublishedResourceAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringBatchMigrationPublishedResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringBatchMigrationPublishedResourceStatus status;

  public SecurityMonitoringBatchMigrationPublishedResourceAttributes() {}

  @JsonCreator
  public SecurityMonitoringBatchMigrationPublishedResourceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          SecurityMonitoringBatchMigrationPublishedResourceStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public SecurityMonitoringBatchMigrationPublishedResourceAttributes error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The reason why the resource could not be published.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SecurityMonitoringBatchMigrationPublishedResourceAttributes ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * The ID of the created Cloud SIEM detection rule.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public SecurityMonitoringBatchMigrationPublishedResourceAttributes status(
      SecurityMonitoringBatchMigrationPublishedResourceStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The outcome of publishing a batch migration resource.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringBatchMigrationPublishedResourceStatus getStatus() {
    return status;
  }

  public void setStatus(SecurityMonitoringBatchMigrationPublishedResourceStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return SecurityMonitoringBatchMigrationPublishedResourceAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringBatchMigrationPublishedResourceAttributes putAdditionalProperty(
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

  /**
   * Return true if this SecurityMonitoringBatchMigrationPublishedResourceAttributes object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringBatchMigrationPublishedResourceAttributes
        securityMonitoringBatchMigrationPublishedResourceAttributes =
            (SecurityMonitoringBatchMigrationPublishedResourceAttributes) o;
    return Objects.equals(
            this.error, securityMonitoringBatchMigrationPublishedResourceAttributes.error)
        && Objects.equals(
            this.ruleId, securityMonitoringBatchMigrationPublishedResourceAttributes.ruleId)
        && Objects.equals(
            this.status, securityMonitoringBatchMigrationPublishedResourceAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringBatchMigrationPublishedResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, ruleId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringBatchMigrationPublishedResourceAttributes {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
