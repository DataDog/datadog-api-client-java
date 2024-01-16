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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The RUM data collection settings for the Synthetic browser test. <strong>Note:</strong> There are
 * 3 ways to format RUM settings:
 *
 * <p><code>{ isEnabled: false }</code> RUM data is not collected.
 *
 * <p><code>{ isEnabled: true }</code> RUM data is collected from the Synthetic test's default
 * application.
 *
 * <p><code>
 * { isEnabled: true, applicationId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", clientTokenId: 12345 }
 * </code> RUM data is collected using the specified application.
 */
@JsonPropertyOrder({
  SyntheticsBrowserTestRumSettings.JSON_PROPERTY_APPLICATION_ID,
  SyntheticsBrowserTestRumSettings.JSON_PROPERTY_CLIENT_TOKEN_ID,
  SyntheticsBrowserTestRumSettings.JSON_PROPERTY_IS_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBrowserTestRumSettings {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
  private String applicationId;

  public static final String JSON_PROPERTY_CLIENT_TOKEN_ID = "clientTokenId";
  private Long clientTokenId;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public SyntheticsBrowserTestRumSettings() {}

  @JsonCreator
  public SyntheticsBrowserTestRumSettings(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SyntheticsBrowserTestRumSettings applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * RUM application ID used to collect RUM data for the browser test.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SyntheticsBrowserTestRumSettings clientTokenId(Long clientTokenId) {
    this.clientTokenId = clientTokenId;
    return this;
  }

  /**
   * RUM application API key ID used to collect RUM data for the browser test.
   *
   * @return clientTokenId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getClientTokenId() {
    return clientTokenId;
  }

  public void setClientTokenId(Long clientTokenId) {
    this.clientTokenId = clientTokenId;
  }

  public SyntheticsBrowserTestRumSettings isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Determines whether RUM data is collected during test runs.
   *
   * @return isEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
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
   * @return SyntheticsBrowserTestRumSettings
   */
  @JsonAnySetter
  public SyntheticsBrowserTestRumSettings putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBrowserTestRumSettings object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestRumSettings syntheticsBrowserTestRumSettings =
        (SyntheticsBrowserTestRumSettings) o;
    return Objects.equals(this.applicationId, syntheticsBrowserTestRumSettings.applicationId)
        && Objects.equals(this.clientTokenId, syntheticsBrowserTestRumSettings.clientTokenId)
        && Objects.equals(this.isEnabled, syntheticsBrowserTestRumSettings.isEnabled)
        && Objects.equals(
            this.additionalProperties, syntheticsBrowserTestRumSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, clientTokenId, isEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestRumSettings {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    clientTokenId: ").append(toIndentedString(clientTokenId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
