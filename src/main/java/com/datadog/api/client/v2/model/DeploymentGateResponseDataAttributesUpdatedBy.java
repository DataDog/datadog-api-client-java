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
   * <p>Information about the user who updated the deployment gate.</p>
 */
@JsonPropertyOrder({
  DeploymentGateResponseDataAttributesUpdatedBy.JSON_PROPERTY_HANDLE,
  DeploymentGateResponseDataAttributesUpdatedBy.JSON_PROPERTY_ID,
  DeploymentGateResponseDataAttributesUpdatedBy.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateResponseDataAttributesUpdatedBy {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public DeploymentGateResponseDataAttributesUpdatedBy() {}

  @JsonCreator
  public DeploymentGateResponseDataAttributesUpdatedBy(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id) {
        this.id = id;
  }
  public DeploymentGateResponseDataAttributesUpdatedBy handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>The handle of the user who updated the deployment rule.</p>
   * @return handle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HANDLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHandle() {
        return handle;
      }
  public void setHandle(String handle) {
    this.handle = handle;
  }
  public DeploymentGateResponseDataAttributesUpdatedBy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the user who updated the deployment rule.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public DeploymentGateResponseDataAttributesUpdatedBy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the user who updated the deployment rule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
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
   * @return DeploymentGateResponseDataAttributesUpdatedBy
   */
  @JsonAnySetter
  public DeploymentGateResponseDataAttributesUpdatedBy putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentGateResponseDataAttributesUpdatedBy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateResponseDataAttributesUpdatedBy deploymentGateResponseDataAttributesUpdatedBy = (DeploymentGateResponseDataAttributesUpdatedBy) o;
    return Objects.equals(this.handle, deploymentGateResponseDataAttributesUpdatedBy.handle) && Objects.equals(this.id, deploymentGateResponseDataAttributesUpdatedBy.id) && Objects.equals(this.name, deploymentGateResponseDataAttributesUpdatedBy.name) && Objects.equals(this.additionalProperties, deploymentGateResponseDataAttributesUpdatedBy.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(handle,id,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateResponseDataAttributesUpdatedBy {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
