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

/** Attributes of a custom recommendation rule. */
@JsonPropertyOrder({
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_CLOUD_PROVIDER,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_CREATED_AT,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_CREATED_BY,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_ENABLED,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_FILTERS,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_MODIFIED_BY,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_NAME,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_NOTES,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_PRIORITY,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_RECOMMENDER_ID,
  CostRecommendationCustomRuleAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationCustomRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<CostRecommendationCustomRuleFilter> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_RECOMMENDER_ID = "recommender_id";
  private String recommenderId;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Double> settings = new HashMap<String, Double>();

  public CostRecommendationCustomRuleAttributes() {}

  @JsonCreator
  public CostRecommendationCustomRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD_PROVIDER) String cloudProvider,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<CostRecommendationCustomRuleFilter> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTES) String notes,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY) Long priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_RECOMMENDER_ID) String recommenderId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTINGS) Map<String, Double> settings) {
    this.cloudProvider = cloudProvider;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.enabled = enabled;
    this.filters = filters;
    for (CostRecommendationCustomRuleFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
    this.name = name;
    this.notes = notes;
    this.priority = priority;
    this.recommenderId = recommenderId;
    this.settings = settings;
  }

  public CostRecommendationCustomRuleAttributes cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * The cloud provider of the recommender, such as <code>aws</code>, <code>azure</code>, or <code>
   * gcp</code>.
   *
   * @return cloudProvider
   */
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }

  public CostRecommendationCustomRuleAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the rule was created.
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

  public CostRecommendationCustomRuleAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the rule.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CostRecommendationCustomRuleAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the rule is applied when recommendations are generated.
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

  public CostRecommendationCustomRuleAttributes filters(
      List<CostRecommendationCustomRuleFilter> filters) {
    this.filters = filters;
    for (CostRecommendationCustomRuleFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CostRecommendationCustomRuleAttributes addFiltersItem(
      CostRecommendationCustomRuleFilter filtersItem) {
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * Tag filters that select the resources the rule applies to. An empty list selects every
   * resource.
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CostRecommendationCustomRuleFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<CostRecommendationCustomRuleFilter> filters) {
    this.filters = filters;
    if (filters != null) {
      for (CostRecommendationCustomRuleFilter item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CostRecommendationCustomRuleAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * When the rule was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CostRecommendationCustomRuleAttributes modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The UUID of the user who last modified the rule.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public CostRecommendationCustomRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule.
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

  public CostRecommendationCustomRuleAttributes notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form notes, such as the reason for the customization.
   *
   * @return notes
   */
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CostRecommendationCustomRuleAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The order in which the rules of a recommender are evaluated, lowest first. It is assigned when
   * the rule is created.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public CostRecommendationCustomRuleAttributes recommenderId(String recommenderId) {
    this.recommenderId = recommenderId;
    return this;
  }

  /**
   * The recommender the rule customizes.
   *
   * @return recommenderId
   */
  @JsonProperty(JSON_PROPERTY_RECOMMENDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRecommenderId() {
    return recommenderId;
  }

  public void setRecommenderId(String recommenderId) {
    this.recommenderId = recommenderId;
  }

  public CostRecommendationCustomRuleAttributes settings(Map<String, Double> settings) {
    this.settings = settings;
    return this;
  }

  public CostRecommendationCustomRuleAttributes putSettingsItem(String key, Double settingsItem) {
    this.settings.put(key, settingsItem);
    return this;
  }

  /**
   * Setting overrides, keyed by setting name. Settings left out keep the recommender default. The
   * accepted settings and their ranges depend on the recommender.
   *
   * @return settings
   */
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Double> getSettings() {
    return settings;
  }

  public void setSettings(Map<String, Double> settings) {
    this.settings = settings;
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
   * @return CostRecommendationCustomRuleAttributes
   */
  @JsonAnySetter
  public CostRecommendationCustomRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostRecommendationCustomRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationCustomRuleAttributes costRecommendationCustomRuleAttributes =
        (CostRecommendationCustomRuleAttributes) o;
    return Objects.equals(this.cloudProvider, costRecommendationCustomRuleAttributes.cloudProvider)
        && Objects.equals(this.createdAt, costRecommendationCustomRuleAttributes.createdAt)
        && Objects.equals(this.createdBy, costRecommendationCustomRuleAttributes.createdBy)
        && Objects.equals(this.enabled, costRecommendationCustomRuleAttributes.enabled)
        && Objects.equals(this.filters, costRecommendationCustomRuleAttributes.filters)
        && Objects.equals(this.modifiedAt, costRecommendationCustomRuleAttributes.modifiedAt)
        && Objects.equals(this.modifiedBy, costRecommendationCustomRuleAttributes.modifiedBy)
        && Objects.equals(this.name, costRecommendationCustomRuleAttributes.name)
        && Objects.equals(this.notes, costRecommendationCustomRuleAttributes.notes)
        && Objects.equals(this.priority, costRecommendationCustomRuleAttributes.priority)
        && Objects.equals(this.recommenderId, costRecommendationCustomRuleAttributes.recommenderId)
        && Objects.equals(this.settings, costRecommendationCustomRuleAttributes.settings)
        && Objects.equals(
            this.additionalProperties, costRecommendationCustomRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cloudProvider,
        createdAt,
        createdBy,
        enabled,
        filters,
        modifiedAt,
        modifiedBy,
        name,
        notes,
        priority,
        recommenderId,
        settings,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationCustomRuleAttributes {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recommenderId: ").append(toIndentedString(recommenderId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
