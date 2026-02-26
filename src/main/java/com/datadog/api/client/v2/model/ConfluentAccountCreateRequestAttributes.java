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
   * <p>Attributes associated with the account creation request.</p>
 */
@JsonPropertyOrder({
  ConfluentAccountCreateRequestAttributes.JSON_PROPERTY_API_KEY,
  ConfluentAccountCreateRequestAttributes.JSON_PROPERTY_API_SECRET,
  ConfluentAccountCreateRequestAttributes.JSON_PROPERTY_RESOURCES,
  ConfluentAccountCreateRequestAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentAccountCreateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_API_SECRET = "api_secret";
  private String apiSecret;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<ConfluentAccountResourceAttributes> resources = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConfluentAccountCreateRequestAttributes() {}

  @JsonCreator
  public ConfluentAccountCreateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_API_KEY)String apiKey,
            @JsonProperty(required=true, value=JSON_PROPERTY_API_SECRET)String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
  }
  public ConfluentAccountCreateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * <p>The API key associated with your Confluent account.</p>
   * @return apiKey
  **/
      @JsonProperty(JSON_PROPERTY_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApiKey() {
        return apiKey;
      }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  public ConfluentAccountCreateRequestAttributes apiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }

  /**
   * <p>The API secret associated with your Confluent account.</p>
   * @return apiSecret
  **/
      @JsonProperty(JSON_PROPERTY_API_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApiSecret() {
        return apiSecret;
      }
  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }
  public ConfluentAccountCreateRequestAttributes resources(List<ConfluentAccountResourceAttributes> resources) {
    this.resources = resources;
    for (ConfluentAccountResourceAttributes item : resources) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ConfluentAccountCreateRequestAttributes addResourcesItem(ConfluentAccountResourceAttributes resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    this.unparsed |= resourcesItem.unparsed;
    return this;
  }

  /**
   * <p>A list of Confluent resources associated with the Confluent account.</p>
   * @return resources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ConfluentAccountResourceAttributes> getResources() {
        return resources;
      }
  public void setResources(List<ConfluentAccountResourceAttributes> resources) {
    this.resources = resources;
  }
  public ConfluentAccountCreateRequestAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public ConfluentAccountCreateRequestAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>A list of strings representing tags. Can be a single key, or key-value pairs separated by a colon.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ConfluentAccountCreateRequestAttributes
   */
  @JsonAnySetter
  public ConfluentAccountCreateRequestAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ConfluentAccountCreateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentAccountCreateRequestAttributes confluentAccountCreateRequestAttributes = (ConfluentAccountCreateRequestAttributes) o;
    return Objects.equals(this.apiKey, confluentAccountCreateRequestAttributes.apiKey) && Objects.equals(this.apiSecret, confluentAccountCreateRequestAttributes.apiSecret) && Objects.equals(this.resources, confluentAccountCreateRequestAttributes.resources) && Objects.equals(this.tags, confluentAccountCreateRequestAttributes.tags) && Objects.equals(this.additionalProperties, confluentAccountCreateRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,apiSecret,resources,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentAccountCreateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
