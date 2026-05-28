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

/** The attributes from a Statuspage URL setting response. */
@JsonPropertyOrder({
  StatuspageUrlSettingResponseAttributes.JSON_PROPERTY_CUSTOM_TAGS,
  StatuspageUrlSettingResponseAttributes.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatuspageUrlSettingResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TAGS = "custom_tags";
  private String customTags;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public StatuspageUrlSettingResponseAttributes customTags(String customTags) {
    this.customTags = customTags;
    return this;
  }

  /**
   * Comma-separated list of custom tags applied to events generated from this Statuspage URL.
   *
   * @return customTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomTags() {
    return customTags;
  }

  public void setCustomTags(String customTags) {
    this.customTags = customTags;
  }

  public StatuspageUrlSettingResponseAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The Statuspage URL being monitored.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return StatuspageUrlSettingResponseAttributes
   */
  @JsonAnySetter
  public StatuspageUrlSettingResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this StatuspageUrlSettingResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatuspageUrlSettingResponseAttributes statuspageUrlSettingResponseAttributes =
        (StatuspageUrlSettingResponseAttributes) o;
    return Objects.equals(this.customTags, statuspageUrlSettingResponseAttributes.customTags)
        && Objects.equals(this.url, statuspageUrlSettingResponseAttributes.url)
        && Objects.equals(
            this.additionalProperties, statuspageUrlSettingResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatuspageUrlSettingResponseAttributes {\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
