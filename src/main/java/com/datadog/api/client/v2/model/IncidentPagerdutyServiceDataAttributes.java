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

/** Attributes of a PagerDuty service. */
@JsonPropertyOrder({
  IncidentPagerdutyServiceDataAttributes.JSON_PROPERTY_HANDLE,
  IncidentPagerdutyServiceDataAttributes.JSON_PROPERTY_NAME,
  IncidentPagerdutyServiceDataAttributes.JSON_PROPERTY_SERVICE_ID,
  IncidentPagerdutyServiceDataAttributes.JSON_PROPERTY_WEBHOOKS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentPagerdutyServiceDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICE_ID = "service_id";
  private String serviceId;

  public static final String JSON_PROPERTY_WEBHOOKS_ENABLED = "webhooks_enabled";
  private Boolean webhooksEnabled;

  public IncidentPagerdutyServiceDataAttributes() {}

  @JsonCreator
  public IncidentPagerdutyServiceDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_ID) String serviceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_WEBHOOKS_ENABLED)
          Boolean webhooksEnabled) {
    this.handle = handle;
    this.name = name;
    this.serviceId = serviceId;
    this.webhooksEnabled = webhooksEnabled;
  }

  public IncidentPagerdutyServiceDataAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle for the PagerDuty service.
   *
   * @return handle
   */
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public IncidentPagerdutyServiceDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the PagerDuty service.
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

  public IncidentPagerdutyServiceDataAttributes serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The PagerDuty service identifier.
   *
   * @return serviceId
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public IncidentPagerdutyServiceDataAttributes webhooksEnabled(Boolean webhooksEnabled) {
    this.webhooksEnabled = webhooksEnabled;
    return this;
  }

  /**
   * Whether webhooks are enabled for this service.
   *
   * @return webhooksEnabled
   */
  @JsonProperty(JSON_PROPERTY_WEBHOOKS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getWebhooksEnabled() {
    return webhooksEnabled;
  }

  public void setWebhooksEnabled(Boolean webhooksEnabled) {
    this.webhooksEnabled = webhooksEnabled;
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
   * @return IncidentPagerdutyServiceDataAttributes
   */
  @JsonAnySetter
  public IncidentPagerdutyServiceDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentPagerdutyServiceDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentPagerdutyServiceDataAttributes incidentPagerdutyServiceDataAttributes =
        (IncidentPagerdutyServiceDataAttributes) o;
    return Objects.equals(this.handle, incidentPagerdutyServiceDataAttributes.handle)
        && Objects.equals(this.name, incidentPagerdutyServiceDataAttributes.name)
        && Objects.equals(this.serviceId, incidentPagerdutyServiceDataAttributes.serviceId)
        && Objects.equals(
            this.webhooksEnabled, incidentPagerdutyServiceDataAttributes.webhooksEnabled)
        && Objects.equals(
            this.additionalProperties, incidentPagerdutyServiceDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, name, serviceId, webhooksEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentPagerdutyServiceDataAttributes {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    webhooksEnabled: ").append(toIndentedString(webhooksEnabled)).append("\n");
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
