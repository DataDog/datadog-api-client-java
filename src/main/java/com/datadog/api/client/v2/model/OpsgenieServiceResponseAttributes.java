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
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes from an Opsgenie service response. */
@JsonPropertyOrder({
  OpsgenieServiceResponseAttributes.JSON_PROPERTY_CUSTOM_URL,
  OpsgenieServiceResponseAttributes.JSON_PROPERTY_NAME,
  OpsgenieServiceResponseAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpsgenieServiceResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_URL = "custom_url";
  private JsonNullable<String> customUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGION = "region";
  private OpsgenieServiceRegionType region;

  public OpsgenieServiceResponseAttributes customUrl(String customUrl) {
    this.customUrl = JsonNullable.<String>of(customUrl);
    return this;
  }

  /**
   * The custom URL for a custom region.
   *
   * @return customUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCustomUrl() {
    return customUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomUrl_JsonNullable() {
    return customUrl;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_URL)
  public void setCustomUrl_JsonNullable(JsonNullable<String> customUrl) {
    this.customUrl = customUrl;
  }

  public void setCustomUrl(String customUrl) {
    this.customUrl = JsonNullable.<String>of(customUrl);
  }

  public OpsgenieServiceResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for the Opsgenie service.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpsgenieServiceResponseAttributes region(OpsgenieServiceRegionType region) {
    this.region = region;
    this.unparsed |= !region.isValid();
    return this;
  }

  /**
   * The region for the Opsgenie service.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OpsgenieServiceRegionType getRegion() {
    return region;
  }

  public void setRegion(OpsgenieServiceRegionType region) {
    if (!region.isValid()) {
      this.unparsed = true;
    }
    this.region = region;
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
   * @return OpsgenieServiceResponseAttributes
   */
  @JsonAnySetter
  public OpsgenieServiceResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OpsgenieServiceResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpsgenieServiceResponseAttributes opsgenieServiceResponseAttributes =
        (OpsgenieServiceResponseAttributes) o;
    return Objects.equals(this.customUrl, opsgenieServiceResponseAttributes.customUrl)
        && Objects.equals(this.name, opsgenieServiceResponseAttributes.name)
        && Objects.equals(this.region, opsgenieServiceResponseAttributes.region)
        && Objects.equals(
            this.additionalProperties, opsgenieServiceResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customUrl, name, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpsgenieServiceResponseAttributes {\n");
    sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
