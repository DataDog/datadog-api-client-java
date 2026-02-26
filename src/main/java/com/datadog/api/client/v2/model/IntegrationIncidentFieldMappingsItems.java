/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  IntegrationIncidentFieldMappingsItems.JSON_PROPERTY_CASE_FIELD,
  IntegrationIncidentFieldMappingsItems.JSON_PROPERTY_INCIDENT_USER_DEFINED_FIELD_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationIncidentFieldMappingsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE_FIELD = "case_field";
  private String caseField;

  public static final String JSON_PROPERTY_INCIDENT_USER_DEFINED_FIELD_ID =
      "incident_user_defined_field_id";
  private String incidentUserDefinedFieldId;

  public IntegrationIncidentFieldMappingsItems caseField(String caseField) {
    this.caseField = caseField;
    return this;
  }

  /**
   * GetcaseField
   *
   * @return caseField
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASE_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaseField() {
    return caseField;
  }

  public void setCaseField(String caseField) {
    this.caseField = caseField;
  }

  public IntegrationIncidentFieldMappingsItems incidentUserDefinedFieldId(
      String incidentUserDefinedFieldId) {
    this.incidentUserDefinedFieldId = incidentUserDefinedFieldId;
    return this;
  }

  /**
   * GetincidentUserDefinedFieldId
   *
   * @return incidentUserDefinedFieldId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCIDENT_USER_DEFINED_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIncidentUserDefinedFieldId() {
    return incidentUserDefinedFieldId;
  }

  public void setIncidentUserDefinedFieldId(String incidentUserDefinedFieldId) {
    this.incidentUserDefinedFieldId = incidentUserDefinedFieldId;
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
   * @return IntegrationIncidentFieldMappingsItems
   */
  @JsonAnySetter
  public IntegrationIncidentFieldMappingsItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationIncidentFieldMappingsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationIncidentFieldMappingsItems integrationIncidentFieldMappingsItems =
        (IntegrationIncidentFieldMappingsItems) o;
    return Objects.equals(this.caseField, integrationIncidentFieldMappingsItems.caseField)
        && Objects.equals(
            this.incidentUserDefinedFieldId,
            integrationIncidentFieldMappingsItems.incidentUserDefinedFieldId)
        && Objects.equals(
            this.additionalProperties, integrationIncidentFieldMappingsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseField, incidentUserDefinedFieldId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationIncidentFieldMappingsItems {\n");
    sb.append("    caseField: ").append(toIndentedString(caseField)).append("\n");
    sb.append("    incidentUserDefinedFieldId: ")
        .append(toIndentedString(incidentUserDefinedFieldId))
        .append("\n");
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
