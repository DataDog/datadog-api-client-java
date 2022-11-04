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

/** Number of Fargate tasks run and hourly usage. */
@JsonPropertyOrder({
  UsageFargateHour.JSON_PROPERTY_APM_FARGATE_COUNT,
  UsageFargateHour.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageFargateHour.JSON_PROPERTY_HOUR,
  UsageFargateHour.JSON_PROPERTY_ORG_NAME,
  UsageFargateHour.JSON_PROPERTY_PUBLIC_ID,
  UsageFargateHour.JSON_PROPERTY_TASKS_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageFargateHour {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_FARGATE_COUNT = "apm_fargate_count";
  private Long apmFargateCount;

  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS =
      "avg_profiled_fargate_tasks";
  private Long avgProfiledFargateTasks;

  public static final String JSON_PROPERTY_HOUR = "hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TASKS_COUNT = "tasks_count";
  private Long tasksCount;

  public UsageFargateHour apmFargateCount(Long apmFargateCount) {
    this.apmFargateCount = apmFargateCount;
    return this;
  }

  /**
   * The high-water mark of APM ECS Fargate tasks during the given hour.
   *
   * @return apmFargateCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getApmFargateCount() {
    return apmFargateCount;
  }

  public void setApmFargateCount(Long apmFargateCount) {
    this.apmFargateCount = apmFargateCount;
  }

  public UsageFargateHour avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
    return this;
  }

  /**
   * The average profiled task count for Fargate Profiling.
   *
   * @return avgProfiledFargateTasks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAvgProfiledFargateTasks() {
    return avgProfiledFargateTasks;
  }

  public void setAvgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
  }

  public UsageFargateHour hour(OffsetDateTime hour) {
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

  public UsageFargateHour orgName(String orgName) {
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

  public UsageFargateHour publicId(String publicId) {
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

  public UsageFargateHour tasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
    return this;
  }

  /**
   * The number of Fargate tasks run.
   *
   * @return tasksCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASKS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTasksCount() {
    return tasksCount;
  }

  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }

  /** Return true if this UsageFargateHour object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageFargateHour usageFargateHour = (UsageFargateHour) o;
    return Objects.equals(this.apmFargateCount, usageFargateHour.apmFargateCount)
        && Objects.equals(this.avgProfiledFargateTasks, usageFargateHour.avgProfiledFargateTasks)
        && Objects.equals(this.hour, usageFargateHour.hour)
        && Objects.equals(this.orgName, usageFargateHour.orgName)
        && Objects.equals(this.publicId, usageFargateHour.publicId)
        && Objects.equals(this.tasksCount, usageFargateHour.tasksCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmFargateCount, avgProfiledFargateTasks, hour, orgName, publicId, tasksCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageFargateHour {\n");
    sb.append("    apmFargateCount: ").append(toIndentedString(apmFargateCount)).append("\n");
    sb.append("    avgProfiledFargateTasks: ")
        .append(toIndentedString(avgProfiledFargateTasks))
        .append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
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
