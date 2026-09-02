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

/** A compliance rule along with its evaluation statistics and framework mappings. */
@JsonPropertyOrder({
  RuleBasedViewRule.JSON_PROPERTY_COMPLIANCE_FRAMEWORKS,
  RuleBasedViewRule.JSON_PROPERTY_ENABLED,
  RuleBasedViewRule.JSON_PROPERTY_ID,
  RuleBasedViewRule.JSON_PROPERTY_NAME,
  RuleBasedViewRule.JSON_PROPERTY_RESOURCE_ATTRIBUTES,
  RuleBasedViewRule.JSON_PROPERTY_RESOURCE_CATEGORY,
  RuleBasedViewRule.JSON_PROPERTY_RESOURCE_TYPE,
  RuleBasedViewRule.JSON_PROPERTY_STATS,
  RuleBasedViewRule.JSON_PROPERTY_STATUS,
  RuleBasedViewRule.JSON_PROPERTY_TAGS,
  RuleBasedViewRule.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleBasedViewRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLIANCE_FRAMEWORKS = "compliance_frameworks";
  private List<RuleBasedViewComplianceFramework> complianceFrameworks = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOURCE_ATTRIBUTES = "resourceAttributes";
  private List<String> resourceAttributes = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOURCE_CATEGORY = "resourceCategory";
  private String resourceCategory;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private String resourceType;

  public static final String JSON_PROPERTY_STATS = "stats";
  private RuleBasedViewRuleStats stats;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private RuleBasedViewRuleCategory type;

  public RuleBasedViewRule() {}

  @JsonCreator
  public RuleBasedViewRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLIANCE_FRAMEWORKS)
          List<RuleBasedViewComplianceFramework> complianceFrameworks,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_ATTRIBUTES)
          List<String> resourceAttributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_CATEGORY)
          String resourceCategory,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE) String resourceType,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATS) RuleBasedViewRuleStats stats,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) RuleBasedViewRuleCategory type) {
    this.complianceFrameworks = complianceFrameworks;
    for (RuleBasedViewComplianceFramework item : complianceFrameworks) {
      this.unparsed |= item.unparsed;
    }
    this.enabled = enabled;
    this.id = id;
    this.name = name;
    this.resourceAttributes = resourceAttributes;
    this.resourceCategory = resourceCategory;
    this.resourceType = resourceType;
    this.stats = stats;
    this.unparsed |= stats.unparsed;
    this.status = status;
    this.tags = tags;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public RuleBasedViewRule complianceFrameworks(
      List<RuleBasedViewComplianceFramework> complianceFrameworks) {
    this.complianceFrameworks = complianceFrameworks;
    for (RuleBasedViewComplianceFramework item : complianceFrameworks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RuleBasedViewRule addComplianceFrameworksItem(
      RuleBasedViewComplianceFramework complianceFrameworksItem) {
    this.complianceFrameworks.add(complianceFrameworksItem);
    this.unparsed |= complianceFrameworksItem.unparsed;
    return this;
  }

  /**
   * List of compliance framework mappings associated with the rule.
   *
   * @return complianceFrameworks
   */
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_FRAMEWORKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<RuleBasedViewComplianceFramework> getComplianceFrameworks() {
    return complianceFrameworks;
  }

  public void setComplianceFrameworks(List<RuleBasedViewComplianceFramework> complianceFrameworks) {
    this.complianceFrameworks = complianceFrameworks;
    if (complianceFrameworks != null) {
      for (RuleBasedViewComplianceFramework item : complianceFrameworks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public RuleBasedViewRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public RuleBasedViewRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the rule.
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

  public RuleBasedViewRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the rule.
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

  public RuleBasedViewRule resourceAttributes(List<String> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
    return this;
  }

  public RuleBasedViewRule addResourceAttributesItem(String resourceAttributesItem) {
    this.resourceAttributes.add(resourceAttributesItem);
    return this;
  }

  /**
   * List of resource attribute names exposed by the rule.
   *
   * @return resourceAttributes
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getResourceAttributes() {
    return resourceAttributes;
  }

  public void setResourceAttributes(List<String> resourceAttributes) {
    this.resourceAttributes = resourceAttributes;
  }

  public RuleBasedViewRule resourceCategory(String resourceCategory) {
    this.resourceCategory = resourceCategory;
    return this;
  }

  /**
   * Resource category targeted by the rule.
   *
   * @return resourceCategory
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceCategory() {
    return resourceCategory;
  }

  public void setResourceCategory(String resourceCategory) {
    this.resourceCategory = resourceCategory;
  }

  public RuleBasedViewRule resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Resource type targeted by the rule.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public RuleBasedViewRule stats(RuleBasedViewRuleStats stats) {
    this.stats = stats;
    this.unparsed |= stats.unparsed;
    return this;
  }

  /**
   * Counts of findings for the rule, grouped by their evaluation status.
   *
   * @return stats
   */
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleBasedViewRuleStats getStats() {
    return stats;
  }

  public void setStats(RuleBasedViewRuleStats stats) {
    this.stats = stats;
    if (stats != null) {
      this.unparsed |= stats.unparsed;
    }
  }

  public RuleBasedViewRule status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Severity associated with the rule (for example, <code>info</code>, <code>low</code>, <code>
   * medium</code>, <code>high</code>, or <code>critical</code>).
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

  public RuleBasedViewRule tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RuleBasedViewRule addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags attached to the rule.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public RuleBasedViewRule type(RuleBasedViewRuleCategory type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The category of the security rule.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RuleBasedViewRuleCategory getType() {
    return type;
  }

  public void setType(RuleBasedViewRuleCategory type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return RuleBasedViewRule
   */
  @JsonAnySetter
  public RuleBasedViewRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RuleBasedViewRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleBasedViewRule ruleBasedViewRule = (RuleBasedViewRule) o;
    return Objects.equals(this.complianceFrameworks, ruleBasedViewRule.complianceFrameworks)
        && Objects.equals(this.enabled, ruleBasedViewRule.enabled)
        && Objects.equals(this.id, ruleBasedViewRule.id)
        && Objects.equals(this.name, ruleBasedViewRule.name)
        && Objects.equals(this.resourceAttributes, ruleBasedViewRule.resourceAttributes)
        && Objects.equals(this.resourceCategory, ruleBasedViewRule.resourceCategory)
        && Objects.equals(this.resourceType, ruleBasedViewRule.resourceType)
        && Objects.equals(this.stats, ruleBasedViewRule.stats)
        && Objects.equals(this.status, ruleBasedViewRule.status)
        && Objects.equals(this.tags, ruleBasedViewRule.tags)
        && Objects.equals(this.type, ruleBasedViewRule.type)
        && Objects.equals(this.additionalProperties, ruleBasedViewRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        complianceFrameworks,
        enabled,
        id,
        name,
        resourceAttributes,
        resourceCategory,
        resourceType,
        stats,
        status,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleBasedViewRule {\n");
    sb.append("    complianceFrameworks: ")
        .append(toIndentedString(complianceFrameworks))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceAttributes: ").append(toIndentedString(resourceAttributes)).append("\n");
    sb.append("    resourceCategory: ").append(toIndentedString(resourceCategory)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
