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
import java.util.Objects;

/** Settings of the Databricks data observability dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  DatabricksDataObservabilityIntegrationDataflowSettingsRequest.JSON_PROPERTY_DO_CRAWLERS_CRON,
  DatabricksDataObservabilityIntegrationDataflowSettingsRequest.JSON_PROPERTY_SYNC_SYSTEM_CATALOG
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksDataObservabilityIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DO_CRAWLERS_CRON = "do_crawlers_cron";
  private String doCrawlersCron;

  public static final String JSON_PROPERTY_SYNC_SYSTEM_CATALOG = "sync_system_catalog";
  private Boolean syncSystemCatalog;

  public DatabricksDataObservabilityIntegrationDataflowSettingsRequest doCrawlersCron(
      String doCrawlersCron) {
    this.doCrawlersCron = doCrawlersCron;
    return this;
  }

  /**
   * Cron expression setting how often the data observability crawlers run.
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

  public DatabricksDataObservabilityIntegrationDataflowSettingsRequest syncSystemCatalog(
      Boolean syncSystemCatalog) {
    this.syncSystemCatalog = syncSystemCatalog;
    return this;
  }

  /**
   * Whether the Databricks <code>system</code> catalog is synchronized alongside your data
   * catalogs.
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
   * Return true if this DatabricksDataObservabilityIntegrationDataflowSettingsRequest object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksDataObservabilityIntegrationDataflowSettingsRequest
        databricksDataObservabilityIntegrationDataflowSettingsRequest =
            (DatabricksDataObservabilityIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
            this.doCrawlersCron,
            databricksDataObservabilityIntegrationDataflowSettingsRequest.doCrawlersCron)
        && Objects.equals(
            this.syncSystemCatalog,
            databricksDataObservabilityIntegrationDataflowSettingsRequest.syncSystemCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doCrawlersCron, syncSystemCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksDataObservabilityIntegrationDataflowSettingsRequest {\n");
    sb.append("    doCrawlersCron: ").append(toIndentedString(doCrawlersCron)).append("\n");
    sb.append("    syncSystemCatalog: ").append(toIndentedString(syncSystemCatalog)).append("\n");
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
