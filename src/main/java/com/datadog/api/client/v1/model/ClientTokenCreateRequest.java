/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Request to create a new client token. */
@JsonPropertyOrder({
  ClientTokenCreateRequest.JSON_PROPERTY_NAME,
  ClientTokenCreateRequest.JSON_PROPERTY_ORIGIN_URLS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ClientTokenCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORIGIN_URLS = "origin_urls";
  private List<String> originUrls = new ArrayList<>();

  public ClientTokenCreateRequest() {}

  @JsonCreator
  public ClientTokenCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORIGIN_URLS) List<String> originUrls) {
    this.name = name;
    this.originUrls = originUrls;
  }

  public ClientTokenCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the client token.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientTokenCreateRequest originUrls(List<String> originUrls) {
    this.originUrls = originUrls;
    return this;
  }

  public ClientTokenCreateRequest addOriginUrlsItem(String originUrlsItem) {
    this.originUrls.add(originUrlsItem);
    return this;
  }

  /**
   * List of allowed origin URLs for browser-based applications. Requests from URLs not in this list
   * will be rejected.
   *
   * @return originUrls
   */
  @JsonProperty(JSON_PROPERTY_ORIGIN_URLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getOriginUrls() {
    return originUrls;
  }

  public void setOriginUrls(List<String> originUrls) {
    this.originUrls = originUrls;
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
   * @return ClientTokenCreateRequest
   */
  @JsonAnySetter
  public ClientTokenCreateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ClientTokenCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientTokenCreateRequest clientTokenCreateRequest = (ClientTokenCreateRequest) o;
    return Objects.equals(this.name, clientTokenCreateRequest.name)
        && Objects.equals(this.originUrls, clientTokenCreateRequest.originUrls)
        && Objects.equals(this.additionalProperties, clientTokenCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originUrls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientTokenCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originUrls: ").append(toIndentedString(originUrls)).append("\n");
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
