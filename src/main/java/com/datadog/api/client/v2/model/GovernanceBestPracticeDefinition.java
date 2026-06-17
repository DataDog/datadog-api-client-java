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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The best practice associated with an insight. Populated with the first active best practice
 * matched to the insight; <code>null</code> when no best practice is attached.
 */
@JsonPropertyOrder({
  GovernanceBestPracticeDefinition.JSON_PROPERTY_CATEGORY,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_DEEP_LINK,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_DESCRIPTION,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_DETECTION_TYPE,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_ID,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_IMPACT,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_IMPACT_HINT,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_PERMISSIONS,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_STATUS,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_SUMMARY,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_TITLE,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_TRIGGER_CONDITION,
  GovernanceBestPracticeDefinition.JSON_PROPERTY_TRIGGER_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceBestPracticeDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_DEEP_LINK = "deep_link";
  private String deepLink;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DETECTION_TYPE = "detection_type";
  private JsonNullable<String> detectionType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private String impact;

  public static final String JSON_PROPERTY_IMPACT_HINT = "impact_hint";
  private Long impactHint;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<String> permissions = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TRIGGER_CONDITION = "trigger_condition";
  private String triggerCondition;

  public static final String JSON_PROPERTY_TRIGGER_TYPE = "trigger_type";
  private String triggerType;

  public GovernanceBestPracticeDefinition() {}

  @JsonCreator
  public GovernanceBestPracticeDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEEP_LINK) String deepLink,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT) String impact,
      @JsonProperty(required = true, value = JSON_PROPERTY_IMPACT_HINT) Long impactHint,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERMISSIONS) List<String> permissions,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUMMARY) String summary,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGER_CONDITION)
          String triggerCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIGGER_TYPE) String triggerType) {
    this.category = category;
    this.deepLink = deepLink;
    this.description = description;
    this.id = id;
    this.impact = impact;
    this.impactHint = impactHint;
    this.permissions = permissions;
    this.status = status;
    this.summary = summary;
    this.title = title;
    this.triggerCondition = triggerCondition;
    this.triggerType = triggerType;
  }

  public GovernanceBestPracticeDefinition category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The value driver the best practice is grouped under, such as <code>access_governance</code>,
   * <code>security</code>, <code>compliance</code>, or <code>operational_hygiene</code>.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GovernanceBestPracticeDefinition deepLink(String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  /**
   * A relative link to the configuration page where the best practice can be acted upon.
   *
   * @return deepLink
   */
  @JsonProperty(JSON_PROPERTY_DEEP_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDeepLink() {
    return deepLink;
  }

  public void setDeepLink(String deepLink) {
    this.deepLink = deepLink;
  }

  public GovernanceBestPracticeDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The full rationale and guidance for the best practice.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GovernanceBestPracticeDefinition detectionType(String detectionType) {
    this.detectionType = JsonNullable.<String>of(detectionType);
    return this;
  }

  /**
   * An optional association to a control's detection type. <code>null</code> when not associated
   * with a control.
   *
   * @return detectionType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDetectionType() {
    return detectionType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDetectionType_JsonNullable() {
    return detectionType;
  }

  @JsonProperty(JSON_PROPERTY_DETECTION_TYPE)
  public void setDetectionType_JsonNullable(JsonNullable<String> detectionType) {
    this.detectionType = detectionType;
  }

  public void setDetectionType(String detectionType) {
    this.detectionType = JsonNullable.<String>of(detectionType);
  }

  public GovernanceBestPracticeDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the best practice.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GovernanceBestPracticeDefinition impact(String impact) {
    this.impact = impact;
    return this;
  }

  /**
   * The expected impact of following the best practice.
   *
   * @return impact
   */
  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public GovernanceBestPracticeDefinition impactHint(Long impactHint) {
    this.impactHint = impactHint;
    return this;
  }

  /**
   * A priority hint for ordering best practices by expected impact. Lower values indicate higher
   * priority.
   *
   * @return impactHint
   */
  @JsonProperty(JSON_PROPERTY_IMPACT_HINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getImpactHint() {
    return impactHint;
  }

  public void setImpactHint(Long impactHint) {
    this.impactHint = impactHint;
  }

  public GovernanceBestPracticeDefinition permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public GovernanceBestPracticeDefinition addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The permissions required for the user to act on the best practice.
   *
   * @return permissions
   */
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public GovernanceBestPracticeDefinition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the best practice is currently <code>active</code> or <code>deprecated</code>.
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

  public GovernanceBestPracticeDefinition summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * A one-line explanation of why this best practice matters.
   *
   * @return summary
   */
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public GovernanceBestPracticeDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable name for the best practice.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GovernanceBestPracticeDefinition triggerCondition(String triggerCondition) {
    this.triggerCondition = triggerCondition;
    return this;
  }

  /**
   * The condition that surfaces the best practice. For an <code>insight</code> trigger, the insight
   * slug; for a <code>static</code> trigger, a descriptive condition key.
   *
   * @return triggerCondition
   */
  @JsonProperty(JSON_PROPERTY_TRIGGER_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTriggerCondition() {
    return triggerCondition;
  }

  public void setTriggerCondition(String triggerCondition) {
    this.triggerCondition = triggerCondition;
  }

  public GovernanceBestPracticeDefinition triggerType(String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * How the best practice is surfaced. <code>insight</code> ties it to an insight; <code>static
   * </code> surfaces it unless its condition is met.
   *
   * @return triggerType
   */
  @JsonProperty(JSON_PROPERTY_TRIGGER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
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
   * @return GovernanceBestPracticeDefinition
   */
  @JsonAnySetter
  public GovernanceBestPracticeDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceBestPracticeDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceBestPracticeDefinition governanceBestPracticeDefinition =
        (GovernanceBestPracticeDefinition) o;
    return Objects.equals(this.category, governanceBestPracticeDefinition.category)
        && Objects.equals(this.deepLink, governanceBestPracticeDefinition.deepLink)
        && Objects.equals(this.description, governanceBestPracticeDefinition.description)
        && Objects.equals(this.detectionType, governanceBestPracticeDefinition.detectionType)
        && Objects.equals(this.id, governanceBestPracticeDefinition.id)
        && Objects.equals(this.impact, governanceBestPracticeDefinition.impact)
        && Objects.equals(this.impactHint, governanceBestPracticeDefinition.impactHint)
        && Objects.equals(this.permissions, governanceBestPracticeDefinition.permissions)
        && Objects.equals(this.status, governanceBestPracticeDefinition.status)
        && Objects.equals(this.summary, governanceBestPracticeDefinition.summary)
        && Objects.equals(this.title, governanceBestPracticeDefinition.title)
        && Objects.equals(this.triggerCondition, governanceBestPracticeDefinition.triggerCondition)
        && Objects.equals(this.triggerType, governanceBestPracticeDefinition.triggerType)
        && Objects.equals(
            this.additionalProperties, governanceBestPracticeDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        deepLink,
        description,
        detectionType,
        id,
        impact,
        impactHint,
        permissions,
        status,
        summary,
        title,
        triggerCondition,
        triggerType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceBestPracticeDefinition {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detectionType: ").append(toIndentedString(detectionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    impactHint: ").append(toIndentedString(impactHint)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    triggerCondition: ").append(toIndentedString(triggerCondition)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
