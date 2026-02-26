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
   * <p>Team sync attributes.</p>
 */
@JsonPropertyOrder({
  TeamSyncAttributes.JSON_PROPERTY_FREQUENCY,
  TeamSyncAttributes.JSON_PROPERTY_SOURCE,
  TeamSyncAttributes.JSON_PROPERTY_SYNC_MEMBERSHIP,
  TeamSyncAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamSyncAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private TeamSyncAttributesFrequency frequency;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private TeamSyncAttributesSource source;

  public static final String JSON_PROPERTY_SYNC_MEMBERSHIP = "sync_membership";
  private Boolean syncMembership;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamSyncAttributesType type;

  public TeamSyncAttributes() {}

  @JsonCreator
  public TeamSyncAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_SOURCE)TeamSyncAttributesSource source,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)TeamSyncAttributesType type) {
        this.source = source;
        this.unparsed |= !source.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public TeamSyncAttributes frequency(TeamSyncAttributesFrequency frequency) {
    this.frequency = frequency;
    this.unparsed |= !frequency.isValid();
    return this;
  }

  /**
   * <p>How often the sync process should be run. Defaults to <code>once</code> when not provided.</p>
   * @return frequency
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FREQUENCY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamSyncAttributesFrequency getFrequency() {
        return frequency;
      }
  public void setFrequency(TeamSyncAttributesFrequency frequency) {
    if (!frequency.isValid()) {
        this.unparsed = true;
    }
    this.frequency = frequency;
  }
  public TeamSyncAttributes source(TeamSyncAttributesSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * <p>The external source platform for team synchronization. Only "github" is supported.</p>
   * @return source
  **/
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TeamSyncAttributesSource getSource() {
        return source;
      }
  public void setSource(TeamSyncAttributesSource source) {
    if (!source.isValid()) {
        this.unparsed = true;
    }
    this.source = source;
  }
  public TeamSyncAttributes syncMembership(Boolean syncMembership) {
    this.syncMembership = syncMembership;
    return this;
  }

  /**
   * <p>Whether to sync members from the external team to the Datadog team. Defaults to <code>false</code> when not provided.</p>
   * @return syncMembership
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SYNC_MEMBERSHIP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getSyncMembership() {
        return syncMembership;
      }
  public void setSyncMembership(Boolean syncMembership) {
    this.syncMembership = syncMembership;
  }
  public TeamSyncAttributes type(TeamSyncAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of synchronization operation. "link" connects teams by matching names. "provision" creates new teams when no match is found.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TeamSyncAttributesType getType() {
        return type;
      }
  public void setType(TeamSyncAttributesType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return TeamSyncAttributes
   */
  @JsonAnySetter
  public TeamSyncAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this TeamSyncAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSyncAttributes teamSyncAttributes = (TeamSyncAttributes) o;
    return Objects.equals(this.frequency, teamSyncAttributes.frequency) && Objects.equals(this.source, teamSyncAttributes.source) && Objects.equals(this.syncMembership, teamSyncAttributes.syncMembership) && Objects.equals(this.type, teamSyncAttributes.type) && Objects.equals(this.additionalProperties, teamSyncAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(frequency,source,syncMembership,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSyncAttributes {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    syncMembership: ").append(toIndentedString(syncMembership)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
