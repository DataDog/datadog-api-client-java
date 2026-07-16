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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an LLM Observability patterns run status. */
@JsonPropertyOrder({
  LLMObsPatternsRunStatusResponseAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsRunStatusResponseAttributes.JSON_PROPERTY_PROGRESS,
  LLMObsPatternsRunStatusResponseAttributes.JSON_PROPERTY_STATUS,
  LLMObsPatternsRunStatusResponseAttributes.JSON_PROPERTY_STEP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsRunStatusResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PROGRESS = "progress";
  private List<LLMObsPatternsActivityProgress> progress = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STEP = "step";
  private String step;

  public LLMObsPatternsRunStatusResponseAttributes() {}

  @JsonCreator
  public LLMObsPatternsRunStatusResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROGRESS)
          List<LLMObsPatternsActivityProgress> progress,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEP) String step) {
    this.createdAt = createdAt;
    this.progress = progress;
    for (LLMObsPatternsActivityProgress item : progress) {
      this.unparsed |= item.unparsed;
    }
    this.status = status;
    this.step = step;
  }

  public LLMObsPatternsRunStatusResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the run was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsPatternsRunStatusResponseAttributes progress(
      List<LLMObsPatternsActivityProgress> progress) {
    this.progress = progress;
    for (LLMObsPatternsActivityProgress item : progress) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsPatternsRunStatusResponseAttributes addProgressItem(
      LLMObsPatternsActivityProgress progressItem) {
    this.progress.add(progressItem);
    this.unparsed |= progressItem.unparsed;
    return this;
  }

  /**
   * List of step-by-step progress entries for a patterns run.
   *
   * @return progress
   */
  @JsonProperty(JSON_PROPERTY_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsPatternsActivityProgress> getProgress() {
    return progress;
  }

  public void setProgress(List<LLMObsPatternsActivityProgress> progress) {
    this.progress = progress;
    if (progress != null) {
      for (LLMObsPatternsActivityProgress item : progress) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsPatternsRunStatusResponseAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Overall status of the run.
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

  public LLMObsPatternsRunStatusResponseAttributes step(String step) {
    this.step = step;
    return this;
  }

  /**
   * The current step of the run.
   *
   * @return step
   */
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
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
   * @return LLMObsPatternsRunStatusResponseAttributes
   */
  @JsonAnySetter
  public LLMObsPatternsRunStatusResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsRunStatusResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsRunStatusResponseAttributes llmObsPatternsRunStatusResponseAttributes =
        (LLMObsPatternsRunStatusResponseAttributes) o;
    return Objects.equals(this.createdAt, llmObsPatternsRunStatusResponseAttributes.createdAt)
        && Objects.equals(this.progress, llmObsPatternsRunStatusResponseAttributes.progress)
        && Objects.equals(this.status, llmObsPatternsRunStatusResponseAttributes.status)
        && Objects.equals(this.step, llmObsPatternsRunStatusResponseAttributes.step)
        && Objects.equals(
            this.additionalProperties,
            llmObsPatternsRunStatusResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, progress, status, step, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsRunStatusResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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
