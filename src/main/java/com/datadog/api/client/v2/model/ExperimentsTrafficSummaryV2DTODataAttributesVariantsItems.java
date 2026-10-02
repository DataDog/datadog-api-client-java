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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Exposure count and identity of one experiment variant. */
@JsonPropertyOrder({
  ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems.JSON_PROPERTY_EXPOSURE_COUNT,
  ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems.JSON_PROPERTY_VARIANT_KEY,
  ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems.JSON_PROPERTY_VARIANT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPOSURE_COUNT = "exposure_count";
  private Long exposureCount;

  public static final String JSON_PROPERTY_VARIANT_KEY = "variant_key";
  private String variantKey;

  public static final String JSON_PROPERTY_VARIANT_NAME = "variant_name";
  private String variantName;

  public ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems exposureCount(
      Long exposureCount) {
    this.exposureCount = exposureCount;
    return this;
  }

  /**
   * Number of recorded exposures for this variant.
   *
   * @return exposureCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExposureCount() {
    return exposureCount;
  }

  public void setExposureCount(Long exposureCount) {
    this.exposureCount = exposureCount;
  }

  public ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems variantKey(String variantKey) {
    this.variantKey = variantKey;
    return this;
  }

  /**
   * Key that identifies the experiment variant.
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

  public ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems variantName(String variantName) {
    this.variantName = variantName;
    return this;
  }

  /**
   * Display name of the experiment variant.
   *
   * @return variantName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantName() {
    return variantName;
  }

  public void setVariantName(String variantName) {
    this.variantName = variantName;
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
   * @return ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems
   */
  @JsonAnySetter
  public ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems putAdditionalProperty(
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
   * Return true if this ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems
        experimentsTrafficSummaryV2DtoDataAttributesVariantsItems =
            (ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems) o;
    return Objects.equals(
            this.exposureCount,
            experimentsTrafficSummaryV2DtoDataAttributesVariantsItems.exposureCount)
        && Objects.equals(
            this.variantKey, experimentsTrafficSummaryV2DtoDataAttributesVariantsItems.variantKey)
        && Objects.equals(
            this.variantName, experimentsTrafficSummaryV2DtoDataAttributesVariantsItems.variantName)
        && Objects.equals(
            this.additionalProperties,
            experimentsTrafficSummaryV2DtoDataAttributesVariantsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exposureCount, variantKey, variantName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsTrafficSummaryV2DTODataAttributesVariantsItems {\n");
    sb.append("    exposureCount: ").append(toIndentedString(exposureCount)).append("\n");
    sb.append("    variantKey: ").append(toIndentedString(variantKey)).append("\n");
    sb.append("    variantName: ").append(toIndentedString(variantName)).append("\n");
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
