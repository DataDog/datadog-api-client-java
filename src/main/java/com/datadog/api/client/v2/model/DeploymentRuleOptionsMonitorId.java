/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A specific monitor and the groups to evaluate for it. */
@JsonPropertyOrder({
  DeploymentRuleOptionsMonitorId.JSON_PROPERTY_GROUPS,
  DeploymentRuleOptionsMonitorId.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleOptionsMonitorId {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public DeploymentRuleOptionsMonitorId() {}

  @JsonCreator
  public DeploymentRuleOptionsMonitorId(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUPS) List<String> groups,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.groups = groups;
    this.id = id;
  }

  public DeploymentRuleOptionsMonitorId groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public DeploymentRuleOptionsMonitorId addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * The exact monitor group names to evaluate. An empty array evaluates all groups.
   *
   * @return groups
   */
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public DeploymentRuleOptionsMonitorId id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The monitor's decimal ID.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /** Return true if this DeploymentRuleOptionsMonitorId object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleOptionsMonitorId deploymentRuleOptionsMonitorId =
        (DeploymentRuleOptionsMonitorId) o;
    return Objects.equals(this.groups, deploymentRuleOptionsMonitorId.groups)
        && Objects.equals(this.id, deploymentRuleOptionsMonitorId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleOptionsMonitorId {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
