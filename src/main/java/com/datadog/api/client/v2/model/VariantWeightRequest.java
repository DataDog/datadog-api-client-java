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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Variant weight request payload. */
@JsonPropertyOrder({
  VariantWeightRequest.JSON_PROPERTY_VALUE,
  VariantWeightRequest.JSON_PROPERTY_VARIANT_ID,
  VariantWeightRequest.JSON_PROPERTY_VARIANT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class VariantWeightRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_VARIANT_ID = "variant_id";
  private UUID variantId;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public VariantWeightRequest() {}

  @JsonCreator
  public VariantWeightRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) Double value) {
    this.value = value;
  }

  public VariantWeightRequest value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * The percentage weight for this variant.
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

  public VariantWeightRequest variantId(UUID variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * The variant ID to assign weight to.
   *
   * @return variantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getVariantId() {
    return variantId;
  }

  public void setVariantId(UUID variantId) {
    this.variantId = variantId;
  }

  public VariantWeightRequest variantKey(String variantKey) {
    this.variantKey = variantKey;
    return this;
  }

  /**
   * The variant key to assign weight to.
   *
   * @return variantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantKey() {
    return variantKey;
  }

  public void setVariantKey(String variantKey) {
    this.variantKey = variantKey;
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
   * @return VariantWeightRequest
   */
  @JsonAnySetter
  public VariantWeightRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this VariantWeightRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantWeightRequest variantWeightRequest = (VariantWeightRequest) o;
    return Objects.equals(this.value, variantWeightRequest.value)
        && Objects.equals(this.variantId, variantWeightRequest.variantId)
        && Objects.equals(this.variantKey, variantWeightRequest.variantKey)
        && Objects.equals(this.additionalProperties, variantWeightRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, variantId, variantKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantWeightRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    variantKey: ").append(toIndentedString(variantKey)).append("\n");
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
