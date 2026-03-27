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
   * <p>Attributes for Azure config pair.</p>
 */
@JsonPropertyOrder({
  AzureUCConfigPairAttributes.JSON_PROPERTY_CONFIGS,
  AzureUCConfigPairAttributes.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureUCConfigPairAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGS = "configs";
  private List<AzureUCConfig> configs = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public AzureUCConfigPairAttributes() {}

  @JsonCreator
  public AzureUCConfigPairAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CONFIGS)List<AzureUCConfig> configs) {
        this.configs = configs;
  }
  public AzureUCConfigPairAttributes configs(List<AzureUCConfig> configs) {
    this.configs = configs;
    for (AzureUCConfig item : configs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AzureUCConfigPairAttributes addConfigsItem(AzureUCConfig configsItem) {
    this.configs.add(configsItem);
    this.unparsed |= configsItem.unparsed;
    return this;
  }

  /**
   * <p>An Azure config.</p>
   * @return configs
  **/
      @JsonProperty(JSON_PROPERTY_CONFIGS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<AzureUCConfig> getConfigs() {
        return configs;
      }
  public void setConfigs(List<AzureUCConfig> configs) {
    this.configs = configs;
  }
  public AzureUCConfigPairAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The ID of the Azure config pair.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
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
   * @return AzureUCConfigPairAttributes
   */
  @JsonAnySetter
  public AzureUCConfigPairAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AzureUCConfigPairAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureUCConfigPairAttributes azureUcConfigPairAttributes = (AzureUCConfigPairAttributes) o;
    return Objects.equals(this.configs, azureUcConfigPairAttributes.configs) && Objects.equals(this.id, azureUcConfigPairAttributes.id) && Objects.equals(this.additionalProperties, azureUcConfigPairAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configs,id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureUCConfigPairAttributes {\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
