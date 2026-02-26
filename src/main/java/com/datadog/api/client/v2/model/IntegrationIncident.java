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
   * <p>Incident integration settings</p>
 */
@JsonPropertyOrder({
  IntegrationIncident.JSON_PROPERTY_AUTO_ESCALATION_QUERY,
  IntegrationIncident.JSON_PROPERTY_DEFAULT_INCIDENT_COMMANDER,
  IntegrationIncident.JSON_PROPERTY_ENABLED,
  IntegrationIncident.JSON_PROPERTY_FIELD_MAPPINGS,
  IntegrationIncident.JSON_PROPERTY_INCIDENT_TYPE,
  IntegrationIncident.JSON_PROPERTY_SEVERITY_CONFIG
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationIncident {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_ESCALATION_QUERY = "auto_escalation_query";
  private String autoEscalationQuery;

  public static final String JSON_PROPERTY_DEFAULT_INCIDENT_COMMANDER = "default_incident_commander";
  private String defaultIncidentCommander;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FIELD_MAPPINGS = "field_mappings";
  private List<IntegrationIncidentFieldMappingsItems> fieldMappings = null;

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incident_type";
  private String incidentType;

  public static final String JSON_PROPERTY_SEVERITY_CONFIG = "severity_config";
  private IntegrationIncidentSeverityConfig severityConfig;

  public IntegrationIncident autoEscalationQuery(String autoEscalationQuery) {
    this.autoEscalationQuery = autoEscalationQuery;
    return this;
  }

  /**
   * <p>Query for auto-escalation</p>
   * @return autoEscalationQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTO_ESCALATION_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAutoEscalationQuery() {
        return autoEscalationQuery;
      }
  public void setAutoEscalationQuery(String autoEscalationQuery) {
    this.autoEscalationQuery = autoEscalationQuery;
  }
  public IntegrationIncident defaultIncidentCommander(String defaultIncidentCommander) {
    this.defaultIncidentCommander = defaultIncidentCommander;
    return this;
  }

  /**
   * <p>Default incident commander</p>
   * @return defaultIncidentCommander
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_INCIDENT_COMMANDER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDefaultIncidentCommander() {
        return defaultIncidentCommander;
      }
  public void setDefaultIncidentCommander(String defaultIncidentCommander) {
    this.defaultIncidentCommander = defaultIncidentCommander;
  }
  public IntegrationIncident enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether incident integration is enabled</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public IntegrationIncident fieldMappings(List<IntegrationIncidentFieldMappingsItems> fieldMappings) {
    this.fieldMappings = fieldMappings;
    for (IntegrationIncidentFieldMappingsItems item : fieldMappings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IntegrationIncident addFieldMappingsItem(IntegrationIncidentFieldMappingsItems fieldMappingsItem) {
    if (this.fieldMappings == null) {
      this.fieldMappings = new ArrayList<>();
    }
    this.fieldMappings.add(fieldMappingsItem);
    this.unparsed |= fieldMappingsItem.unparsed;
    return this;
  }

  /**
   * <p>GetfieldMappings</p>
   * @return fieldMappings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELD_MAPPINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<IntegrationIncidentFieldMappingsItems> getFieldMappings() {
        return fieldMappings;
      }
  public void setFieldMappings(List<IntegrationIncidentFieldMappingsItems> fieldMappings) {
    this.fieldMappings = fieldMappings;
  }
  public IntegrationIncident incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

  /**
   * <p>Incident type</p>
   * @return incidentType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIncidentType() {
        return incidentType;
      }
  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }
  public IntegrationIncident severityConfig(IntegrationIncidentSeverityConfig severityConfig) {
    this.severityConfig = severityConfig;
    this.unparsed |= severityConfig.unparsed;
    return this;
  }

  /**
   * <p>GetseverityConfig</p>
   * @return severityConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEVERITY_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IntegrationIncidentSeverityConfig getSeverityConfig() {
        return severityConfig;
      }
  public void setSeverityConfig(IntegrationIncidentSeverityConfig severityConfig) {
    this.severityConfig = severityConfig;
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
   * @return IntegrationIncident
   */
  @JsonAnySetter
  public IntegrationIncident putAdditionalProperty(String key, Object value) {
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
   * Return true if this IntegrationIncident object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationIncident integrationIncident = (IntegrationIncident) o;
    return Objects.equals(this.autoEscalationQuery, integrationIncident.autoEscalationQuery) && Objects.equals(this.defaultIncidentCommander, integrationIncident.defaultIncidentCommander) && Objects.equals(this.enabled, integrationIncident.enabled) && Objects.equals(this.fieldMappings, integrationIncident.fieldMappings) && Objects.equals(this.incidentType, integrationIncident.incidentType) && Objects.equals(this.severityConfig, integrationIncident.severityConfig) && Objects.equals(this.additionalProperties, integrationIncident.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoEscalationQuery,defaultIncidentCommander,enabled,fieldMappings,incidentType,severityConfig, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationIncident {\n");
    sb.append("    autoEscalationQuery: ").append(toIndentedString(autoEscalationQuery)).append("\n");
    sb.append("    defaultIncidentCommander: ").append(toIndentedString(defaultIncidentCommander)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fieldMappings: ").append(toIndentedString(fieldMappings)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    severityConfig: ").append(toIndentedString(severityConfig)).append("\n");
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
