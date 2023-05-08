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

/** The number of profiled hosts for each hour for a given organization. */
@JsonPropertyOrder({
  UsageProfilingHour.JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT,
  UsageProfilingHour.JSON_PROPERTY_HOST_COUNT,
  UsageProfilingHour.JSON_PROPERTY_HOUR,
  UsageProfilingHour.JSON_PROPERTY_ORG_NAME,
  UsageProfilingHour.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageProfilingHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT = "avg_container_agent_count";
  private Long avgContainerAgentCount;

  public static final String JSON_PROPERTY_HOST_COUNT = "host_count";
  private Long hostCount;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public UsageProfilingHour avgContainerAgentCount(Long avgContainerAgentCount) {
    this.avgContainerAgentCount = avgContainerAgentCount;
    return this;
  }

  /**
   * Get average number of container agents for that hour.
   *
   * @return avgContainerAgentCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_CONTAINER_AGENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgContainerAgentCount() {
    return avgContainerAgentCount;
  }

  public void setAvgContainerAgentCount(Long avgContainerAgentCount) {
    this.avgContainerAgentCount = avgContainerAgentCount;
  }

  public UsageProfilingHour hostCount(Long hostCount) {
    this.hostCount = hostCount;
    return this;
  }

  /**
   * Contains the total number of profiled hosts reporting during a given hour.
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

  public UsageProfilingHour hour(OffsetDateTime hour) {
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

  public UsageProfilingHour orgName(String orgName) {
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

  public UsageProfilingHour publicId(String publicId) {
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

  /** Return true if this UsageProfilingHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageProfilingHour usageProfilingHour = (UsageProfilingHour) o;
    return Objects.equals(this.avgContainerAgentCount, usageProfilingHour.avgContainerAgentCount)
        && Objects.equals(this.hostCount, usageProfilingHour.hostCount)
        && Objects.equals(this.hour, usageProfilingHour.hour)
        && Objects.equals(this.orgName, usageProfilingHour.orgName)
        && Objects.equals(this.publicId, usageProfilingHour.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgContainerAgentCount, hostCount, hour, orgName, publicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageProfilingHour {\n");
    sb.append("    avgContainerAgentCount: ")
        .append(toIndentedString(avgContainerAgentCount))
        .append("\n");
    sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
