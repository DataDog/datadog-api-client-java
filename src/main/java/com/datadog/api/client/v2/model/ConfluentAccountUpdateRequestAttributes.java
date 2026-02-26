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

/** Attributes object for updating a Confluent account. */
@JsonPropertyOrder({
  ConfluentAccountUpdateRequestAttributes.JSON_PROPERTY_API_KEY,
  ConfluentAccountUpdateRequestAttributes.JSON_PROPERTY_API_SECRET,
  ConfluentAccountUpdateRequestAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentAccountUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_API_SECRET = "api_secret";
  private String apiSecret;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ConfluentAccountUpdateRequestAttributes() {}

  @JsonCreator
  public ConfluentAccountUpdateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY) String apiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_API_SECRET) String apiSecret) {
    this.apiKey = apiKey;
    this.apiSecret = apiSecret;
  }

  public ConfluentAccountUpdateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key associated with your Confluent account.
   *
   * @return apiKey
   */
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ConfluentAccountUpdateRequestAttributes apiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }

  /**
   * The API secret associated with your Confluent account.
   *
   * @return apiSecret
   */
  @JsonProperty(JSON_PROPERTY_API_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiSecret() {
    return apiSecret;
  }

  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }

  public ConfluentAccountUpdateRequestAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ConfluentAccountUpdateRequestAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of strings representing tags. Can be a single key, or key-value pairs separated by a
   * colon.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
   * @return ConfluentAccountUpdateRequestAttributes
   */
  @JsonAnySetter
  public ConfluentAccountUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConfluentAccountUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentAccountUpdateRequestAttributes confluentAccountUpdateRequestAttributes =
        (ConfluentAccountUpdateRequestAttributes) o;
    return Objects.equals(this.apiKey, confluentAccountUpdateRequestAttributes.apiKey)
        && Objects.equals(this.apiSecret, confluentAccountUpdateRequestAttributes.apiSecret)
        && Objects.equals(this.tags, confluentAccountUpdateRequestAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            confluentAccountUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, apiSecret, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentAccountUpdateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
