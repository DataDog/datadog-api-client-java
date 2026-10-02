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

/** Lower and upper bounds of the reported statistical interval. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      .JSON_PROPERTY_LOWER,
  ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      .JSON_PROPERTY_UPPER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public
class ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LOWER = "lower";
  private Double lower;

  public static final String JSON_PROPERTY_UPPER = "upper";
  private Double upper;

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      lower(Double lower) {
    this.lower = lower;
    return this;
  }

  /**
   * Lower bound of the reported interval.
   *
   * @return lower
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLower() {
    return lower;
  }

  public void setLower(Double lower) {
    this.lower = lower;
  }

  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      upper(Double upper) {
    this.upper = upper;
    return this;
  }

  /**
   * Upper bound of the reported interval.
   *
   * @return upper
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUpper() {
    return upper;
  }

  public void setUpper(Double upper) {
    this.upper = upper;
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
   * @return ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval
        experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItemsConfidenceInterval =
            (ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval)
                o;
    return Objects.equals(
            this.lower,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItemsConfidenceInterval
                .lower)
        && Objects.equals(
            this.upper,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItemsConfidenceInterval
                .upper)
        && Objects.equals(
            this.additionalProperties,
            experimentsVariantResultsV2DtoDataAttributesMetricsItemsAnalysesItemsConfidenceInterval
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lower, upper, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class"
            + " ExperimentsVariantResultsV2DTODataAttributesMetricsItemsAnalysesItemsConfidenceInterval"
            + " {\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
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
