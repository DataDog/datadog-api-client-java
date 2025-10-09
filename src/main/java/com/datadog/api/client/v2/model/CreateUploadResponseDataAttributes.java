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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The definition of <code>CreateUploadResponseDataAttributes</code> object. */
@JsonPropertyOrder({CreateUploadResponseDataAttributes.JSON_PROPERTY_PART_URLS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateUploadResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PART_URLS = "part_urls";
  private List<String> partUrls = null;

  public CreateUploadResponseDataAttributes partUrls(List<String> partUrls) {
    this.partUrls = partUrls;
    return this;
  }

  public CreateUploadResponseDataAttributes addPartUrlsItem(String partUrlsItem) {
    if (this.partUrls == null) {
      this.partUrls = new ArrayList<>();
    }
    this.partUrls.add(partUrlsItem);
    return this;
  }

  /**
   * The URLs of the parts in the upload.
   *
   * @return partUrls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PART_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getPartUrls() {
    return partUrls;
  }

  public void setPartUrls(List<String> partUrls) {
    this.partUrls = partUrls;
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
   * @return CreateUploadResponseDataAttributes
   */
  @JsonAnySetter
  public CreateUploadResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateUploadResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadResponseDataAttributes createUploadResponseDataAttributes =
        (CreateUploadResponseDataAttributes) o;
    return Objects.equals(this.partUrls, createUploadResponseDataAttributes.partUrls)
        && Objects.equals(
            this.additionalProperties, createUploadResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partUrls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadResponseDataAttributes {\n");
    sb.append("    partUrls: ").append(toIndentedString(partUrls)).append("\n");
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
