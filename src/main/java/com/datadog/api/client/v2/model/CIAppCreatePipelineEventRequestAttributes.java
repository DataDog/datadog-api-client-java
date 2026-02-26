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

/** Attributes of the pipeline event to create. */
@JsonPropertyOrder({
  CIAppCreatePipelineEventRequestAttributes.JSON_PROPERTY_ENV,
  CIAppCreatePipelineEventRequestAttributes.JSON_PROPERTY_PROVIDER_NAME,
  CIAppCreatePipelineEventRequestAttributes.JSON_PROPERTY_RESOURCE,
  CIAppCreatePipelineEventRequestAttributes.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppCreatePipelineEventRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "provider_name";
  private String providerName;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private CIAppCreatePipelineEventRequestAttributesResource resource;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public CIAppCreatePipelineEventRequestAttributes() {}

  @JsonCreator
  public CIAppCreatePipelineEventRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE)
          CIAppCreatePipelineEventRequestAttributesResource resource) {
    this.resource = resource;
    this.unparsed |= resource.unparsed;
  }

  public CIAppCreatePipelineEventRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The Datadog environment.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public CIAppCreatePipelineEventRequestAttributes providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The name of the CI provider. By default, this is "custom".
   *
   * @return providerName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public CIAppCreatePipelineEventRequestAttributes resource(
      CIAppCreatePipelineEventRequestAttributesResource resource) {
    this.resource = resource;
    this.unparsed |= resource.unparsed;
    return this;
  }

  /**
   * Details of the CI pipeline event.
   *
   * @return resource
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CIAppCreatePipelineEventRequestAttributesResource getResource() {
    return resource;
  }

  public void setResource(CIAppCreatePipelineEventRequestAttributesResource resource) {
    this.resource = resource;
  }

  public CIAppCreatePipelineEventRequestAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * If the CI provider is SaaS, use this to differentiate between instances.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
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
   * @return CIAppCreatePipelineEventRequestAttributes
   */
  @JsonAnySetter
  public CIAppCreatePipelineEventRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CIAppCreatePipelineEventRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppCreatePipelineEventRequestAttributes ciAppCreatePipelineEventRequestAttributes =
        (CIAppCreatePipelineEventRequestAttributes) o;
    return Objects.equals(this.env, ciAppCreatePipelineEventRequestAttributes.env)
        && Objects.equals(this.providerName, ciAppCreatePipelineEventRequestAttributes.providerName)
        && Objects.equals(this.resource, ciAppCreatePipelineEventRequestAttributes.resource)
        && Objects.equals(this.service, ciAppCreatePipelineEventRequestAttributes.service)
        && Objects.equals(
            this.additionalProperties,
            ciAppCreatePipelineEventRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, providerName, resource, service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppCreatePipelineEventRequestAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
