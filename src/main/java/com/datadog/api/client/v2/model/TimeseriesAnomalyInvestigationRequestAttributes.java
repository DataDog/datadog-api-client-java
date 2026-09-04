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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an anomaly investigation request. */
@JsonPropertyOrder({TimeseriesAnomalyInvestigationRequestAttributes.JSON_PROPERTY_REQUESTS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesAnomalyInvestigationRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TimeseriesAnomalyInvestigationTimeseriesRequest> requests = new ArrayList<>();

  public TimeseriesAnomalyInvestigationRequestAttributes() {}

  @JsonCreator
  public TimeseriesAnomalyInvestigationRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TimeseriesAnomalyInvestigationTimeseriesRequest> requests) {
    this.requests = requests;
    for (TimeseriesAnomalyInvestigationTimeseriesRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
  }

  public TimeseriesAnomalyInvestigationRequestAttributes requests(
      List<TimeseriesAnomalyInvestigationTimeseriesRequest> requests) {
    this.requests = requests;
    for (TimeseriesAnomalyInvestigationTimeseriesRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesAnomalyInvestigationRequestAttributes addRequestsItem(
      TimeseriesAnomalyInvestigationTimeseriesRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Timeseries requests to investigate. This API version accepts exactly one request.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TimeseriesAnomalyInvestigationTimeseriesRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TimeseriesAnomalyInvestigationTimeseriesRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (TimeseriesAnomalyInvestigationTimeseriesRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return TimeseriesAnomalyInvestigationRequestAttributes
   */
  @JsonAnySetter
  public TimeseriesAnomalyInvestigationRequestAttributes putAdditionalProperty(
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

  /** Return true if this TimeseriesAnomalyInvestigationRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesAnomalyInvestigationRequestAttributes
        timeseriesAnomalyInvestigationRequestAttributes =
            (TimeseriesAnomalyInvestigationRequestAttributes) o;
    return Objects.equals(this.requests, timeseriesAnomalyInvestigationRequestAttributes.requests)
        && Objects.equals(
            this.additionalProperties,
            timeseriesAnomalyInvestigationRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesAnomalyInvestigationRequestAttributes {\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
