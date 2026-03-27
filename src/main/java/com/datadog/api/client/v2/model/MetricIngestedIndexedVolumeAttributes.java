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

/** Object containing the definition of a metric's ingested and indexed volume. */
@JsonPropertyOrder({
  MetricIngestedIndexedVolumeAttributes.JSON_PROPERTY_INDEXED_VOLUME,
  MetricIngestedIndexedVolumeAttributes.JSON_PROPERTY_INGESTED_VOLUME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricIngestedIndexedVolumeAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEXED_VOLUME = "indexed_volume";
  private Long indexedVolume;

  public static final String JSON_PROPERTY_INGESTED_VOLUME = "ingested_volume";
  private Long ingestedVolume;

  public MetricIngestedIndexedVolumeAttributes indexedVolume(Long indexedVolume) {
    this.indexedVolume = indexedVolume;
    return this;
  }

  /**
   * Indexed volume for the given metric.
   *
   * @return indexedVolume
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXED_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIndexedVolume() {
    return indexedVolume;
  }

  public void setIndexedVolume(Long indexedVolume) {
    this.indexedVolume = indexedVolume;
  }

  public MetricIngestedIndexedVolumeAttributes ingestedVolume(Long ingestedVolume) {
    this.ingestedVolume = ingestedVolume;
    return this;
  }

  /**
   * Ingested volume for the given metric.
   *
   * @return ingestedVolume
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTED_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getIngestedVolume() {
    return ingestedVolume;
  }

  public void setIngestedVolume(Long ingestedVolume) {
    this.ingestedVolume = ingestedVolume;
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
   * @return MetricIngestedIndexedVolumeAttributes
   */
  @JsonAnySetter
  public MetricIngestedIndexedVolumeAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricIngestedIndexedVolumeAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricIngestedIndexedVolumeAttributes metricIngestedIndexedVolumeAttributes =
        (MetricIngestedIndexedVolumeAttributes) o;
    return Objects.equals(this.indexedVolume, metricIngestedIndexedVolumeAttributes.indexedVolume)
        && Objects.equals(this.ingestedVolume, metricIngestedIndexedVolumeAttributes.ingestedVolume)
        && Objects.equals(
            this.additionalProperties, metricIngestedIndexedVolumeAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexedVolume, ingestedVolume, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricIngestedIndexedVolumeAttributes {\n");
    sb.append("    indexedVolume: ").append(toIndentedString(indexedVolume)).append("\n");
    sb.append("    ingestedVolume: ").append(toIndentedString(ingestedVolume)).append("\n");
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
