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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response object with all events matching the request and pagination information. */
@JsonPropertyOrder({
  AuditLogsEventsResponse.JSON_PROPERTY_DATA,
  AuditLogsEventsResponse.JSON_PROPERTY_LINKS,
  AuditLogsEventsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsEventsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<AuditLogsEvent> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private AuditLogsResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private AuditLogsResponseMetadata meta;

  public AuditLogsEventsResponse data(List<AuditLogsEvent> data) {
    this.data = data;
    for (AuditLogsEvent item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AuditLogsEventsResponse addDataItem(AuditLogsEvent dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of events matching the request.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuditLogsEvent> getData() {
    return data;
  }

  public void setData(List<AuditLogsEvent> data) {
    this.data = data;
  }

  public AuditLogsEventsResponse links(AuditLogsResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links attributes.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuditLogsResponseLinks getLinks() {
    return links;
  }

  public void setLinks(AuditLogsResponseLinks links) {
    this.links = links;
  }

  public AuditLogsEventsResponse meta(AuditLogsResponseMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The metadata associated with a request.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuditLogsResponseMetadata getMeta() {
    return meta;
  }

  public void setMeta(AuditLogsResponseMetadata meta) {
    this.meta = meta;
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
   * @return AuditLogsEventsResponse
   */
  @JsonAnySetter
  public AuditLogsEventsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AuditLogsEventsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsEventsResponse auditLogsEventsResponse = (AuditLogsEventsResponse) o;
    return Objects.equals(this.data, auditLogsEventsResponse.data)
        && Objects.equals(this.links, auditLogsEventsResponse.links)
        && Objects.equals(this.meta, auditLogsEventsResponse.meta)
        && Objects.equals(this.additionalProperties, auditLogsEventsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsEventsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
