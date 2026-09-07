/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Google Cloud Platform storage access configuration.</p>
 */
@JsonPropertyOrder({
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.JSON_PROPERTY_FILE_PATH,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.JSON_PROPERTY_GCP_BUCKET_NAME,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.JSON_PROPERTY_GCP_PROJECT_ID,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public static final String JSON_PROPERTY_GCP_BUCKET_NAME = "gcp_bucket_name";
  private String gcpBucketName;

  public static final String JSON_PROPERTY_GCP_PROJECT_ID = "gcp_project_id";
  private String gcpProjectId;

  public static final String JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL = "gcp_service_account_email";
  private String gcpServiceAccountEmail;

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail() {}

  @JsonCreator
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail(
            @JsonProperty(required=true, value=JSON_PROPERTY_FILE_PATH)String filePath,
            @JsonProperty(required=true, value=JSON_PROPERTY_GCP_BUCKET_NAME)String gcpBucketName,
            @JsonProperty(required=true, value=JSON_PROPERTY_GCP_PROJECT_ID)String gcpProjectId,
            @JsonProperty(required=true, value=JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL)String gcpServiceAccountEmail) {
        this.filePath = filePath;
        this.gcpBucketName = gcpBucketName;
        this.gcpProjectId = gcpProjectId;
        this.gcpServiceAccountEmail = gcpServiceAccountEmail;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * <p>The relative file path from the GCS bucket root to the CSV file.</p>
   * @return filePath
  **/
      @JsonProperty(JSON_PROPERTY_FILE_PATH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFilePath() {
        return filePath;
      }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpBucketName(String gcpBucketName) {
    this.gcpBucketName = gcpBucketName;
    return this;
  }

  /**
   * <p>GCP bucket containing the CSV file.</p>
   * @return gcpBucketName
  **/
      @JsonProperty(JSON_PROPERTY_GCP_BUCKET_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getGcpBucketName() {
        return gcpBucketName;
      }
  public void setGcpBucketName(String gcpBucketName) {
    this.gcpBucketName = gcpBucketName;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpProjectId(String gcpProjectId) {
    this.gcpProjectId = gcpProjectId;
    return this;
  }

  /**
   * <p>GCP project ID where the bucket is located.</p>
   * @return gcpProjectId
  **/
      @JsonProperty(JSON_PROPERTY_GCP_PROJECT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getGcpProjectId() {
        return gcpProjectId;
      }
  public void setGcpProjectId(String gcpProjectId) {
    this.gcpProjectId = gcpProjectId;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpServiceAccountEmail(String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
    return this;
  }

  /**
   * <p>Service account email with read permissions for the GCS bucket.</p>
   * @return gcpServiceAccountEmail
  **/
      @JsonProperty(JSON_PROPERTY_GCP_SERVICE_ACCOUNT_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getGcpServiceAccountEmail() {
        return gcpServiceAccountEmail;
      }
  public void setGcpServiceAccountEmail(String gcpServiceAccountEmail) {
    this.gcpServiceAccountEmail = gcpServiceAccountEmail;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail
   */
  @JsonAnySetter
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail = (CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail) o;
    return Objects.equals(this.filePath, createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.filePath) && Objects.equals(this.gcpBucketName, createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.gcpBucketName) && Objects.equals(this.gcpProjectId, createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.gcpProjectId) && Objects.equals(this.gcpServiceAccountEmail, createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.gcpServiceAccountEmail) && Objects.equals(this.additionalProperties, createTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filePath,gcpBucketName,gcpProjectId,gcpServiceAccountEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail {\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    gcpBucketName: ").append(toIndentedString(gcpBucketName)).append("\n");
    sb.append("    gcpProjectId: ").append(toIndentedString(gcpProjectId)).append("\n");
    sb.append("    gcpServiceAccountEmail: ").append(toIndentedString(gcpServiceAccountEmail)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
