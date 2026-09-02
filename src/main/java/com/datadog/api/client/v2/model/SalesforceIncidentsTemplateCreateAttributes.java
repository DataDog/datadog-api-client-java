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

/** Salesforce incident template attributes for a create request. */
@JsonPropertyOrder({
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_NAME,
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_OWNER_ID,
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_PRIORITY,
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_SALESFORCE_ORG_ID,
  SalesforceIncidentsTemplateCreateAttributes.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SalesforceIncidentsTemplateCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private String ownerId;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private SalesforceIncidentsTemplatePriority priority;

  public static final String JSON_PROPERTY_SALESFORCE_ORG_ID = "salesforce_org_id";
  private UUID salesforceOrgId;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public SalesforceIncidentsTemplateCreateAttributes() {}

  @JsonCreator
  public SalesforceIncidentsTemplateCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER_ID) String ownerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRIORITY)
          SalesforceIncidentsTemplatePriority priority,
      @JsonProperty(required = true, value = JSON_PROPERTY_SALESFORCE_ORG_ID) UUID salesforceOrgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT) String subject) {
    this.description = description;
    this.name = name;
    this.ownerId = ownerId;
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    this.salesforceOrgId = salesforceOrgId;
    this.subject = subject;
  }

  public SalesforceIncidentsTemplateCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Long-form description body for Salesforce incidents created from this template.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SalesforceIncidentsTemplateCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for this incident template. Must be unique within your organization.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SalesforceIncidentsTemplateCreateAttributes ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The Salesforce user ID that owns incidents created from this template.
   *
   * @return ownerId
   */
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public SalesforceIncidentsTemplateCreateAttributes priority(
      SalesforceIncidentsTemplatePriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * Priority of the Salesforce incident created from this template.
   *
   * @return priority
   */
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SalesforceIncidentsTemplatePriority getPriority() {
    return priority;
  }

  public void setPriority(SalesforceIncidentsTemplatePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public SalesforceIncidentsTemplateCreateAttributes salesforceOrgId(UUID salesforceOrgId) {
    this.salesforceOrgId = salesforceOrgId;
    return this;
  }

  /**
   * The Datadog-assigned ID of the Salesforce organization this template belongs to.
   *
   * @return salesforceOrgId
   */
  @JsonProperty(JSON_PROPERTY_SALESFORCE_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getSalesforceOrgId() {
    return salesforceOrgId;
  }

  public void setSalesforceOrgId(UUID salesforceOrgId) {
    this.salesforceOrgId = salesforceOrgId;
  }

  public SalesforceIncidentsTemplateCreateAttributes subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject line for Salesforce incidents created from this template.
   *
   * @return subject
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
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
   * @return SalesforceIncidentsTemplateCreateAttributes
   */
  @JsonAnySetter
  public SalesforceIncidentsTemplateCreateAttributes putAdditionalProperty(
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

  /** Return true if this SalesforceIncidentsTemplateCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesforceIncidentsTemplateCreateAttributes salesforceIncidentsTemplateCreateAttributes =
        (SalesforceIncidentsTemplateCreateAttributes) o;
    return Objects.equals(this.description, salesforceIncidentsTemplateCreateAttributes.description)
        && Objects.equals(this.name, salesforceIncidentsTemplateCreateAttributes.name)
        && Objects.equals(this.ownerId, salesforceIncidentsTemplateCreateAttributes.ownerId)
        && Objects.equals(this.priority, salesforceIncidentsTemplateCreateAttributes.priority)
        && Objects.equals(
            this.salesforceOrgId, salesforceIncidentsTemplateCreateAttributes.salesforceOrgId)
        && Objects.equals(this.subject, salesforceIncidentsTemplateCreateAttributes.subject)
        && Objects.equals(
            this.additionalProperties,
            salesforceIncidentsTemplateCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, name, ownerId, priority, salesforceOrgId, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesforceIncidentsTemplateCreateAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    salesforceOrgId: ").append(toIndentedString(salesforceOrgId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
