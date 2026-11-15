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

/**
 * Attributes to change. Attributes left out keep their value. <code>filters</code> and <code>
 * settings</code> replace the stored list and map when sent.
 */
@JsonPropertyOrder({
  CostRecommendationCustomRuleUpdateAttributes.JSON_PROPERTY_ENABLED,
  CostRecommendationCustomRuleUpdateAttributes.JSON_PROPERTY_FILTERS,
  CostRecommendationCustomRuleUpdateAttributes.JSON_PROPERTY_NAME,
  CostRecommendationCustomRuleUpdateAttributes.JSON_PROPERTY_NOTES,
  CostRecommendationCustomRuleUpdateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationCustomRuleUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<CostRecommendationCustomRuleFilter> filters = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Map<String, Double> settings = null;

  public CostRecommendationCustomRuleUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the rule is applied when recommendations are generated.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CostRecommendationCustomRuleUpdateAttributes filters(
      List<CostRecommendationCustomRuleFilter> filters) {
    this.filters = filters;
    if (filters != null) {
      for (CostRecommendationCustomRuleFilter item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public CostRecommendationCustomRuleUpdateAttributes addFiltersItem(
      CostRecommendationCustomRuleFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  public CostRecommendationCustomRuleUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule.
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

  public CostRecommendationCustomRuleUpdateAttributes notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form notes, such as the reason for the customization.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CostRecommendationCustomRuleUpdateAttributes settings(Map<String, Double> settings) {
    this.settings = settings;
    return this;
  }

  public CostRecommendationCustomRuleUpdateAttributes putSettingsItem(
      String key, Double settingsItem) {
    if (this.settings == null) {
      this.settings = new HashMap<>();
    }
    this.settings.put(key, settingsItem);
    return this;
  }

  /**
   * Setting overrides, keyed by setting name. Settings left out keep the recommender default. The
   * accepted settings and their ranges depend on the recommender.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return CostRecommendationCustomRuleUpdateAttributes
   */
  @JsonAnySetter
  public CostRecommendationCustomRuleUpdateAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this CostRecommendationCustomRuleUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationCustomRuleUpdateAttributes costRecommendationCustomRuleUpdateAttributes =
        (CostRecommendationCustomRuleUpdateAttributes) o;
    return Objects.equals(this.enabled, costRecommendationCustomRuleUpdateAttributes.enabled)
        && Objects.equals(this.filters, costRecommendationCustomRuleUpdateAttributes.filters)
        && Objects.equals(this.name, costRecommendationCustomRuleUpdateAttributes.name)
        && Objects.equals(this.notes, costRecommendationCustomRuleUpdateAttributes.notes)
        && Objects.equals(this.settings, costRecommendationCustomRuleUpdateAttributes.settings)
        && Objects.equals(
            this.additionalProperties,
            costRecommendationCustomRuleUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, filters, name, notes, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationCustomRuleUpdateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
