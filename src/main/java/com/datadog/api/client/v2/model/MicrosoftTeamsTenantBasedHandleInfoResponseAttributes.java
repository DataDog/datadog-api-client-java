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
   * <p>Tenant-based handle attributes.</p>
 */
@JsonPropertyOrder({
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_CHANNEL_ID,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_CHANNEL_NAME,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_NAME,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_TEAM_ID,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_TEAM_NAME,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_TENANT_ID,
  MicrosoftTeamsTenantBasedHandleInfoResponseAttributes.JSON_PROPERTY_TENANT_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MicrosoftTeamsTenantBasedHandleInfoResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channel_name";
  private String channelName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private String tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;

  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * <p>Channel id.</p>
   * @return channelId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChannelId() {
        return channelId;
      }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

  /**
   * <p>Channel name.</p>
   * @return channelName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChannelName() {
        return channelName;
      }
  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Tenant-based handle name.</p>
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
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * <p>Team id.</p>
   * @return teamId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeamId() {
        return teamId;
      }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * <p>Team name.</p>
   * @return teamName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTeamName() {
        return teamName;
      }
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * <p>Tenant id.</p>
   * @return tenantId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantId() {
        return tenantId;
      }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * <p>Tenant name.</p>
   * @return tenantName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TENANT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTenantName() {
        return tenantName;
      }
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
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
   * @return MicrosoftTeamsTenantBasedHandleInfoResponseAttributes
   */
  @JsonAnySetter
  public MicrosoftTeamsTenantBasedHandleInfoResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this MicrosoftTeamsTenantBasedHandleInfoResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftTeamsTenantBasedHandleInfoResponseAttributes microsoftTeamsTenantBasedHandleInfoResponseAttributes = (MicrosoftTeamsTenantBasedHandleInfoResponseAttributes) o;
    return Objects.equals(this.channelId, microsoftTeamsTenantBasedHandleInfoResponseAttributes.channelId) && Objects.equals(this.channelName, microsoftTeamsTenantBasedHandleInfoResponseAttributes.channelName) && Objects.equals(this.name, microsoftTeamsTenantBasedHandleInfoResponseAttributes.name) && Objects.equals(this.teamId, microsoftTeamsTenantBasedHandleInfoResponseAttributes.teamId) && Objects.equals(this.teamName, microsoftTeamsTenantBasedHandleInfoResponseAttributes.teamName) && Objects.equals(this.tenantId, microsoftTeamsTenantBasedHandleInfoResponseAttributes.tenantId) && Objects.equals(this.tenantName, microsoftTeamsTenantBasedHandleInfoResponseAttributes.tenantName) && Objects.equals(this.additionalProperties, microsoftTeamsTenantBasedHandleInfoResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(channelId,channelName,name,teamId,teamName,tenantId,tenantName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftTeamsTenantBasedHandleInfoResponseAttributes {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
