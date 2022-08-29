/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>Number of Fargate tasks run and hourly usage.</p>
 */
@JsonPropertyOrder({
  UsageFargateHour.JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS,
  UsageFargateHour.JSON_PROPERTY_HOUR,
  UsageFargateHour.JSON_PROPERTY_ORG_NAME,
  UsageFargateHour.JSON_PROPERTY_PUBLIC_ID,
  UsageFargateHour.JSON_PROPERTY_TASKS_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageFargateHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS = "avg_profiled_fargate_tasks";
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

  public UsageFargateHour avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
    return this;
  }

  /**
   * <p>The average profiled task count for Fargate Profiling.</p>
   * @return avgProfiledFargateTasks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The hour for the usage.</p>
   * @return hour
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HOUR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The organization name.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The number of Fargate tasks run.</p>
   * @return tasksCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TASKS_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTasksCount() {
        return tasksCount;
      }
  public void setTasksCount(Long tasksCount) {
    this.tasksCount = tasksCount;
  }

  /**
   * Return true if this UsageFargateHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageFargateHour usageFargateHour = (UsageFargateHour) o;
    return Objects.equals(this.avgProfiledFargateTasks, usageFargateHour.avgProfiledFargateTasks) && Objects.equals(this.hour, usageFargateHour.hour) && Objects.equals(this.orgName, usageFargateHour.orgName) && Objects.equals(this.publicId, usageFargateHour.publicId) && Objects.equals(this.tasksCount, usageFargateHour.tasksCount);
  }


  @Override
  public int hashCode() {
    return Objects.hash(avgProfiledFargateTasks,hour,orgName,publicId,tasksCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageFargateHour {\n");
    sb.append("    avgProfiledFargateTasks: ").append(toIndentedString(avgProfiledFargateTasks)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
    sb.append("}");
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
