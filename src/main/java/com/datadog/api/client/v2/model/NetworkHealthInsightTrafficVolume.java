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

/**
 * Network traffic volume metrics between the client and server services during the query window.
 */
@JsonPropertyOrder({
  NetworkHealthInsightTrafficVolume.JSON_PROPERTY_BYTES_READ,
  NetworkHealthInsightTrafficVolume.JSON_PROPERTY_BYTES_WRITTEN,
  NetworkHealthInsightTrafficVolume.JSON_PROPERTY_TOTAL_TRAFFIC
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NetworkHealthInsightTrafficVolume {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BYTES_READ = "bytes_read";
  private Long bytesRead;

  public static final String JSON_PROPERTY_BYTES_WRITTEN = "bytes_written";
  private Long bytesWritten;

  public static final String JSON_PROPERTY_TOTAL_TRAFFIC = "total_traffic";
  private Long totalTraffic;

  public NetworkHealthInsightTrafficVolume bytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

  /**
   * Total bytes read from the server to the client during the query window.
   *
   * @return bytesRead
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBytesRead() {
    return bytesRead;
  }

  public void setBytesRead(Long bytesRead) {
    this.bytesRead = bytesRead;
  }

  public NetworkHealthInsightTrafficVolume bytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
    return this;
  }

  /**
   * Total bytes written from the client to the server during the query window.
   *
   * @return bytesWritten
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES_WRITTEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBytesWritten() {
    return bytesWritten;
  }

  public void setBytesWritten(Long bytesWritten) {
    this.bytesWritten = bytesWritten;
  }

  public NetworkHealthInsightTrafficVolume totalTraffic(Long totalTraffic) {
    this.totalTraffic = totalTraffic;
    return this;
  }

  /**
   * Sum of bytes written and bytes read across the query window.
   *
   * @return totalTraffic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalTraffic() {
    return totalTraffic;
  }

  public void setTotalTraffic(Long totalTraffic) {
    this.totalTraffic = totalTraffic;
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
   * @return NetworkHealthInsightTrafficVolume
   */
  @JsonAnySetter
  public NetworkHealthInsightTrafficVolume putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NetworkHealthInsightTrafficVolume object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkHealthInsightTrafficVolume networkHealthInsightTrafficVolume =
        (NetworkHealthInsightTrafficVolume) o;
    return Objects.equals(this.bytesRead, networkHealthInsightTrafficVolume.bytesRead)
        && Objects.equals(this.bytesWritten, networkHealthInsightTrafficVolume.bytesWritten)
        && Objects.equals(this.totalTraffic, networkHealthInsightTrafficVolume.totalTraffic)
        && Objects.equals(
            this.additionalProperties, networkHealthInsightTrafficVolume.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, bytesWritten, totalTraffic, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkHealthInsightTrafficVolume {\n");
    sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
    sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
    sb.append("    totalTraffic: ").append(toIndentedString(totalTraffic)).append("\n");
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
