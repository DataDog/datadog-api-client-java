/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes of a ServiceNow assignment group */
@JsonPropertyOrder({
  ServiceNowAssignmentGroupAttributes.JSON_PROPERTY_ASSIGNMENT_GROUP_NAME,
  ServiceNowAssignmentGroupAttributes.JSON_PROPERTY_ASSIGNMENT_GROUP_SYS_ID,
  ServiceNowAssignmentGroupAttributes.JSON_PROPERTY_INSTANCE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowAssignmentGroupAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_NAME = "assignment_group_name";
  private String assignmentGroupName;

  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP_SYS_ID = "assignment_group_sys_id";
  private String assignmentGroupSysId;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instance_id";
  private UUID instanceId;

  public ServiceNowAssignmentGroupAttributes() {}

  @JsonCreator
  public ServiceNowAssignmentGroupAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNMENT_GROUP_NAME)
          String assignmentGroupName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNMENT_GROUP_SYS_ID)
          String assignmentGroupSysId,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_ID) UUID instanceId) {
    this.assignmentGroupName = assignmentGroupName;
    this.assignmentGroupSysId = assignmentGroupSysId;
    this.instanceId = instanceId;
  }

  public ServiceNowAssignmentGroupAttributes assignmentGroupName(String assignmentGroupName) {
    this.assignmentGroupName = assignmentGroupName;
    return this;
  }

  /**
   * The name of the assignment group
   *
   * @return assignmentGroupName
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAssignmentGroupName() {
    return assignmentGroupName;
  }

  public void setAssignmentGroupName(String assignmentGroupName) {
    this.assignmentGroupName = assignmentGroupName;
  }

  public ServiceNowAssignmentGroupAttributes assignmentGroupSysId(String assignmentGroupSysId) {
    this.assignmentGroupSysId = assignmentGroupSysId;
    return this;
  }

  /**
   * The system ID of the assignment group in ServiceNow
   *
   * @return assignmentGroupSysId
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP_SYS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAssignmentGroupSysId() {
    return assignmentGroupSysId;
  }

  public void setAssignmentGroupSysId(String assignmentGroupSysId) {
    this.assignmentGroupSysId = assignmentGroupSysId;
  }

  public ServiceNowAssignmentGroupAttributes instanceId(UUID instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The ID of the ServiceNow instance
   *
   * @return instanceId
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
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
   * @return ServiceNowAssignmentGroupAttributes
   */
  @JsonAnySetter
  public ServiceNowAssignmentGroupAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceNowAssignmentGroupAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowAssignmentGroupAttributes serviceNowAssignmentGroupAttributes =
        (ServiceNowAssignmentGroupAttributes) o;
    return Objects.equals(
            this.assignmentGroupName, serviceNowAssignmentGroupAttributes.assignmentGroupName)
        && Objects.equals(
            this.assignmentGroupSysId, serviceNowAssignmentGroupAttributes.assignmentGroupSysId)
        && Objects.equals(this.instanceId, serviceNowAssignmentGroupAttributes.instanceId)
        && Objects.equals(
            this.additionalProperties, serviceNowAssignmentGroupAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentGroupName, assignmentGroupSysId, instanceId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowAssignmentGroupAttributes {\n");
    sb.append("    assignmentGroupName: ")
        .append(toIndentedString(assignmentGroupName))
        .append("\n");
    sb.append("    assignmentGroupSysId: ")
        .append(toIndentedString(assignmentGroupSysId))
        .append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
