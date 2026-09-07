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

/** Google Chat organization attributes. */
@JsonPropertyOrder({
  GoogleChatOrganizationAttributes.JSON_PROPERTY_DOMAIN_ID,
  GoogleChatOrganizationAttributes.JSON_PROPERTY_DOMAIN_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GoogleChatOrganizationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN_ID = "domain_id";
  private String domainId;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domain_name";
  private String domainName;

  public GoogleChatOrganizationAttributes domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The Google Chat organization domain ID.
   *
   * @return domainId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  public GoogleChatOrganizationAttributes domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * The Google Chat organization domain name.
   *
   * @return domainName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
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
   * @return GoogleChatOrganizationAttributes
   */
  @JsonAnySetter
  public GoogleChatOrganizationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GoogleChatOrganizationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleChatOrganizationAttributes googleChatOrganizationAttributes =
        (GoogleChatOrganizationAttributes) o;
    return Objects.equals(this.domainId, googleChatOrganizationAttributes.domainId)
        && Objects.equals(this.domainName, googleChatOrganizationAttributes.domainName)
        && Objects.equals(
            this.additionalProperties, googleChatOrganizationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, domainName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleChatOrganizationAttributes {\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
