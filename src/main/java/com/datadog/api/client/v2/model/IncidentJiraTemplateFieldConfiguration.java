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
import org.openapitools.jackson.nullable.JsonNullable;

/** Configuration for a Jira field mapping. */
@JsonPropertyOrder({
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_CUSTOM_OUTBOUND_VALUE,
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_INCIDENT_FIELD,
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_JIRA_FIELD_KEY,
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_JIRA_FIELD_TYPE,
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_SYNC_DIRECTION,
  IncidentJiraTemplateFieldConfiguration.JSON_PROPERTY_VALUE_MAPPING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentJiraTemplateFieldConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_OUTBOUND_VALUE = "custom_outbound_value";
  private Object customOutboundValue = null;

  public static final String JSON_PROPERTY_INCIDENT_FIELD = "incident_field";
  private JsonNullable<String> incidentField = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JIRA_FIELD_KEY = "jira_field_key";
  private String jiraFieldKey;

  public static final String JSON_PROPERTY_JIRA_FIELD_TYPE = "jira_field_type";
  private JsonNullable<String> jiraFieldType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SYNC_DIRECTION = "sync_direction";
  private String syncDirection;

  public static final String JSON_PROPERTY_VALUE_MAPPING = "value_mapping";
  private Map<String, String> valueMapping = null;

  public IncidentJiraTemplateFieldConfiguration() {}

  @JsonCreator
  public IncidentJiraTemplateFieldConfiguration(
      @JsonProperty(required = true, value = JSON_PROPERTY_JIRA_FIELD_KEY) String jiraFieldKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_SYNC_DIRECTION) String syncDirection) {
    this.jiraFieldKey = jiraFieldKey;
    this.syncDirection = syncDirection;
  }

  public IncidentJiraTemplateFieldConfiguration customOutboundValue(Object customOutboundValue) {
    this.customOutboundValue = customOutboundValue;
    return this;
  }

  /**
   * Custom value for outbound synchronization.
   *
   * @return customOutboundValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_OUTBOUND_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getCustomOutboundValue() {
    return customOutboundValue;
  }

  public void setCustomOutboundValue(Object customOutboundValue) {
    this.customOutboundValue = customOutboundValue;
  }

  public IncidentJiraTemplateFieldConfiguration incidentField(String incidentField) {
    this.incidentField = JsonNullable.<String>of(incidentField);
    return this;
  }

  /**
   * The incident field to map to.
   *
   * @return incidentField
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getIncidentField() {
    return incidentField.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getIncidentField_JsonNullable() {
    return incidentField;
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_FIELD)
  public void setIncidentField_JsonNullable(JsonNullable<String> incidentField) {
    this.incidentField = incidentField;
  }

  public void setIncidentField(String incidentField) {
    this.incidentField = JsonNullable.<String>of(incidentField);
  }

  public IncidentJiraTemplateFieldConfiguration jiraFieldKey(String jiraFieldKey) {
    this.jiraFieldKey = jiraFieldKey;
    return this;
  }

  /**
   * The Jira field key.
   *
   * @return jiraFieldKey
   */
  @JsonProperty(JSON_PROPERTY_JIRA_FIELD_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getJiraFieldKey() {
    return jiraFieldKey;
  }

  public void setJiraFieldKey(String jiraFieldKey) {
    this.jiraFieldKey = jiraFieldKey;
  }

  public IncidentJiraTemplateFieldConfiguration jiraFieldType(String jiraFieldType) {
    this.jiraFieldType = JsonNullable.<String>of(jiraFieldType);
    return this;
  }

  /**
   * The type of the Jira field.
   *
   * @return jiraFieldType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getJiraFieldType() {
    return jiraFieldType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JIRA_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getJiraFieldType_JsonNullable() {
    return jiraFieldType;
  }

  @JsonProperty(JSON_PROPERTY_JIRA_FIELD_TYPE)
  public void setJiraFieldType_JsonNullable(JsonNullable<String> jiraFieldType) {
    this.jiraFieldType = jiraFieldType;
  }

  public void setJiraFieldType(String jiraFieldType) {
    this.jiraFieldType = JsonNullable.<String>of(jiraFieldType);
  }

  public IncidentJiraTemplateFieldConfiguration syncDirection(String syncDirection) {
    this.syncDirection = syncDirection;
    return this;
  }

  /**
   * The direction of synchronization.
   *
   * @return syncDirection
   */
  @JsonProperty(JSON_PROPERTY_SYNC_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSyncDirection() {
    return syncDirection;
  }

  public void setSyncDirection(String syncDirection) {
    this.syncDirection = syncDirection;
  }

  public IncidentJiraTemplateFieldConfiguration valueMapping(Map<String, String> valueMapping) {
    this.valueMapping = valueMapping;
    return this;
  }

  public IncidentJiraTemplateFieldConfiguration putValueMappingItem(
      String key, String valueMappingItem) {
    if (this.valueMapping == null) {
      this.valueMapping = new HashMap<>();
    }
    this.valueMapping.put(key, valueMappingItem);
    return this;
  }

  /**
   * Mapping of values between incident and Jira fields.
   *
   * @return valueMapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getValueMapping() {
    return valueMapping;
  }

  public void setValueMapping(Map<String, String> valueMapping) {
    this.valueMapping = valueMapping;
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
   * @return IncidentJiraTemplateFieldConfiguration
   */
  @JsonAnySetter
  public IncidentJiraTemplateFieldConfiguration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentJiraTemplateFieldConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentJiraTemplateFieldConfiguration incidentJiraTemplateFieldConfiguration =
        (IncidentJiraTemplateFieldConfiguration) o;
    return Objects.equals(
            this.customOutboundValue, incidentJiraTemplateFieldConfiguration.customOutboundValue)
        && Objects.equals(this.incidentField, incidentJiraTemplateFieldConfiguration.incidentField)
        && Objects.equals(this.jiraFieldKey, incidentJiraTemplateFieldConfiguration.jiraFieldKey)
        && Objects.equals(this.jiraFieldType, incidentJiraTemplateFieldConfiguration.jiraFieldType)
        && Objects.equals(this.syncDirection, incidentJiraTemplateFieldConfiguration.syncDirection)
        && Objects.equals(this.valueMapping, incidentJiraTemplateFieldConfiguration.valueMapping)
        && Objects.equals(
            this.additionalProperties, incidentJiraTemplateFieldConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customOutboundValue,
        incidentField,
        jiraFieldKey,
        jiraFieldType,
        syncDirection,
        valueMapping,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentJiraTemplateFieldConfiguration {\n");
    sb.append("    customOutboundValue: ")
        .append(toIndentedString(customOutboundValue))
        .append("\n");
    sb.append("    incidentField: ").append(toIndentedString(incidentField)).append("\n");
    sb.append("    jiraFieldKey: ").append(toIndentedString(jiraFieldKey)).append("\n");
    sb.append("    jiraFieldType: ").append(toIndentedString(jiraFieldType)).append("\n");
    sb.append("    syncDirection: ").append(toIndentedString(syncDirection)).append("\n");
    sb.append("    valueMapping: ").append(toIndentedString(valueMapping)).append("\n");
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
