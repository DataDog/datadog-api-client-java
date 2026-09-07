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
   * <p>Attributes of a fleet schedule in the v2 API response.</p>
 */
@JsonPropertyOrder({
  FleetScheduleV2Attributes.JSON_PROPERTY_CREATED_AT,
  FleetScheduleV2Attributes.JSON_PROPERTY_CREATED_BY,
  FleetScheduleV2Attributes.JSON_PROPERTY_IS_DEFAULT,
  FleetScheduleV2Attributes.JSON_PROPERTY_NAME,
  FleetScheduleV2Attributes.JSON_PROPERTY_NEXT_RUN,
  FleetScheduleV2Attributes.JSON_PROPERTY_NOTIFICATION_RULE,
  FleetScheduleV2Attributes.JSON_PROPERTY_QUERY,
  FleetScheduleV2Attributes.JSON_PROPERTY_RULE,
  FleetScheduleV2Attributes.JSON_PROPERTY_STATUS,
  FleetScheduleV2Attributes.JSON_PROPERTY_UPDATED_AT,
  FleetScheduleV2Attributes.JSON_PROPERTY_UPDATED_BY,
  FleetScheduleV2Attributes.JSON_PROPERTY_VERSION_TO_LATEST
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetScheduleV2Attributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEXT_RUN = "next_run";
  private String nextRun;

  public static final String JSON_PROPERTY_NOTIFICATION_RULE = "notification_rule";
  private FleetScheduleV2NotificationRule notificationRule;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE = "rule";
  private FleetScheduleV2RecurrenceRule rule;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FleetScheduleStatus status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public static final String JSON_PROPERTY_VERSION_TO_LATEST = "version_to_latest";
  private Long versionToLatest;

  public FleetScheduleV2Attributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>RFC3339 timestamp when the schedule was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public FleetScheduleV2Attributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>User handle of the person who created the schedule.</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public FleetScheduleV2Attributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * <p>Whether this is the default schedule for the organization.</p>
   * @return isDefault
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDefault() {
        return isDefault;
      }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }
  public FleetScheduleV2Attributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Human-readable name for the schedule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public FleetScheduleV2Attributes nextRun(String nextRun) {
    this.nextRun = nextRun;
    return this;
  }

  /**
   * <p>RFC3339 timestamp of the next scheduled maintenance window start time.
   * Absent when the next run time cannot be computed.</p>
   * @return nextRun
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NEXT_RUN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNextRun() {
        return nextRun;
      }
  public void setNextRun(String nextRun) {
    this.nextRun = nextRun;
  }
  public FleetScheduleV2Attributes notificationRule(FleetScheduleV2NotificationRule notificationRule) {
    this.notificationRule = notificationRule;
    this.unparsed |= notificationRule.unparsed;
    return this;
  }

  /**
   * <p>Notification configuration attached to a schedule.</p>
   * <p>Included when available. If the notification rule cannot be retrieved, this field is
   * omitted and the schedule is still returned. If the notification rule is retrieved but its
   * handles cannot be resolved, it is still included with an empty <code>handles</code> array.</p>
   * @return notificationRule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTIFICATION_RULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetScheduleV2NotificationRule getNotificationRule() {
        return notificationRule;
      }
  public void setNotificationRule(FleetScheduleV2NotificationRule notificationRule) {
    this.notificationRule = notificationRule;
    if (notificationRule != null) {
      this.unparsed |= notificationRule.unparsed;
    }
  }
  public FleetScheduleV2Attributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query used to filter and select target hosts for scheduled deployments.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public FleetScheduleV2Attributes rule(FleetScheduleV2RecurrenceRule rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * <p>Defines the recurrence pattern for the schedule.</p>
   * @return rule
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetScheduleV2RecurrenceRule getRule() {
        return rule;
      }
  public void setRule(FleetScheduleV2RecurrenceRule rule) {
    this.rule = rule;
    if (rule != null) {
      this.unparsed |= rule.unparsed;
    }
  }
  public FleetScheduleV2Attributes status(FleetScheduleStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of the schedule.
   * - <code>active</code>: The schedule is active and will create deployments according to its recurrence rule.
   * - <code>inactive</code>: The schedule is inactive and will not create any deployments.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FleetScheduleStatus getStatus() {
        return status;
      }
  public void setStatus(FleetScheduleStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public FleetScheduleV2Attributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>RFC3339 timestamp when the schedule was last updated.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }
  public FleetScheduleV2Attributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>User handle of the person who last updated the schedule.</p>
   * @return updatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedBy() {
        return updatedBy;
      }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }
  public FleetScheduleV2Attributes versionToLatest(Long versionToLatest) {
    this.versionToLatest = versionToLatest;
    return this;
  }

  /**
   * <p>Number of major versions behind the latest to target for upgrades.
   * - 0: Always upgrade to the latest version.
   * - 1: Upgrade to latest minus 1 major version.
   * - 2: Upgrade to latest minus 2 major versions.</p>
   * minimum: 0
   * maximum: 2
   * @return versionToLatest
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION_TO_LATEST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersionToLatest() {
        return versionToLatest;
      }
  public void setVersionToLatest(Long versionToLatest) {
    this.versionToLatest = versionToLatest;
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
   * @return FleetScheduleV2Attributes
   */
  @JsonAnySetter
  public FleetScheduleV2Attributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this FleetScheduleV2Attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetScheduleV2Attributes fleetScheduleV2Attributes = (FleetScheduleV2Attributes) o;
    return Objects.equals(this.createdAt, fleetScheduleV2Attributes.createdAt) && Objects.equals(this.createdBy, fleetScheduleV2Attributes.createdBy) && Objects.equals(this.isDefault, fleetScheduleV2Attributes.isDefault) && Objects.equals(this.name, fleetScheduleV2Attributes.name) && Objects.equals(this.nextRun, fleetScheduleV2Attributes.nextRun) && Objects.equals(this.notificationRule, fleetScheduleV2Attributes.notificationRule) && Objects.equals(this.query, fleetScheduleV2Attributes.query) && Objects.equals(this.rule, fleetScheduleV2Attributes.rule) && Objects.equals(this.status, fleetScheduleV2Attributes.status) && Objects.equals(this.updatedAt, fleetScheduleV2Attributes.updatedAt) && Objects.equals(this.updatedBy, fleetScheduleV2Attributes.updatedBy) && Objects.equals(this.versionToLatest, fleetScheduleV2Attributes.versionToLatest) && Objects.equals(this.additionalProperties, fleetScheduleV2Attributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,isDefault,name,nextRun,notificationRule,query,rule,status,updatedAt,updatedBy,versionToLatest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetScheduleV2Attributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextRun: ").append(toIndentedString(nextRun)).append("\n");
    sb.append("    notificationRule: ").append(toIndentedString(notificationRule)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    versionToLatest: ").append(toIndentedString(versionToLatest)).append("\n");
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
