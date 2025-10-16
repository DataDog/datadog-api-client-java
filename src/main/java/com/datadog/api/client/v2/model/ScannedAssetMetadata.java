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

/** The metadata of a scanned asset. */
@JsonPropertyOrder({
  ScannedAssetMetadata.JSON_PROPERTY_ATTRIBUTES,
  ScannedAssetMetadata.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScannedAssetMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ScannedAssetMetadataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public ScannedAssetMetadata() {}

  @JsonCreator
  public ScannedAssetMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ScannedAssetMetadataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
  }

  public ScannedAssetMetadata attributes(ScannedAssetMetadataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes of a scanned asset metadata.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScannedAssetMetadataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ScannedAssetMetadataAttributes attributes) {
    this.attributes = attributes;
  }

  public ScannedAssetMetadata id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the scanned asset metadata.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * @return ScannedAssetMetadata
   */
  @JsonAnySetter
  public ScannedAssetMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScannedAssetMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScannedAssetMetadata scannedAssetMetadata = (ScannedAssetMetadata) o;
    return Objects.equals(this.attributes, scannedAssetMetadata.attributes)
        && Objects.equals(this.id, scannedAssetMetadata.id)
        && Objects.equals(this.additionalProperties, scannedAssetMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScannedAssetMetadata {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
