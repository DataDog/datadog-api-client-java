/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attribute Metadata. */
@JsonPropertyOrder({
  AttributeMetadata.JSON_PROPERTY_AUTOMUTE,
  AttributeMetadata.JSON_PROPERTY_CLIENT_EMAIL,
  AttributeMetadata.JSON_PROPERTY_HOST_FILTERS,
  AttributeMetadata.JSON_PROPERTY_IS_CSPM_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AttributeMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOMUTE = "automute";
  private Boolean automute;

  public static final String JSON_PROPERTY_CLIENT_EMAIL = "client_email";
  private String clientEmail;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private List<String> hostFilters = null;

  public static final String JSON_PROPERTY_IS_CSPM_ENABLED = "is_cspm_enabled";
  private Boolean isCspmEnabled;

  public AttributeMetadata automute(Boolean automute) {
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

  public AttributeMetadata clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Your client email.
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

  public AttributeMetadata hostFilters(List<String> hostFilters) {
    this.hostFilters = hostFilters;
    return this;
  }

  public AttributeMetadata addHostFiltersItem(String hostFiltersItem) {
    if (this.hostFilters == null) {
      this.hostFilters = new ArrayList<>();
    }
    this.hostFilters.add(hostFiltersItem);
    return this;
  }

  /**
   * Your host filters.
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

  public AttributeMetadata isCspmEnabled(Boolean isCspmEnabled) {
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

  /** Return true if this AttributeMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeMetadata attributeMetadata = (AttributeMetadata) o;
    return Objects.equals(this.automute, attributeMetadata.automute)
        && Objects.equals(this.clientEmail, attributeMetadata.clientEmail)
        && Objects.equals(this.hostFilters, attributeMetadata.hostFilters)
        && Objects.equals(this.isCspmEnabled, attributeMetadata.isCspmEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automute, clientEmail, hostFilters, isCspmEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeMetadata {\n");
    sb.append("    automute: ").append(toIndentedString(automute)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    isCspmEnabled: ").append(toIndentedString(isCspmEnabled)).append("\n");
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
