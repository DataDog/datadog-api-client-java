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
   * <p>Attributes of an Elastic Cloud integration account returned in responses.</p>
 */
@JsonPropertyOrder({
  ElasticCloudIntegrationAccountResponseAttributes.JSON_PROPERTY_AUTHENTICATION,
  ElasticCloudIntegrationAccountResponseAttributes.JSON_PROPERTY_DATAFLOWS,
  ElasticCloudIntegrationAccountResponseAttributes.JSON_PROPERTY_NAME,
  ElasticCloudIntegrationAccountResponseAttributes.JSON_PROPERTY_SETTINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudIntegrationAccountResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private ElasticCloudIntegrationAccountAuthenticationResponse authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private ElasticCloudIntegrationDataflowsResponse dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private ElasticCloudIntegrationAccountSettingsResponse settings;

  public ElasticCloudIntegrationAccountResponseAttributes() {}

  @JsonCreator
  public ElasticCloudIntegrationAccountResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SETTINGS)ElasticCloudIntegrationAccountSettingsResponse settings) {
        this.name = name;
        this.settings = settings;
        this.unparsed |= settings.unparsed;
  }
  public ElasticCloudIntegrationAccountResponseAttributes authentication(ElasticCloudIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * <p>Authentication configured on the Elastic Cloud integration account.</p>
   * @return authentication
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudIntegrationAccountAuthenticationResponse getAuthentication() {
        return authentication;
      }
  public void setAuthentication(ElasticCloudIntegrationAccountAuthenticationResponse authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }
  public ElasticCloudIntegrationAccountResponseAttributes dataflows(ElasticCloudIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * <p>Dataflows configured on the Elastic Cloud integration account, keyed by dataflow id.</p>
   * @return dataflows
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATAFLOWS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ElasticCloudIntegrationDataflowsResponse getDataflows() {
        return dataflows;
      }
  public void setDataflows(ElasticCloudIntegrationDataflowsResponse dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }
  public ElasticCloudIntegrationAccountResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Human-readable name of the Elastic Cloud integration account.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ElasticCloudIntegrationAccountResponseAttributes settings(ElasticCloudIntegrationAccountSettingsResponse settings) {
    this.settings = settings;
    this.unparsed |= settings.unparsed;
    return this;
  }

  /**
   * <p>Settings configured on the Elastic Cloud integration account.</p>
   * @return settings
  **/
      @JsonProperty(JSON_PROPERTY_SETTINGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ElasticCloudIntegrationAccountSettingsResponse getSettings() {
        return settings;
      }
  public void setSettings(ElasticCloudIntegrationAccountSettingsResponse settings) {
    this.settings = settings;
    if (settings != null) {
      this.unparsed |= settings.unparsed;
    }
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
   * @return ElasticCloudIntegrationAccountResponseAttributes
   */
  @JsonAnySetter
  public ElasticCloudIntegrationAccountResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ElasticCloudIntegrationAccountResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudIntegrationAccountResponseAttributes elasticCloudIntegrationAccountResponseAttributes = (ElasticCloudIntegrationAccountResponseAttributes) o;
    return Objects.equals(this.authentication, elasticCloudIntegrationAccountResponseAttributes.authentication) && Objects.equals(this.dataflows, elasticCloudIntegrationAccountResponseAttributes.dataflows) && Objects.equals(this.name, elasticCloudIntegrationAccountResponseAttributes.name) && Objects.equals(this.settings, elasticCloudIntegrationAccountResponseAttributes.settings) && Objects.equals(this.additionalProperties, elasticCloudIntegrationAccountResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authentication,dataflows,name,settings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudIntegrationAccountResponseAttributes {\n");
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
