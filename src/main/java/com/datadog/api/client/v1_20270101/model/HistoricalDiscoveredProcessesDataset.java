/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HistoricalDiscoveredProcessesDataset.JSON_PROPERTY_DATA_SOURCE,
  HistoricalDiscoveredProcessesDataset.JSON_PROPERTY_NAME,
  HistoricalDiscoveredProcessesDataset.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HistoricalDiscoveredProcessesDataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private HistoricalDiscoveredProcessesDatasetDataSource dataSource;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public HistoricalDiscoveredProcessesDataset() {}

  @JsonCreator
  public HistoricalDiscoveredProcessesDataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          HistoricalDiscoveredProcessesDatasetDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) String timestamp) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.name = name;
    this.timestamp = timestamp;
  }

  public HistoricalDiscoveredProcessesDataset dataSource(
      HistoricalDiscoveredProcessesDatasetDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HistoricalDiscoveredProcessesDatasetDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(HistoricalDiscoveredProcessesDatasetDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public HistoricalDiscoveredProcessesDataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HistoricalDiscoveredProcessesDataset timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /** Return true if this HistoricalDiscoveredProcessesDataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalDiscoveredProcessesDataset historicalDiscoveredProcessesDataset =
        (HistoricalDiscoveredProcessesDataset) o;
    return Objects.equals(this.dataSource, historicalDiscoveredProcessesDataset.dataSource)
        && Objects.equals(this.name, historicalDiscoveredProcessesDataset.name)
        && Objects.equals(this.timestamp, historicalDiscoveredProcessesDataset.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, name, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalDiscoveredProcessesDataset {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
