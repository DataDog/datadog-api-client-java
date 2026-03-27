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
   * <p>Cloud storage access configuration for the reference table data file.</p>
 */
@JsonPropertyOrder({
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails.JSON_PROPERTY_AWS_DETAIL,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails.JSON_PROPERTY_AZURE_DETAIL,
  CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails.JSON_PROPERTY_GCP_DETAIL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS_DETAIL = "aws_detail";
  private CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail awsDetail;

  public static final String JSON_PROPERTY_AZURE_DETAIL = "azure_detail";
  private CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail azureDetail;

  public static final String JSON_PROPERTY_GCP_DETAIL = "gcp_detail";
  private CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpDetail;

  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails awsDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail awsDetail) {
    this.awsDetail = awsDetail;
    this.unparsed |= awsDetail.unparsed;
    return this;
  }

  /**
   * <p>Amazon Web Services S3 storage access configuration.</p>
   * @return awsDetail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AWS_DETAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail getAwsDetail() {
        return awsDetail;
      }
  public void setAwsDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAwsDetail awsDetail) {
    this.awsDetail = awsDetail;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails azureDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail azureDetail) {
    this.azureDetail = azureDetail;
    this.unparsed |= azureDetail.unparsed;
    return this;
  }

  /**
   * <p>Azure Blob Storage access configuration.</p>
   * @return azureDetail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AZURE_DETAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail getAzureDetail() {
        return azureDetail;
      }
  public void setAzureDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsAzureDetail azureDetail) {
    this.azureDetail = azureDetail;
  }
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails gcpDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpDetail) {
    this.gcpDetail = gcpDetail;
    this.unparsed |= gcpDetail.unparsed;
    return this;
  }

  /**
   * <p>Google Cloud Platform storage access configuration.</p>
   * @return gcpDetail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GCP_DETAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail getGcpDetail() {
        return gcpDetail;
      }
  public void setGcpDetail(CreateTableRequestDataAttributesFileMetadataOneOfAccessDetailsGcpDetail gcpDetail) {
    this.gcpDetail = gcpDetail;
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
   * @return CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails
   */
  @JsonAnySetter
  public CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails createTableRequestDataAttributesFileMetadataOneOfAccessDetails = (CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails) o;
    return Objects.equals(this.awsDetail, createTableRequestDataAttributesFileMetadataOneOfAccessDetails.awsDetail) && Objects.equals(this.azureDetail, createTableRequestDataAttributesFileMetadataOneOfAccessDetails.azureDetail) && Objects.equals(this.gcpDetail, createTableRequestDataAttributesFileMetadataOneOfAccessDetails.gcpDetail) && Objects.equals(this.additionalProperties, createTableRequestDataAttributesFileMetadataOneOfAccessDetails.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(awsDetail,azureDetail,gcpDetail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributesFileMetadataOneOfAccessDetails {\n");
    sb.append("    awsDetail: ").append(toIndentedString(awsDetail)).append("\n");
    sb.append("    azureDetail: ").append(toIndentedString(azureDetail)).append("\n");
    sb.append("    gcpDetail: ").append(toIndentedString(gcpDetail)).append("\n");
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
