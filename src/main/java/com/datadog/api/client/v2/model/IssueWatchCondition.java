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

/**
 * Condition that triggers the watch action. The fields that are set depend on <code>kind</code>:
 * <code>OCCURRENCES</code> uses <code>threshold</code>, <code>CARDINALITY</code> uses <code>
 * threshold</code> and <code>projection</code>, <code>ELAPSED_TIME</code> uses <code>duration
 * </code>, and <code>ANY</code> and <code>ALL</code> use <code>operands</code>.
 */
@JsonPropertyOrder({
  IssueWatchCondition.JSON_PROPERTY_DURATION,
  IssueWatchCondition.JSON_PROPERTY_KIND,
  IssueWatchCondition.JSON_PROPERTY_OPERANDS,
  IssueWatchCondition.JSON_PROPERTY_PROJECTION,
  IssueWatchCondition.JSON_PROPERTY_THRESHOLD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueWatchCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public static final String JSON_PROPERTY_KIND = "kind";
  private IssueWatchConditionKind kind;

  public static final String JSON_PROPERTY_OPERANDS = "operands";
  private List<IssueWatchCondition> operands = null;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private List<String> projection = null;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private Long threshold;

  public IssueWatchCondition() {}

  @JsonCreator
  public IssueWatchCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) IssueWatchConditionKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
  }

  public IssueWatchCondition duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Time that must elapse before the condition is met, as a Go duration string.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public IssueWatchCondition kind(IssueWatchConditionKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Kind of watch condition.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueWatchConditionKind getKind() {
    return kind;
  }

  public void setKind(IssueWatchConditionKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public IssueWatchCondition operands(List<IssueWatchCondition> operands) {
    this.operands = operands;
    if (operands != null) {
      for (IssueWatchCondition item : operands) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public IssueWatchCondition addOperandsItem(IssueWatchCondition operandsItem) {
    if (this.operands == null) {
      this.operands = new ArrayList<>();
    }
    this.operands.add(operandsItem);
    this.unparsed |= operandsItem.unparsed;
    return this;
  }

  /**
   * Nested conditions combined by <code>ANY</code> or <code>ALL</code>.
   *
   * @return operands
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueWatchCondition> getOperands() {
    return operands;
  }

  public void setOperands(List<IssueWatchCondition> operands) {
    this.operands = operands;
    if (operands != null) {
      for (IssueWatchCondition item : operands) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public IssueWatchCondition projection(List<String> projection) {
    this.projection = projection;
    return this;
  }

  public IssueWatchCondition addProjectionItem(String projectionItem) {
    if (this.projection == null) {
      this.projection = new ArrayList<>();
    }
    this.projection.add(projectionItem);
    return this;
  }

  /**
   * Attributes whose distinct values are counted for <code>CARDINALITY</code>.
   *
   * @return projection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProjection() {
    return projection;
  }

  public void setProjection(List<String> projection) {
    this.projection = projection;
  }

  public IssueWatchCondition threshold(Long threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Number of occurrences, or of distinct values for <code>CARDINALITY</code>, that triggers the
   * condition.
   *
   * @return threshold
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getThreshold() {
    return threshold;
  }

  public void setThreshold(Long threshold) {
    this.threshold = threshold;
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
   * @return IssueWatchCondition
   */
  @JsonAnySetter
  public IssueWatchCondition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueWatchCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueWatchCondition issueWatchCondition = (IssueWatchCondition) o;
    return Objects.equals(this.duration, issueWatchCondition.duration)
        && Objects.equals(this.kind, issueWatchCondition.kind)
        && Objects.equals(this.operands, issueWatchCondition.operands)
        && Objects.equals(this.projection, issueWatchCondition.projection)
        && Objects.equals(this.threshold, issueWatchCondition.threshold)
        && Objects.equals(this.additionalProperties, issueWatchCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, kind, operands, projection, threshold, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueWatchCondition {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    operands: ").append(toIndentedString(operands)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
