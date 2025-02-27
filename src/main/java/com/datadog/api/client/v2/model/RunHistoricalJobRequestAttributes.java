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

/** Run a historical job request. */
@JsonPropertyOrder({
  RunHistoricalJobRequestAttributes.JSON_PROPERTY_FROM_RULE,
  RunHistoricalJobRequestAttributes.JSON_PROPERTY_ID,
  RunHistoricalJobRequestAttributes.JSON_PROPERTY_JOB_DEFINITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RunHistoricalJobRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_RULE = "fromRule";
  private JobDefinitionFromRule fromRule;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JOB_DEFINITION = "jobDefinition";
  private JobDefinition jobDefinition;

  public RunHistoricalJobRequestAttributes fromRule(JobDefinitionFromRule fromRule) {
    this.fromRule = fromRule;
    this.unparsed |= fromRule.unparsed;
    return this;
  }

  /**
   * Definition of a historical job based on a security monitoring rule.
   *
   * @return fromRule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JobDefinitionFromRule getFromRule() {
    return fromRule;
  }

  public void setFromRule(JobDefinitionFromRule fromRule) {
    this.fromRule = fromRule;
  }

  public RunHistoricalJobRequestAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Request ID.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunHistoricalJobRequestAttributes jobDefinition(JobDefinition jobDefinition) {
    this.jobDefinition = jobDefinition;
    this.unparsed |= jobDefinition.unparsed;
    return this;
  }

  /**
   * Definition of a historical job.
   *
   * @return jobDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JobDefinition getJobDefinition() {
    return jobDefinition;
  }

  public void setJobDefinition(JobDefinition jobDefinition) {
    this.jobDefinition = jobDefinition;
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
   * @return RunHistoricalJobRequestAttributes
   */
  @JsonAnySetter
  public RunHistoricalJobRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RunHistoricalJobRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunHistoricalJobRequestAttributes runHistoricalJobRequestAttributes =
        (RunHistoricalJobRequestAttributes) o;
    return Objects.equals(this.fromRule, runHistoricalJobRequestAttributes.fromRule)
        && Objects.equals(this.id, runHistoricalJobRequestAttributes.id)
        && Objects.equals(this.jobDefinition, runHistoricalJobRequestAttributes.jobDefinition)
        && Objects.equals(
            this.additionalProperties, runHistoricalJobRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromRule, id, jobDefinition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunHistoricalJobRequestAttributes {\n");
    sb.append("    fromRule: ").append(toIndentedString(fromRule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobDefinition: ").append(toIndentedString(jobDefinition)).append("\n");
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
