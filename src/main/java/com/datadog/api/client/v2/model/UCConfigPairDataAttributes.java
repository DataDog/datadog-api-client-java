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
   * <p>The definition of <code>UCConfigPairDataAttributes</code> object.</p>
 */
@JsonPropertyOrder({
  UCConfigPairDataAttributes.JSON_PROPERTY_CONFIGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UCConfigPairDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGS = "configs";
  private List<UCConfigPairDataAttributesConfigsItems> configs = null;

  public UCConfigPairDataAttributes configs(List<UCConfigPairDataAttributesConfigsItems> configs) {
    this.configs = configs;
    for (UCConfigPairDataAttributesConfigsItems item : configs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UCConfigPairDataAttributes addConfigsItem(UCConfigPairDataAttributesConfigsItems configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    this.unparsed |= configsItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>configs</code>.</p>
   * @return configs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UCConfigPairDataAttributesConfigsItems> getConfigs() {
        return configs;
      }
  public void setConfigs(List<UCConfigPairDataAttributesConfigsItems> configs) {
    this.configs = configs;
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
   * @return UCConfigPairDataAttributes
   */
  @JsonAnySetter
  public UCConfigPairDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UCConfigPairDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UCConfigPairDataAttributes ucConfigPairDataAttributes = (UCConfigPairDataAttributes) o;
    return Objects.equals(this.configs, ucConfigPairDataAttributes.configs) && Objects.equals(this.additionalProperties, ucConfigPairDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UCConfigPairDataAttributes {\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
