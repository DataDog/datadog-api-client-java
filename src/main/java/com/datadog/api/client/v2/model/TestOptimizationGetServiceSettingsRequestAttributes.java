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
   * <p>Attributes for requesting Test Optimization service settings.</p>
 */
@JsonPropertyOrder({
  TestOptimizationGetServiceSettingsRequestAttributes.JSON_PROPERTY_ENV,
  TestOptimizationGetServiceSettingsRequestAttributes.JSON_PROPERTY_REPOSITORY_ID,
  TestOptimizationGetServiceSettingsRequestAttributes.JSON_PROPERTY_SERVICE_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TestOptimizationGetServiceSettingsRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "service_name";
  private String serviceName;

  public TestOptimizationGetServiceSettingsRequestAttributes() {}

  @JsonCreator
  public TestOptimizationGetServiceSettingsRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_REPOSITORY_ID)String repositoryId,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE_NAME)String serviceName) {
        this.repositoryId = repositoryId;
        this.serviceName = serviceName;
  }
  public TestOptimizationGetServiceSettingsRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>The environment name. If omitted, defaults to <code>none</code>.</p>
   * @return env
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEnv() {
        return env;
      }
  public void setEnv(String env) {
    this.env = env;
  }
  public TestOptimizationGetServiceSettingsRequestAttributes repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * <p>The repository identifier.</p>
   * @return repositoryId
  **/
      @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRepositoryId() {
        return repositoryId;
      }
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }
  public TestOptimizationGetServiceSettingsRequestAttributes serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * <p>The service name.</p>
   * @return serviceName
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getServiceName() {
        return serviceName;
      }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
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
   * @return TestOptimizationGetServiceSettingsRequestAttributes
   */
  @JsonAnySetter
  public TestOptimizationGetServiceSettingsRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TestOptimizationGetServiceSettingsRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestOptimizationGetServiceSettingsRequestAttributes testOptimizationGetServiceSettingsRequestAttributes = (TestOptimizationGetServiceSettingsRequestAttributes) o;
    return Objects.equals(this.env, testOptimizationGetServiceSettingsRequestAttributes.env) && Objects.equals(this.repositoryId, testOptimizationGetServiceSettingsRequestAttributes.repositoryId) && Objects.equals(this.serviceName, testOptimizationGetServiceSettingsRequestAttributes.serviceName) && Objects.equals(this.additionalProperties, testOptimizationGetServiceSettingsRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(env,repositoryId,serviceName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestOptimizationGetServiceSettingsRequestAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
