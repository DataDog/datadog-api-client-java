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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Updatable attributes of an Elastic Cloud CCM account. Every field is optional; only the fields
 * provided are changed.
 */
@JsonPropertyOrder({
  ElasticCloudCcmAccountUpdateAttributes.JSON_PROPERTY_AUTHENTICATION,
  ElasticCloudCcmAccountUpdateAttributes.JSON_PROPERTY_DATAFLOWS,
  ElasticCloudCcmAccountUpdateAttributes.JSON_PROPERTY_NAME,
  ElasticCloudCcmAccountUpdateAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudCcmAccountUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private ElasticCloudCcmAuthentication authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private List<ElasticCloudCcmDataflow> dataflows = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ElasticCloudCcmSettingsUpdate settings;

  public ElasticCloudCcmAccountUpdateAttributes authentication(
      ElasticCloudCcmAuthentication authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication methods supported by the Elastic Cloud CCM interface. Exactly one is set,
   * selected by its <code>type</code>.
   *
   * @return authentication
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudCcmAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(ElasticCloudCcmAuthentication authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public ElasticCloudCcmAccountUpdateAttributes dataflows(List<ElasticCloudCcmDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (ElasticCloudCcmDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ElasticCloudCcmAccountUpdateAttributes addDataflowsItem(
      ElasticCloudCcmDataflow dataflowsItem) {
    if (this.dataflows == null) {
      this.dataflows = new ArrayList<>();
    }
    this.dataflows.add(dataflowsItem);
    this.unparsed |= dataflowsItem.unparsed;
    return this;
  }

  /**
   * Dataflows for the Elastic Cloud CCM interface.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ElasticCloudCcmDataflow> getDataflows() {
    return dataflows;
  }

  public void setDataflows(List<ElasticCloudCcmDataflow> dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      for (ElasticCloudCcmDataflow item : dataflows) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ElasticCloudCcmAccountUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the account.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElasticCloudCcmAccountUpdateAttributes settings(ElasticCloudCcmSettingsUpdate settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * Partial Elastic Cloud CCM interface settings for updates.
   *
   * @return settings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ElasticCloudCcmSettingsUpdate getSettings() {
    return settings;
  }

  public void setSettings(ElasticCloudCcmSettingsUpdate settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
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
   * @return ElasticCloudCcmAccountUpdateAttributes
   */
  @JsonAnySetter
  public ElasticCloudCcmAccountUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudCcmAccountUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudCcmAccountUpdateAttributes elasticCloudCcmAccountUpdateAttributes =
        (ElasticCloudCcmAccountUpdateAttributes) o;
    return Objects.equals(
            this.authentication, elasticCloudCcmAccountUpdateAttributes.authentication)
        && Objects.equals(this.dataflows, elasticCloudCcmAccountUpdateAttributes.dataflows)
        && Objects.equals(this.name, elasticCloudCcmAccountUpdateAttributes.name)
        && Objects.equals(this.settings, elasticCloudCcmAccountUpdateAttributes.settings)
        && Objects.equals(
            this.additionalProperties, elasticCloudCcmAccountUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudCcmAccountUpdateAttributes {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
