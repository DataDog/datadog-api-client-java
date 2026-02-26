/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Define a request certificate. */
@JsonPropertyOrder({
  SyntheticsTestRequestCertificateItem.JSON_PROPERTY_CONTENT,
  SyntheticsTestRequestCertificateItem.JSON_PROPERTY_FILENAME,
  SyntheticsTestRequestCertificateItem.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestRequestCertificateItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public SyntheticsTestRequestCertificateItem content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Content of the certificate or key.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public SyntheticsTestRequestCertificateItem filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * File name for the certificate or key.
   *
   * @return filename
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public SyntheticsTestRequestCertificateItem updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date of update of the certificate or key, ISO format.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return SyntheticsTestRequestCertificateItem
   */
  @JsonAnySetter
  public SyntheticsTestRequestCertificateItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestRequestCertificateItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestRequestCertificateItem syntheticsTestRequestCertificateItem =
        (SyntheticsTestRequestCertificateItem) o;
    return Objects.equals(this.content, syntheticsTestRequestCertificateItem.content)
        && Objects.equals(this.filename, syntheticsTestRequestCertificateItem.filename)
        && Objects.equals(this.updatedAt, syntheticsTestRequestCertificateItem.updatedAt)
        && Objects.equals(
            this.additionalProperties, syntheticsTestRequestCertificateItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, filename, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestRequestCertificateItem {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
