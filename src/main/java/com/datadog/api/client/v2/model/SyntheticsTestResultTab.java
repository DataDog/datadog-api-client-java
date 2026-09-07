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

/** Information about a browser tab involved in a step. */
@JsonPropertyOrder({
  SyntheticsTestResultTab.JSON_PROPERTY_FOCUSED,
  SyntheticsTestResultTab.JSON_PROPERTY_TITLE,
  SyntheticsTestResultTab.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultTab {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FOCUSED = "focused";
  private Boolean focused;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SyntheticsTestResultTab focused(Boolean focused) {
    this.focused = focused;
    return this;
  }

  /**
   * Whether the tab was focused during the step.
   *
   * @return focused
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOCUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getFocused() {
    return focused;
  }

  public void setFocused(Boolean focused) {
    this.focused = focused;
  }

  public SyntheticsTestResultTab title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the tab.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SyntheticsTestResultTab url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL loaded in the tab.
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
   * @return SyntheticsTestResultTab
   */
  @JsonAnySetter
  public SyntheticsTestResultTab putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultTab object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultTab syntheticsTestResultTab = (SyntheticsTestResultTab) o;
    return Objects.equals(this.focused, syntheticsTestResultTab.focused)
        && Objects.equals(this.title, syntheticsTestResultTab.title)
        && Objects.equals(this.url, syntheticsTestResultTab.url)
        && Objects.equals(this.additionalProperties, syntheticsTestResultTab.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(focused, title, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultTab {\n");
    sb.append("    focused: ").append(toIndentedString(focused)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
