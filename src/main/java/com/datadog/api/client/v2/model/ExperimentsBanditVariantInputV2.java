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

/**
 * A flag variant the bandit uses, named by its ID. The variant's <code>key</code> and <code>name
 * </code> come from the flag and can't be set.
 */
@JsonPropertyOrder({
  ExperimentsBanditVariantInputV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditVariantInputV2.JSON_PROPERTY_IS_ACTIVE,
  ExperimentsBanditVariantInputV2.JSON_PROPERTY_IS_FALLBACK
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditVariantInputV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive = true;

  public static final String JSON_PROPERTY_IS_FALLBACK = "is_fallback";
  private Boolean isFallback = false;

  public ExperimentsBanditVariantInputV2() {}

  @JsonCreator
  public ExperimentsBanditVariantInputV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
  }

  public ExperimentsBanditVariantInputV2 featureFlagVariantId(UUID featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
    return this;
  }

  /**
   * The variant's ID on the flag.
   *
   * @return featureFlagVariantId
   */
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getFeatureFlagVariantId() {
    return featureFlagVariantId;
  }

  public void setFeatureFlagVariantId(UUID featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
  }

  public ExperimentsBanditVariantInputV2 isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the variant is one of the arms the bandit chooses between. Defaults to <code>true
   * </code>.
   *
   * @return isActive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ExperimentsBanditVariantInputV2 isFallback(Boolean isFallback) {
    this.isFallback = isFallback;
    return this;
  }

  /**
   * Whether the variant is served when the bandit reaches its scheduled end. At most one variant is
   * the fallback, and it doesn't have to be an arm. Defaults to <code>false</code>.
   *
   * @return isFallback
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsFallback() {
    return isFallback;
  }

  public void setIsFallback(Boolean isFallback) {
    this.isFallback = isFallback;
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
   * @return ExperimentsBanditVariantInputV2
   */
  @JsonAnySetter
  public ExperimentsBanditVariantInputV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditVariantInputV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditVariantInputV2 experimentsBanditVariantInputV2 =
        (ExperimentsBanditVariantInputV2) o;
    return Objects.equals(
            this.featureFlagVariantId, experimentsBanditVariantInputV2.featureFlagVariantId)
        && Objects.equals(this.isActive, experimentsBanditVariantInputV2.isActive)
        && Objects.equals(this.isFallback, experimentsBanditVariantInputV2.isFallback)
        && Objects.equals(
            this.additionalProperties, experimentsBanditVariantInputV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureFlagVariantId, isActive, isFallback, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditVariantInputV2 {\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isFallback: ").append(toIndentedString(isFallback)).append("\n");
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
