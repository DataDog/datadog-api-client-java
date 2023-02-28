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

/** Data object for creating a Cloudflare account. */
@JsonPropertyOrder({
  CloudflareAccountCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
  CloudflareAccountCreateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareAccountCreateRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private CloudflareAccountCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudflareAccountType type = CloudflareAccountType.CLOUDFLARE_ACCOUNTS;

  public CloudflareAccountCreateRequestData() {}

  @JsonCreator
  public CloudflareAccountCreateRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          CloudflareAccountCreateRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CloudflareAccountType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CloudflareAccountCreateRequestData attributes(
      CloudflareAccountCreateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes object for creating a Cloudflare account.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudflareAccountCreateRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CloudflareAccountCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public CloudflareAccountCreateRequestData type(CloudflareAccountType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The JSON:API type for this API. Should always be <code>cloudflare-accounts</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudflareAccountType getType() {
    return type;
  }

  public void setType(CloudflareAccountType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CloudflareAccountCreateRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareAccountCreateRequestData cloudflareAccountCreateRequestData =
        (CloudflareAccountCreateRequestData) o;
    return Objects.equals(this.attributes, cloudflareAccountCreateRequestData.attributes)
        && Objects.equals(this.type, cloudflareAccountCreateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareAccountCreateRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
