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
import java.util.UUID;

/** Salesforce incident template attributes for an update request. */
@JsonPropertyOrder({
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_NAME,
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_OWNER_ID,
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_PRIORITY,
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_SALESFORCE_ORG_ID,
  SalesforceIncidentsTemplateUpdateAttributes.JSON_PROPERTY_SUBJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SalesforceIncidentsTemplateUpdateAttributes {
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

  public SalesforceIncidentsTemplateUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Long-form description body for Salesforce incidents created from this template.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SalesforceIncidentsTemplateUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for this incident template.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SalesforceIncidentsTemplateUpdateAttributes ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The Salesforce user ID that owns incidents created from this template.
   *
   * @return ownerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public SalesforceIncidentsTemplateUpdateAttributes priority(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SalesforceIncidentsTemplatePriority getPriority() {
    return priority;
  }

  public void setPriority(SalesforceIncidentsTemplatePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public SalesforceIncidentsTemplateUpdateAttributes salesforceOrgId(UUID salesforceOrgId) {
    this.salesforceOrgId = salesforceOrgId;
    return this;
  }

  /**
   * The Datadog-assigned ID of the Salesforce organization this template belongs to.
   *
   * @return salesforceOrgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALESFORCE_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getSalesforceOrgId() {
    return salesforceOrgId;
  }

  public void setSalesforceOrgId(UUID salesforceOrgId) {
    this.salesforceOrgId = salesforceOrgId;
  }

  public SalesforceIncidentsTemplateUpdateAttributes subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Subject line for Salesforce incidents created from this template.
   *
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return SalesforceIncidentsTemplateUpdateAttributes
   */
  @JsonAnySetter
  public SalesforceIncidentsTemplateUpdateAttributes putAdditionalProperty(
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

  /** Return true if this SalesforceIncidentsTemplateUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesforceIncidentsTemplateUpdateAttributes salesforceIncidentsTemplateUpdateAttributes =
        (SalesforceIncidentsTemplateUpdateAttributes) o;
    return Objects.equals(this.description, salesforceIncidentsTemplateUpdateAttributes.description)
        && Objects.equals(this.name, salesforceIncidentsTemplateUpdateAttributes.name)
        && Objects.equals(this.ownerId, salesforceIncidentsTemplateUpdateAttributes.ownerId)
        && Objects.equals(this.priority, salesforceIncidentsTemplateUpdateAttributes.priority)
        && Objects.equals(
            this.salesforceOrgId, salesforceIncidentsTemplateUpdateAttributes.salesforceOrgId)
        && Objects.equals(this.subject, salesforceIncidentsTemplateUpdateAttributes.subject)
        && Objects.equals(
            this.additionalProperties,
            salesforceIncidentsTemplateUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, name, ownerId, priority, salesforceOrgId, subject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesforceIncidentsTemplateUpdateAttributes {\n");
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
