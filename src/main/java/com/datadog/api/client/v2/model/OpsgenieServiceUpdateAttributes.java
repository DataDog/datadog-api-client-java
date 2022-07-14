/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The Opsgenie service attributes for an update request. */
@JsonPropertyOrder({
  OpsgenieServiceUpdateAttributes.JSON_PROPERTY_CUSTOM_URL,
  OpsgenieServiceUpdateAttributes.JSON_PROPERTY_NAME,
  OpsgenieServiceUpdateAttributes.JSON_PROPERTY_OPSGENIE_API_KEY,
  OpsgenieServiceUpdateAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpsgenieServiceUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_URL = "custom_url";
  private JsonNullable<String> customUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPSGENIE_API_KEY = "opsgenie_api_key";
  private String opsgenieApiKey;

  public static final String JSON_PROPERTY_REGION = "region";
  private OpsgenieServiceRegionType region;

  public OpsgenieServiceUpdateAttributes customUrl(String customUrl) {
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

  public OpsgenieServiceUpdateAttributes name(String name) {
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

  public OpsgenieServiceUpdateAttributes opsgenieApiKey(String opsgenieApiKey) {
    this.opsgenieApiKey = opsgenieApiKey;
    return this;
  }

  /**
   * The Opsgenie API key for your Opsgenie service.
   *
   * @return opsgenieApiKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPSGENIE_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOpsgenieApiKey() {
    return opsgenieApiKey;
  }

  public void setOpsgenieApiKey(String opsgenieApiKey) {
    this.opsgenieApiKey = opsgenieApiKey;
  }

  public OpsgenieServiceUpdateAttributes region(OpsgenieServiceRegionType region) {
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

  /** Return true if this OpsgenieServiceUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpsgenieServiceUpdateAttributes opsgenieServiceUpdateAttributes =
        (OpsgenieServiceUpdateAttributes) o;
    return Objects.equals(this.customUrl, opsgenieServiceUpdateAttributes.customUrl)
        && Objects.equals(this.name, opsgenieServiceUpdateAttributes.name)
        && Objects.equals(this.opsgenieApiKey, opsgenieServiceUpdateAttributes.opsgenieApiKey)
        && Objects.equals(this.region, opsgenieServiceUpdateAttributes.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customUrl, name, opsgenieApiKey, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpsgenieServiceUpdateAttributes {\n");
    sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opsgenieApiKey: ").append(toIndentedString(opsgenieApiKey)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("}");
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
