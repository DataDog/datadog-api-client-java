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

/** A flag variant the bandit uses. */
@JsonPropertyOrder({
  ExperimentsBanditVariantV2.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsBanditVariantV2.JSON_PROPERTY_IS_ACTIVE,
  ExperimentsBanditVariantV2.JSON_PROPERTY_IS_FALLBACK,
  ExperimentsBanditVariantV2.JSON_PROPERTY_KEY,
  ExperimentsBanditVariantV2.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditVariantV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private UUID featureFlagVariantId;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_IS_FALLBACK = "is_fallback";
  private Boolean isFallback;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ExperimentsBanditVariantV2() {}

  @JsonCreator
  public ExperimentsBanditVariantV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
          UUID featureFlagVariantId,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ACTIVE) Boolean isActive,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_FALLBACK) Boolean isFallback,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.featureFlagVariantId = featureFlagVariantId;
    this.isActive = isActive;
    this.isFallback = isFallback;
    this.key = key;
    if (key != null) {}
    this.name = name;
    if (name != null) {}
  }

  public ExperimentsBanditVariantV2 featureFlagVariantId(UUID featureFlagVariantId) {
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

  public ExperimentsBanditVariantV2 isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether the variant is one of the arms the bandit chooses between.
   *
   * @return isActive
   */
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ExperimentsBanditVariantV2 isFallback(Boolean isFallback) {
    this.isFallback = isFallback;
    return this;
  }

  /**
   * Whether the variant is served when the bandit reaches its scheduled end. At most one variant is
   * the fallback.
   *
   * @return isFallback
   */
  @JsonProperty(JSON_PROPERTY_IS_FALLBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsFallback() {
    return isFallback;
  }

  public void setIsFallback(Boolean isFallback) {
    this.isFallback = isFallback;
  }

  public ExperimentsBanditVariantV2 key(String key) {
    this.key = key;
    if (key != null) {}
    return this;
  }

  /**
   * The variant's key. An arm keeps the key it had when it was added, because exposures are matched
   * on it. Null only for a fallback deleted from the flag.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ExperimentsBanditVariantV2 name(String name) {
    this.name = name;
    if (name != null) {}
    return this;
  }

  /**
   * The variant's name on the flag. Null when it is no longer on the flag.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return ExperimentsBanditVariantV2
   */
  @JsonAnySetter
  public ExperimentsBanditVariantV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditVariantV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditVariantV2 experimentsBanditVariantV2 = (ExperimentsBanditVariantV2) o;
    return Objects.equals(
            this.featureFlagVariantId, experimentsBanditVariantV2.featureFlagVariantId)
        && Objects.equals(this.isActive, experimentsBanditVariantV2.isActive)
        && Objects.equals(this.isFallback, experimentsBanditVariantV2.isFallback)
        && Objects.equals(this.key, experimentsBanditVariantV2.key)
        && Objects.equals(this.name, experimentsBanditVariantV2.name)
        && Objects.equals(
            this.additionalProperties, experimentsBanditVariantV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        featureFlagVariantId, isActive, isFallback, key, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditVariantV2 {\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isFallback: ").append(toIndentedString(isFallback)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
