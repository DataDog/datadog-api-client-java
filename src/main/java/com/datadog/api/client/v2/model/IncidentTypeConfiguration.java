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

/**
 * The incident-type-scoped behavior settings. All fields are optional on update. Any field omitted
 * from a PATCH request keeps its current value. This object is read-only on the incident type
 * resource itself and is only mutated through the update (PATCH) endpoint.
 */
@JsonPropertyOrder({
  IncidentTypeConfiguration.JSON_PROPERTY_ALLOW_INCIDENT_DELETION,
  IncidentTypeConfiguration.JSON_PROPERTY_ALLOW_WORKFLOWS,
  IncidentTypeConfiguration.JSON_PROPERTY_CREATE_MESSAGE,
  IncidentTypeConfiguration.JSON_PROPERTY_EDITABLE_TIMESTAMPS,
  IncidentTypeConfiguration.JSON_PROPERTY_PRIVATE_INCIDENTS,
  IncidentTypeConfiguration.JSON_PROPERTY_PRIVATE_INCIDENTS_BY_DEFAULT,
  IncidentTypeConfiguration.JSON_PROPERTY_SLUG_SOURCE,
  IncidentTypeConfiguration.JSON_PROPERTY_TEST_INCIDENTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTypeConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_INCIDENT_DELETION = "allow_incident_deletion";
  private Boolean allowIncidentDeletion = false;

  public static final String JSON_PROPERTY_ALLOW_WORKFLOWS = "allow_workflows";
  private Boolean allowWorkflows = true;

  public static final String JSON_PROPERTY_CREATE_MESSAGE = "create_message";
  private String createMessage;

  public static final String JSON_PROPERTY_EDITABLE_TIMESTAMPS = "editable_timestamps";
  private Boolean editableTimestamps = false;

  public static final String JSON_PROPERTY_PRIVATE_INCIDENTS = "private_incidents";
  private Boolean privateIncidents = false;

  public static final String JSON_PROPERTY_PRIVATE_INCIDENTS_BY_DEFAULT =
      "private_incidents_by_default";
  private Boolean privateIncidentsByDefault = false;

  public static final String JSON_PROPERTY_SLUG_SOURCE = "slug_source";
  private IncidentTypeSlugSource slugSource = IncidentTypeSlugSource.DEFAULT;

  public static final String JSON_PROPERTY_TEST_INCIDENTS = "test_incidents";
  private Boolean testIncidents = true;

  public IncidentTypeConfiguration allowIncidentDeletion(Boolean allowIncidentDeletion) {
    this.allowIncidentDeletion = allowIncidentDeletion;
    return this;
  }

  /**
   * Whether incidents of this type can be deleted.
   *
   * @return allowIncidentDeletion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_INCIDENT_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowIncidentDeletion() {
    return allowIncidentDeletion;
  }

  public void setAllowIncidentDeletion(Boolean allowIncidentDeletion) {
    this.allowIncidentDeletion = allowIncidentDeletion;
  }

  public IncidentTypeConfiguration allowWorkflows(Boolean allowWorkflows) {
    this.allowWorkflows = allowWorkflows;
    return this;
  }

  /**
   * Whether automation workflows can be triggered for incidents of this type.
   *
   * @return allowWorkflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_WORKFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowWorkflows() {
    return allowWorkflows;
  }

  public void setAllowWorkflows(Boolean allowWorkflows) {
    this.allowWorkflows = allowWorkflows;
  }

  public IncidentTypeConfiguration createMessage(String createMessage) {
    this.createMessage = createMessage;
    return this;
  }

  /**
   * An optional message shown to users when they declare an incident of this type.
   *
   * @return createMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreateMessage() {
    return createMessage;
  }

  public void setCreateMessage(String createMessage) {
    this.createMessage = createMessage;
  }

  public IncidentTypeConfiguration editableTimestamps(Boolean editableTimestamps) {
    this.editableTimestamps = editableTimestamps;
    return this;
  }

  /**
   * Whether responders can edit incident timestamps for incidents of this type.
   *
   * @return editableTimestamps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDITABLE_TIMESTAMPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEditableTimestamps() {
    return editableTimestamps;
  }

  public void setEditableTimestamps(Boolean editableTimestamps) {
    this.editableTimestamps = editableTimestamps;
  }

  public IncidentTypeConfiguration privateIncidents(Boolean privateIncidents) {
    this.privateIncidents = privateIncidents;
    return this;
  }

  /**
   * Whether responders can create private incidents of this type. This is an opt-in setting,
   * distinct from <code>private_incidents_by_default</code>, which controls whether incidents are
   * created private automatically.
   *
   * @return privateIncidents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_INCIDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrivateIncidents() {
    return privateIncidents;
  }

  public void setPrivateIncidents(Boolean privateIncidents) {
    this.privateIncidents = privateIncidents;
  }

  public IncidentTypeConfiguration privateIncidentsByDefault(Boolean privateIncidentsByDefault) {
    this.privateIncidentsByDefault = privateIncidentsByDefault;
    return this;
  }

  /**
   * Whether incidents of this type are created as private by default.
   *
   * @return privateIncidentsByDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_INCIDENTS_BY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrivateIncidentsByDefault() {
    return privateIncidentsByDefault;
  }

  public void setPrivateIncidentsByDefault(Boolean privateIncidentsByDefault) {
    this.privateIncidentsByDefault = privateIncidentsByDefault;
  }

  public IncidentTypeConfiguration slugSource(IncidentTypeSlugSource slugSource) {
    this.slugSource = slugSource;
    this.unparsed |= !slugSource.isValid();
    return this;
  }

  /**
   * When set to <code>servicenow</code>, incidents will display the ServiceNow record ID instead of
   * the public ID. If no ServiceNow integration exists, the public ID will be displayed.
   *
   * @return slugSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUG_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentTypeSlugSource getSlugSource() {
    return slugSource;
  }

  public void setSlugSource(IncidentTypeSlugSource slugSource) {
    if (!slugSource.isValid()) {
      this.unparsed = true;
    }
    this.slugSource = slugSource;
  }

  public IncidentTypeConfiguration testIncidents(Boolean testIncidents) {
    this.testIncidents = testIncidents;
    return this;
  }

  /**
   * Whether incidents of this type are treated as test incidents.
   *
   * @return testIncidents
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_INCIDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTestIncidents() {
    return testIncidents;
  }

  public void setTestIncidents(Boolean testIncidents) {
    this.testIncidents = testIncidents;
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
   * @return IncidentTypeConfiguration
   */
  @JsonAnySetter
  public IncidentTypeConfiguration putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentTypeConfiguration object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTypeConfiguration incidentTypeConfiguration = (IncidentTypeConfiguration) o;
    return Objects.equals(
            this.allowIncidentDeletion, incidentTypeConfiguration.allowIncidentDeletion)
        && Objects.equals(this.allowWorkflows, incidentTypeConfiguration.allowWorkflows)
        && Objects.equals(this.createMessage, incidentTypeConfiguration.createMessage)
        && Objects.equals(this.editableTimestamps, incidentTypeConfiguration.editableTimestamps)
        && Objects.equals(this.privateIncidents, incidentTypeConfiguration.privateIncidents)
        && Objects.equals(
            this.privateIncidentsByDefault, incidentTypeConfiguration.privateIncidentsByDefault)
        && Objects.equals(this.slugSource, incidentTypeConfiguration.slugSource)
        && Objects.equals(this.testIncidents, incidentTypeConfiguration.testIncidents)
        && Objects.equals(
            this.additionalProperties, incidentTypeConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowIncidentDeletion,
        allowWorkflows,
        createMessage,
        editableTimestamps,
        privateIncidents,
        privateIncidentsByDefault,
        slugSource,
        testIncidents,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTypeConfiguration {\n");
    sb.append("    allowIncidentDeletion: ")
        .append(toIndentedString(allowIncidentDeletion))
        .append("\n");
    sb.append("    allowWorkflows: ").append(toIndentedString(allowWorkflows)).append("\n");
    sb.append("    createMessage: ").append(toIndentedString(createMessage)).append("\n");
    sb.append("    editableTimestamps: ").append(toIndentedString(editableTimestamps)).append("\n");
    sb.append("    privateIncidents: ").append(toIndentedString(privateIncidents)).append("\n");
    sb.append("    privateIncidentsByDefault: ")
        .append(toIndentedString(privateIncidentsByDefault))
        .append("\n");
    sb.append("    slugSource: ").append(toIndentedString(slugSource)).append("\n");
    sb.append("    testIncidents: ").append(toIndentedString(testIncidents)).append("\n");
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
