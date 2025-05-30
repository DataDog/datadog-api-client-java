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

/** Asset version. */
@JsonPropertyOrder({AssetVersion.JSON_PROPERTY_FIRST, AssetVersion.JSON_PROPERTY_LAST})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssetVersion {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST = "first";
  private String first;

  public static final String JSON_PROPERTY_LAST = "last";
  private String last;

  public AssetVersion first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Asset first version.
   *
   * @return first
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public AssetVersion last(String last) {
    this.last = last;
    return this;
  }

  /**
   * Asset last version.
   *
   * @return last
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
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
   * @return AssetVersion
   */
  @JsonAnySetter
  public AssetVersion putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AssetVersion object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetVersion assetVersion = (AssetVersion) o;
    return Objects.equals(this.first, assetVersion.first)
        && Objects.equals(this.last, assetVersion.last)
        && Objects.equals(this.additionalProperties, assetVersion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetVersion {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
