/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The incident's attributes for an update request. */
@JsonPropertyOrder({
  IncidentUpdateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_END,
  IncidentUpdateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE,
  IncidentUpdateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_START,
  IncidentUpdateAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
  IncidentUpdateAttributes.JSON_PROPERTY_DETECTED,
  IncidentUpdateAttributes.JSON_PROPERTY_FIELDS,
  IncidentUpdateAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
  IncidentUpdateAttributes.JSON_PROPERTY_RESOLVED,
  IncidentUpdateAttributes.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_END = "customer_impact_end";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> customerImpactEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE = "customer_impact_scope";
  private String customerImpactScope;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_START = "customer_impact_start";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> customerImpactStart =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACTED = "customer_impacted";
  private Boolean customerImpacted;

  public static final String JSON_PROPERTY_DETECTED = "detected";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> detected = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, IncidentFieldAttributes> fields = null;

  public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
  private List<IncidentNotificationHandle> notificationHandles = null;

  public static final String JSON_PROPERTY_RESOLVED = "resolved";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> resolved = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentUpdateAttributes customerImpactEnd(OffsetDateTime customerImpactEnd) {
    this.customerImpactEnd = JsonNullable.<OffsetDateTime>of(customerImpactEnd);
    return this;
  }

  /**
   * Timestamp when customers were no longer impacted by the incident.
   *
   * @return customerImpactEnd
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCustomerImpactEnd() {
    return customerImpactEnd.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCustomerImpactEnd_JsonNullable() {
    return customerImpactEnd;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_END)
  public void setCustomerImpactEnd_JsonNullable(JsonNullable<OffsetDateTime> customerImpactEnd) {
    this.customerImpactEnd = customerImpactEnd;
  }

  public void setCustomerImpactEnd(OffsetDateTime customerImpactEnd) {
    this.customerImpactEnd = JsonNullable.<OffsetDateTime>of(customerImpactEnd);
  }

  public IncidentUpdateAttributes customerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
    return this;
  }

  /**
   * A summary of the impact customers experienced during the incident.
   *
   * @return customerImpactScope
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerImpactScope() {
    return customerImpactScope;
  }

  public void setCustomerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
  }

  public IncidentUpdateAttributes customerImpactStart(OffsetDateTime customerImpactStart) {
    this.customerImpactStart = JsonNullable.<OffsetDateTime>of(customerImpactStart);
    return this;
  }

  /**
   * Timestamp when customers began being impacted by the incident.
   *
   * @return customerImpactStart
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCustomerImpactStart() {
    return customerImpactStart.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCustomerImpactStart_JsonNullable() {
    return customerImpactStart;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_START)
  public void setCustomerImpactStart_JsonNullable(
      JsonNullable<OffsetDateTime> customerImpactStart) {
    this.customerImpactStart = customerImpactStart;
  }

  public void setCustomerImpactStart(OffsetDateTime customerImpactStart) {
    this.customerImpactStart = JsonNullable.<OffsetDateTime>of(customerImpactStart);
  }

  public IncidentUpdateAttributes customerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
    return this;
  }

  /**
   * A flag indicating whether the incident caused customer impact.
   *
   * @return customerImpacted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerImpacted() {
    return customerImpacted;
  }

  public void setCustomerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
  }

  public IncidentUpdateAttributes detected(OffsetDateTime detected) {
    this.detected = JsonNullable.<OffsetDateTime>of(detected);
    return this;
  }

  /**
   * Timestamp when the incident was detected.
   *
   * @return detected
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDetected() {
    return detected.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDetected_JsonNullable() {
    return detected;
  }

  @JsonProperty(JSON_PROPERTY_DETECTED)
  public void setDetected_JsonNullable(JsonNullable<OffsetDateTime> detected) {
    this.detected = detected;
  }

  public void setDetected(OffsetDateTime detected) {
    this.detected = JsonNullable.<OffsetDateTime>of(detected);
  }

  public IncidentUpdateAttributes fields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentUpdateAttributes putFieldsItem(String key, IncidentFieldAttributes fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * A condensed view of the user-defined fields for which to update selections.
   *
   * @return fields
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, IncidentFieldAttributes> getFields() {
    return fields;
  }

  public void setFields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
  }

  public IncidentUpdateAttributes notificationHandles(
      List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
    for (IncidentNotificationHandle item : notificationHandles) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentUpdateAttributes addNotificationHandlesItem(
      IncidentNotificationHandle notificationHandlesItem) {
    if (this.notificationHandles == null) {
      this.notificationHandles = new ArrayList<>();
    }
    this.notificationHandles.add(notificationHandlesItem);
    this.unparsed |= notificationHandlesItem.unparsed;
    return this;
  }

  /**
   * Notification handles that will be notified of the incident during update.
   *
   * @return notificationHandles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentNotificationHandle> getNotificationHandles() {
    return notificationHandles;
  }

  public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
  }

  public IncidentUpdateAttributes resolved(OffsetDateTime resolved) {
    this.resolved = JsonNullable.<OffsetDateTime>of(resolved);
    return this;
  }

  /**
   * Timestamp when the incident's state was set to resolved.
   *
   * @return resolved
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getResolved() {
    return resolved.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getResolved_JsonNullable() {
    return resolved;
  }

  @JsonProperty(JSON_PROPERTY_RESOLVED)
  public void setResolved_JsonNullable(JsonNullable<OffsetDateTime> resolved) {
    this.resolved = resolved;
  }

  public void setResolved(OffsetDateTime resolved) {
    this.resolved = JsonNullable.<OffsetDateTime>of(resolved);
  }

  public IncidentUpdateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the incident, which summarizes what happened.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Return true if this IncidentUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentUpdateAttributes incidentUpdateAttributes = (IncidentUpdateAttributes) o;
    return Objects.equals(this.customerImpactEnd, incidentUpdateAttributes.customerImpactEnd)
        && Objects.equals(this.customerImpactScope, incidentUpdateAttributes.customerImpactScope)
        && Objects.equals(this.customerImpactStart, incidentUpdateAttributes.customerImpactStart)
        && Objects.equals(this.customerImpacted, incidentUpdateAttributes.customerImpacted)
        && Objects.equals(this.detected, incidentUpdateAttributes.detected)
        && Objects.equals(this.fields, incidentUpdateAttributes.fields)
        && Objects.equals(this.notificationHandles, incidentUpdateAttributes.notificationHandles)
        && Objects.equals(this.resolved, incidentUpdateAttributes.resolved)
        && Objects.equals(this.title, incidentUpdateAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customerImpactEnd,
        customerImpactScope,
        customerImpactStart,
        customerImpacted,
        detected,
        fields,
        notificationHandles,
        resolved,
        title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentUpdateAttributes {\n");
    sb.append("    customerImpactEnd: ").append(toIndentedString(customerImpactEnd)).append("\n");
    sb.append("    customerImpactScope: ")
        .append(toIndentedString(customerImpactScope))
        .append("\n");
    sb.append("    customerImpactStart: ")
        .append(toIndentedString(customerImpactStart))
        .append("\n");
    sb.append("    customerImpacted: ").append(toIndentedString(customerImpacted)).append("\n");
    sb.append("    detected: ").append(toIndentedString(detected)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    notificationHandles: ")
        .append(toIndentedString(notificationHandles))
        .append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
