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

/** Elastic Cloud monitoring interface (source-type) configuration. */
@JsonPropertyOrder({
  ElasticCloudMonitoringInterface.JSON_PROPERTY_AUTHENTICATION,
  ElasticCloudMonitoringInterface.JSON_PROPERTY_DATAFLOWS,
  ElasticCloudMonitoringInterface.JSON_PROPERTY_SETTINGS,
  ElasticCloudMonitoringInterface.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudMonitoringInterface {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private ElasticCloudAuthentication authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private List<ElasticCloudDataflow> dataflows = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ElasticCloudSettings settings;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ElasticCloudMonitoringInterfaceType type;

  public ElasticCloudMonitoringInterface() {}

  @JsonCreator
  public ElasticCloudMonitoringInterface(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          ElasticCloudAuthentication authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ElasticCloudMonitoringInterfaceType type) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ElasticCloudMonitoringInterface authentication(ElasticCloudAuthentication authentication) {
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
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ElasticCloudAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(ElasticCloudAuthentication authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public ElasticCloudMonitoringInterface dataflows(List<ElasticCloudDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (ElasticCloudDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ElasticCloudMonitoringInterface addDataflowsItem(ElasticCloudDataflow dataflowsItem) {
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

  public ElasticCloudMonitoringInterface settings(ElasticCloudSettings settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Elastic Cloud interface settings.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudSettings getSettings() {
    return settings;
  }

  public void setSettings(ElasticCloudSettings settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
  }

  public ElasticCloudMonitoringInterface type(ElasticCloudMonitoringInterfaceType type) {
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
   * @return ElasticCloudMonitoringInterface
   */
  @JsonAnySetter
  public ElasticCloudMonitoringInterface putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudMonitoringInterface object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudMonitoringInterface elasticCloudMonitoringInterface =
        (ElasticCloudMonitoringInterface) o;
    return Objects.equals(this.authentication, elasticCloudMonitoringInterface.authentication)
        && Objects.equals(this.dataflows, elasticCloudMonitoringInterface.dataflows)
        && Objects.equals(this.settings, elasticCloudMonitoringInterface.settings)
        && Objects.equals(this.type, elasticCloudMonitoringInterface.type)
        && Objects.equals(
            this.additionalProperties, elasticCloudMonitoringInterface.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, settings, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudMonitoringInterface {\n");
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
