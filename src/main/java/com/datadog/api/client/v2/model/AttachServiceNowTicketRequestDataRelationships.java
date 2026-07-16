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

/** Relationships of the ServiceNow ticket to attach security findings to. */
@JsonPropertyOrder({
  AttachServiceNowTicketRequestDataRelationships.JSON_PROPERTY_FINDINGS,
  AttachServiceNowTicketRequestDataRelationships.JSON_PROPERTY_PROJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AttachServiceNowTicketRequestDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FINDINGS = "findings";
  private Findings findings;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private CaseManagementProject project;

  public AttachServiceNowTicketRequestDataRelationships() {}

  @JsonCreator
  public AttachServiceNowTicketRequestDataRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_FINDINGS) Findings findings,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT) CaseManagementProject project) {
    this.findings = findings;
    this.unparsed |= findings.unparsed;
    this.project = project;
    this.unparsed |= project.unparsed;
  }

  public AttachServiceNowTicketRequestDataRelationships findings(Findings findings) {
    this.findings = findings;
    this.unparsed |= findings.unparsed;
    return this;
  }

  /**
   * A list of security findings.
   *
   * @return findings
   */
  @JsonProperty(JSON_PROPERTY_FINDINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Findings getFindings() {
    return findings;
  }

  public void setFindings(Findings findings) {
    this.findings = findings;
    if (findings != null) {
      this.unparsed |= findings.unparsed;
    }
  }

  public AttachServiceNowTicketRequestDataRelationships project(CaseManagementProject project) {
    this.project = project;
    this.unparsed |= project.unparsed;
    return this;
  }

  /**
   * Case management project.
   *
   * @return project
   */
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseManagementProject getProject() {
    return project;
  }

  public void setProject(CaseManagementProject project) {
    this.project = project;
    if (project != null) {
      this.unparsed |= project.unparsed;
    }
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
   * @return AttachServiceNowTicketRequestDataRelationships
   */
  @JsonAnySetter
  public AttachServiceNowTicketRequestDataRelationships putAdditionalProperty(
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

  /** Return true if this AttachServiceNowTicketRequestDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachServiceNowTicketRequestDataRelationships attachServiceNowTicketRequestDataRelationships =
        (AttachServiceNowTicketRequestDataRelationships) o;
    return Objects.equals(this.findings, attachServiceNowTicketRequestDataRelationships.findings)
        && Objects.equals(this.project, attachServiceNowTicketRequestDataRelationships.project)
        && Objects.equals(
            this.additionalProperties,
            attachServiceNowTicketRequestDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(findings, project, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachServiceNowTicketRequestDataRelationships {\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
