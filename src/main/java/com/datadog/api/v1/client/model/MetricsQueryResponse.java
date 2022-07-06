/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Objects;

/** Response Object that includes your query and the list of metrics retrieved. */
@JsonPropertyOrder({
  MetricsQueryResponse.JSON_PROPERTY_ERROR,
  MetricsQueryResponse.JSON_PROPERTY_FROM_DATE,
  MetricsQueryResponse.JSON_PROPERTY_GROUP_BY,
  MetricsQueryResponse.JSON_PROPERTY_MESSAGE,
  MetricsQueryResponse.JSON_PROPERTY_QUERY,
  MetricsQueryResponse.JSON_PROPERTY_RES_TYPE,
  MetricsQueryResponse.JSON_PROPERTY_SERIES,
  MetricsQueryResponse.JSON_PROPERTY_STATUS,
  MetricsQueryResponse.JSON_PROPERTY_TO_DATE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsQueryResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_FROM_DATE = "from_date";
  private Long fromDate;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RES_TYPE = "res_type";
  private String resType;

  public static final String JSON_PROPERTY_SERIES = "series";
  private List<MetricsQueryMetadata> series = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TO_DATE = "to_date";
  private Long toDate;

  /**
   * Message indicating the errors if status is not <code>ok</code>.
   *
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }

  /**
   * Start of requested time window, milliseconds since Unix epoch.
   *
   * @return fromDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromDate() {
    return fromDate;
  }

  /**
   * List of tag keys on which to group.
   *
   * @return groupBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  /**
   * Message indicating <code>success</code> if status is <code>ok</code>.
   *
   * @return message
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  /**
   * Query string
   *
   * @return query
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  /**
   * Type of response.
   *
   * @return resType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RES_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResType() {
    return resType;
  }

  /**
   * List of timeseries queried.
   *
   * @return series
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MetricsQueryMetadata> getSeries() {
    return series;
  }

  /**
   * Status of the query.
   *
   * @return status
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  /**
   * End of requested time window, milliseconds since Unix epoch.
   *
   * @return toDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getToDate() {
    return toDate;
  }

  /** Return true if this MetricsQueryResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsQueryResponse metricsQueryResponse = (MetricsQueryResponse) o;
    return Objects.equals(this.error, metricsQueryResponse.error)
        && Objects.equals(this.fromDate, metricsQueryResponse.fromDate)
        && Objects.equals(this.groupBy, metricsQueryResponse.groupBy)
        && Objects.equals(this.message, metricsQueryResponse.message)
        && Objects.equals(this.query, metricsQueryResponse.query)
        && Objects.equals(this.resType, metricsQueryResponse.resType)
        && Objects.equals(this.series, metricsQueryResponse.series)
        && Objects.equals(this.status, metricsQueryResponse.status)
        && Objects.equals(this.toDate, metricsQueryResponse.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, fromDate, groupBy, message, query, resType, series, status, toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsQueryResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
