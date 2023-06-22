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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** An application key response. */
@JsonPropertyOrder({ApplicationKeyListResponse.JSON_PROPERTY_APPLICATION_KEYS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_KEYS = "application_keys";
  private List<ApplicationKey> applicationKeys = null;

  public ApplicationKeyListResponse applicationKeys(List<ApplicationKey> applicationKeys) {
    this.applicationKeys = applicationKeys;
    for (ApplicationKey item : applicationKeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApplicationKeyListResponse addApplicationKeysItem(ApplicationKey applicationKeysItem) {
    if (this.applicationKeys == null) {
      this.applicationKeys = new ArrayList<>();
    }
    this.applicationKeys.add(applicationKeysItem);
    this.unparsed |= applicationKeysItem.unparsed;
    return this;
  }

  /**
   * Array of application keys.
   *
   * @return applicationKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationKey> getApplicationKeys() {
    return applicationKeys;
  }

  public void setApplicationKeys(List<ApplicationKey> applicationKeys) {
    this.applicationKeys = applicationKeys;
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
   * @return ApplicationKeyListResponse
   */
  @JsonAnySetter
  public ApplicationKeyListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ApplicationKeyListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyListResponse applicationKeyListResponse = (ApplicationKeyListResponse) o;
    return Objects.equals(this.applicationKeys, applicationKeyListResponse.applicationKeys)
        && Objects.equals(
            this.additionalProperties, applicationKeyListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyListResponse {\n");
    sb.append("    applicationKeys: ").append(toIndentedString(applicationKeys)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
