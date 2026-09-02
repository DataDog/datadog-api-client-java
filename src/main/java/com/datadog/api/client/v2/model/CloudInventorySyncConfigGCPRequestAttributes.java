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

/** GCP settings for buckets involved in inventory reporting. */
@JsonPropertyOrder({
  CloudInventorySyncConfigGCPRequestAttributes.JSON_PROPERTY_DESTINATION_BUCKET_NAME,
  CloudInventorySyncConfigGCPRequestAttributes.JSON_PROPERTY_PROJECT_ID,
  CloudInventorySyncConfigGCPRequestAttributes.JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL,
  CloudInventorySyncConfigGCPRequestAttributes.JSON_PROPERTY_SOURCE_BUCKET_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudInventorySyncConfigGCPRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION_BUCKET_NAME = "destination_bucket_name";
  private String destinationBucketName;

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private String projectId;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL = "service_account_email";
  private String serviceAccountEmail;

  public static final String JSON_PROPERTY_SOURCE_BUCKET_NAME = "source_bucket_name";
  private String sourceBucketName;

  public CloudInventorySyncConfigGCPRequestAttributes() {}

  @JsonCreator
  public CloudInventorySyncConfigGCPRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESTINATION_BUCKET_NAME)
          String destinationBucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) String projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL)
          String serviceAccountEmail,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_BUCKET_NAME)
          String sourceBucketName) {
    this.destinationBucketName = destinationBucketName;
    this.projectId = projectId;
    this.serviceAccountEmail = serviceAccountEmail;
    this.sourceBucketName = sourceBucketName;
  }

  public CloudInventorySyncConfigGCPRequestAttributes destinationBucketName(
      String destinationBucketName) {
    this.destinationBucketName = destinationBucketName;
    return this;
  }

  /**
   * GCS bucket name where Datadog reads inventory reports.
   *
   * @return destinationBucketName
   */
  @JsonProperty(JSON_PROPERTY_DESTINATION_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestinationBucketName() {
    return destinationBucketName;
  }

  public void setDestinationBucketName(String destinationBucketName) {
    this.destinationBucketName = destinationBucketName;
  }

  public CloudInventorySyncConfigGCPRequestAttributes projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * GCP project ID for the inventory destination bucket.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public CloudInventorySyncConfigGCPRequestAttributes serviceAccountEmail(
      String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * Service account email used to read the destination bucket.
   *
   * @return serviceAccountEmail
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }

  public CloudInventorySyncConfigGCPRequestAttributes sourceBucketName(String sourceBucketName) {
    this.sourceBucketName = sourceBucketName;
    return this;
  }

  /**
   * GCS bucket name that inventory reports are generated for.
   *
   * @return sourceBucketName
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceBucketName() {
    return sourceBucketName;
  }

  public void setSourceBucketName(String sourceBucketName) {
    this.sourceBucketName = sourceBucketName;
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
   * @return CloudInventorySyncConfigGCPRequestAttributes
   */
  @JsonAnySetter
  public CloudInventorySyncConfigGCPRequestAttributes putAdditionalProperty(
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

  /** Return true if this CloudInventorySyncConfigGCPRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInventorySyncConfigGCPRequestAttributes cloudInventorySyncConfigGcpRequestAttributes =
        (CloudInventorySyncConfigGCPRequestAttributes) o;
    return Objects.equals(
            this.destinationBucketName,
            cloudInventorySyncConfigGcpRequestAttributes.destinationBucketName)
        && Objects.equals(this.projectId, cloudInventorySyncConfigGcpRequestAttributes.projectId)
        && Objects.equals(
            this.serviceAccountEmail,
            cloudInventorySyncConfigGcpRequestAttributes.serviceAccountEmail)
        && Objects.equals(
            this.sourceBucketName, cloudInventorySyncConfigGcpRequestAttributes.sourceBucketName)
        && Objects.equals(
            this.additionalProperties,
            cloudInventorySyncConfigGcpRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destinationBucketName,
        projectId,
        serviceAccountEmail,
        sourceBucketName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInventorySyncConfigGCPRequestAttributes {\n");
    sb.append("    destinationBucketName: ")
        .append(toIndentedString(destinationBucketName))
        .append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    serviceAccountEmail: ")
        .append(toIndentedString(serviceAccountEmail))
        .append("\n");
    sb.append("    sourceBucketName: ").append(toIndentedString(sourceBucketName)).append("\n");
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
