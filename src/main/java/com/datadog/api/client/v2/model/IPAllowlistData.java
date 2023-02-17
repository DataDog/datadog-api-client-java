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

/** IP allowlist data. */
@JsonPropertyOrder({
  IPAllowlistData.JSON_PROPERTY_ATTRIBUTES,
  IPAllowlistData.JSON_PROPERTY_ID,
  IPAllowlistData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IPAllowlistData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IPAllowlistAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IPAllowlistType type = IPAllowlistType.IP_ALLOWLIST;

  public IPAllowlistData() {}

  @JsonCreator
  public IPAllowlistData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) IPAllowlistType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public IPAllowlistData attributes(IPAllowlistAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of the IP allowlist.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IPAllowlistAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IPAllowlistAttributes attributes) {
    this.attributes = attributes;
  }

  public IPAllowlistData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the org.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IPAllowlistData type(IPAllowlistType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * IP allowlist type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IPAllowlistType getType() {
    return type;
  }

  public void setType(IPAllowlistType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this IPAllowlistData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAllowlistData ipAllowlistData = (IPAllowlistData) o;
    return Objects.equals(this.attributes, ipAllowlistData.attributes)
        && Objects.equals(this.id, ipAllowlistData.id)
        && Objects.equals(this.type, ipAllowlistData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAllowlistData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
