/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  IntegrationServiceNowSyncConfigPriority.JSON_PROPERTY_IMPACT_MAPPING,
  IntegrationServiceNowSyncConfigPriority.JSON_PROPERTY_SYNC_TYPE,
  IntegrationServiceNowSyncConfigPriority.JSON_PROPERTY_URGENCY_MAPPING
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationServiceNowSyncConfigPriority {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IMPACT_MAPPING = "impact_mapping";
  private Map<String, String> impactMapping = null;

  public static final String JSON_PROPERTY_SYNC_TYPE = "sync_type";
  private String syncType;

  public static final String JSON_PROPERTY_URGENCY_MAPPING = "urgency_mapping";
  private Map<String, String> urgencyMapping = null;

  public IntegrationServiceNowSyncConfigPriority impactMapping(Map<String, String> impactMapping) {
    this.impactMapping = impactMapping;
    return this;
  }

  public IntegrationServiceNowSyncConfigPriority putImpactMappingItem(
      String key, String impactMappingItem) {
    if (this.impactMapping == null) {
      this.impactMapping = new HashMap<>();
    }
    this.impactMapping.put(key, impactMappingItem);
    return this;
  }

  /**
   * GetimpactMapping
   *
   * @return impactMapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACT_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getImpactMapping() {
    return impactMapping;
  }

  public void setImpactMapping(Map<String, String> impactMapping) {
    this.impactMapping = impactMapping;
  }

  public IntegrationServiceNowSyncConfigPriority syncType(String syncType) {
    this.syncType = syncType;
    return this;
  }

  /**
   * GetsyncType
   *
   * @return syncType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSyncType() {
    return syncType;
  }

  public void setSyncType(String syncType) {
    this.syncType = syncType;
  }

  public IntegrationServiceNowSyncConfigPriority urgencyMapping(
      Map<String, String> urgencyMapping) {
    this.urgencyMapping = urgencyMapping;
    return this;
  }

  public IntegrationServiceNowSyncConfigPriority putUrgencyMappingItem(
      String key, String urgencyMappingItem) {
    if (this.urgencyMapping == null) {
      this.urgencyMapping = new HashMap<>();
    }
    this.urgencyMapping.put(key, urgencyMappingItem);
    return this;
  }

  /**
   * GeturgencyMapping
   *
   * @return urgencyMapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URGENCY_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getUrgencyMapping() {
    return urgencyMapping;
  }

  public void setUrgencyMapping(Map<String, String> urgencyMapping) {
    this.urgencyMapping = urgencyMapping;
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
   * @return IntegrationServiceNowSyncConfigPriority
   */
  @JsonAnySetter
  public IntegrationServiceNowSyncConfigPriority putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationServiceNowSyncConfigPriority object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationServiceNowSyncConfigPriority integrationServiceNowSyncConfigPriority =
        (IntegrationServiceNowSyncConfigPriority) o;
    return Objects.equals(this.impactMapping, integrationServiceNowSyncConfigPriority.impactMapping)
        && Objects.equals(this.syncType, integrationServiceNowSyncConfigPriority.syncType)
        && Objects.equals(
            this.urgencyMapping, integrationServiceNowSyncConfigPriority.urgencyMapping)
        && Objects.equals(
            this.additionalProperties,
            integrationServiceNowSyncConfigPriority.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impactMapping, syncType, urgencyMapping, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationServiceNowSyncConfigPriority {\n");
    sb.append("    impactMapping: ").append(toIndentedString(impactMapping)).append("\n");
    sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
    sb.append("    urgencyMapping: ").append(toIndentedString(urgencyMapping)).append("\n");
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
