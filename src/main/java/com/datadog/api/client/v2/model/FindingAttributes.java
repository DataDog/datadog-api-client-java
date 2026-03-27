/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The JSON:API attributes of the finding.</p>
 */
@JsonPropertyOrder({
  FindingAttributes.JSON_PROPERTY_DATADOG_LINK,
  FindingAttributes.JSON_PROPERTY_DESCRIPTION,
  FindingAttributes.JSON_PROPERTY_EVALUATION,
  FindingAttributes.JSON_PROPERTY_EVALUATION_CHANGED_AT,
  FindingAttributes.JSON_PROPERTY_EXTERNAL_ID,
  FindingAttributes.JSON_PROPERTY_MUTE,
  FindingAttributes.JSON_PROPERTY_RESOURCE,
  FindingAttributes.JSON_PROPERTY_RESOURCE_DISCOVERY_DATE,
  FindingAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  FindingAttributes.JSON_PROPERTY_RULE,
  FindingAttributes.JSON_PROPERTY_STATUS,
  FindingAttributes.JSON_PROPERTY_TAGS,
  FindingAttributes.JSON_PROPERTY_VULNERABILITY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATADOG_LINK = "datadog_link";
  private String datadogLink;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EVALUATION = "evaluation";
  private FindingEvaluation evaluation;

  public static final String JSON_PROPERTY_EVALUATION_CHANGED_AT = "evaluation_changed_at";
  private Long evaluationChangedAt;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_MUTE = "mute";
  private FindingMute mute;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_RESOURCE_DISCOVERY_DATE = "resource_discovery_date";
  private Long resourceDiscoveryDate;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private String resourceType;

  public static final String JSON_PROPERTY_RULE = "rule";
  private FindingRule rule;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FindingStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VULNERABILITY_TYPE = "vulnerability_type";
  private FindingVulnerabilityType vulnerabilityType;

  public FindingAttributes datadogLink(String datadogLink) {
    this.datadogLink = datadogLink;
    return this;
  }

  /**
   * <p>The Datadog relative link for this finding.</p>
   * @return datadogLink
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATADOG_LINK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDatadogLink() {
        return datadogLink;
      }
  public void setDatadogLink(String datadogLink) {
    this.datadogLink = datadogLink;
  }
  public FindingAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>The description and remediation steps for this finding.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public FindingAttributes evaluation(FindingEvaluation evaluation) {
    this.evaluation = evaluation;
    this.unparsed |= !evaluation.isValid();
    return this;
  }

  /**
   * <p>The evaluation of the finding.</p>
   * @return evaluation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The date on which the evaluation for this finding changed (Unix ms).</p>
   * minimum: 1
   * @return evaluationChangedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATION_CHANGED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEvaluationChangedAt() {
        return evaluationChangedAt;
      }
  public void setEvaluationChangedAt(Long evaluationChangedAt) {
    this.evaluationChangedAt = evaluationChangedAt;
  }
  public FindingAttributes externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * <p>The cloud-based ID for the resource related to the finding.</p>
   * @return externalId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getExternalId() {
        return externalId;
      }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
  public FindingAttributes mute(FindingMute mute) {
    this.mute = mute;
    this.unparsed |= mute.unparsed;
    return this;
  }

  /**
   * <p>Information about the mute status of this finding.</p>
   * @return mute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The resource name of this finding.</p>
   * @return resource
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The date on which the resource was discovered (Unix ms).</p>
   * minimum: 1
   * @return resourceDiscoveryDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_DISCOVERY_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The resource type of this finding.</p>
   * @return resourceType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The rule that triggered this finding.</p>
   * @return rule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The status of the finding.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The tags associated with this finding.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public FindingAttributes vulnerabilityType(FindingVulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
    this.unparsed |= !vulnerabilityType.isValid();
    return this;
  }

  /**
   * <p>The vulnerability type of the finding.</p>
   * @return vulnerabilityType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VULNERABILITY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FindingVulnerabilityType getVulnerabilityType() {
        return vulnerabilityType;
      }
  public void setVulnerabilityType(FindingVulnerabilityType vulnerabilityType) {
    if (!vulnerabilityType.isValid()) {
        this.unparsed = true;
    }
    this.vulnerabilityType = vulnerabilityType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FindingAttributes
   */
  @JsonAnySetter
  public FindingAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this FindingAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingAttributes findingAttributes = (FindingAttributes) o;
    return Objects.equals(this.datadogLink, findingAttributes.datadogLink) && Objects.equals(this.description, findingAttributes.description) && Objects.equals(this.evaluation, findingAttributes.evaluation) && Objects.equals(this.evaluationChangedAt, findingAttributes.evaluationChangedAt) && Objects.equals(this.externalId, findingAttributes.externalId) && Objects.equals(this.mute, findingAttributes.mute) && Objects.equals(this.resource, findingAttributes.resource) && Objects.equals(this.resourceDiscoveryDate, findingAttributes.resourceDiscoveryDate) && Objects.equals(this.resourceType, findingAttributes.resourceType) && Objects.equals(this.rule, findingAttributes.rule) && Objects.equals(this.status, findingAttributes.status) && Objects.equals(this.tags, findingAttributes.tags) && Objects.equals(this.vulnerabilityType, findingAttributes.vulnerabilityType) && Objects.equals(this.additionalProperties, findingAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(datadogLink,description,evaluation,evaluationChangedAt,externalId,mute,resource,resourceDiscoveryDate,resourceType,rule,status,tags,vulnerabilityType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingAttributes {\n");
    sb.append("    datadogLink: ").append(toIndentedString(datadogLink)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    evaluationChangedAt: ").append(toIndentedString(evaluationChangedAt)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceDiscoveryDate: ").append(toIndentedString(resourceDiscoveryDate)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vulnerabilityType: ").append(toIndentedString(vulnerabilityType)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
