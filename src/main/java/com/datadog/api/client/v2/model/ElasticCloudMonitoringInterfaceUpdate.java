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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Partial Elastic Cloud monitoring interface for updates. */
@JsonPropertyOrder({
  ElasticCloudMonitoringInterfaceUpdate.JSON_PROPERTY_AUTHENTICATION,
  ElasticCloudMonitoringInterfaceUpdate.JSON_PROPERTY_DATAFLOWS,
  ElasticCloudMonitoringInterfaceUpdate.JSON_PROPERTY_SETTINGS,
  ElasticCloudMonitoringInterfaceUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudMonitoringInterfaceUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private ElasticCloudAuthentication authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private List<ElasticCloudDataflow> dataflows = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ElasticCloudSettingsUpdate settings;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ElasticCloudMonitoringInterfaceType type;

  public ElasticCloudMonitoringInterfaceUpdate() {}

  @JsonCreator
  public ElasticCloudMonitoringInterfaceUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ElasticCloudMonitoringInterfaceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ElasticCloudMonitoringInterfaceUpdate authentication(
      ElasticCloudAuthentication authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication methods supported by the Elastic Cloud interface. Exactly one is set, selected
   * by its <code>type</code>.
   *
   * @return authentication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(ElasticCloudAuthentication authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public ElasticCloudMonitoringInterfaceUpdate dataflows(List<ElasticCloudDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (ElasticCloudDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ElasticCloudMonitoringInterfaceUpdate addDataflowsItem(
      ElasticCloudDataflow dataflowsItem) {
    if (this.dataflows == null) {
      this.dataflows = new ArrayList<>();
    }
    this.dataflows.add(dataflowsItem);
    this.unparsed |= dataflowsItem.unparsed;
    return this;
  }

  /**
   * Dataflows for the Elastic Cloud monitoring interface.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ElasticCloudDataflow> getDataflows() {
    return dataflows;
  }

  public void setDataflows(List<ElasticCloudDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (ElasticCloudDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ElasticCloudMonitoringInterfaceUpdate settings(ElasticCloudSettingsUpdate settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Partial Elastic Cloud interface settings for updates.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudSettingsUpdate getSettings() {
    return settings;
  }

  public void setSettings(ElasticCloudSettingsUpdate settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
  }

  public ElasticCloudMonitoringInterfaceUpdate type(ElasticCloudMonitoringInterfaceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Interface discriminator for the Elastic Cloud monitoring interface.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ElasticCloudMonitoringInterfaceType getType() {
    return type;
  }

  public void setType(ElasticCloudMonitoringInterfaceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ElasticCloudMonitoringInterfaceUpdate
   */
  @JsonAnySetter
  public ElasticCloudMonitoringInterfaceUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudMonitoringInterfaceUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudMonitoringInterfaceUpdate elasticCloudMonitoringInterfaceUpdate =
        (ElasticCloudMonitoringInterfaceUpdate) o;
    return Objects.equals(this.authentication, elasticCloudMonitoringInterfaceUpdate.authentication)
        && Objects.equals(this.dataflows, elasticCloudMonitoringInterfaceUpdate.dataflows)
        && Objects.equals(this.settings, elasticCloudMonitoringInterfaceUpdate.settings)
        && Objects.equals(this.type, elasticCloudMonitoringInterfaceUpdate.type)
        && Objects.equals(
            this.additionalProperties, elasticCloudMonitoringInterfaceUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, settings, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudMonitoringInterfaceUpdate {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
