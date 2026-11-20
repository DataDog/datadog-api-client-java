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

/** Writable attributes used to create an Anthropic Usage and Costs integration account. */
@JsonPropertyOrder({
  AnthropicUsageAndCostsIntegrationAccountCreateAttributes.JSON_PROPERTY_AUTHENTICATION,
  AnthropicUsageAndCostsIntegrationAccountCreateAttributes.JSON_PROPERTY_DATAFLOWS,
  AnthropicUsageAndCostsIntegrationAccountCreateAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnthropicUsageAndCostsIntegrationAccountCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest authentication;

  public static final String JSON_PROPERTY_DATAFLOWS = "dataflows";
  private AnthropicUsageAndCostsIntegrationDataflowsRequest dataflows;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes() {}

  @JsonCreator
  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION)
          AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest authentication,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    this.name = name;
  }

  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes authentication(
      AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    this.unparsed |= authentication.unparsed;
    return this;
  }

  /**
   * Authentication for creating the Anthropic Usage and Costs integration account. Exactly one
   * method is set.
   *
   * @return authentication
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest getAuthentication() {
    return authentication;
  }

  public void setAuthentication(
      AnthropicUsageAndCostsIntegrationAccountAuthenticationRequest authentication) {
    this.authentication = authentication;
    if (authentication != null) {
      this.unparsed |= authentication.unparsed;
    }
  }

  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes dataflows(
      AnthropicUsageAndCostsIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    this.unparsed |= dataflows.unparsed;
    return this;
  }

  /**
   * Data Datadog collects from Anthropic Usage and Costs, keyed by dataflow ID. Datadog always
   * collects usage metrics. Each dataflow in this object adds another type of collection. Set
   * <code>enabled</code> to start or stop a dataflow. The default for each dataflow applies when
   * the account is created. On update, omitted fields keep their current values. If a dataflow
   * depends on a Datadog product, its description names that product. If you enable a dataflow
   * without that product, Datadog stores the setting but collects no data.
   *
   * @return dataflows
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnthropicUsageAndCostsIntegrationDataflowsRequest getDataflows() {
    return dataflows;
  }

  public void setDataflows(AnthropicUsageAndCostsIntegrationDataflowsRequest dataflows) {
    this.dataflows = dataflows;
    if (dataflows != null) {
      this.unparsed |= dataflows.unparsed;
    }
  }

  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name of the Anthropic Usage and Costs integration account.
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
   * @return AnthropicUsageAndCostsIntegrationAccountCreateAttributes
   */
  @JsonAnySetter
  public AnthropicUsageAndCostsIntegrationAccountCreateAttributes putAdditionalProperty(
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

  /**
   * Return true if this AnthropicUsageAndCostsIntegrationAccountCreateAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnthropicUsageAndCostsIntegrationAccountCreateAttributes
        anthropicUsageAndCostsIntegrationAccountCreateAttributes =
            (AnthropicUsageAndCostsIntegrationAccountCreateAttributes) o;
    return Objects.equals(
            this.authentication,
            anthropicUsageAndCostsIntegrationAccountCreateAttributes.authentication)
        && Objects.equals(
            this.dataflows, anthropicUsageAndCostsIntegrationAccountCreateAttributes.dataflows)
        && Objects.equals(this.name, anthropicUsageAndCostsIntegrationAccountCreateAttributes.name)
        && Objects.equals(
            this.additionalProperties,
            anthropicUsageAndCostsIntegrationAccountCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, dataflows, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnthropicUsageAndCostsIntegrationAccountCreateAttributes {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    dataflows: ").append(toIndentedString(dataflows)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
