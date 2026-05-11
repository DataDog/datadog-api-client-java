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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a feature flag in list responses. */
@JsonPropertyOrder({
  FeatureFlagListItemAttributes.JSON_PROPERTY_ARCHIVED_AT,
  FeatureFlagListItemAttributes.JSON_PROPERTY_CREATED_AT,
  FeatureFlagListItemAttributes.JSON_PROPERTY_CREATED_BY,
  FeatureFlagListItemAttributes.JSON_PROPERTY_DESCRIPTION,
  FeatureFlagListItemAttributes.JSON_PROPERTY_DISTRIBUTION_CHANNEL,
  FeatureFlagListItemAttributes.JSON_PROPERTY_FEATURE_FLAG_ENVIRONMENTS,
  FeatureFlagListItemAttributes.JSON_PROPERTY_JSON_SCHEMA,
  FeatureFlagListItemAttributes.JSON_PROPERTY_KEY,
  FeatureFlagListItemAttributes.JSON_PROPERTY_LAST_UPDATED_BY,
  FeatureFlagListItemAttributes.JSON_PROPERTY_NAME,
  FeatureFlagListItemAttributes.JSON_PROPERTY_REQUIRE_APPROVAL,
  FeatureFlagListItemAttributes.JSON_PROPERTY_STALENESS_STATUS,
  FeatureFlagListItemAttributes.JSON_PROPERTY_TAGS,
  FeatureFlagListItemAttributes.JSON_PROPERTY_UPDATED_AT,
  FeatureFlagListItemAttributes.JSON_PROPERTY_VALUE_TYPE,
  FeatureFlagListItemAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagListItemAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED_AT = "archived_at";
  private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISTRIBUTION_CHANNEL = "distribution_channel";
  private String distributionChannel;

  public static final String JSON_PROPERTY_FEATURE_FLAG_ENVIRONMENTS = "feature_flag_environments";
  private List<FeatureFlagEnvironmentListItem> featureFlagEnvironments = null;

  public static final String JSON_PROPERTY_JSON_SCHEMA = "json_schema";
  private JsonNullable<String> jsonSchema = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "last_updated_by";
  private UUID lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUIRE_APPROVAL = "require_approval";
  private Boolean requireApproval;

  public static final String JSON_PROPERTY_STALENESS_STATUS = "staleness_status";
  private String stalenessStatus;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VALUE_TYPE = "value_type";
  private ValueType valueType;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<Variant> variants = new ArrayList<>();

  public FeatureFlagListItemAttributes() {}

  @JsonCreator
  public FeatureFlagListItemAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_TYPE) ValueType valueType,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS) List<Variant> variants) {
    this.description = description;
    this.key = key;
    this.name = name;
    this.valueType = valueType;
    this.unparsed |= !valueType.isValid();
    this.variants = variants;
  }

  public FeatureFlagListItemAttributes archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = JsonNullable.<OffsetDateTime>of(archivedAt);
    return this;
  }

  /**
   * The timestamp when the feature flag was archived.
   *
   * @return archivedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getArchivedAt() {
    return archivedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchivedAt_JsonNullable() {
    return archivedAt;
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED_AT)
  public void setArchivedAt_JsonNullable(JsonNullable<OffsetDateTime> archivedAt) {
    this.archivedAt = archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = JsonNullable.<OffsetDateTime>of(archivedAt);
  }

  public FeatureFlagListItemAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the feature flag was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FeatureFlagListItemAttributes createdBy(UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user who created the feature flag.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public FeatureFlagListItemAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the feature flag.
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

  public FeatureFlagListItemAttributes distributionChannel(String distributionChannel) {
    this.distributionChannel = distributionChannel;
    return this;
  }

  /**
   * Distribution channel for the feature flag.
   *
   * @return distributionChannel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDistributionChannel() {
    return distributionChannel;
  }

  public void setDistributionChannel(String distributionChannel) {
    this.distributionChannel = distributionChannel;
  }

  public FeatureFlagListItemAttributes featureFlagEnvironments(
      List<FeatureFlagEnvironmentListItem> featureFlagEnvironments) {
    this.featureFlagEnvironments = featureFlagEnvironments;
    for (FeatureFlagEnvironmentListItem item : featureFlagEnvironments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FeatureFlagListItemAttributes addFeatureFlagEnvironmentsItem(
      FeatureFlagEnvironmentListItem featureFlagEnvironmentsItem) {
    if (this.featureFlagEnvironments == null) {
      this.featureFlagEnvironments = new ArrayList<>();
    }
    this.featureFlagEnvironments.add(featureFlagEnvironmentsItem);
    this.unparsed |= featureFlagEnvironmentsItem.unparsed;
    return this;
  }

  /**
   * Environment-specific settings for the feature flag.
   *
   * @return featureFlagEnvironments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_ENVIRONMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FeatureFlagEnvironmentListItem> getFeatureFlagEnvironments() {
    return featureFlagEnvironments;
  }

  public void setFeatureFlagEnvironments(
      List<FeatureFlagEnvironmentListItem> featureFlagEnvironments) {
    this.featureFlagEnvironments = featureFlagEnvironments;
  }

  public FeatureFlagListItemAttributes jsonSchema(String jsonSchema) {
    this.jsonSchema = JsonNullable.<String>of(jsonSchema);
    return this;
  }

  /**
   * JSON schema for validation when value_type is JSON.
   *
   * @return jsonSchema
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getJsonSchema() {
    return jsonSchema.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getJsonSchema_JsonNullable() {
    return jsonSchema;
  }

  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  public void setJsonSchema_JsonNullable(JsonNullable<String> jsonSchema) {
    this.jsonSchema = jsonSchema;
  }

  public void setJsonSchema(String jsonSchema) {
    this.jsonSchema = JsonNullable.<String>of(jsonSchema);
  }

  public FeatureFlagListItemAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The unique key of the feature flag.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeatureFlagListItemAttributes lastUpdatedBy(UUID lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * The ID of the user who last updated the feature flag.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(UUID lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public FeatureFlagListItemAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the feature flag.
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

  public FeatureFlagListItemAttributes requireApproval(Boolean requireApproval) {
    this.requireApproval = requireApproval;
    return this;
  }

  /**
   * Indicates whether this feature flag requires approval for changes.
   *
   * @return requireApproval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequireApproval() {
    return requireApproval;
  }

  public void setRequireApproval(Boolean requireApproval) {
    this.requireApproval = requireApproval;
  }

  public FeatureFlagListItemAttributes stalenessStatus(String stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
    return this;
  }

  /**
   * Indicates the staleness status of the feature flag.
   *
   * @return stalenessStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STALENESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStalenessStatus() {
    return stalenessStatus;
  }

  public void setStalenessStatus(String stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
  }

  public FeatureFlagListItemAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FeatureFlagListItemAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the feature flag.
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

  public FeatureFlagListItemAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the feature flag was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public FeatureFlagListItemAttributes valueType(ValueType valueType) {
    this.valueType = valueType;
    this.unparsed |= !valueType.isValid();
    return this;
  }

  /**
   * The type of values for the feature flag variants.
   *
   * @return valueType
   */
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ValueType getValueType() {
    return valueType;
  }

  public void setValueType(ValueType valueType) {
    if (!valueType.isValid()) {
      this.unparsed = true;
    }
    this.valueType = valueType;
  }

  public FeatureFlagListItemAttributes variants(List<Variant> variants) {
    this.variants = variants;
    for (Variant item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FeatureFlagListItemAttributes addVariantsItem(Variant variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * The variants of the feature flag.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Variant> getVariants() {
    return variants;
  }

  public void setVariants(List<Variant> variants) {
    this.variants = variants;
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
   * @return FeatureFlagListItemAttributes
   */
  @JsonAnySetter
  public FeatureFlagListItemAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagListItemAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagListItemAttributes featureFlagListItemAttributes = (FeatureFlagListItemAttributes) o;
    return Objects.equals(this.archivedAt, featureFlagListItemAttributes.archivedAt)
        && Objects.equals(this.createdAt, featureFlagListItemAttributes.createdAt)
        && Objects.equals(this.createdBy, featureFlagListItemAttributes.createdBy)
        && Objects.equals(this.description, featureFlagListItemAttributes.description)
        && Objects.equals(
            this.distributionChannel, featureFlagListItemAttributes.distributionChannel)
        && Objects.equals(
            this.featureFlagEnvironments, featureFlagListItemAttributes.featureFlagEnvironments)
        && Objects.equals(this.jsonSchema, featureFlagListItemAttributes.jsonSchema)
        && Objects.equals(this.key, featureFlagListItemAttributes.key)
        && Objects.equals(this.lastUpdatedBy, featureFlagListItemAttributes.lastUpdatedBy)
        && Objects.equals(this.name, featureFlagListItemAttributes.name)
        && Objects.equals(this.requireApproval, featureFlagListItemAttributes.requireApproval)
        && Objects.equals(this.stalenessStatus, featureFlagListItemAttributes.stalenessStatus)
        && Objects.equals(this.tags, featureFlagListItemAttributes.tags)
        && Objects.equals(this.updatedAt, featureFlagListItemAttributes.updatedAt)
        && Objects.equals(this.valueType, featureFlagListItemAttributes.valueType)
        && Objects.equals(this.variants, featureFlagListItemAttributes.variants)
        && Objects.equals(
            this.additionalProperties, featureFlagListItemAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        archivedAt,
        createdAt,
        createdBy,
        description,
        distributionChannel,
        featureFlagEnvironments,
        jsonSchema,
        key,
        lastUpdatedBy,
        name,
        requireApproval,
        stalenessStatus,
        tags,
        updatedAt,
        valueType,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagListItemAttributes {\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributionChannel: ")
        .append(toIndentedString(distributionChannel))
        .append("\n");
    sb.append("    featureFlagEnvironments: ")
        .append(toIndentedString(featureFlagEnvironments))
        .append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireApproval: ").append(toIndentedString(requireApproval)).append("\n");
    sb.append("    stalenessStatus: ").append(toIndentedString(stalenessStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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
