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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating or updating a Statuspage incident. */
@JsonPropertyOrder({
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_BODY,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_COMPONENTS,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_DELIVER_NOTIFICATIONS,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_IMPACT,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_NAME,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_PAGE_ID,
  IncidentStatuspageIncidentDataAttributesRequest.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentStatuspageIncidentDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BODY = "body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private Map<String, String> components = null;

  public static final String JSON_PROPERTY_DELIVER_NOTIFICATIONS = "deliver_notifications";
  private JsonNullable<Boolean> deliverNotifications = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private JsonNullable<String> impact = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAGE_ID = "page_id";
  private String pageId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<String> status = JsonNullable.<String>undefined();

  public IncidentStatuspageIncidentDataAttributesRequest body(String body) {
    this.body = JsonNullable.<String>of(body);
    return this;
  }

  /**
   * The body text of the Statuspage incident.
   *
   * @return body
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getBody() {
    return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }

  public IncidentStatuspageIncidentDataAttributesRequest components(
      Map<String, String> components) {
    this.components = components;
    return this;
  }

  public IncidentStatuspageIncidentDataAttributesRequest putComponentsItem(
      String key, String componentsItem) {
    if (this.components == null) {
      this.components = new HashMap<>();
    }
    this.components.put(key, componentsItem);
    return this;
  }

  /**
   * Map of component identifiers to their status.
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getComponents() {
    return components;
  }

  public void setComponents(Map<String, String> components) {
    this.components = components;
  }

  public IncidentStatuspageIncidentDataAttributesRequest deliverNotifications(
      Boolean deliverNotifications) {
    this.deliverNotifications = JsonNullable.<Boolean>of(deliverNotifications);
    return this;
  }

  /**
   * Whether to deliver notifications.
   *
   * @return deliverNotifications
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getDeliverNotifications() {
    return deliverNotifications.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELIVER_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getDeliverNotifications_JsonNullable() {
    return deliverNotifications;
  }

  @JsonProperty(JSON_PROPERTY_DELIVER_NOTIFICATIONS)
  public void setDeliverNotifications_JsonNullable(JsonNullable<Boolean> deliverNotifications) {
    this.deliverNotifications = deliverNotifications;
  }

  public void setDeliverNotifications(Boolean deliverNotifications) {
    this.deliverNotifications = JsonNullable.<Boolean>of(deliverNotifications);
  }

  public IncidentStatuspageIncidentDataAttributesRequest impact(String impact) {
    this.impact = JsonNullable.<String>of(impact);
    return this;
  }

  /**
   * The impact level of the incident.
   *
   * @return impact
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getImpact() {
    return impact.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getImpact_JsonNullable() {
    return impact;
  }

  @JsonProperty(JSON_PROPERTY_IMPACT)
  public void setImpact_JsonNullable(JsonNullable<String> impact) {
    this.impact = impact;
  }

  public void setImpact(String impact) {
    this.impact = JsonNullable.<String>of(impact);
  }

  public IncidentStatuspageIncidentDataAttributesRequest name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * The name of the Statuspage incident.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public IncidentStatuspageIncidentDataAttributesRequest pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * The Statuspage page identifier.
   *
   * @return pageId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public IncidentStatuspageIncidentDataAttributesRequest status(String status) {
    this.status = JsonNullable.<String>of(status);
    return this;
  }

  /**
   * The status of the Statuspage incident.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStatus() {
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStatus_JsonNullable() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<String> status) {
    this.status = status;
  }

  public void setStatus(String status) {
    this.status = JsonNullable.<String>of(status);
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
   * @return IncidentStatuspageIncidentDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentStatuspageIncidentDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this IncidentStatuspageIncidentDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentStatuspageIncidentDataAttributesRequest
        incidentStatuspageIncidentDataAttributesRequest =
            (IncidentStatuspageIncidentDataAttributesRequest) o;
    return Objects.equals(this.body, incidentStatuspageIncidentDataAttributesRequest.body)
        && Objects.equals(
            this.components, incidentStatuspageIncidentDataAttributesRequest.components)
        && Objects.equals(
            this.deliverNotifications,
            incidentStatuspageIncidentDataAttributesRequest.deliverNotifications)
        && Objects.equals(this.impact, incidentStatuspageIncidentDataAttributesRequest.impact)
        && Objects.equals(this.name, incidentStatuspageIncidentDataAttributesRequest.name)
        && Objects.equals(this.pageId, incidentStatuspageIncidentDataAttributesRequest.pageId)
        && Objects.equals(this.status, incidentStatuspageIncidentDataAttributesRequest.status)
        && Objects.equals(
            this.additionalProperties,
            incidentStatuspageIncidentDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        body, components, deliverNotifications, impact, name, pageId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentStatuspageIncidentDataAttributesRequest {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    deliverNotifications: ")
        .append(toIndentedString(deliverNotifications))
        .append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
