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

/** Number of Fargate tasks run and hourly usage. */
@JsonPropertyOrder({
  UsageFargateHour.JSON_PROPERTY_APM_FARGATE_COUNT,
  UsageFargateHour.JSON_PROPERTY_APPSEC_FARGATE_COUNT,
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
  private JsonNullable<Long> apmFargateCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_APPSEC_FARGATE_COUNT = "appsec_fargate_count";
  private JsonNullable<Long> appsecFargateCount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS =
      "avg_profiled_fargate_tasks";
  private JsonNullable<Long> avgProfiledFargateTasks = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TASKS_COUNT = "tasks_count";
  private JsonNullable<Long> tasksCount = JsonNullable.<Long>undefined();

  public UsageFargateHour apmFargateCount(Long apmFargateCount) {
    this.apmFargateCount = JsonNullable.<Long>of(apmFargateCount);
    return this;
  }

  /**
   * The high-water mark of APM ECS Fargate tasks during the given hour.
   *
   * @return apmFargateCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getApmFargateCount() {
    return apmFargateCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getApmFargateCount_JsonNullable() {
    return apmFargateCount;
  }

  @JsonProperty(JSON_PROPERTY_APM_FARGATE_COUNT)
  public void setApmFargateCount_JsonNullable(JsonNullable<Long> apmFargateCount) {
    this.apmFargateCount = apmFargateCount;
  }

  public void setApmFargateCount(Long apmFargateCount) {
    this.apmFargateCount = JsonNullable.<Long>of(apmFargateCount);
  }

  public UsageFargateHour appsecFargateCount(Long appsecFargateCount) {
    this.appsecFargateCount = JsonNullable.<Long>of(appsecFargateCount);
    return this;
  }

  /**
   * The Application Security Monitoring ECS Fargate tasks during the given hour.
   *
   * @return appsecFargateCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAppsecFargateCount() {
    return appsecFargateCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAppsecFargateCount_JsonNullable() {
    return appsecFargateCount;
  }

  @JsonProperty(JSON_PROPERTY_APPSEC_FARGATE_COUNT)
  public void setAppsecFargateCount_JsonNullable(JsonNullable<Long> appsecFargateCount) {
    this.appsecFargateCount = appsecFargateCount;
  }

  public void setAppsecFargateCount(Long appsecFargateCount) {
    this.appsecFargateCount = JsonNullable.<Long>of(appsecFargateCount);
  }

  public UsageFargateHour avgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = JsonNullable.<Long>of(avgProfiledFargateTasks);
    return this;
  }

  /**
   * The average profiled task count for Fargate Profiling.
   *
   * @return avgProfiledFargateTasks
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAvgProfiledFargateTasks() {
    return avgProfiledFargateTasks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAvgProfiledFargateTasks_JsonNullable() {
    return avgProfiledFargateTasks;
  }

  @JsonProperty(JSON_PROPERTY_AVG_PROFILED_FARGATE_TASKS)
  public void setAvgProfiledFargateTasks_JsonNullable(JsonNullable<Long> avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = avgProfiledFargateTasks;
  }

  public void setAvgProfiledFargateTasks(Long avgProfiledFargateTasks) {
    this.avgProfiledFargateTasks = JsonNullable.<Long>of(avgProfiledFargateTasks);
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
    this.tasksCount = JsonNullable.<Long>of(tasksCount);
    return this;
  }

  /**
   * The number of Fargate tasks run.
   *
   * @return tasksCount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getTasksCount() {
    return tasksCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TASKS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getTasksCount_JsonNullable() {
    return tasksCount;
  }

  @JsonProperty(JSON_PROPERTY_TASKS_COUNT)
  public void setTasksCount_JsonNullable(JsonNullable<Long> tasksCount) {
    this.tasksCount = tasksCount;
  }

  public void setTasksCount(Long tasksCount) {
    this.tasksCount = JsonNullable.<Long>of(tasksCount);
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
   * @return UsageFargateHour
   */
  @JsonAnySetter
  public UsageFargateHour putAdditionalProperty(String key, Object value) {
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
        && Objects.equals(this.appsecFargateCount, usageFargateHour.appsecFargateCount)
        && Objects.equals(this.avgProfiledFargateTasks, usageFargateHour.avgProfiledFargateTasks)
        && Objects.equals(this.hour, usageFargateHour.hour)
        && Objects.equals(this.orgName, usageFargateHour.orgName)
        && Objects.equals(this.publicId, usageFargateHour.publicId)
        && Objects.equals(this.tasksCount, usageFargateHour.tasksCount)
        && Objects.equals(this.additionalProperties, usageFargateHour.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apmFargateCount,
        appsecFargateCount,
        avgProfiledFargateTasks,
        hour,
        orgName,
        publicId,
        tasksCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageFargateHour {\n");
    sb.append("    apmFargateCount: ").append(toIndentedString(apmFargateCount)).append("\n");
    sb.append("    appsecFargateCount: ").append(toIndentedString(appsecFargateCount)).append("\n");
    sb.append("    avgProfiledFargateTasks: ")
        .append(toIndentedString(avgProfiledFargateTasks))
        .append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    tasksCount: ").append(toIndentedString(tasksCount)).append("\n");
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
