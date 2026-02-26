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

/** Metadata for content pack states */
@JsonPropertyOrder({
  SecurityMonitoringContentPackStateMeta.JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT,
  SecurityMonitoringContentPackStateMeta.JSON_PROPERTY_SKU
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringContentPackStateMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT =
      "cloud_siem_index_incorrect";
  private Boolean cloudSiemIndexIncorrect;

  public static final String JSON_PROPERTY_SKU = "sku";
  private SecurityMonitoringSKU sku;

  public SecurityMonitoringContentPackStateMeta() {}

  @JsonCreator
  public SecurityMonitoringContentPackStateMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT)
          Boolean cloudSiemIndexIncorrect,
      @JsonProperty(required = true, value = JSON_PROPERTY_SKU) SecurityMonitoringSKU sku) {
    this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
    this.sku = sku;
    this.unparsed |= !sku.isValid();
  }

  public SecurityMonitoringContentPackStateMeta cloudSiemIndexIncorrect(
      Boolean cloudSiemIndexIncorrect) {
    this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
    return this;
  }

  /**
   * Whether the cloud SIEM index configuration is incorrect at the organization level
   *
   * @return cloudSiemIndexIncorrect
   */
  @JsonProperty(JSON_PROPERTY_CLOUD_SIEM_INDEX_INCORRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCloudSiemIndexIncorrect() {
    return cloudSiemIndexIncorrect;
  }

  public void setCloudSiemIndexIncorrect(Boolean cloudSiemIndexIncorrect) {
    this.cloudSiemIndexIncorrect = cloudSiemIndexIncorrect;
  }

  public SecurityMonitoringContentPackStateMeta sku(SecurityMonitoringSKU sku) {
    this.sku = sku;
    this.unparsed |= !sku.isValid();
    return this;
  }

  /**
   * The SIEM pricing model (SKU) for the organization
   *
   * @return sku
   */
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSKU getSku() {
    return sku;
  }

  public void setSku(SecurityMonitoringSKU sku) {
    if (!sku.isValid()) {
      this.unparsed = true;
    }
    this.sku = sku;
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
   * @return SecurityMonitoringContentPackStateMeta
   */
  @JsonAnySetter
  public SecurityMonitoringContentPackStateMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringContentPackStateMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringContentPackStateMeta securityMonitoringContentPackStateMeta =
        (SecurityMonitoringContentPackStateMeta) o;
    return Objects.equals(
            this.cloudSiemIndexIncorrect,
            securityMonitoringContentPackStateMeta.cloudSiemIndexIncorrect)
        && Objects.equals(this.sku, securityMonitoringContentPackStateMeta.sku)
        && Objects.equals(
            this.additionalProperties, securityMonitoringContentPackStateMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudSiemIndexIncorrect, sku, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringContentPackStateMeta {\n");
    sb.append("    cloudSiemIndexIncorrect: ")
        .append(toIndentedString(cloudSiemIndexIncorrect))
        .append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
