/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.MonitorOverallStates;
import com.datadog.api.v1.client.model.MonitorStateGroup;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MonitorState
 */
@JsonPropertyOrder({
  MonitorState.JSON_PROPERTY_GROUPS,
  MonitorState.JSON_PROPERTY_MONITOR_ID,
  MonitorState.JSON_PROPERTY_OVERALL_STATE
})

public class MonitorState {
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Map<String, MonitorStateGroup> groups = null;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private MonitorOverallStates overallState;


  public MonitorState groups(Map<String, MonitorStateGroup> groups) {
    
    this.groups = groups;
    return this;
  }

  public MonitorState putGroupsItem(String key, MonitorStateGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new HashMap<>();
    }
    this.groups.put(key, groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, MonitorStateGroup> getGroups() {
    return groups;
  }


  public void setGroups(Map<String, MonitorStateGroup> groups) {
    this.groups = groups;
  }


  public MonitorState monitorId(Long monitorId) {
    
    this.monitorId = monitorId;
    return this;
  }

   /**
   * Get monitorId
   * @return monitorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMonitorId() {
    return monitorId;
  }


  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }


  public MonitorState overallState(MonitorOverallStates overallState) {
    
    this.overallState = overallState;
    return this;
  }

   /**
   * Get overallState
   * @return overallState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitorOverallStates getOverallState() {
    return overallState;
  }


  public void setOverallState(MonitorOverallStates overallState) {
    this.overallState = overallState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorState monitorState = (MonitorState) o;
    return Objects.equals(this.groups, monitorState.groups) &&
        Objects.equals(this.monitorId, monitorState.monitorId) &&
        Objects.equals(this.overallState, monitorState.overallState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, monitorId, overallState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorState {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

