/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonCreator;
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

/** The incident's attributes from a response. */
@JsonPropertyOrder({
  IncidentResponseAttributes.JSON_PROPERTY_CREATED,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_DURATION,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_END,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_START,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
  IncidentResponseAttributes.JSON_PROPERTY_DETECTED,
  IncidentResponseAttributes.JSON_PROPERTY_FIELDS,
  IncidentResponseAttributes.JSON_PROPERTY_MODIFIED,
  IncidentResponseAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
  IncidentResponseAttributes.JSON_PROPERTY_PUBLIC_ID,
  IncidentResponseAttributes.JSON_PROPERTY_RESOLVED,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_DETECT,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_INTERNAL_RESPONSE,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_REPAIR,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_RESOLVE,
  IncidentResponseAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_DURATION = "customer_impact_duration";
  private Long customerImpactDuration;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_END = "customer_impact_end";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> customerImpactEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE = "customer_impact_scope";
  private JsonNullable<String> customerImpactScope = JsonNullable.<String>undefined();

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

  public static final String JSON_PROPERTY_MODIFIED = "modified";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
  private JsonNullable<List<IncidentNotificationHandle>> notificationHandles =
      JsonNullable.<List<IncidentNotificationHandle>>undefined();

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private Long publicId;

  public static final String JSON_PROPERTY_RESOLVED = "resolved";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> resolved = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_TIME_TO_DETECT = "time_to_detect";
  private Long timeToDetect;

  public static final String JSON_PROPERTY_TIME_TO_INTERNAL_RESPONSE = "time_to_internal_response";
  private Long timeToInternalResponse;

  public static final String JSON_PROPERTY_TIME_TO_REPAIR = "time_to_repair";
  private Long timeToRepair;

  public static final String JSON_PROPERTY_TIME_TO_RESOLVE = "time_to_resolve";
  private Long timeToResolve;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentResponseAttributes() {}

  @JsonCreator
  public IncidentResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.title = title;
  }

  /**
   * Timestamp when the incident was created.
   *
   * @return created
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  /**
   * Length of the incident's customer impact in seconds. Equals the difference between <code>
   * customer_impact_start</code> and <code>customer_impact_end</code>.
   *
   * @return customerImpactDuration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCustomerImpactDuration() {
    return customerImpactDuration;
  }

  public IncidentResponseAttributes customerImpactEnd(OffsetDateTime customerImpactEnd) {
    this.customerImpactEnd = JsonNullable.<OffsetDateTime>of(customerImpactEnd);
    return this;
  }

  /**
   * Timestamp when customers were no longer impacted by the incident.
   *
   * @return customerImpactEnd
   */
  @jakarta.annotation.Nullable
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

  public IncidentResponseAttributes customerImpactScope(String customerImpactScope) {
    this.customerImpactScope = JsonNullable.<String>of(customerImpactScope);
    return this;
  }

  /**
   * A summary of the impact customers experienced during the incident.
   *
   * @return customerImpactScope
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCustomerImpactScope() {
    return customerImpactScope.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomerImpactScope_JsonNullable() {
    return customerImpactScope;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
  public void setCustomerImpactScope_JsonNullable(JsonNullable<String> customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
  }

  public void setCustomerImpactScope(String customerImpactScope) {
    this.customerImpactScope = JsonNullable.<String>of(customerImpactScope);
  }

  public IncidentResponseAttributes customerImpactStart(OffsetDateTime customerImpactStart) {
    this.customerImpactStart = JsonNullable.<OffsetDateTime>of(customerImpactStart);
    return this;
  }

  /**
   * Timestamp when customers began being impacted by the incident.
   *
   * @return customerImpactStart
   */
  @jakarta.annotation.Nullable
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

  public IncidentResponseAttributes customerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
    return this;
  }

  /**
   * A flag indicating whether the incident caused customer impact.
   *
   * @return customerImpacted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustomerImpacted() {
    return customerImpacted;
  }

  public void setCustomerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
  }

  public IncidentResponseAttributes detected(OffsetDateTime detected) {
    this.detected = JsonNullable.<OffsetDateTime>of(detected);
    return this;
  }

  /**
   * Timestamp when the incident was detected.
   *
   * @return detected
   */
  @jakarta.annotation.Nullable
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

  public IncidentResponseAttributes fields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentResponseAttributes putFieldsItem(String key, IncidentFieldAttributes fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * A condensed view of the user-defined fields attached to incidents.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, IncidentFieldAttributes> getFields() {
    return fields;
  }

  public void setFields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
  }

  /**
   * Timestamp when the incident was last modified.
   *
   * @return modified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public IncidentResponseAttributes notificationHandles(
      List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles =
        JsonNullable.<List<IncidentNotificationHandle>>of(notificationHandles);
    return this;
  }

  public IncidentResponseAttributes addNotificationHandlesItem(
      IncidentNotificationHandle notificationHandlesItem) {
    if (this.notificationHandles == null || !this.notificationHandles.isPresent()) {
      this.notificationHandles =
          JsonNullable.<List<IncidentNotificationHandle>>of(new ArrayList<>());
    }
    try {
      this.notificationHandles.get().add(notificationHandlesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Notification handles that will be notified of the incident during update.
   *
   * @return notificationHandles
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IncidentNotificationHandle> getNotificationHandles() {
    return notificationHandles.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IncidentNotificationHandle>> getNotificationHandles_JsonNullable() {
    return notificationHandles;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
  public void setNotificationHandles_JsonNullable(
      JsonNullable<List<IncidentNotificationHandle>> notificationHandles) {
    this.notificationHandles = notificationHandles;
  }

  public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles =
        JsonNullable.<List<IncidentNotificationHandle>>of(notificationHandles);
  }

  public IncidentResponseAttributes publicId(Long publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The monotonically increasing integer ID for the incident.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPublicId() {
    return publicId;
  }

  public void setPublicId(Long publicId) {
    this.publicId = publicId;
  }

  public IncidentResponseAttributes resolved(OffsetDateTime resolved) {
    this.resolved = JsonNullable.<OffsetDateTime>of(resolved);
    return this;
  }

  /**
   * Timestamp when the incident's state was set to resolved.
   *
   * @return resolved
   */
  @jakarta.annotation.Nullable
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

  /**
   * The amount of time in seconds to detect the incident. Equals the difference between <code>
   * customer_impact_start</code> and <code>detected</code>.
   *
   * @return timeToDetect
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_DETECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToDetect() {
    return timeToDetect;
  }

  /**
   * The amount of time in seconds to call incident after detection. Equals the difference of <code>
   * detected</code> and <code>created</code>.
   *
   * @return timeToInternalResponse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_INTERNAL_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToInternalResponse() {
    return timeToInternalResponse;
  }

  /**
   * The amount of time in seconds to resolve customer impact after detecting the issue. Equals the
   * difference between <code>customer_impact_end</code> and <code>detected</code>.
   *
   * @return timeToRepair
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_REPAIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToRepair() {
    return timeToRepair;
  }

  /**
   * The amount of time in seconds to resolve the incident after it was created. Equals the
   * difference between <code>created</code> and <code>resolved</code>.
   *
   * @return timeToResolve
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_RESOLVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeToResolve() {
    return timeToResolve;
  }

  public IncidentResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the incident, which summarizes what happened.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Return true if this IncidentResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponseAttributes incidentResponseAttributes = (IncidentResponseAttributes) o;
    return Objects.equals(this.created, incidentResponseAttributes.created)
        && Objects.equals(
            this.customerImpactDuration, incidentResponseAttributes.customerImpactDuration)
        && Objects.equals(this.customerImpactEnd, incidentResponseAttributes.customerImpactEnd)
        && Objects.equals(this.customerImpactScope, incidentResponseAttributes.customerImpactScope)
        && Objects.equals(this.customerImpactStart, incidentResponseAttributes.customerImpactStart)
        && Objects.equals(this.customerImpacted, incidentResponseAttributes.customerImpacted)
        && Objects.equals(this.detected, incidentResponseAttributes.detected)
        && Objects.equals(this.fields, incidentResponseAttributes.fields)
        && Objects.equals(this.modified, incidentResponseAttributes.modified)
        && Objects.equals(this.notificationHandles, incidentResponseAttributes.notificationHandles)
        && Objects.equals(this.publicId, incidentResponseAttributes.publicId)
        && Objects.equals(this.resolved, incidentResponseAttributes.resolved)
        && Objects.equals(this.timeToDetect, incidentResponseAttributes.timeToDetect)
        && Objects.equals(
            this.timeToInternalResponse, incidentResponseAttributes.timeToInternalResponse)
        && Objects.equals(this.timeToRepair, incidentResponseAttributes.timeToRepair)
        && Objects.equals(this.timeToResolve, incidentResponseAttributes.timeToResolve)
        && Objects.equals(this.title, incidentResponseAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        customerImpactDuration,
        customerImpactEnd,
        customerImpactScope,
        customerImpactStart,
        customerImpacted,
        detected,
        fields,
        modified,
        notificationHandles,
        publicId,
        resolved,
        timeToDetect,
        timeToInternalResponse,
        timeToRepair,
        timeToResolve,
        title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customerImpactDuration: ")
        .append(toIndentedString(customerImpactDuration))
        .append("\n");
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
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    notificationHandles: ")
        .append(toIndentedString(notificationHandles))
        .append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    timeToDetect: ").append(toIndentedString(timeToDetect)).append("\n");
    sb.append("    timeToInternalResponse: ")
        .append(toIndentedString(timeToInternalResponse))
        .append("\n");
    sb.append("    timeToRepair: ").append(toIndentedString(timeToRepair)).append("\n");
    sb.append("    timeToResolve: ").append(toIndentedString(timeToResolve)).append("\n");
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
