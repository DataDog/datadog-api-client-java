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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Request body for getting presigned URLs for a multipart file upload. */
@JsonPropertyOrder({
  SyntheticsTestFileMultipartPresignedUrlsRequest.JSON_PROPERTY_BUCKET_KEY_PREFIX,
  SyntheticsTestFileMultipartPresignedUrlsRequest.JSON_PROPERTY_PARTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestFileMultipartPresignedUrlsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_KEY_PREFIX = "bucketKeyPrefix";
  private SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix bucketKeyPrefix;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private List<SyntheticsTestFileMultipartPresignedUrlsPart> parts = new ArrayList<>();

  public SyntheticsTestFileMultipartPresignedUrlsRequest() {}

  @JsonCreator
  public SyntheticsTestFileMultipartPresignedUrlsRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_KEY_PREFIX)
          SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix bucketKeyPrefix,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARTS)
          List<SyntheticsTestFileMultipartPresignedUrlsPart> parts) {
    this.bucketKeyPrefix = bucketKeyPrefix;
    this.unparsed |= !bucketKeyPrefix.isValid();
    this.parts = parts;
  }

  public SyntheticsTestFileMultipartPresignedUrlsRequest bucketKeyPrefix(
      SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix bucketKeyPrefix) {
    this.bucketKeyPrefix = bucketKeyPrefix;
    this.unparsed |= !bucketKeyPrefix.isValid();
    return this;
  }

  /**
   * The bucket key prefix indicating the type of file upload.
   *
   * @return bucketKeyPrefix
   */
  @JsonProperty(JSON_PROPERTY_BUCKET_KEY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix getBucketKeyPrefix() {
    return bucketKeyPrefix;
  }

  public void setBucketKeyPrefix(
      SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix bucketKeyPrefix) {
    if (!bucketKeyPrefix.isValid()) {
      this.unparsed = true;
    }
    this.bucketKeyPrefix = bucketKeyPrefix;
  }

  public SyntheticsTestFileMultipartPresignedUrlsRequest parts(
      List<SyntheticsTestFileMultipartPresignedUrlsPart> parts) {
    this.parts = parts;
    for (SyntheticsTestFileMultipartPresignedUrlsPart item : parts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestFileMultipartPresignedUrlsRequest addPartsItem(
      SyntheticsTestFileMultipartPresignedUrlsPart partsItem) {
    this.parts.add(partsItem);
    this.unparsed |= partsItem.unparsed;
    return this;
  }

  /**
   * Array of part descriptors for the multipart upload.
   *
   * @return parts
   */
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsTestFileMultipartPresignedUrlsPart> getParts() {
    return parts;
  }

  public void setParts(List<SyntheticsTestFileMultipartPresignedUrlsPart> parts) {
    this.parts = parts;
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
   * @return SyntheticsTestFileMultipartPresignedUrlsRequest
   */
  @JsonAnySetter
  public SyntheticsTestFileMultipartPresignedUrlsRequest putAdditionalProperty(
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

  /** Return true if this SyntheticsTestFileMultipartPresignedUrlsRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestFileMultipartPresignedUrlsRequest
        syntheticsTestFileMultipartPresignedUrlsRequest =
            (SyntheticsTestFileMultipartPresignedUrlsRequest) o;
    return Objects.equals(
            this.bucketKeyPrefix, syntheticsTestFileMultipartPresignedUrlsRequest.bucketKeyPrefix)
        && Objects.equals(this.parts, syntheticsTestFileMultipartPresignedUrlsRequest.parts)
        && Objects.equals(
            this.additionalProperties,
            syntheticsTestFileMultipartPresignedUrlsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKeyPrefix, parts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestFileMultipartPresignedUrlsRequest {\n");
    sb.append("    bucketKeyPrefix: ").append(toIndentedString(bucketKeyPrefix)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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
