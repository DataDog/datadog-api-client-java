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

/**
 * The definition of <code>CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
 * </code> object.
 */
@JsonPropertyOrder({
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
      .JSON_PROPERTY_AWS_ACCOUNT_ID,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
      .JSON_PROPERTY_AWS_BUCKET_NAME,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail.JSON_PROPERTY_FILE_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_ACCOUNT_ID = "aws_account_id";
  private String awsAccountId;

  public static final String JSON_PROPERTY_AWS_BUCKET_NAME = "aws_bucket_name";
  private String awsBucketName;

  public static final String JSON_PROPERTY_FILE_PATH = "file_path";
  private String filePath;

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail() {}

  @JsonCreator
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail(
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_ACCOUNT_ID) String awsAccountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_AWS_BUCKET_NAME) String awsBucketName,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE_PATH) String filePath) {
    this.awsAccountId = awsAccountId;
    this.awsBucketName = awsBucketName;
    this.filePath = filePath;
  }

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail awsAccountId(
      String awsAccountId) {
    this.awsAccountId = awsAccountId;
    return this;
  }

  /**
   * The ID of the AWS account.
   *
   * @return awsAccountId
   */
  @JsonProperty(JSON_PROPERTY_AWS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsAccountId() {
    return awsAccountId;
  }

  public void setAwsAccountId(String awsAccountId) {
    this.awsAccountId = awsAccountId;
  }

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail awsBucketName(
      String awsBucketName) {
    this.awsBucketName = awsBucketName;
    return this;
  }

  /**
   * The name of the Amazon S3 bucket.
   *
   * @return awsBucketName
   */
  @JsonProperty(JSON_PROPERTY_AWS_BUCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAwsBucketName() {
    return awsBucketName;
  }

  public void setAwsBucketName(String awsBucketName) {
    this.awsBucketName = awsBucketName;
  }

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail filePath(
      String filePath) {
    this.filePath = filePath;
    return this;
  }

  /**
   * The relative file path from the S3 bucket root to the CSV file.
   *
   * @return filePath
   */
  @JsonProperty(JSON_PROPERTY_FILE_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
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
   * @return CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
   */
  @JsonAnySetter
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
        createTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail =
            (CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail) o;
    return Objects.equals(
            this.awsAccountId,
            createTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail.awsAccountId)
        && Objects.equals(
            this.awsBucketName,
            createTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail.awsBucketName)
        && Objects.equals(
            this.filePath,
            createTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail.filePath)
        && Objects.equals(
            this.additionalProperties,
            createTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsAccountId, awsBucketName, filePath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail {\n");
    sb.append("    awsAccountId: ").append(toIndentedString(awsAccountId)).append("\n");
    sb.append("    awsBucketName: ").append(toIndentedString(awsBucketName)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
