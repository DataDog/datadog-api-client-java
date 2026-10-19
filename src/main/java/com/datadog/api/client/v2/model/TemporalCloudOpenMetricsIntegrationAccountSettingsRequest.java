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

/** Settings for creating the Temporal Cloud OpenMetrics integration account. */
@JsonPropertyOrder({
  TemporalCloudOpenMetricsIntegrationAccountSettingsRequest.JSON_PROPERTY_INCLUDE_OPT_IN_LABELS,
  TemporalCloudOpenMetricsIntegrationAccountSettingsRequest.JSON_PROPERTY_NAMESPACES_TO_INCLUDE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TemporalCloudOpenMetricsIntegrationAccountSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_OPT_IN_LABELS = "include_opt_in_labels";
  private Boolean includeOptInLabels;

  public static final String JSON_PROPERTY_NAMESPACES_TO_INCLUDE = "namespaces_to_include";
  private String namespacesToInclude;

  public TemporalCloudOpenMetricsIntegrationAccountSettingsRequest includeOptInLabels(
      Boolean includeOptInLabels) {
    this.includeOptInLabels = includeOptInLabels;
    return this;
  }

  /**
   * When enabled, Datadog collects Temporal Cloud's <a
   * href="https://docs.temporal.io/cloud/metrics/openmetrics/metrics-reference#opt-in-labels">opt-in
   * labels</a> (activity type, worker deployment name, and worker build ID) for more granularity on
   * your existing metrics. Enabling them may increase metric collection latency. Defaults to <code>
   * false</code>.
   *
   * @return includeOptInLabels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_OPT_IN_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeOptInLabels() {
    return includeOptInLabels;
  }

  public void setIncludeOptInLabels(Boolean includeOptInLabels) {
    this.includeOptInLabels = includeOptInLabels;
  }

  public TemporalCloudOpenMetricsIntegrationAccountSettingsRequest namespacesToInclude(
      String namespacesToInclude) {
    this.namespacesToInclude = namespacesToInclude;
    return this;
  }

  /**
   * Comma-separated list of Temporal Cloud namespaces to collect metrics for. An entry can use
   * <code>*</code> as a wildcard; for example, <code>prod-*</code> matches every namespace starting
   * with <code>prod-</code>. Entries may contain only lowercase letters, digits, hyphens, periods
   * and <code>*</code>; any other value is rejected with a <code>422</code> response. Omit it or
   * leave it empty to collect metrics for all namespaces.
   *
   * @return namespacesToInclude
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACES_TO_INCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespacesToInclude() {
    return namespacesToInclude;
  }

  public void setNamespacesToInclude(String namespacesToInclude) {
    this.namespacesToInclude = namespacesToInclude;
  }

  /**
   * Return true if this TemporalCloudOpenMetricsIntegrationAccountSettingsRequest object is equal
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
    TemporalCloudOpenMetricsIntegrationAccountSettingsRequest
        temporalCloudOpenMetricsIntegrationAccountSettingsRequest =
            (TemporalCloudOpenMetricsIntegrationAccountSettingsRequest) o;
    return Objects.equals(
            this.includeOptInLabels,
            temporalCloudOpenMetricsIntegrationAccountSettingsRequest.includeOptInLabels)
        && Objects.equals(
            this.namespacesToInclude,
            temporalCloudOpenMetricsIntegrationAccountSettingsRequest.namespacesToInclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOptInLabels, namespacesToInclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporalCloudOpenMetricsIntegrationAccountSettingsRequest {\n");
    sb.append("    includeOptInLabels: ").append(toIndentedString(includeOptInLabels)).append("\n");
    sb.append("    namespacesToInclude: ")
        .append(toIndentedString(namespacesToInclude))
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
