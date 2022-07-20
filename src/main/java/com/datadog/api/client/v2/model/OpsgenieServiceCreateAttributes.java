/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The Opsgenie service attributes for a create request. */
@JsonPropertyOrder({
  OpsgenieServiceCreateAttributes.JSON_PROPERTY_CUSTOM_URL,
  OpsgenieServiceCreateAttributes.JSON_PROPERTY_NAME,
  OpsgenieServiceCreateAttributes.JSON_PROPERTY_OPSGENIE_API_KEY,
  OpsgenieServiceCreateAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpsgenieServiceCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_URL = "custom_url";
  private String customUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPSGENIE_API_KEY = "opsgenie_api_key";
  private String opsgenieApiKey;

  public static final String JSON_PROPERTY_REGION = "region";
  private OpsgenieServiceRegionType region;

  public OpsgenieServiceCreateAttributes() {}

  @JsonCreator
  public OpsgenieServiceCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPSGENIE_API_KEY) String opsgenieApiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_REGION)
          OpsgenieServiceRegionType region) {
    this.name = name;
    this.opsgenieApiKey = opsgenieApiKey;
    this.region = region;
    this.unparsed |= !region.isValid();
  }

  public OpsgenieServiceCreateAttributes customUrl(String customUrl) {
    this.customUrl = customUrl;
    return this;
  }

  /**
   * The custom URL for a custom region.
   *
   * @return customUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomUrl() {
    return customUrl;
  }

  public void setCustomUrl(String customUrl) {
    this.customUrl = customUrl;
  }

  public OpsgenieServiceCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for the Opsgenie service.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OpsgenieServiceCreateAttributes opsgenieApiKey(String opsgenieApiKey) {
    this.opsgenieApiKey = opsgenieApiKey;
    return this;
  }

  /**
   * The Opsgenie API key for your Opsgenie service.
   *
   * @return opsgenieApiKey
   */
  @JsonProperty(JSON_PROPERTY_OPSGENIE_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOpsgenieApiKey() {
    return opsgenieApiKey;
  }

  public void setOpsgenieApiKey(String opsgenieApiKey) {
    this.opsgenieApiKey = opsgenieApiKey;
  }

  public OpsgenieServiceCreateAttributes region(OpsgenieServiceRegionType region) {
    this.region = region;
    this.unparsed |= !region.isValid();
    return this;
  }

  /**
   * The region for the Opsgenie service.
   *
   * @return region
   */
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpsgenieServiceRegionType getRegion() {
    return region;
  }

  public void setRegion(OpsgenieServiceRegionType region) {
    if (!region.isValid()) {
      this.unparsed = true;
    }
    this.region = region;
  }

  /** Return true if this OpsgenieServiceCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpsgenieServiceCreateAttributes opsgenieServiceCreateAttributes =
        (OpsgenieServiceCreateAttributes) o;
    return Objects.equals(this.customUrl, opsgenieServiceCreateAttributes.customUrl)
        && Objects.equals(this.name, opsgenieServiceCreateAttributes.name)
        && Objects.equals(this.opsgenieApiKey, opsgenieServiceCreateAttributes.opsgenieApiKey)
        && Objects.equals(this.region, opsgenieServiceCreateAttributes.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customUrl, name, opsgenieApiKey, region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpsgenieServiceCreateAttributes {\n");
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
