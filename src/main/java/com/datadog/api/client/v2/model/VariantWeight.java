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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Variant weight details. */
@JsonPropertyOrder({
  VariantWeight.JSON_PROPERTY_CREATED_AT,
  VariantWeight.JSON_PROPERTY_ID,
  VariantWeight.JSON_PROPERTY_UPDATED_AT,
  VariantWeight.JSON_PROPERTY_VALUE,
  VariantWeight.JSON_PROPERTY_VARIANT,
  VariantWeight.JSON_PROPERTY_VARIANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class VariantWeight {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private Variant variant;

  public static final String JSON_PROPERTY_VARIANT_ID = "variant_id";
  private UUID variantId;

  public VariantWeight() {}

  @JsonCreator
  public VariantWeight(
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANT_ID) UUID variantId) {
    this.value = value;
    this.variantId = variantId;
  }

  public VariantWeight createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the variant weight was created.
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

  public VariantWeight id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the variant weight assignment.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public VariantWeight updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the variant weight was last updated.
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

  public VariantWeight value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The percentage weight for the variant.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public VariantWeight variant(Variant variant) {
    this.variant = variant;
    this.unparsed |= variant.unparsed;
    return this;
  }

  /**
   * A variant of a feature flag.
   *
   * @return variant
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Variant getVariant() {
    return variant;
  }

  public void setVariant(Variant variant) {
    this.variant = variant;
  }

  public VariantWeight variantId(UUID variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * The variant ID.
   *
   * @return variantId
   */
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getVariantId() {
    return variantId;
  }

  public void setVariantId(UUID variantId) {
    this.variantId = variantId;
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
   * @return VariantWeight
   */
  @JsonAnySetter
  public VariantWeight putAdditionalProperty(String key, Object value) {
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

  /** Return true if this VariantWeight object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantWeight variantWeight = (VariantWeight) o;
    return Objects.equals(this.createdAt, variantWeight.createdAt)
        && Objects.equals(this.id, variantWeight.id)
        && Objects.equals(this.updatedAt, variantWeight.updatedAt)
        && Objects.equals(this.value, variantWeight.value)
        && Objects.equals(this.variant, variantWeight.variant)
        && Objects.equals(this.variantId, variantWeight.variantId)
        && Objects.equals(this.additionalProperties, variantWeight.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, value, variant, variantId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantWeight {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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
