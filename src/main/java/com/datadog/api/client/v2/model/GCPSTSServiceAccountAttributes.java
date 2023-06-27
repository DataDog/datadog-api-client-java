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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes associated with your service account. */
@JsonPropertyOrder({
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_AUTOMUTE,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_CLIENT_EMAIL,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_HOST_FILTERS,
  GCPSTSServiceAccountAttributes.JSON_PROPERTY_IS_CSPM_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GCPSTSServiceAccountAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private List<String> hostFilters = null;

  public static final String JSON_PROPERTY_IS_CSPM_ENABLED = "is_cspm_enabled";
  private Boolean isCspmEnabled;

  public GCPSTSServiceAccountAttributes automute(Boolean automute) {
    this.automute = automute;
    return this;
  }

  /**
   * Silence monitors for expected GCE instance shutdowns.
   *
   * @return automute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutomute() {
    return automute;
  }

  public void setAutomute(Boolean automute) {
    this.automute = automute;
  }

  public GCPSTSServiceAccountAttributes clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Your service account email address.
   *
   * @return clientEmail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public GCPSTSServiceAccountAttributes hostFilters(List<String> hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  public GCPSTSServiceAccountAttributes addHostFiltersItem(String hostFiltersItem) {
    if (this.hostFilters == null) {
      this.hostFilters = new ArrayList<>();
    }
    this.hostFilters.add(hostFiltersItem);
    return this;
  }

  /**
   * Your Host Filters.
   *
   * @return hostFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getHostFilters() {
    return hostFilters;
  }

  public void setHostFilters(List<String> hostFilters) {
    this.hostFilters = hostFilters;
  }

  public GCPSTSServiceAccountAttributes isCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
    return this;
  }

  /**
   * When enabled, Datadog performs configuration checks across your Google Cloud environment by
   * continuously scanning every resource.
   *
   * @return isCspmEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CSPM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCspmEnabled() {
    return isCspmEnabled;
  }

  public void setIsCspmEnabled(Boolean isCspmEnabled) {
    this.isCspmEnabled = isCspmEnabled;
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
   * @return GCPSTSServiceAccountAttributes
   */
  @JsonAnySetter
  public GCPSTSServiceAccountAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GCPSTSServiceAccountAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCPSTSServiceAccountAttributes gcpstsServiceAccountAttributes =
        (GCPSTSServiceAccountAttributes) o;
    return Objects.equals(this.automute, gcpstsServiceAccountAttributes.automute)
        && Objects.equals(this.clientEmail, gcpstsServiceAccountAttributes.clientEmail)
        && Objects.equals(this.hostFilters, gcpstsServiceAccountAttributes.hostFilters)
        && Objects.equals(this.isCspmEnabled, gcpstsServiceAccountAttributes.isCspmEnabled)
        && Objects.equals(
            this.additionalProperties, gcpstsServiceAccountAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automute, clientEmail, hostFilters, isCspmEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCPSTSServiceAccountAttributes {\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    isCspmEnabled: ").append(toIndentedString(isCspmEnabled)).append("\n");
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
