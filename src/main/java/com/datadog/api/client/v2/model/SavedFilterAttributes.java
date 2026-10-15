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

/** Saved filter details, including the full targeting rules and conditions. */
@JsonPropertyOrder({
  SavedFilterAttributes.JSON_PROPERTY_ARCHIVED_AT,
  SavedFilterAttributes.JSON_PROPERTY_CREATED_AT,
  SavedFilterAttributes.JSON_PROPERTY_CREATED_BY,
  SavedFilterAttributes.JSON_PROPERTY_CREATION_TYPE,
  SavedFilterAttributes.JSON_PROPERTY_DESCRIPTION,
  SavedFilterAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  SavedFilterAttributes.JSON_PROPERTY_NAME,
  SavedFilterAttributes.JSON_PROPERTY_TARGETING_RULES,
  SavedFilterAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SavedFilterAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private OffsetDateTime archivedAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATION_TYPE = "creation_type";
  private SavedFilterCreationType creationType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<SavedFilterTargetingRule> targetingRules = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public SavedFilterAttributes() {}

  @JsonCreator
  public SavedFilterAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATION_TYPE)
          SavedFilterCreationType creationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGETING_RULES)
          List<SavedFilterTargetingRule> targetingRules,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.creationType = creationType;
    this.unparsed |= !creationType.isValid();
    this.name = name;
    this.targetingRules = targetingRules;
    for (SavedFilterTargetingRule item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
  }

  public SavedFilterAttributes archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * The time the saved filter was archived. Omitted when the filter is not archived.
   *
   * @return archivedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }

  public SavedFilterAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the saved filter was created.
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

  public SavedFilterAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user who created the saved filter.
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

  public SavedFilterAttributes creationType(SavedFilterCreationType creationType) {
    this.creationType = creationType;
    this.unparsed |= !creationType.isValid();
    return this;
  }

  /**
   * How the saved filter was authored. RULES indicates rule-based authoring and LIST indicates list
   * import. Both types return targeting rules and conditions.
   *
   * @return creationType
   */
  @JsonProperty(JSON_PROPERTY_CREATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SavedFilterCreationType getCreationType() {
    return creationType;
  }

  public void setCreationType(SavedFilterCreationType creationType) {
    if (!creationType.isValid()) {
      this.unparsed = true;
    }
    this.creationType = creationType;
  }

  public SavedFilterAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the saved filter. Omitted when no description is set.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SavedFilterAttributes migrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Optional JSON metadata supplied by migration tools for tracking the source of a saved filter.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMigrationMetadata() {
    return migrationMetadata;
  }

  public void setMigrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public SavedFilterAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the saved filter.
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

  public SavedFilterAttributes targetingRules(List<SavedFilterTargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    for (SavedFilterTargetingRule item : targetingRules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SavedFilterAttributes addTargetingRulesItem(SavedFilterTargetingRule targetingRulesItem) {
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Targeting rules combined with OR. Conditions within each rule are combined with AND. Both saved
   * lists and saved rules use this structure.
   *
   * @return targetingRules
   */
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SavedFilterTargetingRule> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<SavedFilterTargetingRule> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (SavedFilterTargetingRule item : targetingRules) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SavedFilterAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time the saved filter was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return SavedFilterAttributes
   */
  @JsonAnySetter
  public SavedFilterAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SavedFilterAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedFilterAttributes savedFilterAttributes = (SavedFilterAttributes) o;
    return Objects.equals(this.archivedAt, savedFilterAttributes.archivedAt)
        && Objects.equals(this.createdAt, savedFilterAttributes.createdAt)
        && Objects.equals(this.createdBy, savedFilterAttributes.createdBy)
        && Objects.equals(this.creationType, savedFilterAttributes.creationType)
        && Objects.equals(this.description, savedFilterAttributes.description)
        && Objects.equals(this.migrationMetadata, savedFilterAttributes.migrationMetadata)
        && Objects.equals(this.name, savedFilterAttributes.name)
        && Objects.equals(this.targetingRules, savedFilterAttributes.targetingRules)
        && Objects.equals(this.updatedAt, savedFilterAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, savedFilterAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archivedAt,
        createdAt,
        createdBy,
        creationType,
        description,
        migrationMetadata,
        name,
        targetingRules,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedFilterAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationType: ").append(toIndentedString(creationType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
