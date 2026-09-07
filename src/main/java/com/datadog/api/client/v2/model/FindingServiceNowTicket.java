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

/** ServiceNow ticket associated with the case. */
@JsonPropertyOrder({
  FindingServiceNowTicket.JSON_PROPERTY_RESULT,
  FindingServiceNowTicket.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FindingServiceNowTicket {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESULT = "result";
  private FindingServiceNowTicketResult result;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public FindingServiceNowTicket result(FindingServiceNowTicketResult result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * Result of the ServiceNow ticket creation or attachment.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FindingServiceNowTicketResult getResult() {
    return result;
  }

  public void setResult(FindingServiceNowTicketResult result) {
    this.result = result;
    if (result != null) {
      this.unparsed |= result.unparsed;
    }
  }

  public FindingServiceNowTicket status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the ServiceNow ticket operation. Can be "COMPLETED" if successful, or "FAILED" if the
   * operation failed.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
   * @return FindingServiceNowTicket
   */
  @JsonAnySetter
  public FindingServiceNowTicket putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FindingServiceNowTicket object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindingServiceNowTicket findingServiceNowTicket = (FindingServiceNowTicket) o;
    return Objects.equals(this.result, findingServiceNowTicket.result)
        && Objects.equals(this.status, findingServiceNowTicket.status)
        && Objects.equals(this.additionalProperties, findingServiceNowTicket.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingServiceNowTicket {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
