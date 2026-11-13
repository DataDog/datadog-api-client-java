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

/**
 * Number of errors reported by each source. Several sources can report the same error, such as an
 * APM span and a log, so the counts overlap: don't add them together.
 */
@JsonPropertyOrder({
  IssueImpactErrorCounts.JSON_PROPERTY_APM,
  IssueImpactErrorCounts.JSON_PROPERTY_LLMOBS,
  IssueImpactErrorCounts.JSON_PROPERTY_LOGS,
  IssueImpactErrorCounts.JSON_PROPERTY_RUM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueImpactErrorCounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM = "apm";
  private Long apm;

  public static final String JSON_PROPERTY_LLMOBS = "llmobs";
  private Long llmobs;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private Long logs;

  public static final String JSON_PROPERTY_RUM = "rum";
  private Long rum;

  public IssueImpactErrorCounts() {}

  @JsonCreator
  public IssueImpactErrorCounts(
      @JsonProperty(required = true, value = JSON_PROPERTY_APM) Long apm,
      @JsonProperty(required = true, value = JSON_PROPERTY_LLMOBS) Long llmobs,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOGS) Long logs,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUM) Long rum) {
    this.apm = apm;
    this.llmobs = llmobs;
    this.logs = logs;
    this.rum = rum;
  }

  public IssueImpactErrorCounts apm(Long apm) {
    this.apm = apm;
    return this;
  }

  /**
   * Number of errors reported by APM.
   *
   * @return apm
   */
  @JsonProperty(JSON_PROPERTY_APM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getApm() {
    return apm;
  }

  public void setApm(Long apm) {
    this.apm = apm;
  }

  public IssueImpactErrorCounts llmobs(Long llmobs) {
    this.llmobs = llmobs;
    return this;
  }

  /**
   * Number of errors reported by Agent Observability.
   *
   * @return llmobs
   */
  @JsonProperty(JSON_PROPERTY_LLMOBS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLlmobs() {
    return llmobs;
  }

  public void setLlmobs(Long llmobs) {
    this.llmobs = llmobs;
  }

  public IssueImpactErrorCounts logs(Long logs) {
    this.logs = logs;
    return this;
  }

  /**
   * Number of errors reported by Log Management.
   *
   * @return logs
   */
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLogs() {
    return logs;
  }

  public void setLogs(Long logs) {
    this.logs = logs;
  }

  public IssueImpactErrorCounts rum(Long rum) {
    this.rum = rum;
    return this;
  }

  /**
   * Number of errors reported by RUM.
   *
   * @return rum
   */
  @JsonProperty(JSON_PROPERTY_RUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRum() {
    return rum;
  }

  public void setRum(Long rum) {
    this.rum = rum;
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
   * @return IssueImpactErrorCounts
   */
  @JsonAnySetter
  public IssueImpactErrorCounts putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueImpactErrorCounts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueImpactErrorCounts issueImpactErrorCounts = (IssueImpactErrorCounts) o;
    return Objects.equals(this.apm, issueImpactErrorCounts.apm)
        && Objects.equals(this.llmobs, issueImpactErrorCounts.llmobs)
        && Objects.equals(this.logs, issueImpactErrorCounts.logs)
        && Objects.equals(this.rum, issueImpactErrorCounts.rum)
        && Objects.equals(this.additionalProperties, issueImpactErrorCounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apm, llmobs, logs, rum, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueImpactErrorCounts {\n");
    sb.append("    apm: ").append(toIndentedString(apm)).append("\n");
    sb.append("    llmobs: ").append(toIndentedString(llmobs)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
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
