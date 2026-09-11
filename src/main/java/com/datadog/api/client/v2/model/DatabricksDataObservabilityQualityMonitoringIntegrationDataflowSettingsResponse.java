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

/** Settings of the Data Observability dataflow. */
@JsonPropertyOrder({
  DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_DO_CRAWLERS_CRON,
  DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      .JSON_PROPERTY_SYNC_SYSTEM_CATALOG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DO_CRAWLERS_CRON = "do_crawlers_cron";
  private String doCrawlersCron;

  public static final String JSON_PROPERTY_SYNC_SYSTEM_CATALOG = "sync_system_catalog";
  private Boolean syncSystemCatalog;

  public DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      doCrawlersCron(String doCrawlersCron) {
    this.doCrawlersCron = doCrawlersCron;
    return this;
  }

  /**
   * Cron expression setting how often Datadog connects to your Databricks warehouse to collect
   * metadata. Currently, only hourly (<code>0 * * * *</code>) and daily (<code>0 0 * * *</code>)
   * are supported.
   *
   * @return doCrawlersCron
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DO_CRAWLERS_CRON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDoCrawlersCron() {
    return doCrawlersCron;
  }

  public void setDoCrawlersCron(String doCrawlersCron) {
    this.doCrawlersCron = doCrawlersCron;
  }

  public DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      syncSystemCatalog(Boolean syncSystemCatalog) {
    this.syncSystemCatalog = syncSystemCatalog;
    return this;
  }

  /**
   * Whether metadata from the Databricks <code>system</code> catalog is included in Data
   * Observability alongside your data catalogs.
   *
   * @return syncSystemCatalog
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_SYSTEM_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSyncSystemCatalog() {
    return syncSystemCatalog;
  }

  public void setSyncSystemCatalog(Boolean syncSystemCatalog) {
    this.syncSystemCatalog = syncSystemCatalog;
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
   * @return DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
   */
  @JsonAnySetter
  public DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
        databricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse =
            (DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse) o;
    return Objects.equals(
            this.doCrawlersCron,
            databricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .doCrawlersCron)
        && Objects.equals(
            this.syncSystemCatalog,
            databricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .syncSystemCatalog)
        && Objects.equals(
            this.additionalProperties,
            databricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doCrawlersCron, syncSystemCatalog, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsResponse"
            + " {\n");
    sb.append("    doCrawlersCron: ").append(toIndentedString(doCrawlersCron)).append("\n");
    sb.append("    syncSystemCatalog: ").append(toIndentedString(syncSystemCatalog)).append("\n");
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
