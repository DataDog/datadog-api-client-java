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

/** Attributes for creating a new feature flag. */
@JsonPropertyOrder({
  CreateFeatureFlagAttributes.JSON_PROPERTY_DEFAULT_VARIANT_KEY,
  CreateFeatureFlagAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateFeatureFlagAttributes.JSON_PROPERTY_DISTRIBUTION_CHANNEL,
  CreateFeatureFlagAttributes.JSON_PROPERTY_JSON_SCHEMA,
  CreateFeatureFlagAttributes.JSON_PROPERTY_KEY,
  CreateFeatureFlagAttributes.JSON_PROPERTY_NAME,
  CreateFeatureFlagAttributes.JSON_PROPERTY_REQUIRE_APPROVAL,
  CreateFeatureFlagAttributes.JSON_PROPERTY_STALENESS_STATUS,
  CreateFeatureFlagAttributes.JSON_PROPERTY_TAGS,
  CreateFeatureFlagAttributes.JSON_PROPERTY_VALUE_TYPE,
  CreateFeatureFlagAttributes.JSON_PROPERTY_VARIANTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateFeatureFlagAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_VARIANT_KEY = "default_variant_key";
  private JsonNullable<String> defaultVariantKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISTRIBUTION_CHANNEL = "distribution_channel";
  private FeatureFlagDistributionChannel distributionChannel;

  public static final String JSON_PROPERTY_JSON_SCHEMA = "json_schema";
  private JsonNullable<String> jsonSchema = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUIRE_APPROVAL = "require_approval";
  private Boolean requireApproval;

  public static final String JSON_PROPERTY_STALENESS_STATUS = "staleness_status";
  private CreateFeatureFlagStalenessStatus stalenessStatus;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VALUE_TYPE = "value_type";
  private ValueType valueType;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<CreateVariant> variants = new ArrayList<>();

  public CreateFeatureFlagAttributes() {}

  @JsonCreator
  public CreateFeatureFlagAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_TYPE) ValueType valueType,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS) List<CreateVariant> variants) {
    this.key = key;
    this.name = name;
    this.valueType = valueType;
    this.unparsed |= !valueType.isValid();
    this.variants = variants;
    for (CreateVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
  }

  public CreateFeatureFlagAttributes defaultVariantKey(String defaultVariantKey) {
    this.defaultVariantKey = JsonNullable.<String>of(defaultVariantKey);
    return this;
  }

  /**
   * The key of the default variant.
   *
   * @return defaultVariantKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDefaultVariantKey() {
    return defaultVariantKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDefaultVariantKey_JsonNullable() {
    return defaultVariantKey;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_VARIANT_KEY)
  public void setDefaultVariantKey_JsonNullable(JsonNullable<String> defaultVariantKey) {
    this.defaultVariantKey = defaultVariantKey;
  }

  public void setDefaultVariantKey(String defaultVariantKey) {
    this.defaultVariantKey = JsonNullable.<String>of(defaultVariantKey);
  }

  public CreateFeatureFlagAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the feature flag.
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

  public CreateFeatureFlagAttributes distributionChannel(
      FeatureFlagDistributionChannel distributionChannel) {
    this.distributionChannel = distributionChannel;
    this.unparsed |= !distributionChannel.isValid();
    return this;
  }

  /**
   * The distribution channel for the feature flag.
   *
   * @return distributionChannel
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISTRIBUTION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FeatureFlagDistributionChannel getDistributionChannel() {
    return distributionChannel;
  }

  public void setDistributionChannel(FeatureFlagDistributionChannel distributionChannel) {
    if (!distributionChannel.isValid()) {
      this.unparsed = true;
    }
    this.distributionChannel = distributionChannel;
  }

  public CreateFeatureFlagAttributes jsonSchema(String jsonSchema) {
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

  public CreateFeatureFlagAttributes key(String key) {
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

  public CreateFeatureFlagAttributes name(String name) {
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

  public CreateFeatureFlagAttributes requireApproval(Boolean requireApproval) {
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

  public CreateFeatureFlagAttributes stalenessStatus(
      CreateFeatureFlagStalenessStatus stalenessStatus) {
    this.stalenessStatus = stalenessStatus;
    this.unparsed |= !stalenessStatus.isValid();
    return this;
  }

  /**
   * The staleness status for the feature flag at creation.
   *
   * @return stalenessStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STALENESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateFeatureFlagStalenessStatus getStalenessStatus() {
    return stalenessStatus;
  }

  public void setStalenessStatus(CreateFeatureFlagStalenessStatus stalenessStatus) {
    if (!stalenessStatus.isValid()) {
      this.unparsed = true;
    }
    this.stalenessStatus = stalenessStatus;
  }

  public CreateFeatureFlagAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateFeatureFlagAttributes addTagsItem(String tagsItem) {
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

  public CreateFeatureFlagAttributes valueType(ValueType valueType) {
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

  public CreateFeatureFlagAttributes variants(List<CreateVariant> variants) {
    this.variants = variants;
    for (CreateVariant item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateFeatureFlagAttributes addVariantsItem(CreateVariant variantsItem) {
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
  public List<CreateVariant> getVariants() {
    return variants;
  }

  public void setVariants(List<CreateVariant> variants) {
    this.variants = variants;
    if (variants != null) {
      for (CreateVariant item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return CreateFeatureFlagAttributes
   */
  @JsonAnySetter
  public CreateFeatureFlagAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateFeatureFlagAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeatureFlagAttributes createFeatureFlagAttributes = (CreateFeatureFlagAttributes) o;
    return Objects.equals(this.defaultVariantKey, createFeatureFlagAttributes.defaultVariantKey)
        && Objects.equals(this.description, createFeatureFlagAttributes.description)
        && Objects.equals(this.distributionChannel, createFeatureFlagAttributes.distributionChannel)
        && Objects.equals(this.jsonSchema, createFeatureFlagAttributes.jsonSchema)
        && Objects.equals(this.key, createFeatureFlagAttributes.key)
        && Objects.equals(this.name, createFeatureFlagAttributes.name)
        && Objects.equals(this.requireApproval, createFeatureFlagAttributes.requireApproval)
        && Objects.equals(this.stalenessStatus, createFeatureFlagAttributes.stalenessStatus)
        && Objects.equals(this.tags, createFeatureFlagAttributes.tags)
        && Objects.equals(this.valueType, createFeatureFlagAttributes.valueType)
        && Objects.equals(this.variants, createFeatureFlagAttributes.variants)
        && Objects.equals(
            this.additionalProperties, createFeatureFlagAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        defaultVariantKey,
        description,
        distributionChannel,
        jsonSchema,
        key,
        name,
        requireApproval,
        stalenessStatus,
        tags,
        valueType,
        variants,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeatureFlagAttributes {\n");
    sb.append("    defaultVariantKey: ").append(toIndentedString(defaultVariantKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distributionChannel: ")
        .append(toIndentedString(distributionChannel))
        .append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireApproval: ").append(toIndentedString(requireApproval)).append("\n");
    sb.append("    stalenessStatus: ").append(toIndentedString(stalenessStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
