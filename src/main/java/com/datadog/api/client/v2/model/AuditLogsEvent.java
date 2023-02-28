/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Object description of an Audit Logs event after it is processed and stored by Datadog.</p>
 */
@JsonPropertyOrder({
  AuditLogsEvent.JSON_PROPERTY_ATTRIBUTES,
  AuditLogsEvent.JSON_PROPERTY_ID,
  AuditLogsEvent.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuditLogsEvent {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private AuditLogsEventAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AuditLogsEventType type = AuditLogsEventType.Audit;

  public AuditLogsEvent attributes(AuditLogsEventAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>JSON object containing all event attributes and their associated values.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsEventAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(AuditLogsEventAttributes attributes) {
    this.attributes = attributes;
  }
  public AuditLogsEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Unique ID of the event.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public AuditLogsEvent type(AuditLogsEventType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the event.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AuditLogsEventType getType() {
        return type;
      }
  public void setType(AuditLogsEventType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this AuditLogsEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogsEvent auditLogsEvent = (AuditLogsEvent) o;
    return Objects.equals(this.attributes, auditLogsEvent.attributes) && Objects.equals(this.id, auditLogsEvent.id) && Objects.equals(this.type, auditLogsEvent.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogsEvent {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
