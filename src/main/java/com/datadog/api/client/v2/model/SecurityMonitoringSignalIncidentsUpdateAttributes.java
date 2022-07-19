/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes describing the new list of related signals for a security signal. */
@JsonPropertyOrder({
  SecurityMonitoringSignalIncidentsUpdateAttributes.JSON_PROPERTY_INCIDENT_IDS,
  SecurityMonitoringSignalIncidentsUpdateAttributes.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalIncidentsUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCIDENT_IDS = "incident_ids";
  private List<Long> incidentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringSignalIncidentsUpdateAttributes() {}

  @JsonCreator
  public SecurityMonitoringSignalIncidentsUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENT_IDS) List<Long> incidentIds) {
    this.incidentIds = incidentIds;
  }

  public SecurityMonitoringSignalIncidentsUpdateAttributes incidentIds(List<Long> incidentIds) {
    this.incidentIds = incidentIds;
    return this;
  }

  public SecurityMonitoringSignalIncidentsUpdateAttributes addIncidentIdsItem(
      Long incidentIdsItem) {
    this.incidentIds.add(incidentIdsItem);
    return this;
  }

  /**
   * Array of incidents that are associated with this signal.
   *
   * @return incidentIds
   */
  @JsonProperty(JSON_PROPERTY_INCIDENT_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Long> getIncidentIds() {
    return incidentIds;
  }

  public void setIncidentIds(List<Long> incidentIds) {
    this.incidentIds = incidentIds;
  }

  public SecurityMonitoringSignalIncidentsUpdateAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the updated signal. If server side version is higher, update will be rejected.
   *
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  /** Return true if this SecurityMonitoringSignalIncidentsUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalIncidentsUpdateAttributes
        securityMonitoringSignalIncidentsUpdateAttributes =
            (SecurityMonitoringSignalIncidentsUpdateAttributes) o;
    return Objects.equals(
            this.incidentIds, securityMonitoringSignalIncidentsUpdateAttributes.incidentIds)
        && Objects.equals(this.version, securityMonitoringSignalIncidentsUpdateAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incidentIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalIncidentsUpdateAttributes {\n");
    sb.append("    incidentIds: ").append(toIndentedString(incidentIds)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
