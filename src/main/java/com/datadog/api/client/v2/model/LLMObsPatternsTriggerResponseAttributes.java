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

/** Attributes of an LLM Observability patterns trigger response. */
@JsonPropertyOrder({
  LLMObsPatternsTriggerResponseAttributes.JSON_PROPERTY_CONFIG_ID,
  LLMObsPatternsTriggerResponseAttributes.JSON_PROPERTY_RUN_ID,
  LLMObsPatternsTriggerResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsTriggerResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG_ID = "config_id";
  private String configId;

  public static final String JSON_PROPERTY_RUN_ID = "run_id";
  private String runId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LLMObsPatternsTriggerResponseAttributes() {}

  @JsonCreator
  public LLMObsPatternsTriggerResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_ID) String configId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUN_ID) String runId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.configId = configId;
    this.runId = runId;
    this.status = status;
  }

  public LLMObsPatternsTriggerResponseAttributes configId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * The ID of the patterns configuration that was run.
   *
   * @return configId
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }

  public LLMObsPatternsTriggerResponseAttributes runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The ID of the patterns run that was started.
   *
   * @return runId
   */
  @JsonProperty(JSON_PROPERTY_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public LLMObsPatternsTriggerResponseAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the patterns run.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
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
   * @return LLMObsPatternsTriggerResponseAttributes
   */
  @JsonAnySetter
  public LLMObsPatternsTriggerResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsTriggerResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsTriggerResponseAttributes llmObsPatternsTriggerResponseAttributes =
        (LLMObsPatternsTriggerResponseAttributes) o;
    return Objects.equals(this.configId, llmObsPatternsTriggerResponseAttributes.configId)
        && Objects.equals(this.runId, llmObsPatternsTriggerResponseAttributes.runId)
        && Objects.equals(this.status, llmObsPatternsTriggerResponseAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            llmObsPatternsTriggerResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, runId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsTriggerResponseAttributes {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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
