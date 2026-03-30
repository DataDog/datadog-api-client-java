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

/** Request body for completing a multipart file upload. */
@JsonPropertyOrder({
  SyntheticsTestFileCompleteMultipartUploadRequest.JSON_PROPERTY_KEY,
  SyntheticsTestFileCompleteMultipartUploadRequest.JSON_PROPERTY_PARTS,
  SyntheticsTestFileCompleteMultipartUploadRequest.JSON_PROPERTY_UPLOAD_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestFileCompleteMultipartUploadRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private List<SyntheticsTestFileCompleteMultipartUploadPart> parts = new ArrayList<>();

  public static final String JSON_PROPERTY_UPLOAD_ID = "uploadId";
  private String uploadId;

  public SyntheticsTestFileCompleteMultipartUploadRequest() {}

  @JsonCreator
  public SyntheticsTestFileCompleteMultipartUploadRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARTS)
          List<SyntheticsTestFileCompleteMultipartUploadPart> parts,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPLOAD_ID) String uploadId) {
    this.key = key;
    this.parts = parts;
    this.uploadId = uploadId;
  }

  public SyntheticsTestFileCompleteMultipartUploadRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The full storage path for the uploaded file.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SyntheticsTestFileCompleteMultipartUploadRequest parts(
      List<SyntheticsTestFileCompleteMultipartUploadPart> parts) {
    this.parts = parts;
    for (SyntheticsTestFileCompleteMultipartUploadPart item : parts) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestFileCompleteMultipartUploadRequest addPartsItem(
      SyntheticsTestFileCompleteMultipartUploadPart partsItem) {
    this.parts.add(partsItem);
    this.unparsed |= partsItem.unparsed;
    return this;
  }

  /**
   * Array of completed parts with their ETags.
   *
   * @return parts
   */
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SyntheticsTestFileCompleteMultipartUploadPart> getParts() {
    return parts;
  }

  public void setParts(List<SyntheticsTestFileCompleteMultipartUploadPart> parts) {
    this.parts = parts;
  }

  public SyntheticsTestFileCompleteMultipartUploadRequest uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * The upload ID returned when the multipart upload was initiated.
   *
   * @return uploadId
   */
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
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
   * @return SyntheticsTestFileCompleteMultipartUploadRequest
   */
  @JsonAnySetter
  public SyntheticsTestFileCompleteMultipartUploadRequest putAdditionalProperty(
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

  /** Return true if this SyntheticsTestFileCompleteMultipartUploadRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestFileCompleteMultipartUploadRequest
        syntheticsTestFileCompleteMultipartUploadRequest =
            (SyntheticsTestFileCompleteMultipartUploadRequest) o;
    return Objects.equals(this.key, syntheticsTestFileCompleteMultipartUploadRequest.key)
        && Objects.equals(this.parts, syntheticsTestFileCompleteMultipartUploadRequest.parts)
        && Objects.equals(this.uploadId, syntheticsTestFileCompleteMultipartUploadRequest.uploadId)
        && Objects.equals(
            this.additionalProperties,
            syntheticsTestFileCompleteMultipartUploadRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, parts, uploadId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestFileCompleteMultipartUploadRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
