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
   * <p>Parameters for creating a deployment gate.</p>
 */
@JsonPropertyOrder({
  CreateDeploymentGateParamsDataAttributes.JSON_PROPERTY_DRY_RUN,
  CreateDeploymentGateParamsDataAttributes.JSON_PROPERTY_ENV,
  CreateDeploymentGateParamsDataAttributes.JSON_PROPERTY_IDENTIFIER,
  CreateDeploymentGateParamsDataAttributes.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateDeploymentGateParamsDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun = false;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier = "default";

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public CreateDeploymentGateParamsDataAttributes() {}

  @JsonCreator
  public CreateDeploymentGateParamsDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service) {
        this.env = env;
        this.service = service;
  }
  public CreateDeploymentGateParamsDataAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * <p>Whether this gate is run in dry-run mode.</p>
   * @return dryRun
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DRY_RUN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getDryRun() {
        return dryRun;
      }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }
  public CreateDeploymentGateParamsDataAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>The environment of the deployment gate.</p>
   * @return env
  **/
      @JsonProperty(JSON_PROPERTY_ENV)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEnv() {
        return env;
      }
  public void setEnv(String env) {
    this.env = env;
  }
  public CreateDeploymentGateParamsDataAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * <p>The identifier of the deployment gate.</p>
   * @return identifier
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IDENTIFIER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIdentifier() {
        return identifier;
      }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
  public CreateDeploymentGateParamsDataAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The service of the deployment gate.</p>
   * @return service
  **/
      @JsonProperty(JSON_PROPERTY_SERVICE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getService() {
        return service;
      }
  public void setService(String service) {
    this.service = service;
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
   * @return CreateDeploymentGateParamsDataAttributes
   */
  @JsonAnySetter
  public CreateDeploymentGateParamsDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateDeploymentGateParamsDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDeploymentGateParamsDataAttributes createDeploymentGateParamsDataAttributes = (CreateDeploymentGateParamsDataAttributes) o;
    return Objects.equals(this.dryRun, createDeploymentGateParamsDataAttributes.dryRun) && Objects.equals(this.env, createDeploymentGateParamsDataAttributes.env) && Objects.equals(this.identifier, createDeploymentGateParamsDataAttributes.identifier) && Objects.equals(this.service, createDeploymentGateParamsDataAttributes.service) && Objects.equals(this.additionalProperties, createDeploymentGateParamsDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dryRun,env,identifier,service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDeploymentGateParamsDataAttributes {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
