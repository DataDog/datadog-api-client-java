/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes describing which incident to add the signal to.</p>
 */
@JsonPropertyOrder({
  AddSignalToIncidentRequest.JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE,
  AddSignalToIncidentRequest.JSON_PROPERTY_INCIDENT_ID,
  AddSignalToIncidentRequest.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AddSignalToIncidentRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE = "add_to_signal_timeline";
  private Boolean addToSignalTimeline;

  public static final String JSON_PROPERTY_INCIDENT_ID = "incident_id";
  private Long incidentId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AddSignalToIncidentRequest() {}

  @JsonCreator
  public AddSignalToIncidentRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_INCIDENT_ID)Long incidentId) {
        this.incidentId = incidentId;
  }
  public AddSignalToIncidentRequest addToSignalTimeline(Boolean addToSignalTimeline) {
    this.addToSignalTimeline = addToSignalTimeline;
    return this;
  }

  /**
   * <p>Whether to post the signal on the incident timeline.</p>
   * @return addToSignalTimeline
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADD_TO_SIGNAL_TIMELINE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAddToSignalTimeline() {
        return addToSignalTimeline;
      }
  public void setAddToSignalTimeline(Boolean addToSignalTimeline) {
    this.addToSignalTimeline = addToSignalTimeline;
  }
  public AddSignalToIncidentRequest incidentId(Long incidentId) {
    this.incidentId = incidentId;
    return this;
  }

  /**
   * <p>Public ID attribute of the incident to which the signal will be added.</p>
   * @return incidentId
  **/
      @JsonProperty(JSON_PROPERTY_INCIDENT_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getIncidentId() {
        return incidentId;
      }
  public void setIncidentId(Long incidentId) {
    this.incidentId = incidentId;
  }
  public AddSignalToIncidentRequest version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>Version of the updated signal. If server side version is higher, update will be rejected.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * Return true if this AddSignalToIncidentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSignalToIncidentRequest addSignalToIncidentRequest = (AddSignalToIncidentRequest) o;
    return Objects.equals(this.addToSignalTimeline, addSignalToIncidentRequest.addToSignalTimeline) && Objects.equals(this.incidentId, addSignalToIncidentRequest.incidentId) && Objects.equals(this.version, addSignalToIncidentRequest.version);
  }


  @Override
  public int hashCode() {
    return Objects.hash(addToSignalTimeline,incidentId,version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSignalToIncidentRequest {\n");
    sb.append("    addToSignalTimeline: ").append(toIndentedString(addToSignalTimeline)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
