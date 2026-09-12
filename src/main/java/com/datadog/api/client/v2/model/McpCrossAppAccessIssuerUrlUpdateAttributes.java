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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for the MCP Cross-App Access issuer URL update request. */
@JsonPropertyOrder({McpCrossAppAccessIssuerUrlUpdateAttributes.JSON_PROPERTY_ISSUER_URL})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class McpCrossAppAccessIssuerUrlUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ISSUER_URL = "issuer_url";
  private String issuerUrl;

  public McpCrossAppAccessIssuerUrlUpdateAttributes() {}

  @JsonCreator
  public McpCrossAppAccessIssuerUrlUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ISSUER_URL) String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }

  public McpCrossAppAccessIssuerUrlUpdateAttributes issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

  /**
   * The Okta OIDC issuer URL for MCP Cross-App Access, for example <code>
   * https://your-subdomain.okta.com</code>. Provide an empty string to unset the issuer URL and opt
   * the organization out of MCP Cross-App Access.
   *
   * @return issuerUrl
   */
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
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
   * @return McpCrossAppAccessIssuerUrlUpdateAttributes
   */
  @JsonAnySetter
  public McpCrossAppAccessIssuerUrlUpdateAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this McpCrossAppAccessIssuerUrlUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    McpCrossAppAccessIssuerUrlUpdateAttributes mcpCrossAppAccessIssuerUrlUpdateAttributes =
        (McpCrossAppAccessIssuerUrlUpdateAttributes) o;
    return Objects.equals(this.issuerUrl, mcpCrossAppAccessIssuerUrlUpdateAttributes.issuerUrl)
        && Objects.equals(
            this.additionalProperties,
            mcpCrossAppAccessIssuerUrlUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McpCrossAppAccessIssuerUrlUpdateAttributes {\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
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
