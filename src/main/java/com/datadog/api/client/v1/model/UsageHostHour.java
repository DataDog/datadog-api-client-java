/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

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
  private Long agentHostCount;

  public static final String JSON_PROPERTY_ALIBABA_HOST_COUNT = "alibaba_host_count";
  private Long alibabaHostCount;

  public static final String JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT =
      "apm_azure_app_service_host_count";
  private Long apmAzureAppServiceHostCount;

  public static final String JSON_PROPERTY_APM_HOST_COUNT = "apm_host_count";
  private Long apmHostCount;

  public static final String JSON_PROPERTY_AWS_HOST_COUNT = "aws_host_count";
  private Long awsHostCount;

  public static final String JSON_PROPERTY_AZURE_HOST_COUNT = "azure_host_count";
  private Long azureHostCount;

  public static final String JSON_PROPERTY_CONTAINER_COUNT = "container_count";
  private Long containerCount;

  public static final String JSON_PROPERTY_GCP_HOST_COUNT = "gcp_host_count";
  private Long gcpHostCount;

  public static final String JSON_PROPERTY_HEROKU_HOST_COUNT = "heroku_host_count";
  private Long herokuHostCount;

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private Long hostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INFRA_AZURE_APP_SERVICE = "infra_azure_app_service";
  private Long infraAzureAppService;

  public static final String JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT =
      "opentelemetry_apm_host_count";
  private Long opentelemetryApmHostCount;

  public static final String JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT = "opentelemetry_host_count";
  private Long opentelemetryHostCount;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_VSPHERE_HOST_COUNT = "vsphere_host_count";
  private Long vsphereHostCount;

  public UsageHostHour agentHostCount(Long agentHostCount) {
    this.agentHostCount = agentHostCount;
    return this;
  }

  /**
   * Contains the total number of infrastructure hosts reporting during a given hour that were
   * running the Datadog Agent.
   *
   * @return agentHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAgentHostCount() {
    return agentHostCount;
  }

  public void setAgentHostCount(Long agentHostCount) {
    this.agentHostCount = agentHostCount;
  }

  public UsageHostHour alibabaHostCount(Long alibabaHostCount) {
    this.alibabaHostCount = alibabaHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through Alibaba integration (and were NOT
   * running the Datadog Agent).
   *
   * @return alibabaHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIBABA_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAlibabaHostCount() {
    return alibabaHostCount;
  }

  public void setAlibabaHostCount(Long alibabaHostCount) {
    this.alibabaHostCount = alibabaHostCount;
  }

  public UsageHostHour apmAzureAppServiceHostCount(Long apmAzureAppServiceHostCount) {
    this.apmAzureAppServiceHostCount = apmAzureAppServiceHostCount;
    return this;
  }

  /**
   * Contains the total number of Azure App Services hosts using APM.
   *
   * @return apmAzureAppServiceHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_AZURE_APP_SERVICE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmAzureAppServiceHostCount() {
    return apmAzureAppServiceHostCount;
  }

  public void setApmAzureAppServiceHostCount(Long apmAzureAppServiceHostCount) {
    this.apmAzureAppServiceHostCount = apmAzureAppServiceHostCount;
  }

  public UsageHostHour apmHostCount(Long apmHostCount) {
    this.apmHostCount = apmHostCount;
    return this;
  }

  /**
   * Shows the total number of hosts using APM during the hour, these are counted as billable
   * (except during trial periods).
   *
   * @return apmHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmHostCount() {
    return apmHostCount;
  }

  public void setApmHostCount(Long apmHostCount) {
    this.apmHostCount = apmHostCount;
  }

  public UsageHostHour awsHostCount(Long awsHostCount) {
    this.awsHostCount = awsHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the AWS integration (and were NOT
   * running the Datadog Agent).
   *
   * @return awsHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AWS_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAwsHostCount() {
    return awsHostCount;
  }

  public void setAwsHostCount(Long awsHostCount) {
    this.awsHostCount = awsHostCount;
  }

  public UsageHostHour azureHostCount(Long azureHostCount) {
    this.azureHostCount = azureHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through Azure integration (and were NOT
   * running the Datadog Agent).
   *
   * @return azureHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AZURE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAzureHostCount() {
    return azureHostCount;
  }

  public void setAzureHostCount(Long azureHostCount) {
    this.azureHostCount = azureHostCount;
  }

  public UsageHostHour containerCount(Long containerCount) {
    this.containerCount = containerCount;
    return this;
  }

  /**
   * Shows the total number of containers reported by the Docker integration during the hour.
   *
   * @return containerCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getContainerCount() {
    return containerCount;
  }

  public void setContainerCount(Long containerCount) {
    this.containerCount = containerCount;
  }

  public UsageHostHour gcpHostCount(Long gcpHostCount) {
    this.gcpHostCount = gcpHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the Google Cloud integration (and were
   * NOT running the Datadog Agent).
   *
   * @return gcpHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GCP_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getGcpHostCount() {
    return gcpHostCount;
  }

  public void setGcpHostCount(Long gcpHostCount) {
    this.gcpHostCount = gcpHostCount;
  }

  public UsageHostHour herokuHostCount(Long herokuHostCount) {
    this.herokuHostCount = herokuHostCount;
    return this;
  }

  /**
   * Contains the total number of Heroku dynos reported by the Datadog Agent.
   *
   * @return herokuHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEROKU_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHerokuHostCount() {
    return herokuHostCount;
  }

  public void setHerokuHostCount(Long herokuHostCount) {
    this.herokuHostCount = herokuHostCount;
  }

  public UsageHostHour hostCount(Long hostCount) {
    this.hostCount = hostCount;
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
  @JsonProperty(JSON_PROPERTY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHostCount() {
    return hostCount;
  }

  public void setHostCount(Long hostCount) {
    this.hostCount = hostCount;
  }

  public UsageHostHour hour(OffsetDateTime hour) {
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

  public UsageHostHour infraAzureAppService(Long infraAzureAppService) {
    this.infraAzureAppService = infraAzureAppService;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through the Azure App Services integration
   * (and were NOT running the Datadog Agent).
   *
   * @return infraAzureAppService
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFRA_AZURE_APP_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getInfraAzureAppService() {
    return infraAzureAppService;
  }

  public void setInfraAzureAppService(Long infraAzureAppService) {
    this.infraAzureAppService = infraAzureAppService;
  }

  public UsageHostHour opentelemetryApmHostCount(Long opentelemetryApmHostCount) {
    this.opentelemetryApmHostCount = opentelemetryApmHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts using APM reported by Datadog exporter for the OpenTelemetry
   * Collector.
   *
   * @return opentelemetryApmHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_APM_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryApmHostCount() {
    return opentelemetryApmHostCount;
  }

  public void setOpentelemetryApmHostCount(Long opentelemetryApmHostCount) {
    this.opentelemetryApmHostCount = opentelemetryApmHostCount;
  }

  public UsageHostHour opentelemetryHostCount(Long opentelemetryHostCount) {
    this.opentelemetryHostCount = opentelemetryHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts reported by Datadog exporter for the OpenTelemetry
   * Collector.
   *
   * @return opentelemetryHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENTELEMETRY_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOpentelemetryHostCount() {
    return opentelemetryHostCount;
  }

  public void setOpentelemetryHostCount(Long opentelemetryHostCount) {
    this.opentelemetryHostCount = opentelemetryHostCount;
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
    this.vsphereHostCount = vsphereHostCount;
    return this;
  }

  /**
   * Contains the total number of hosts that reported through vSphere integration (and were NOT
   * running the Datadog Agent).
   *
   * @return vsphereHostCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VSPHERE_HOST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVsphereHostCount() {
    return vsphereHostCount;
  }

  public void setVsphereHostCount(Long vsphereHostCount) {
    this.vsphereHostCount = vsphereHostCount;
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
        && Objects.equals(this.vsphereHostCount, usageHostHour.vsphereHostCount);
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
        vsphereHostCount);
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
    sb.append("}");
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
