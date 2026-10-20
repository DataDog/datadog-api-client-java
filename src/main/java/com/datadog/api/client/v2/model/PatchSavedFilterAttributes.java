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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Fields to update. At least one of <code>name</code>, <code>description</code>, or <code>
 * targeting_rules</code> must have a non-null value. Omitted or null fields are preserved. The
 * creation type cannot be changed.
 */
@JsonPropertyOrder({
  PatchSavedFilterAttributes.JSON_PROPERTY_DESCRIPTION,
  PatchSavedFilterAttributes.JSON_PROPERTY_LAST_UPDATED_AT,
  PatchSavedFilterAttributes.JSON_PROPERTY_NAME,
  PatchSavedFilterAttributes.JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchSavedFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "last_updated_at";
  private JsonNullable<OffsetDateTime> lastUpdatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private JsonNullable<List<SavedFilterTargetingRuleRequest>> targetingRules =
      JsonNullable.<List<SavedFilterTargetingRuleRequest>>undefined();

  public PatchSavedFilterAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * The new description. Send an empty string to clear the description. If omitted or null, the
   * existing description is preserved.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public PatchSavedFilterAttributes lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<OffsetDateTime>of(lastUpdatedAt);
    return this;
  }

  /**
   * The <code>updated_at</code> value returned by a previous read, as an RFC 3339 timestamp. If it
   * differs from the stored update time, truncated to seconds, the request returns a 409 response.
   * For metadata-only updates, this check does not prevent all concurrent writes. This field alone
   * does not constitute an update.
   *
   * @return lastUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastUpdatedAt_JsonNullable() {
    return lastUpdatedAt;
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  public void setLastUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<OffsetDateTime>of(lastUpdatedAt);
  }

  public PatchSavedFilterAttributes name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * The new name of the saved filter. Must not be empty.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public PatchSavedFilterAttributes targetingRules(
      List<SavedFilterTargetingRuleRequest> targetingRules) {
    this.targetingRules = JsonNullable.<List<SavedFilterTargetingRuleRequest>>of(targetingRules);
    return this;
  }

  public PatchSavedFilterAttributes addTargetingRulesItem(
      SavedFilterTargetingRuleRequest targetingRulesItem) {
    if (this.targetingRules == null || !this.targetingRules.isPresent()) {
      this.targetingRules =
          JsonNullable.<List<SavedFilterTargetingRuleRequest>>of(new ArrayList<>());
    }
    try {
      this.targetingRules.get().add(targetingRulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The complete replacement targeting rules, combined with OR. Conditions within each rule are
   * combined with AND. Replaces all existing rules. Values are not appended. Must contain at least
   * one rule. Saved filters cannot reference other saved filters.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<SavedFilterTargetingRuleRequest> getTargetingRules() {
    return targetingRules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SavedFilterTargetingRuleRequest>> getTargetingRules_JsonNullable() {
    return targetingRules;
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  public void setTargetingRules_JsonNullable(
      JsonNullable<List<SavedFilterTargetingRuleRequest>> targetingRules) {
    this.targetingRules = targetingRules;
  }

  public void setTargetingRules(List<SavedFilterTargetingRuleRequest> targetingRules) {
    this.targetingRules = JsonNullable.<List<SavedFilterTargetingRuleRequest>>of(targetingRules);
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
   * @return PatchSavedFilterAttributes
   */
  @JsonAnySetter
  public PatchSavedFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PatchSavedFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchSavedFilterAttributes patchSavedFilterAttributes = (PatchSavedFilterAttributes) o;
    return Objects.equals(this.description, patchSavedFilterAttributes.description)
        && Objects.equals(this.lastUpdatedAt, patchSavedFilterAttributes.lastUpdatedAt)
        && Objects.equals(this.name, patchSavedFilterAttributes.name)
        && Objects.equals(this.targetingRules, patchSavedFilterAttributes.targetingRules)
        && Objects.equals(
            this.additionalProperties, patchSavedFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lastUpdatedAt, name, targetingRules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchSavedFilterAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
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
