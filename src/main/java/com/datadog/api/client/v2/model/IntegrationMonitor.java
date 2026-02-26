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
   * <p>Monitor integration settings</p>
 */
@JsonPropertyOrder({
  IntegrationMonitor.JSON_PROPERTY_AUTO_RESOLVE_ENABLED,
  IntegrationMonitor.JSON_PROPERTY_CASE_TYPE_ID,
  IntegrationMonitor.JSON_PROPERTY_ENABLED,
  IntegrationMonitor.JSON_PROPERTY_HANDLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationMonitor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_RESOLVE_ENABLED = "auto_resolve_enabled";
  private Boolean autoResolveEnabled;

  public static final String JSON_PROPERTY_CASE_TYPE_ID = "case_type_id";
  private String caseTypeId;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public IntegrationMonitor autoResolveEnabled(Boolean autoResolveEnabled) {
    this.autoResolveEnabled = autoResolveEnabled;
    return this;
  }

  /**
   * <p>Whether auto-resolve is enabled</p>
   * @return autoResolveEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTO_RESOLVE_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAutoResolveEnabled() {
        return autoResolveEnabled;
      }
  public void setAutoResolveEnabled(Boolean autoResolveEnabled) {
    this.autoResolveEnabled = autoResolveEnabled;
  }
  public IntegrationMonitor caseTypeId(String caseTypeId) {
    this.caseTypeId = caseTypeId;
    return this;
  }

  /**
   * <p>Case type ID for monitor integration</p>
   * @return caseTypeId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CASE_TYPE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCaseTypeId() {
        return caseTypeId;
      }
  public void setCaseTypeId(String caseTypeId) {
    this.caseTypeId = caseTypeId;
  }
  public IntegrationMonitor enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether monitor integration is enabled</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public IntegrationMonitor handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * <p>Monitor handle</p>
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
   * @return IntegrationMonitor
   */
  @JsonAnySetter
  public IntegrationMonitor putAdditionalProperty(String key, Object value) {
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
   * Return true if this IntegrationMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMonitor integrationMonitor = (IntegrationMonitor) o;
    return Objects.equals(this.autoResolveEnabled, integrationMonitor.autoResolveEnabled) && Objects.equals(this.caseTypeId, integrationMonitor.caseTypeId) && Objects.equals(this.enabled, integrationMonitor.enabled) && Objects.equals(this.handle, integrationMonitor.handle) && Objects.equals(this.additionalProperties, integrationMonitor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoResolveEnabled,caseTypeId,enabled,handle, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMonitor {\n");
    sb.append("    autoResolveEnabled: ").append(toIndentedString(autoResolveEnabled)).append("\n");
    sb.append("    caseTypeId: ").append(toIndentedString(caseTypeId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
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
