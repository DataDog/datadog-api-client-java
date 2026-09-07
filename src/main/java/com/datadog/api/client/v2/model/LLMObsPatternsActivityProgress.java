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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Progress information for a single step of a patterns run. */
@JsonPropertyOrder({
  LLMObsPatternsActivityProgress.JSON_PROPERTY_NAME,
  LLMObsPatternsActivityProgress.JSON_PROPERTY_STARTED_AT,
  LLMObsPatternsActivityProgress.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsActivityProgress {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private JsonNullable<OffsetDateTime> startedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LLMObsPatternsActivityProgress() {}

  @JsonCreator
  public LLMObsPatternsActivityProgress(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.name = name;
    this.status = status;
  }

  public LLMObsPatternsActivityProgress name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the step.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsPatternsActivityProgress startedAt(OffsetDateTime startedAt) {
    this.startedAt = JsonNullable.<OffsetDateTime>of(startedAt);
    return this;
  }

  /**
   * Timestamp when the step started. Null if the step has not started.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getStartedAt() {
    return startedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getStartedAt_JsonNullable() {
    return startedAt;
  }

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  public void setStartedAt_JsonNullable(JsonNullable<OffsetDateTime> startedAt) {
    this.startedAt = startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = JsonNullable.<OffsetDateTime>of(startedAt);
  }

  public LLMObsPatternsActivityProgress status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the step.
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
   * @return LLMObsPatternsActivityProgress
   */
  @JsonAnySetter
  public LLMObsPatternsActivityProgress putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsActivityProgress object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsActivityProgress llmObsPatternsActivityProgress =
        (LLMObsPatternsActivityProgress) o;
    return Objects.equals(this.name, llmObsPatternsActivityProgress.name)
        && Objects.equals(this.startedAt, llmObsPatternsActivityProgress.startedAt)
        && Objects.equals(this.status, llmObsPatternsActivityProgress.status)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsActivityProgress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startedAt, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsActivityProgress {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
