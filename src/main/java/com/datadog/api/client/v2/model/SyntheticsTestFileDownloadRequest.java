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

/** Request body for getting a presigned download URL for a test file. */
@JsonPropertyOrder({SyntheticsTestFileDownloadRequest.JSON_PROPERTY_BUCKET_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestFileDownloadRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUCKET_KEY = "bucketKey";
  private String bucketKey;

  public SyntheticsTestFileDownloadRequest() {}

  @JsonCreator
  public SyntheticsTestFileDownloadRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUCKET_KEY) String bucketKey) {
    this.bucketKey = bucketKey;
  }

  public SyntheticsTestFileDownloadRequest bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

  /**
   * The bucket key referencing the file to download.
   *
   * @return bucketKey
   */
  @JsonProperty(JSON_PROPERTY_BUCKET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBucketKey() {
    return bucketKey;
  }

  public void setBucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
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
   * @return SyntheticsTestFileDownloadRequest
   */
  @JsonAnySetter
  public SyntheticsTestFileDownloadRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestFileDownloadRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestFileDownloadRequest syntheticsTestFileDownloadRequest =
        (SyntheticsTestFileDownloadRequest) o;
    return Objects.equals(this.bucketKey, syntheticsTestFileDownloadRequest.bucketKey)
        && Objects.equals(
            this.additionalProperties, syntheticsTestFileDownloadRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestFileDownloadRequest {\n");
    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
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
