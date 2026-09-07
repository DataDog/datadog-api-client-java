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

/** Number of hosts/containers recorded for each hour for a given organization. */
@JsonPropertyOrder({
  UsageHostHour.JSON_PROPERTY_AGENT_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_ALIBABA_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_APM_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_AWS_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_AZURE_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_CONTAINER_COUNT,
  UsageHostHour.JSON_PROPERTY_GCP_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_HEROKU_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_HOUR,
  UsageHostHour.JSON_PROPERTY_INFRA_AZURE_APP_SERVICE,
  UsageHostHour.JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT,
  UsageHostHour.JSON_PROPERTY_ORG_NAME,
  UsageHostHour.JSON_PROPERTY_PUBLIC_ID,
  UsageHostHour.JSON_PROPERTY_VSPHERE_HOST_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageHostHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_HOST_COUNT = "agent_host_count";
  private JsonNullable<Long> agentHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ALIBABA_HOST_COUNT = "alibaba_host_count";
  private JsonNullable<Long> alibabaHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT =
      "apm_azure_app_service_host_count";
  private JsonNullable<Long> apmAzureAppServiceHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APM_HOST_COUNT = "apm_host_count";
  private JsonNullable<Long> apmHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AWS_HOST_COUNT = "aws_host_count";
  private JsonNullable<Long> awsHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AZURE_HOST_COUNT = "azure_host_count";
  private JsonNullable<Long> azureHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CONTAINER_COUNT = "container_count";
  private JsonNullable<Long> containerCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_GCP_HOST_COUNT = "gcp_host_count";
  private JsonNullable<Long> gcpHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HEROKU_HOST_COUNT = "heroku_host_count";
  private JsonNullable<Long> herokuHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private JsonNullable<Long> hostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private JsonNullable<OffsetDateTime> hour = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_INFRA_AZURE_APP_SERVICE = "infra_azure_app_service";
  private JsonNullable<Long> infraAzureAppService = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT =
      "opentelemetry_apm_host_count";
  private JsonNullable<Long> opentelemetryApmHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT = "opentelemetry_host_count";
  private JsonNullable<Long> opentelemetryHostCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_VSPHERE_HOST_COUNT = "vsphere_host_count";
  private JsonNullable<Long> vsphereHostCount = JsonNullable.<Long>undefined();

  public UsageHostHour agentHostCount(Long agentHostCount) {
    this.agentHostCount = JsonNullable.<Long>of(agentHostCount);
    return this;
  }

  /**
   * Contains the total number of infrastructure hosts reporting during a given hour that were
   * running the Datadog Agent.
   *
   * @return agentHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAgentHostCount() {
    return agentHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAgentHostCount_JsonNullable() {
    return agentHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AGENT_HOST_COUNT)
  public void setAgentHostCount_JsonNullable(JsonNullable<Long> agentHostCount) {
    this.agentHostCount = agentHostCount;
  }

  public void setAgentHostCount(Long agentHostCount) {
    this.agentHostCount = JsonNullable.<Long>of(agentHostCount);
  }

  public UsageHostHour alibabaHostCount(Long alibabaHostCount) {
    this.alibabaHostCount = JsonNullable.<Long>of(alibabaHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through Alibaba integration (and were NOT
   * running the Datadog Agent).
   *
   * @return alibabaHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAlibabaHostCount() {
    return alibabaHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALIBABA_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAlibabaHostCount_JsonNullable() {
    return alibabaHostCount;
  }

  @JsonProperty(JSON_PROPERTY_ALIBABA_HOST_COUNT)
  public void setAlibabaHostCount_JsonNullable(JsonNullable<Long> alibabaHostCount) {
    this.alibabaHostCount = alibabaHostCount;
  }

  public void setAlibabaHostCount(Long alibabaHostCount) {
    this.alibabaHostCount = JsonNullable.<Long>of(alibabaHostCount);
  }

  public UsageHostHour apmAzureAppServiceHostCount(Long apmAzureAppServiceHostCount) {
    this.apmAzureAppServiceHostCount = JsonNullable.<Long>of(apmAzureAppServiceHostCount);
    return this;
  }

  /**
   * Contains the total number of Azure App Services hosts using APM.
   *
   * @return apmAzureAppServiceHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmAzureAppServiceHostCount() {
    return apmAzureAppServiceHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmAzureAppServiceHostCount_JsonNullable() {
    return apmAzureAppServiceHostCount;
  }

  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT)
  public void setApmAzureAppServiceHostCount_JsonNullable(
      JsonNullable<Long> apmAzureAppServiceHostCount) {
    this.apmAzureAppServiceHostCount = apmAzureAppServiceHostCount;
  }

  public void setApmAzureAppServiceHostCount(Long apmAzureAppServiceHostCount) {
    this.apmAzureAppServiceHostCount = JsonNullable.<Long>of(apmAzureAppServiceHostCount);
  }

  public UsageHostHour apmHostCount(Long apmHostCount) {
    this.apmHostCount = JsonNullable.<Long>of(apmHostCount);
    return this;
  }

  /**
   * Shows the total number of hosts using APM during the hour, these are counted as billable
   * (except during trial periods).
   *
   * @return apmHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmHostCount() {
    return apmHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmHostCount_JsonNullable() {
    return apmHostCount;
  }

  @JsonProperty(JSON_PROPERTY_APM_HOST_COUNT)
  public void setApmHostCount_JsonNullable(JsonNullable<Long> apmHostCount) {
    this.apmHostCount = apmHostCount;
  }

  public void setApmHostCount(Long apmHostCount) {
    this.apmHostCount = JsonNullable.<Long>of(apmHostCount);
  }

  public UsageHostHour awsHostCount(Long awsHostCount) {
    this.awsHostCount = JsonNullable.<Long>of(awsHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the AWS integration (and were NOT
   * running the Datadog Agent).
   *
   * @return awsHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAwsHostCount() {
    return awsHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAwsHostCount_JsonNullable() {
    return awsHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AWS_HOST_COUNT)
  public void setAwsHostCount_JsonNullable(JsonNullable<Long> awsHostCount) {
    this.awsHostCount = awsHostCount;
  }

  public void setAwsHostCount(Long awsHostCount) {
    this.awsHostCount = JsonNullable.<Long>of(awsHostCount);
  }

  public UsageHostHour azureHostCount(Long azureHostCount) {
    this.azureHostCount = JsonNullable.<Long>of(azureHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through Azure integration (and were NOT
   * running the Datadog Agent).
   *
   * @return azureHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAzureHostCount() {
    return azureHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AZURE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAzureHostCount_JsonNullable() {
    return azureHostCount;
  }

  @JsonProperty(JSON_PROPERTY_AZURE_HOST_COUNT)
  public void setAzureHostCount_JsonNullable(JsonNullable<Long> azureHostCount) {
    this.azureHostCount = azureHostCount;
  }

  public void setAzureHostCount(Long azureHostCount) {
    this.azureHostCount = JsonNullable.<Long>of(azureHostCount);
  }

  public UsageHostHour containerCount(Long containerCount) {
    this.containerCount = JsonNullable.<Long>of(containerCount);
    return this;
  }

  /**
   * Shows the total number of containers reported by the Docker integration during the hour.
   *
   * @return containerCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getContainerCount() {
    return containerCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getContainerCount_JsonNullable() {
    return containerCount;
  }

  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  public void setContainerCount_JsonNullable(JsonNullable<Long> containerCount) {
    this.containerCount = containerCount;
  }

  public void setContainerCount(Long containerCount) {
    this.containerCount = JsonNullable.<Long>of(containerCount);
  }

  public UsageHostHour gcpHostCount(Long gcpHostCount) {
    this.gcpHostCount = JsonNullable.<Long>of(gcpHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the Google Cloud integration (and were
   * NOT running the Datadog Agent).
   *
   * @return gcpHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getGcpHostCount() {
    return gcpHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getGcpHostCount_JsonNullable() {
    return gcpHostCount;
  }

  @JsonProperty(JSON_PROPERTY_GCP_HOST_COUNT)
  public void setGcpHostCount_JsonNullable(JsonNullable<Long> gcpHostCount) {
    this.gcpHostCount = gcpHostCount;
  }

  public void setGcpHostCount(Long gcpHostCount) {
    this.gcpHostCount = JsonNullable.<Long>of(gcpHostCount);
  }

  public UsageHostHour herokuHostCount(Long herokuHostCount) {
    this.herokuHostCount = JsonNullable.<Long>of(herokuHostCount);
    return this;
  }

  /**
   * Contains the total number of Heroku dynos reported by the Datadog Agent.
   *
   * @return herokuHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getHerokuHostCount() {
    return herokuHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getHerokuHostCount_JsonNullable() {
    return herokuHostCount;
  }

  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_COUNT)
  public void setHerokuHostCount_JsonNullable(JsonNullable<Long> herokuHostCount) {
    this.herokuHostCount = herokuHostCount;
  }

  public void setHerokuHostCount(Long herokuHostCount) {
    this.herokuHostCount = JsonNullable.<Long>of(herokuHostCount);
  }

  public UsageHostHour hostCount(Long hostCount) {
    this.hostCount = JsonNullable.<Long>of(hostCount);
    return this;
  }

  /**
   * Contains the total number of billable infrastructure hosts reporting during a given hour. This
   * is the sum of <code>agent_host_count</code>, <code>aws_host_count</code>, and <code>
   * gcp_host_count</code>.
   *
   * @return hostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getHostCount() {
    return hostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getHostCount_JsonNullable() {
    return hostCount;
  }

  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  public void setHostCount_JsonNullable(JsonNullable<Long> hostCount) {
    this.hostCount = hostCount;
  }

  public void setHostCount(Long hostCount) {
    this.hostCount = JsonNullable.<Long>of(hostCount);
  }

  public UsageHostHour hour(OffsetDateTime hour) {
    this.hour = JsonNullable.<OffsetDateTime>of(hour);
    return this;
  }

  /**
   * The hour for the usage.
   *
   * @return hour
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getHour() {
    return hour.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getHour_JsonNullable() {
    return hour;
  }

  @JsonProperty(JSON_PROPERTY_HOUR)
  public void setHour_JsonNullable(JsonNullable<OffsetDateTime> hour) {
    this.hour = hour;
  }

  public void setHour(OffsetDateTime hour) {
    this.hour = JsonNullable.<OffsetDateTime>of(hour);
  }

  public UsageHostHour infraAzureAppService(Long infraAzureAppService) {
    this.infraAzureAppService = JsonNullable.<Long>of(infraAzureAppService);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the Azure App Services integration
   * (and were NOT running the Datadog Agent).
   *
   * @return infraAzureAppService
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getInfraAzureAppService() {
    return infraAzureAppService.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INFRA_AZURE_APP_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getInfraAzureAppService_JsonNullable() {
    return infraAzureAppService;
  }

  @JsonProperty(JSON_PROPERTY_INFRA_AZURE_APP_SERVICE)
  public void setInfraAzureAppService_JsonNullable(JsonNullable<Long> infraAzureAppService) {
    this.infraAzureAppService = infraAzureAppService;
  }

  public void setInfraAzureAppService(Long infraAzureAppService) {
    this.infraAzureAppService = JsonNullable.<Long>of(infraAzureAppService);
  }

  public UsageHostHour opentelemetryApmHostCount(Long opentelemetryApmHostCount) {
    this.opentelemetryApmHostCount = JsonNullable.<Long>of(opentelemetryApmHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts using APM reported by Datadog exporter for the OpenTelemetry
   * Collector.
   *
   * @return opentelemetryApmHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOpentelemetryApmHostCount() {
    return opentelemetryApmHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOpentelemetryApmHostCount_JsonNullable() {
    return opentelemetryApmHostCount;
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT)
  public void setOpentelemetryApmHostCount_JsonNullable(
      JsonNullable<Long> opentelemetryApmHostCount) {
    this.opentelemetryApmHostCount = opentelemetryApmHostCount;
  }

  public void setOpentelemetryApmHostCount(Long opentelemetryApmHostCount) {
    this.opentelemetryApmHostCount = JsonNullable.<Long>of(opentelemetryApmHostCount);
  }

  public UsageHostHour opentelemetryHostCount(Long opentelemetryHostCount) {
    this.opentelemetryHostCount = JsonNullable.<Long>of(opentelemetryHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts reported by Datadog exporter for the OpenTelemetry
   * Collector.
   *
   * @return opentelemetryHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOpentelemetryHostCount() {
    return opentelemetryHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOpentelemetryHostCount_JsonNullable() {
    return opentelemetryHostCount;
  }

  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT)
  public void setOpentelemetryHostCount_JsonNullable(JsonNullable<Long> opentelemetryHostCount) {
    this.opentelemetryHostCount = opentelemetryHostCount;
  }

  public void setOpentelemetryHostCount(Long opentelemetryHostCount) {
    this.opentelemetryHostCount = JsonNullable.<Long>of(opentelemetryHostCount);
  }

  public UsageHostHour orgName(String orgName) {
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

  public UsageHostHour publicId(String publicId) {
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

  public UsageHostHour vsphereHostCount(Long vsphereHostCount) {
    this.vsphereHostCount = JsonNullable.<Long>of(vsphereHostCount);
    return this;
  }

  /**
   * Contains the total number of hosts that reported through vSphere integration (and were NOT
   * running the Datadog Agent).
   *
   * @return vsphereHostCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getVsphereHostCount() {
    return vsphereHostCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getVsphereHostCount_JsonNullable() {
    return vsphereHostCount;
  }

  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_COUNT)
  public void setVsphereHostCount_JsonNullable(JsonNullable<Long> vsphereHostCount) {
    this.vsphereHostCount = vsphereHostCount;
  }

  public void setVsphereHostCount(Long vsphereHostCount) {
    this.vsphereHostCount = JsonNullable.<Long>of(vsphereHostCount);
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
   * @return UsageHostHour
   */
  @JsonAnySetter
  public UsageHostHour putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageHostHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageHostHour usageHostHour = (UsageHostHour) o;
    return Objects.equals(this.agentHostCount, usageHostHour.agentHostCount)
        && Objects.equals(this.alibabaHostCount, usageHostHour.alibabaHostCount)
        && Objects.equals(
            this.apmAzureAppServiceHostCount, usageHostHour.apmAzureAppServiceHostCount)
        && Objects.equals(this.apmHostCount, usageHostHour.apmHostCount)
        && Objects.equals(this.awsHostCount, usageHostHour.awsHostCount)
        && Objects.equals(this.azureHostCount, usageHostHour.azureHostCount)
        && Objects.equals(this.containerCount, usageHostHour.containerCount)
        && Objects.equals(this.gcpHostCount, usageHostHour.gcpHostCount)
        && Objects.equals(this.herokuHostCount, usageHostHour.herokuHostCount)
        && Objects.equals(this.hostCount, usageHostHour.hostCount)
        && Objects.equals(this.hour, usageHostHour.hour)
        && Objects.equals(this.infraAzureAppService, usageHostHour.infraAzureAppService)
        && Objects.equals(this.opentelemetryApmHostCount, usageHostHour.opentelemetryApmHostCount)
        && Objects.equals(this.opentelemetryHostCount, usageHostHour.opentelemetryHostCount)
        && Objects.equals(this.orgName, usageHostHour.orgName)
        && Objects.equals(this.publicId, usageHostHour.publicId)
        && Objects.equals(this.vsphereHostCount, usageHostHour.vsphereHostCount)
        && Objects.equals(this.additionalProperties, usageHostHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        agentHostCount,
        alibabaHostCount,
        apmAzureAppServiceHostCount,
        apmHostCount,
        awsHostCount,
        azureHostCount,
        containerCount,
        gcpHostCount,
        herokuHostCount,
        hostCount,
        hour,
        infraAzureAppService,
        opentelemetryApmHostCount,
        opentelemetryHostCount,
        orgName,
        publicId,
        vsphereHostCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageHostHour {\n");
    sb.append("    agentHostCount: ").append(toIndentedString(agentHostCount)).append("\n");
    sb.append("    alibabaHostCount: ").append(toIndentedString(alibabaHostCount)).append("\n");
    sb.append("    apmAzureAppServiceHostCount: ")
        .append(toIndentedString(apmAzureAppServiceHostCount))
        .append("\n");
    sb.append("    apmHostCount: ").append(toIndentedString(apmHostCount)).append("\n");
    sb.append("    awsHostCount: ").append(toIndentedString(awsHostCount)).append("\n");
    sb.append("    azureHostCount: ").append(toIndentedString(azureHostCount)).append("\n");
    sb.append("    containerCount: ").append(toIndentedString(containerCount)).append("\n");
    sb.append("    gcpHostCount: ").append(toIndentedString(gcpHostCount)).append("\n");
    sb.append("    herokuHostCount: ").append(toIndentedString(herokuHostCount)).append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    infraAzureAppService: ")
        .append(toIndentedString(infraAzureAppService))
        .append("\n");
    sb.append("    opentelemetryApmHostCount: ")
        .append(toIndentedString(opentelemetryApmHostCount))
        .append("\n");
    sb.append("    opentelemetryHostCount: ")
        .append(toIndentedString(opentelemetryHostCount))
        .append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    vsphereHostCount: ").append(toIndentedString(vsphereHostCount)).append("\n");
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
