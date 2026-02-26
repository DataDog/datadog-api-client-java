/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An application key response. */
@JsonPropertyOrder({ApplicationKeyResponse.JSON_PROPERTY_APPLICATION_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_KEY = "application_key";
  private ApplicationKey applicationKey;

  public ApplicationKeyResponse applicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
    this.unparsed |= applicationKey.unparsed;
    return this;
  }

  /**
   * An application key with its associated metadata.
   *
   * @return applicationKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationKey getApplicationKey() {
    return applicationKey;
  }

  public void setApplicationKey(ApplicationKey applicationKey) {
    this.applicationKey = applicationKey;
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
   * @return ApplicationKeyResponse
   */
  @JsonAnySetter
  public ApplicationKeyResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationKeyResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyResponse applicationKeyResponse = (ApplicationKeyResponse) o;
    return Objects.equals(this.applicationKey, applicationKeyResponse.applicationKey)
        && Objects.equals(this.additionalProperties, applicationKeyResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyResponse {\n");
    sb.append("    applicationKey: ").append(toIndentedString(applicationKey)).append("\n");
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
