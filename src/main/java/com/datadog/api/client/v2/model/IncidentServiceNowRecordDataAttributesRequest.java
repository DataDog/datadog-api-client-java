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

/** Attributes for creating a ServiceNow record for an incident. */
@JsonPropertyOrder({
  IncidentServiceNowRecordDataAttributesRequest.JSON_PROPERTY_ASSIGNMENT_GROUP,
  IncidentServiceNowRecordDataAttributesRequest.JSON_PROPERTY_CONFIGURATION_ITEM_MAPPING,
  IncidentServiceNowRecordDataAttributesRequest.JSON_PROPERTY_INSTANCE_NAME,
  IncidentServiceNowRecordDataAttributesRequest.JSON_PROPERTY_RECORD_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentServiceNowRecordDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENT_GROUP = "assignment_group";
  private String assignmentGroup;

  public static final String JSON_PROPERTY_CONFIGURATION_ITEM_MAPPING =
      "configuration_item_mapping";
  private String configurationItemMapping;

  public static final String JSON_PROPERTY_INSTANCE_NAME = "instance_name";
  private String instanceName;

  public static final String JSON_PROPERTY_RECORD_ID = "record_id";
  private String recordId;

  public IncidentServiceNowRecordDataAttributesRequest() {}

  @JsonCreator
  public IncidentServiceNowRecordDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSIGNMENT_GROUP) String assignmentGroup,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION_ITEM_MAPPING)
          String configurationItemMapping,
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_NAME) String instanceName) {
    this.assignmentGroup = assignmentGroup;
    this.configurationItemMapping = configurationItemMapping;
    this.instanceName = instanceName;
  }

  public IncidentServiceNowRecordDataAttributesRequest assignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
    return this;
  }

  /**
   * The ServiceNow assignment group.
   *
   * @return assignmentGroup
   */
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAssignmentGroup() {
    return assignmentGroup;
  }

  public void setAssignmentGroup(String assignmentGroup) {
    this.assignmentGroup = assignmentGroup;
  }

  public IncidentServiceNowRecordDataAttributesRequest configurationItemMapping(
      String configurationItemMapping) {
    this.configurationItemMapping = configurationItemMapping;
    return this;
  }

  /**
   * The ServiceNow configuration item mapping.
   *
   * @return configurationItemMapping
   */
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ITEM_MAPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConfigurationItemMapping() {
    return configurationItemMapping;
  }

  public void setConfigurationItemMapping(String configurationItemMapping) {
    this.configurationItemMapping = configurationItemMapping;
  }

  public IncidentServiceNowRecordDataAttributesRequest instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * The ServiceNow instance name.
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

  public IncidentServiceNowRecordDataAttributesRequest recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * An existing ServiceNow record ID (Sys ID) to link instead of creating a new record.
   *
   * @return recordId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
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
   * @return IncidentServiceNowRecordDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentServiceNowRecordDataAttributesRequest putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentServiceNowRecordDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceNowRecordDataAttributesRequest incidentServiceNowRecordDataAttributesRequest =
        (IncidentServiceNowRecordDataAttributesRequest) o;
    return Objects.equals(
            this.assignmentGroup, incidentServiceNowRecordDataAttributesRequest.assignmentGroup)
        && Objects.equals(
            this.configurationItemMapping,
            incidentServiceNowRecordDataAttributesRequest.configurationItemMapping)
        && Objects.equals(
            this.instanceName, incidentServiceNowRecordDataAttributesRequest.instanceName)
        && Objects.equals(this.recordId, incidentServiceNowRecordDataAttributesRequest.recordId)
        && Objects.equals(
            this.additionalProperties,
            incidentServiceNowRecordDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentGroup, configurationItemMapping, instanceName, recordId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceNowRecordDataAttributesRequest {\n");
    sb.append("    assignmentGroup: ").append(toIndentedString(assignmentGroup)).append("\n");
    sb.append("    configurationItemMapping: ")
        .append(toIndentedString(configurationItemMapping))
        .append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
