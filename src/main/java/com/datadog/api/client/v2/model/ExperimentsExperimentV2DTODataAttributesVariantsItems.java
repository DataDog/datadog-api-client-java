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
import org.openapitools.jackson.nullable.JsonNullable;

/** Variant in an experiment, with its identity and traffic allocation. */
@JsonPropertyOrder({
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID,
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_IS_ACTIVE,
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_IS_CONTROL,
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_KEY,
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_NAME,
  ExperimentsExperimentV2DTODataAttributesVariantsItems.JSON_PROPERTY_WEIGHT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentV2DTODataAttributesVariantsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID = "feature_flag_variant_id";
  private String featureFlagVariantId;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is_active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_IS_CONTROL = "is_control";
  private Boolean isControl;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Double weight;

  public ExperimentsExperimentV2DTODataAttributesVariantsItems() {}

  @JsonCreator
  public ExperimentsExperimentV2DTODataAttributesVariantsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ACTIVE) Boolean isActive,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_CONTROL) Boolean isControl,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_WEIGHT) Double weight) {
    this.isActive = isActive;
    this.isControl = isControl;
    this.key = key;
    this.weight = weight;
  }

  public ExperimentsExperimentV2DTODataAttributesVariantsItems featureFlagVariantId(
      String featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
    return this;
  }

  /**
   * Backing feature flag variant ID. Present for Datadog feature flag experiments and omitted for
   * Warehouse experiments.
   *
   * @return featureFlagVariantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE_FLAG_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFeatureFlagVariantId() {
    return featureFlagVariantId;
  }

  public void setFeatureFlagVariantId(String featureFlagVariantId) {
    this.featureFlagVariantId = featureFlagVariantId;
  }

  public ExperimentsExperimentV2DTODataAttributesVariantsItems isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Whether this variant participates in the experiment.
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

  public ExperimentsExperimentV2DTODataAttributesVariantsItems isControl(Boolean isControl) {
    this.isControl = isControl;
    return this;
  }

  /**
   * Whether this is the single control variant.
   *
   * @return isControl
   */
  @JsonProperty(JSON_PROPERTY_IS_CONTROL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsControl() {
    return isControl;
  }

  public void setIsControl(Boolean isControl) {
    this.isControl = isControl;
  }

  public ExperimentsExperimentV2DTODataAttributesVariantsItems key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Value recorded in exposure data for this variant.
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

  public ExperimentsExperimentV2DTODataAttributesVariantsItems name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * Display name of the experiment variant.
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

  public ExperimentsExperimentV2DTODataAttributesVariantsItems weight(Double weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Traffic allocation percentage.
   *
   * @return weight
   */
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
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
   * @return ExperimentsExperimentV2DTODataAttributesVariantsItems
   */
  @JsonAnySetter
  public ExperimentsExperimentV2DTODataAttributesVariantsItems putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsExperimentV2DTODataAttributesVariantsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentV2DTODataAttributesVariantsItems
        experimentsExperimentV2DtoDataAttributesVariantsItems =
            (ExperimentsExperimentV2DTODataAttributesVariantsItems) o;
    return Objects.equals(
            this.featureFlagVariantId,
            experimentsExperimentV2DtoDataAttributesVariantsItems.featureFlagVariantId)
        && Objects.equals(
            this.isActive, experimentsExperimentV2DtoDataAttributesVariantsItems.isActive)
        && Objects.equals(
            this.isControl, experimentsExperimentV2DtoDataAttributesVariantsItems.isControl)
        && Objects.equals(this.key, experimentsExperimentV2DtoDataAttributesVariantsItems.key)
        && Objects.equals(this.name, experimentsExperimentV2DtoDataAttributesVariantsItems.name)
        && Objects.equals(this.weight, experimentsExperimentV2DtoDataAttributesVariantsItems.weight)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentV2DtoDataAttributesVariantsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        featureFlagVariantId, isActive, isControl, key, name, weight, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentV2DTODataAttributesVariantsItems {\n");
    sb.append("    featureFlagVariantId: ")
        .append(toIndentedString(featureFlagVariantId))
        .append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isControl: ").append(toIndentedString(isControl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
