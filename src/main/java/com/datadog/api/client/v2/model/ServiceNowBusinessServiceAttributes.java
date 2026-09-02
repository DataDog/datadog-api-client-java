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

/** Attributes of a ServiceNow business service */
@JsonPropertyOrder({
  ServiceNowBusinessServiceAttributes.JSON_PROPERTY_INSTANCE_ID,
  ServiceNowBusinessServiceAttributes.JSON_PROPERTY_SERVICE_NAME,
  ServiceNowBusinessServiceAttributes.JSON_PROPERTY_SERVICE_SYS_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceNowBusinessServiceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INSTANCE_ID = "instance_id";
  private UUID instanceId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public static final String JSON_PROPERTY_SERVICE_SYS_ID = "service_sys_id";
  private String serviceSysId;

  public ServiceNowBusinessServiceAttributes() {}

  @JsonCreator
  public ServiceNowBusinessServiceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INSTANCE_ID) UUID instanceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_NAME) String serviceName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_SYS_ID) String serviceSysId) {
    this.instanceId = instanceId;
    this.serviceName = serviceName;
    this.serviceSysId = serviceSysId;
  }

  public ServiceNowBusinessServiceAttributes instanceId(UUID instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * The ID of the ServiceNow instance
   *
   * @return instanceId
   */
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }

  public ServiceNowBusinessServiceAttributes serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The name of the business service
   *
   * @return serviceName
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ServiceNowBusinessServiceAttributes serviceSysId(String serviceSysId) {
    this.serviceSysId = serviceSysId;
    return this;
  }

  /**
   * The system ID of the business service in ServiceNow
   *
   * @return serviceSysId
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_SYS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceSysId() {
    return serviceSysId;
  }

  public void setServiceSysId(String serviceSysId) {
    this.serviceSysId = serviceSysId;
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
   * @return ServiceNowBusinessServiceAttributes
   */
  @JsonAnySetter
  public ServiceNowBusinessServiceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceNowBusinessServiceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowBusinessServiceAttributes serviceNowBusinessServiceAttributes =
        (ServiceNowBusinessServiceAttributes) o;
    return Objects.equals(this.instanceId, serviceNowBusinessServiceAttributes.instanceId)
        && Objects.equals(this.serviceName, serviceNowBusinessServiceAttributes.serviceName)
        && Objects.equals(this.serviceSysId, serviceNowBusinessServiceAttributes.serviceSysId)
        && Objects.equals(
            this.additionalProperties, serviceNowBusinessServiceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, serviceName, serviceSysId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowBusinessServiceAttributes {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceSysId: ").append(toIndentedString(serviceSysId)).append("\n");
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
