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

/** Step execution summary for a Synthetic test result. */
@JsonPropertyOrder({
  SyntheticsTestResultStepsInfo.JSON_PROPERTY_COMPLETED,
  SyntheticsTestResultStepsInfo.JSON_PROPERTY_ERRORS,
  SyntheticsTestResultStepsInfo.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultStepsInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private Long completed;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Long errors;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public SyntheticsTestResultStepsInfo completed(Long completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Number of completed steps.
   *
   * @return completed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCompleted() {
    return completed;
  }

  public void setCompleted(Long completed) {
    this.completed = completed;
  }

  public SyntheticsTestResultStepsInfo errors(Long errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Number of steps with errors.
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getErrors() {
    return errors;
  }

  public void setErrors(Long errors) {
    this.errors = errors;
  }

  public SyntheticsTestResultStepsInfo total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of steps.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
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
   * @return SyntheticsTestResultStepsInfo
   */
  @JsonAnySetter
  public SyntheticsTestResultStepsInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultStepsInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultStepsInfo syntheticsTestResultStepsInfo = (SyntheticsTestResultStepsInfo) o;
    return Objects.equals(this.completed, syntheticsTestResultStepsInfo.completed)
        && Objects.equals(this.errors, syntheticsTestResultStepsInfo.errors)
        && Objects.equals(this.total, syntheticsTestResultStepsInfo.total)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultStepsInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, errors, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultStepsInfo {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
