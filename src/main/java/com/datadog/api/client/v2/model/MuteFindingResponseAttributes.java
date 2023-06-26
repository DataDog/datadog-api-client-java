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

/** The JSON:API attributes of the finding. */
@JsonPropertyOrder({
  MuteFindingResponseAttributes.JSON_PROPERTY_EVALUATION,
  MuteFindingResponseAttributes.JSON_PROPERTY_EVALUATION_CHANGED_AT,
  MuteFindingResponseAttributes.JSON_PROPERTY_MUTE,
  MuteFindingResponseAttributes.JSON_PROPERTY_RESOURCE,
  MuteFindingResponseAttributes.JSON_PROPERTY_RESOURCE_DISCOVERY_DATE,
  MuteFindingResponseAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  MuteFindingResponseAttributes.JSON_PROPERTY_RULE,
  MuteFindingResponseAttributes.JSON_PROPERTY_STATUS,
  MuteFindingResponseAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MuteFindingResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVALUATION = "evaluation";
  private FindingEvaluation evaluation;

  public static final String JSON_PROPERTY_EVALUATION_CHANGED_AT = "evaluation_changed_at";
  private Long evaluationChangedAt;

  public static final String JSON_PROPERTY_MUTE = "mute";
  private MuteFindingResponseProperties mute = null;

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

  public MuteFindingResponseAttributes evaluation(FindingEvaluation evaluation) {
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

  public MuteFindingResponseAttributes evaluationChangedAt(Long evaluationChangedAt) {
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

  public MuteFindingResponseAttributes mute(MuteFindingResponseProperties mute) {
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
  public MuteFindingResponseProperties getMute() {
    return mute;
  }

  public void setMute(MuteFindingResponseProperties mute) {
    this.mute = mute;
  }

  public MuteFindingResponseAttributes resource(String resource) {
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

  public MuteFindingResponseAttributes resourceDiscoveryDate(Long resourceDiscoveryDate) {
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

  public MuteFindingResponseAttributes resourceType(String resourceType) {
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

  public MuteFindingResponseAttributes rule(FindingRule rule) {
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

  public MuteFindingResponseAttributes status(FindingStatus status) {
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

  public MuteFindingResponseAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MuteFindingResponseAttributes addTagsItem(String tagsItem) {
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
   * @return MuteFindingResponseAttributes
   */
  @JsonAnySetter
  public MuteFindingResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MuteFindingResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuteFindingResponseAttributes muteFindingResponseAttributes = (MuteFindingResponseAttributes) o;
    return Objects.equals(this.evaluation, muteFindingResponseAttributes.evaluation)
        && Objects.equals(
            this.evaluationChangedAt, muteFindingResponseAttributes.evaluationChangedAt)
        && Objects.equals(this.mute, muteFindingResponseAttributes.mute)
        && Objects.equals(this.resource, muteFindingResponseAttributes.resource)
        && Objects.equals(
            this.resourceDiscoveryDate, muteFindingResponseAttributes.resourceDiscoveryDate)
        && Objects.equals(this.resourceType, muteFindingResponseAttributes.resourceType)
        && Objects.equals(this.rule, muteFindingResponseAttributes.rule)
        && Objects.equals(this.status, muteFindingResponseAttributes.status)
        && Objects.equals(this.tags, muteFindingResponseAttributes.tags)
        && Objects.equals(
            this.additionalProperties, muteFindingResponseAttributes.additionalProperties);
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
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuteFindingResponseAttributes {\n");
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
