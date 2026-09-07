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

/** ServiceNow ticket creation attributes */
@JsonPropertyOrder({
  ServiceNowTicketCreateAttributes.JSON_PROPERTY_ASSIGNMENT_GROUP,
  ServiceNowTicketCreateAttributes.JSON_PROPERTY_INSTANCE_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowTicketCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP = "assignment_group";
  private String assignmentGroup;

  public static final String JSON_PROPERTY_INSTANCE_NAME = "instance_name";
  private String instanceName;

  public ServiceNowTicketCreateAttributes() {}

  @JsonCreator
  public ServiceNowTicketCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_NAME) String instanceName) {
    this.instanceName = instanceName;
  }

  public ServiceNowTicketCreateAttributes assignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
    return this;
  }

  /**
   * ServiceNow assignment group
   *
   * @return assignmentGroup
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignmentGroup() {
    return assignmentGroup;
  }

  public void setAssignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
  }

  public ServiceNowTicketCreateAttributes instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * ServiceNow instance name
   *
   * @return instanceName
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
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
   * @return ServiceNowTicketCreateAttributes
   */
  @JsonAnySetter
  public ServiceNowTicketCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceNowTicketCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowTicketCreateAttributes serviceNowTicketCreateAttributes =
        (ServiceNowTicketCreateAttributes) o;
    return Objects.equals(this.assignmentGroup, serviceNowTicketCreateAttributes.assignmentGroup)
        && Objects.equals(this.instanceName, serviceNowTicketCreateAttributes.instanceName)
        && Objects.equals(
            this.additionalProperties, serviceNowTicketCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentGroup, instanceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowTicketCreateAttributes {\n");
    sb.append("    assignmentGroup: ").append(toIndentedString(assignmentGroup)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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
