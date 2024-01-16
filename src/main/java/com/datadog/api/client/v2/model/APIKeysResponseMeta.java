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

/** Additional information related to api keys response. */
@JsonPropertyOrder({
  APIKeysResponseMeta.JSON_PROPERTY_MAX_ALLOWED,
  APIKeysResponseMeta.JSON_PROPERTY_PAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class APIKeysResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_ALLOWED = "max_allowed";
  private Long maxAllowed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private APIKeysResponseMetaPage page;

  public APIKeysResponseMeta maxAllowed(Long maxAllowed) {
    this.maxAllowed = maxAllowed;
    return this;
  }

  /**
   * Max allowed number of API keys.
   *
   * @return maxAllowed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxAllowed() {
    return maxAllowed;
  }

  public void setMaxAllowed(Long maxAllowed) {
    this.maxAllowed = maxAllowed;
  }

  public APIKeysResponseMeta page(APIKeysResponseMetaPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Additional information related to the API keys response.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public APIKeysResponseMetaPage getPage() {
    return page;
  }

  public void setPage(APIKeysResponseMetaPage page) {
    this.page = page;
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
   * @return APIKeysResponseMeta
   */
  @JsonAnySetter
  public APIKeysResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this APIKeysResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeysResponseMeta apiKeysResponseMeta = (APIKeysResponseMeta) o;
    return Objects.equals(this.maxAllowed, apiKeysResponseMeta.maxAllowed)
        && Objects.equals(this.page, apiKeysResponseMeta.page)
        && Objects.equals(this.additionalProperties, apiKeysResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAllowed, page, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeysResponseMeta {\n");
    sb.append("    maxAllowed: ").append(toIndentedString(maxAllowed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
