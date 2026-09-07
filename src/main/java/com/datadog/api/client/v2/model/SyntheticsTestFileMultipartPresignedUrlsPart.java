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

/** A part descriptor for initiating a multipart upload. */
@JsonPropertyOrder({
  SyntheticsTestFileMultipartPresignedUrlsPart.JSON_PROPERTY_MD5,
  SyntheticsTestFileMultipartPresignedUrlsPart.JSON_PROPERTY_PART_NUMBER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestFileMultipartPresignedUrlsPart {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MD5 = "md5";
  private String md5;

  public static final String JSON_PROPERTY_PART_NUMBER = "partNumber";
  private Long partNumber;

  public SyntheticsTestFileMultipartPresignedUrlsPart() {}

  @JsonCreator
  public SyntheticsTestFileMultipartPresignedUrlsPart(
      @JsonProperty(required = true, value = JSON_PROPERTY_MD5) String md5,
      @JsonProperty(required = true, value = JSON_PROPERTY_PART_NUMBER) Long partNumber) {
    this.md5 = md5;
    this.partNumber = partNumber;
  }

  public SyntheticsTestFileMultipartPresignedUrlsPart md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * Base64-encoded MD5 digest of the part content.
   *
   * @return md5
   */
  @JsonProperty(JSON_PROPERTY_MD5)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public SyntheticsTestFileMultipartPresignedUrlsPart partNumber(Long partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  /**
   * The 1-indexed part number for the multipart upload.
   *
   * @return partNumber
   */
  @JsonProperty(JSON_PROPERTY_PART_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(Long partNumber) {
    this.partNumber = partNumber;
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
   * @return SyntheticsTestFileMultipartPresignedUrlsPart
   */
  @JsonAnySetter
  public SyntheticsTestFileMultipartPresignedUrlsPart putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SyntheticsTestFileMultipartPresignedUrlsPart object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestFileMultipartPresignedUrlsPart syntheticsTestFileMultipartPresignedUrlsPart =
        (SyntheticsTestFileMultipartPresignedUrlsPart) o;
    return Objects.equals(this.md5, syntheticsTestFileMultipartPresignedUrlsPart.md5)
        && Objects.equals(this.partNumber, syntheticsTestFileMultipartPresignedUrlsPart.partNumber)
        && Objects.equals(
            this.additionalProperties,
            syntheticsTestFileMultipartPresignedUrlsPart.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md5, partNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestFileMultipartPresignedUrlsPart {\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
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
