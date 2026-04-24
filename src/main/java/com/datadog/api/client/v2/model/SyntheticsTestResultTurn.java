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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A turn in a goal-based browser test, grouping steps and reasoning. */
@JsonPropertyOrder({
  SyntheticsTestResultTurn.JSON_PROPERTY_BUCKET_KEYS,
  SyntheticsTestResultTurn.JSON_PROPERTY_NAME,
  SyntheticsTestResultTurn.JSON_PROPERTY_REASONING,
  SyntheticsTestResultTurn.JSON_PROPERTY_STATUS,
  SyntheticsTestResultTurn.JSON_PROPERTY_STEPS,
  SyntheticsTestResultTurn.JSON_PROPERTY_TURN_FINISHED_AT,
  SyntheticsTestResultTurn.JSON_PROPERTY_TURN_STARTED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultTurn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_KEYS = "bucket_keys";
  private SyntheticsTestResultBucketKeys bucketKeys;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SyntheticsTestResultTurnStep> steps = null;

  public static final String JSON_PROPERTY_TURN_FINISHED_AT = "turn_finished_at";
  private Long turnFinishedAt;

  public static final String JSON_PROPERTY_TURN_STARTED_AT = "turn_started_at";
  private Long turnStartedAt;

  public SyntheticsTestResultTurn bucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
    this.unparsed |= bucketKeys.unparsed;
    return this;
  }

  /**
   * Storage bucket keys for artifacts produced during a step or test.
   *
   * @return bucketKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultBucketKeys getBucketKeys() {
    return bucketKeys;
  }

  public void setBucketKeys(SyntheticsTestResultBucketKeys bucketKeys) {
    this.bucketKeys = bucketKeys;
  }

  public SyntheticsTestResultTurn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the turn.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsTestResultTurn reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Agent reasoning produced for this turn.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public SyntheticsTestResultTurn status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the turn (for example, <code>passed</code>, <code>failed</code>).
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SyntheticsTestResultTurn steps(List<SyntheticsTestResultTurnStep> steps) {
    this.steps = steps;
    for (SyntheticsTestResultTurnStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultTurn addStepsItem(SyntheticsTestResultTurnStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Steps executed during the turn.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultTurnStep> getSteps() {
    return steps;
  }

  public void setSteps(List<SyntheticsTestResultTurnStep> steps) {
    this.steps = steps;
  }

  public SyntheticsTestResultTurn turnFinishedAt(Long turnFinishedAt) {
    this.turnFinishedAt = turnFinishedAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the turn finished.
   *
   * @return turnFinishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURN_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTurnFinishedAt() {
    return turnFinishedAt;
  }

  public void setTurnFinishedAt(Long turnFinishedAt) {
    this.turnFinishedAt = turnFinishedAt;
  }

  public SyntheticsTestResultTurn turnStartedAt(Long turnStartedAt) {
    this.turnStartedAt = turnStartedAt;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the turn started.
   *
   * @return turnStartedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TURN_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTurnStartedAt() {
    return turnStartedAt;
  }

  public void setTurnStartedAt(Long turnStartedAt) {
    this.turnStartedAt = turnStartedAt;
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
   * @return SyntheticsTestResultTurn
   */
  @JsonAnySetter
  public SyntheticsTestResultTurn putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultTurn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultTurn syntheticsTestResultTurn = (SyntheticsTestResultTurn) o;
    return Objects.equals(this.bucketKeys, syntheticsTestResultTurn.bucketKeys)
        && Objects.equals(this.name, syntheticsTestResultTurn.name)
        && Objects.equals(this.reasoning, syntheticsTestResultTurn.reasoning)
        && Objects.equals(this.status, syntheticsTestResultTurn.status)
        && Objects.equals(this.steps, syntheticsTestResultTurn.steps)
        && Objects.equals(this.turnFinishedAt, syntheticsTestResultTurn.turnFinishedAt)
        && Objects.equals(this.turnStartedAt, syntheticsTestResultTurn.turnStartedAt)
        && Objects.equals(this.additionalProperties, syntheticsTestResultTurn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bucketKeys,
        name,
        reasoning,
        status,
        steps,
        turnFinishedAt,
        turnStartedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultTurn {\n");
    sb.append("    bucketKeys: ").append(toIndentedString(bucketKeys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    turnFinishedAt: ").append(toIndentedString(turnFinishedAt)).append("\n");
    sb.append("    turnStartedAt: ").append(toIndentedString(turnStartedAt)).append("\n");
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
