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
   * <p>Basic information about a deployment gate.</p>
 */
@JsonPropertyOrder({
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_CREATED_BY,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_DRY_RUN,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_ENV,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_IDENTIFIER,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_SERVICE,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_UPDATED_AT,
  DeploymentGateResponseDataAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateResponseDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private DeploymentGateResponseDataAttributesCreatedBy createdBy;

  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private DeploymentGateResponseDataAttributesUpdatedBy updatedBy;

  public DeploymentGateResponseDataAttributes() {}

  @JsonCreator
  public DeploymentGateResponseDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)DeploymentGateResponseDataAttributesCreatedBy createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_DRY_RUN)Boolean dryRun,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_IDENTIFIER)String identifier,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.unparsed |= createdBy.unparsed;
        this.dryRun = dryRun;
        this.env = env;
        this.identifier = identifier;
        this.service = service;
  }
  public DeploymentGateResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The timestamp when the deployment gate was created.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public DeploymentGateResponseDataAttributes createdBy(DeploymentGateResponseDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>Information about the user who created the deployment gate.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DeploymentGateResponseDataAttributesCreatedBy getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(DeploymentGateResponseDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
  }
  public DeploymentGateResponseDataAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * <p>Whether this gate is run in dry-run mode.</p>
   * @return dryRun
  **/
      @JsonProperty(JSON_PROPERTY_DRY_RUN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getDryRun() {
        return dryRun;
      }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }
  public DeploymentGateResponseDataAttributes env(String env) {
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
  public DeploymentGateResponseDataAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * <p>The identifier of the deployment gate.</p>
   * @return identifier
  **/
      @JsonProperty(JSON_PROPERTY_IDENTIFIER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getIdentifier() {
        return identifier;
      }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }
  public DeploymentGateResponseDataAttributes service(String service) {
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
  public DeploymentGateResponseDataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>The timestamp when the deployment gate was last updated.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public DeploymentGateResponseDataAttributes updatedBy(DeploymentGateResponseDataAttributesUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
    this.unparsed |= updatedBy.unparsed;
    return this;
  }

  /**
   * <p>Information about the user who updated the deployment gate.</p>
   * @return updatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DeploymentGateResponseDataAttributesUpdatedBy getUpdatedBy() {
        return updatedBy;
      }
  public void setUpdatedBy(DeploymentGateResponseDataAttributesUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return DeploymentGateResponseDataAttributes
   */
  @JsonAnySetter
  public DeploymentGateResponseDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentGateResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateResponseDataAttributes deploymentGateResponseDataAttributes = (DeploymentGateResponseDataAttributes) o;
    return Objects.equals(this.createdAt, deploymentGateResponseDataAttributes.createdAt) && Objects.equals(this.createdBy, deploymentGateResponseDataAttributes.createdBy) && Objects.equals(this.dryRun, deploymentGateResponseDataAttributes.dryRun) && Objects.equals(this.env, deploymentGateResponseDataAttributes.env) && Objects.equals(this.identifier, deploymentGateResponseDataAttributes.identifier) && Objects.equals(this.service, deploymentGateResponseDataAttributes.service) && Objects.equals(this.updatedAt, deploymentGateResponseDataAttributes.updatedAt) && Objects.equals(this.updatedBy, deploymentGateResponseDataAttributes.updatedBy) && Objects.equals(this.additionalProperties, deploymentGateResponseDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,dryRun,env,identifier,service,updatedAt,updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateResponseDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
