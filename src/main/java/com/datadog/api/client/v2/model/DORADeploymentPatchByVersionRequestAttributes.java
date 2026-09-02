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
   * <p>Attributes for patching a DORA deployment event identified by service, environment, and version.</p>
 */
@JsonPropertyOrder({
  DORADeploymentPatchByVersionRequestAttributes.JSON_PROPERTY_CHANGE_FAILURE,
  DORADeploymentPatchByVersionRequestAttributes.JSON_PROPERTY_ENV,
  DORADeploymentPatchByVersionRequestAttributes.JSON_PROPERTY_REMEDIATION,
  DORADeploymentPatchByVersionRequestAttributes.JSON_PROPERTY_SERVICE,
  DORADeploymentPatchByVersionRequestAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentPatchByVersionRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_FAILURE = "change_failure";
  private Boolean changeFailure;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_REMEDIATION = "remediation";
  private DORADeploymentPatchByVersionRemediation remediation;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DORADeploymentPatchByVersionRequestAttributes() {}

  @JsonCreator
  public DORADeploymentPatchByVersionRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_FAILURE)Boolean changeFailure,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENV)String env,
            @JsonProperty(required=true, value=JSON_PROPERTY_SERVICE)String service,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)String version) {
        this.changeFailure = changeFailure;
        this.env = env;
        this.service = service;
        this.version = version;
  }
  public DORADeploymentPatchByVersionRequestAttributes changeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
    return this;
  }

  /**
   * <p>Indicates whether the deployment resulted in a change failure.</p>
   * @return changeFailure
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_FAILURE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getChangeFailure() {
        return changeFailure;
      }
  public void setChangeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
  }
  public DORADeploymentPatchByVersionRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * <p>The environment the deployment was performed in.</p>
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
  public DORADeploymentPatchByVersionRequestAttributes remediation(DORADeploymentPatchByVersionRemediation remediation) {
    this.remediation = remediation;
    this.unparsed |= remediation.unparsed;
    return this;
  }

  /**
   * <p>Remediation details for the deployment. Optional, but required to calculate failed deployment recovery time. Specify either <code>id</code> or <code>version</code> to identify the remediation deployment, but not both.</p>
   * @return remediation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REMEDIATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DORADeploymentPatchByVersionRemediation getRemediation() {
        return remediation;
      }
  public void setRemediation(DORADeploymentPatchByVersionRemediation remediation) {
    this.remediation = remediation;
    if (remediation != null) {
      this.unparsed |= remediation.unparsed;
    }
  }
  public DORADeploymentPatchByVersionRequestAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * <p>The name of the service that was deployed.</p>
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
  public DORADeploymentPatchByVersionRequestAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version deployed. This can be seen in the Service Catalog or in the APM Deployment Tracking.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getVersion() {
        return version;
      }
  public void setVersion(String version) {
    this.version = version;
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
   * @return DORADeploymentPatchByVersionRequestAttributes
   */
  @JsonAnySetter
  public DORADeploymentPatchByVersionRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DORADeploymentPatchByVersionRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentPatchByVersionRequestAttributes doraDeploymentPatchByVersionRequestAttributes = (DORADeploymentPatchByVersionRequestAttributes) o;
    return Objects.equals(this.changeFailure, doraDeploymentPatchByVersionRequestAttributes.changeFailure) && Objects.equals(this.env, doraDeploymentPatchByVersionRequestAttributes.env) && Objects.equals(this.remediation, doraDeploymentPatchByVersionRequestAttributes.remediation) && Objects.equals(this.service, doraDeploymentPatchByVersionRequestAttributes.service) && Objects.equals(this.version, doraDeploymentPatchByVersionRequestAttributes.version) && Objects.equals(this.additionalProperties, doraDeploymentPatchByVersionRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(changeFailure,env,remediation,service,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentPatchByVersionRequestAttributes {\n");
    sb.append("    changeFailure: ").append(toIndentedString(changeFailure)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
