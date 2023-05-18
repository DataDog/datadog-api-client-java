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

/** Info on your service account. */
@JsonPropertyOrder({
  ServiceAccountInfo.JSON_PROPERTY_ATTRIBUTES,
  ServiceAccountInfo.JSON_PROPERTY_ID,
  ServiceAccountInfo.JSON_PROPERTY_META,
  ServiceAccountInfo.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceAccountInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AccountAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private MetaInfo meta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ServiceAccountInfo attributes(AccountAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes associated with your service account.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccountAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(AccountAttributes attributes) {
    this.attributes = attributes;
  }

  public ServiceAccountInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Your service account's unique ID.
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

  public ServiceAccountInfo meta(MetaInfo meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Additional information related to your service account.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetaInfo getMeta() {
    return meta;
  }

  public void setMeta(MetaInfo meta) {
    this.meta = meta;
  }

  public ServiceAccountInfo type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of account.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this ServiceAccountInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountInfo serviceAccountInfo = (ServiceAccountInfo) o;
    return Objects.equals(this.attributes, serviceAccountInfo.attributes)
        && Objects.equals(this.id, serviceAccountInfo.id)
        && Objects.equals(this.meta, serviceAccountInfo.meta)
        && Objects.equals(this.type, serviceAccountInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, meta, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountInfo {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
