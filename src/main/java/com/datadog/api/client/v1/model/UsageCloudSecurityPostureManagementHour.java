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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Cloud Security Management Pro usage for a given organization for a given hour. */
@JsonPropertyOrder({
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_AAS_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_AWS_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_AZURE_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_COMPLIANCE_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_CONTAINER_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_GCP_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_HOST_COUNT,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_HOUR,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_ORG_NAME,
  UsageCloudSecurityPostureManagementHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCloudSecurityPostureManagementHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AAS_HOST_COUNT = "aas_host_count";
  private JsonNullable<Double> aasHostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AWS_HOST_COUNT = "aws_host_count";
  private JsonNullable<Double> awsHostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AZURE_HOST_COUNT = "azure_host_count";
  private JsonNullable<Double> azureHostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COMPLIANCE_HOST_COUNT = "compliance_host_count";
  private JsonNullable<Double> complianceHostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CONTAINER_COUNT = "container_count";
  private JsonNullable<Double> containerCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_GCP_HOST_COUNT = "gcp_host_count";
  private JsonNullable<Double> gcpHostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private JsonNullable<Double> hostCount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageCloudSecurityPostureManagementHour aasHostCount(Double aasHostCount) {
    this.aasHostCount = JsonNullable.<Double>of(aasHostCount);
    return this;
  }

  /**
   * The number of Cloud Security Management Pro Azure app services hosts during a given hour.
   *
   * @return aasHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAasHostCount() {
    return aasHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AAS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAasHostCount_JsonNullable() {
    return aasHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AAS_HOST_COUNT)
  public void setAasHostCount_JsonNullable(JsonNullable<Double> aasHostCount) {
    this.aasHostCount = aasHostCount;
  }

  public void setAasHostCount(Double aasHostCount) {
    this.aasHostCount = JsonNullable.<Double>of(aasHostCount);
  }

  public UsageCloudSecurityPostureManagementHour awsHostCount(Double awsHostCount) {
    this.awsHostCount = JsonNullable.<Double>of(awsHostCount);
    return this;
  }

  /**
   * The number of Cloud Security Management Pro AWS hosts during a given hour.
   *
   * @return awsHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAwsHostCount() {
    return awsHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAwsHostCount_JsonNullable() {
    return awsHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_COUNT)
  public void setAwsHostCount_JsonNullable(JsonNullable<Double> awsHostCount) {
    this.awsHostCount = awsHostCount;
  }

  public void setAwsHostCount(Double awsHostCount) {
    this.awsHostCount = JsonNullable.<Double>of(awsHostCount);
  }

  public UsageCloudSecurityPostureManagementHour azureHostCount(Double azureHostCount) {
    this.azureHostCount = JsonNullable.<Double>of(azureHostCount);
    return this;
  }

  /**
   * The number of Cloud Security Management Pro Azure hosts during a given hour.
   *
   * @return azureHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getAzureHostCount() {
    return azureHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AZURE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getAzureHostCount_JsonNullable() {
    return azureHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AZURE_HOST_COUNT)
  public void setAzureHostCount_JsonNullable(JsonNullable<Double> azureHostCount) {
    this.azureHostCount = azureHostCount;
  }

  public void setAzureHostCount(Double azureHostCount) {
    this.azureHostCount = JsonNullable.<Double>of(azureHostCount);
  }

  public UsageCloudSecurityPostureManagementHour complianceHostCount(Double complianceHostCount) {
    this.complianceHostCount = JsonNullable.<Double>of(complianceHostCount);
    return this;
  }

  /**
   * The number of Cloud Security Management Pro hosts during a given hour.
   *
   * @return complianceHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getComplianceHostCount() {
    return complianceHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLIANCE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getComplianceHostCount_JsonNullable() {
    return complianceHostCount;
  }

  @JsonProperty(JSON_PROPERTY_COMPLIANCE_HOST_COUNT)
  public void setComplianceHostCount_JsonNullable(JsonNullable<Double> complianceHostCount) {
    this.complianceHostCount = complianceHostCount;
  }

  public void setComplianceHostCount(Double complianceHostCount) {
    this.complianceHostCount = JsonNullable.<Double>of(complianceHostCount);
  }

  public UsageCloudSecurityPostureManagementHour containerCount(Double containerCount) {
    this.containerCount = JsonNullable.<Double>of(containerCount);
    return this;
  }

  /**
   * The total number of Cloud Security Management Pro containers during a given hour.
   *
   * @return containerCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getContainerCount() {
    return containerCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getContainerCount_JsonNullable() {
    return containerCount;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  public void setContainerCount_JsonNullable(JsonNullable<Double> containerCount) {
    this.containerCount = containerCount;
  }

  public void setContainerCount(Double containerCount) {
    this.containerCount = JsonNullable.<Double>of(containerCount);
  }

  public UsageCloudSecurityPostureManagementHour gcpHostCount(Double gcpHostCount) {
    this.gcpHostCount = JsonNullable.<Double>of(gcpHostCount);
    return this;
  }

  /**
   * The number of Cloud Security Management Pro GCP hosts during a given hour.
   *
   * @return gcpHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getGcpHostCount() {
    return gcpHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getGcpHostCount_JsonNullable() {
    return gcpHostCount;
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_COUNT)
  public void setGcpHostCount_JsonNullable(JsonNullable<Double> gcpHostCount) {
    this.gcpHostCount = gcpHostCount;
  }

  public void setGcpHostCount(Double gcpHostCount) {
    this.gcpHostCount = JsonNullable.<Double>of(gcpHostCount);
  }

  public UsageCloudSecurityPostureManagementHour hostCount(Double hostCount) {
    this.hostCount = JsonNullable.<Double>of(hostCount);
    return this;
  }

  /**
   * The total number of Cloud Security Management Pro hosts during a given hour.
   *
   * @return hostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getHostCount() {
    return hostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getHostCount_JsonNullable() {
    return hostCount;
  }

  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  public void setHostCount_JsonNullable(JsonNullable<Double> hostCount) {
    this.hostCount = hostCount;
  }

  public void setHostCount(Double hostCount) {
    this.hostCount = JsonNullable.<Double>of(hostCount);
  }

  public UsageCloudSecurityPostureManagementHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getHour() {
    return hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }

  public UsageCloudSecurityPostureManagementHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UsageCloudSecurityPostureManagementHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
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
   * @return UsageCloudSecurityPostureManagementHour
   */
  @JsonAnySetter
  public UsageCloudSecurityPostureManagementHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageCloudSecurityPostureManagementHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCloudSecurityPostureManagementHour usageCloudSecurityPostureManagementHour =
        (UsageCloudSecurityPostureManagementHour) o;
    return Objects.equals(this.aasHostCount, usageCloudSecurityPostureManagementHour.aasHostCount)
        && Objects.equals(this.awsHostCount, usageCloudSecurityPostureManagementHour.awsHostCount)
        && Objects.equals(
            this.azureHostCount, usageCloudSecurityPostureManagementHour.azureHostCount)
        && Objects.equals(
            this.complianceHostCount, usageCloudSecurityPostureManagementHour.complianceHostCount)
        && Objects.equals(
            this.containerCount, usageCloudSecurityPostureManagementHour.containerCount)
        && Objects.equals(this.gcpHostCount, usageCloudSecurityPostureManagementHour.gcpHostCount)
        && Objects.equals(this.hostCount, usageCloudSecurityPostureManagementHour.hostCount)
        && Objects.equals(this.hour, usageCloudSecurityPostureManagementHour.hour)
        && Objects.equals(this.orgName, usageCloudSecurityPostureManagementHour.orgName)
        && Objects.equals(this.publicId, usageCloudSecurityPostureManagementHour.publicId)
        && Objects.equals(
            this.additionalProperties,
            usageCloudSecurityPostureManagementHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aasHostCount,
        awsHostCount,
        azureHostCount,
        complianceHostCount,
        containerCount,
        gcpHostCount,
        hostCount,
        hour,
        orgName,
        publicId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCloudSecurityPostureManagementHour {\n");
    sb.append("    aasHostCount: ").append(toIndentedString(aasHostCount)).append("\n");
    sb.append("    awsHostCount: ").append(toIndentedString(awsHostCount)).append("\n");
    sb.append("    azureHostCount: ").append(toIndentedString(azureHostCount)).append("\n");
    sb.append("    complianceHostCount: ")
        .append(toIndentedString(complianceHostCount))
        .append("\n");
    sb.append("    containerCount: ").append(toIndentedString(containerCount)).append("\n");
    sb.append("    gcpHostCount: ").append(toIndentedString(gcpHostCount)).append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
