/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The JSON:API attributes of the finding. */
@JsonPropertyOrder({
  FindingAttributes.JSON_PROPERTY_EVALUATION,
  FindingAttributes.JSON_PROPERTY_EVALUATION_CHANGED_AT,
  FindingAttributes.JSON_PROPERTY_MUTE,
  FindingAttributes.JSON_PROPERTY_RESOURCE,
  FindingAttributes.JSON_PROPERTY_RESOURCE_DISCOVERY_DATE,
  FindingAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  FindingAttributes.JSON_PROPERTY_RULE,
  FindingAttributes.JSON_PROPERTY_STATUS,
  FindingAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVALUATION = "evaluation";
  private FindingEvaluation evaluation;

  public static final String JSON_PROPERTY_EVALUATION_CHANGED_AT = "evaluation_changed_at";
  private Long evaluationChangedAt;

  public static final String JSON_PROPERTY_MUTE = "mute";
  private FindingMute mute = null;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_RESOURCE_DISCOVERY_DATE = "resource_discovery_date";
  private Long resourceDiscoveryDate;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_RULE = "rule";
  private FindingRule rule = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FindingStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public FindingAttributes evaluation(FindingEvaluation evaluation) {
    this.evaluation = evaluation;
    this.unparsed |= !evaluation.isValid();
    return this;
  }

  /**
   * The evaluation of the finding.
   *
   * @return evaluation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingEvaluation getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(FindingEvaluation evaluation) {
    if (!evaluation.isValid()) {
      this.unparsed = true;
    }
    this.evaluation = evaluation;
  }

  public FindingAttributes evaluationChangedAt(Long evaluationChangedAt) {
    this.evaluationChangedAt = evaluationChangedAt;
    return this;
  }

  /**
   * The date on which the evaluation for this finding changed (Unix ms). minimum: 1
   *
   * @return evaluationChangedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_CHANGED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEvaluationChangedAt() {
    return evaluationChangedAt;
  }

  public void setEvaluationChangedAt(Long evaluationChangedAt) {
    this.evaluationChangedAt = evaluationChangedAt;
  }

  public FindingAttributes mute(FindingMute mute) {
    this.mute = mute;
    this.unparsed |= mute.unparsed;
    return this;
  }

  /**
   * Information about the mute status of this finding.
   *
   * @return mute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingMute getMute() {
    return mute;
  }

  public void setMute(FindingMute mute) {
    this.mute = mute;
  }

  public FindingAttributes resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The resource name of this finding.
   *
   * @return resource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public FindingAttributes resourceDiscoveryDate(Long resourceDiscoveryDate) {
    this.resourceDiscoveryDate = resourceDiscoveryDate;
    return this;
  }

  /**
   * The date on which the resource was discovered (Unix ms). minimum: 1
   *
   * @return resourceDiscoveryDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_DISCOVERY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getResourceDiscoveryDate() {
    return resourceDiscoveryDate;
  }

  public void setResourceDiscoveryDate(Long resourceDiscoveryDate) {
    this.resourceDiscoveryDate = resourceDiscoveryDate;
  }

  public FindingAttributes resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The resource type of this finding.
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public FindingAttributes rule(FindingRule rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * The rule that triggered this finding.
   *
   * @return rule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingRule getRule() {
    return rule;
  }

  public void setRule(FindingRule rule) {
    this.rule = rule;
  }

  public FindingAttributes status(FindingStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the finding.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingStatus getStatus() {
    return status;
  }

  public void setStatus(FindingStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public FindingAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FindingAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The tags associated with this finding.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this FindingAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingAttributes findingAttributes = (FindingAttributes) o;
    return Objects.equals(this.evaluation, findingAttributes.evaluation)
        && Objects.equals(this.evaluationChangedAt, findingAttributes.evaluationChangedAt)
        && Objects.equals(this.mute, findingAttributes.mute)
        && Objects.equals(this.resource, findingAttributes.resource)
        && Objects.equals(this.resourceDiscoveryDate, findingAttributes.resourceDiscoveryDate)
        && Objects.equals(this.resourceType, findingAttributes.resourceType)
        && Objects.equals(this.rule, findingAttributes.rule)
        && Objects.equals(this.status, findingAttributes.status)
        && Objects.equals(this.tags, findingAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        evaluation,
        evaluationChangedAt,
        mute,
        resource,
        resourceDiscoveryDate,
        resourceType,
        rule,
        status,
        tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingAttributes {\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    evaluationChangedAt: ")
        .append(toIndentedString(evaluationChangedAt))
        .append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceDiscoveryDate: ")
        .append(toIndentedString(resourceDiscoveryDate))
        .append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
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
