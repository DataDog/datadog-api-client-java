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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Settings for the cloud provider specified in <code>data.id</code>. Include only the matching
 * provider object (<code>aws</code>, <code>gcp</code>, or <code>azure</code>).
 */
@JsonPropertyOrder({
  UpsertCloudInventorySyncConfigRequestAttributes.JSON_PROPERTY_AWS,
  UpsertCloudInventorySyncConfigRequestAttributes.JSON_PROPERTY_AZURE,
  UpsertCloudInventorySyncConfigRequestAttributes.JSON_PROPERTY_GCP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertCloudInventorySyncConfigRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AWS = "aws";
  private CloudInventorySyncConfigAWSRequestAttributes aws;

  public static final String JSON_PROPERTY_AZURE = "azure";
  private CloudInventorySyncConfigAzureRequestAttributes azure;

  public static final String JSON_PROPERTY_GCP = "gcp";
  private CloudInventorySyncConfigGCPRequestAttributes gcp;

  public UpsertCloudInventorySyncConfigRequestAttributes aws(
      CloudInventorySyncConfigAWSRequestAttributes aws) {
    this.aws = aws;
    this.unparsed |= aws.unparsed;
    return this;
  }

  /**
   * AWS settings for the S3 bucket Storage Management reads inventory reports from.
   *
   * @return aws
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudInventorySyncConfigAWSRequestAttributes getAws() {
    return aws;
  }

  public void setAws(CloudInventorySyncConfigAWSRequestAttributes aws) {
    this.aws = aws;
  }

  public UpsertCloudInventorySyncConfigRequestAttributes azure(
      CloudInventorySyncConfigAzureRequestAttributes azure) {
    this.azure = azure;
    this.unparsed |= azure.unparsed;
    return this;
  }

  /**
   * Azure settings for the storage account and container with inventory data.
   *
   * @return azure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudInventorySyncConfigAzureRequestAttributes getAzure() {
    return azure;
  }

  public void setAzure(CloudInventorySyncConfigAzureRequestAttributes azure) {
    this.azure = azure;
  }

  public UpsertCloudInventorySyncConfigRequestAttributes gcp(
      CloudInventorySyncConfigGCPRequestAttributes gcp) {
    this.gcp = gcp;
    this.unparsed |= gcp.unparsed;
    return this;
  }

  /**
   * GCP settings for buckets involved in inventory reporting.
   *
   * @return gcp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudInventorySyncConfigGCPRequestAttributes getGcp() {
    return gcp;
  }

  public void setGcp(CloudInventorySyncConfigGCPRequestAttributes gcp) {
    this.gcp = gcp;
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
   * @return UpsertCloudInventorySyncConfigRequestAttributes
   */
  @JsonAnySetter
  public UpsertCloudInventorySyncConfigRequestAttributes putAdditionalProperty(
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

  /** Return true if this UpsertCloudInventorySyncConfigRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCloudInventorySyncConfigRequestAttributes
        upsertCloudInventorySyncConfigRequestAttributes =
            (UpsertCloudInventorySyncConfigRequestAttributes) o;
    return Objects.equals(this.aws, upsertCloudInventorySyncConfigRequestAttributes.aws)
        && Objects.equals(this.azure, upsertCloudInventorySyncConfigRequestAttributes.azure)
        && Objects.equals(this.gcp, upsertCloudInventorySyncConfigRequestAttributes.gcp)
        && Objects.equals(
            this.additionalProperties,
            upsertCloudInventorySyncConfigRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, azure, gcp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCloudInventorySyncConfigRequestAttributes {\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcp: ").append(toIndentedString(gcp)).append("\n");
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
