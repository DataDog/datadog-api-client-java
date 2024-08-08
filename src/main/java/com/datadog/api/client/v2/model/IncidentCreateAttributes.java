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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The incident's attributes for a create request. */
@JsonPropertyOrder({
  IncidentCreateAttributes.JSON_PROPERTY_ADDITIONAL_NOTIFICATIONS,
  IncidentCreateAttributes.JSON_PROPERTY_ARCHIVED,
  IncidentCreateAttributes.JSON_PROPERTY_CASE_ID,
  IncidentCreateAttributes.JSON_PROPERTY_CREATION_IDEMPOTENCY_KEY,
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_END,
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE,
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_START,
  IncidentCreateAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
  IncidentCreateAttributes.JSON_PROPERTY_DETECTED,
  IncidentCreateAttributes.JSON_PROPERTY_DURATION,
  IncidentCreateAttributes.JSON_PROPERTY_FIELDS,
  IncidentCreateAttributes.JSON_PROPERTY_INCIDENT_TYPE_UUID,
  IncidentCreateAttributes.JSON_PROPERTY_INITIAL_CELLS,
  IncidentCreateAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
  IncidentCreateAttributes.JSON_PROPERTY_PUBLIC_ID,
  IncidentCreateAttributes.JSON_PROPERTY_RESOLVED,
  IncidentCreateAttributes.JSON_PROPERTY_SEVERITY,
  IncidentCreateAttributes.JSON_PROPERTY_STATE,
  IncidentCreateAttributes.JSON_PROPERTY_TIME_TO_RESOLVE,
  IncidentCreateAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_NOTIFICATIONS = "additional_notifications";
  private JsonNullable<String> additionalNotifications = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ARCHIVED = "archived";
  private JsonNullable<OffsetDateTime> archived = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CASE_ID = "case_id";
  private JsonNullable<Integer> caseId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CREATION_IDEMPOTENCY_KEY = "creation_idempotency_key";
  private JsonNullable<String> creationIdempotencyKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_END = "customer_impact_end";
  private JsonNullable<OffsetDateTime> customerImpactEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE = "customer_impact_scope";
  private String customerImpactScope;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_START = "customer_impact_start";
  private JsonNullable<OffsetDateTime> customerImpactStart =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACTED = "customer_impacted";
  private Boolean customerImpacted;

  public static final String JSON_PROPERTY_DETECTED = "detected";
  private JsonNullable<OffsetDateTime> detected = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Integer> duration = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, IncidentFieldAttributes> fields = null;

  public static final String JSON_PROPERTY_INCIDENT_TYPE_UUID = "incident_type_uuid";
  private JsonNullable<String> incidentTypeUuid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INITIAL_CELLS = "initial_cells";
  private List<IncidentTimelineCellCreateAttributes> initialCells = null;

  public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
  private List<IncidentNotificationHandle> notificationHandles = null;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private JsonNullable<Integer> publicId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RESOLVED = "resolved";
  private JsonNullable<OffsetDateTime> resolved = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private JsonNullable<String> severity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIME_TO_RESOLVE = "time_to_resolve";
  private JsonNullable<Integer> timeToResolve = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentCreateAttributes() {}

  @JsonCreator
  public IncidentCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CUSTOMER_IMPACTED)
          Boolean customerImpacted,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.customerImpacted = customerImpacted;
    this.title = title;
  }

  public IncidentCreateAttributes additionalNotifications(String additionalNotifications) {
    this.additionalNotifications = JsonNullable.<String>of(additionalNotifications);
    return this;
  }

  /**
   * The IncidentCreateAttributes additional_notifications.
   *
   * @return additionalNotifications
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAdditionalNotifications() {
    return additionalNotifications.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAdditionalNotifications_JsonNullable() {
    return additionalNotifications;
  }

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NOTIFICATIONS)
  public void setAdditionalNotifications_JsonNullable(
      JsonNullable<String> additionalNotifications) {
    this.additionalNotifications = additionalNotifications;
  }

  public void setAdditionalNotifications(String additionalNotifications) {
    this.additionalNotifications = JsonNullable.<String>of(additionalNotifications);
  }

  public IncidentCreateAttributes archived(OffsetDateTime archived) {
    this.archived = JsonNullable.<OffsetDateTime>of(archived);
    return this;
  }

  /**
   * The IncidentCreateAttributes archived.
   *
   * @return archived
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getArchived() {
    return archived.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchived_JsonNullable() {
    return archived;
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  public void setArchived_JsonNullable(JsonNullable<OffsetDateTime> archived) {
    this.archived = archived;
  }

  public void setArchived(OffsetDateTime archived) {
    this.archived = JsonNullable.<OffsetDateTime>of(archived);
  }

  public IncidentCreateAttributes caseId(Integer caseId) {
    this.caseId = JsonNullable.<Integer>of(caseId);
    return this;
  }

  /**
   * The IncidentCreateAttributes case_id. minimum: 0 maximum: 2147483647
   *
   * @return caseId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getCaseId() {
    return caseId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getCaseId_JsonNullable() {
    return caseId;
  }

  @JsonProperty(JSON_PROPERTY_CASE_ID)
  public void setCaseId_JsonNullable(JsonNullable<Integer> caseId) {
    this.caseId = caseId;
  }

  public void setCaseId(Integer caseId) {
    this.caseId = JsonNullable.<Integer>of(caseId);
  }

  public IncidentCreateAttributes creationIdempotencyKey(String creationIdempotencyKey) {
    this.creationIdempotencyKey = JsonNullable.<String>of(creationIdempotencyKey);
    return this;
  }

  /**
   * The IncidentCreateAttributes creation_idempotency_key.
   *
   * @return creationIdempotencyKey
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCreationIdempotencyKey() {
    return creationIdempotencyKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATION_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCreationIdempotencyKey_JsonNullable() {
    return creationIdempotencyKey;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_IDEMPOTENCY_KEY)
  public void setCreationIdempotencyKey_JsonNullable(JsonNullable<String> creationIdempotencyKey) {
    this.creationIdempotencyKey = creationIdempotencyKey;
  }

  public void setCreationIdempotencyKey(String creationIdempotencyKey) {
    this.creationIdempotencyKey = JsonNullable.<String>of(creationIdempotencyKey);
  }

  public IncidentCreateAttributes customerImpactEnd(OffsetDateTime customerImpactEnd) {
    this.customerImpactEnd = JsonNullable.<OffsetDateTime>of(customerImpactEnd);
    return this;
  }

  /**
   * The IncidentCreateAttributes customer_impact_end.
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

  public IncidentCreateAttributes customerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
    return this;
  }

  /**
   * Required if <code>customer_impacted:"true"</code>. A summary of the impact customers
   * experienced during the incident.
   *
   * @return customerImpactScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerImpactScope() {
    return customerImpactScope;
  }

  public void setCustomerImpactScope(String customerImpactScope) {
    this.customerImpactScope = customerImpactScope;
  }

  public IncidentCreateAttributes customerImpactStart(OffsetDateTime customerImpactStart) {
    this.customerImpactStart = JsonNullable.<OffsetDateTime>of(customerImpactStart);
    return this;
  }

  /**
   * The IncidentCreateAttributes customer_impact_start.
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

  public IncidentCreateAttributes customerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
    return this;
  }

  /**
   * A flag indicating whether the incident caused customer impact.
   *
   * @return customerImpacted
   */
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCustomerImpacted() {
    return customerImpacted;
  }

  public void setCustomerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
  }

  public IncidentCreateAttributes detected(OffsetDateTime detected) {
    this.detected = JsonNullable.<OffsetDateTime>of(detected);
    return this;
  }

  /**
   * The IncidentCreateAttributes detected.
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

  public IncidentCreateAttributes duration(Integer duration) {
    this.duration = JsonNullable.<Integer>of(duration);
    return this;
  }

  /**
   * The IncidentCreateAttributes duration. maximum: 2147483647
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getDuration() {
    return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getDuration_JsonNullable() {
    return duration;
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<Integer> duration) {
    this.duration = duration;
  }

  public void setDuration(Integer duration) {
    this.duration = JsonNullable.<Integer>of(duration);
  }

  public IncidentCreateAttributes fields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
    return this;
  }

  public IncidentCreateAttributes putFieldsItem(String key, IncidentFieldAttributes fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * A condensed view of the user-defined fields for which to create initial selections.
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

  public IncidentCreateAttributes incidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = JsonNullable.<String>of(incidentTypeUuid);
    return this;
  }

  /**
   * The IncidentCreateAttributes incident_type_uuid.
   *
   * @return incidentTypeUuid
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getIncidentTypeUuid() {
    return incidentTypeUuid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getIncidentTypeUuid_JsonNullable() {
    return incidentTypeUuid;
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
  public void setIncidentTypeUuid_JsonNullable(JsonNullable<String> incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
  }

  public void setIncidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = JsonNullable.<String>of(incidentTypeUuid);
  }

  public IncidentCreateAttributes initialCells(
      List<IncidentTimelineCellCreateAttributes> initialCells) {
    this.initialCells = initialCells;
    for (IncidentTimelineCellCreateAttributes item : initialCells) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentCreateAttributes addInitialCellsItem(
      IncidentTimelineCellCreateAttributes initialCellsItem) {
    if (this.initialCells == null) {
      this.initialCells = new ArrayList<>();
    }
    this.initialCells.add(initialCellsItem);
    this.unparsed |= initialCellsItem.unparsed;
    return this;
  }

  /**
   * An array of initial timeline cells to be placed at the beginning of the incident timeline.
   *
   * @return initialCells
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentTimelineCellCreateAttributes> getInitialCells() {
    return initialCells;
  }

  public void setInitialCells(List<IncidentTimelineCellCreateAttributes> initialCells) {
    this.initialCells = initialCells;
  }

  public IncidentCreateAttributes notificationHandles(
      List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
    for (IncidentNotificationHandle item : notificationHandles) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentCreateAttributes addNotificationHandlesItem(
      IncidentNotificationHandle notificationHandlesItem) {
    if (this.notificationHandles == null) {
      this.notificationHandles = new ArrayList<>();
    }
    this.notificationHandles.add(notificationHandlesItem);
    this.unparsed |= notificationHandlesItem.unparsed;
    return this;
  }

  /**
   * Notification handles that will be notified of the incident at creation.
   *
   * @return notificationHandles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentNotificationHandle> getNotificationHandles() {
    return notificationHandles;
  }

  public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = notificationHandles;
  }

  public IncidentCreateAttributes publicId(Integer publicId) {
    this.publicId = JsonNullable.<Integer>of(publicId);
    return this;
  }

  /**
   * The IncidentCreateAttributes public_id. maximum: 2147483647
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getPublicId() {
    return publicId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getPublicId_JsonNullable() {
    return publicId;
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  public void setPublicId_JsonNullable(JsonNullable<Integer> publicId) {
    this.publicId = publicId;
  }

  public void setPublicId(Integer publicId) {
    this.publicId = JsonNullable.<Integer>of(publicId);
  }

  public IncidentCreateAttributes resolved(OffsetDateTime resolved) {
    this.resolved = JsonNullable.<OffsetDateTime>of(resolved);
    return this;
  }

  /**
   * The IncidentCreateAttributes resolved.
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

  public IncidentCreateAttributes severity(String severity) {
    this.severity = JsonNullable.<String>of(severity);
    return this;
  }

  /**
   * The IncidentCreateAttributes severity.
   *
   * @return severity
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSeverity() {
    return severity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSeverity_JsonNullable() {
    return severity;
  }

  @JsonProperty(JSON_PROPERTY_SEVERITY)
  public void setSeverity_JsonNullable(JsonNullable<String> severity) {
    this.severity = severity;
  }

  public void setSeverity(String severity) {
    this.severity = JsonNullable.<String>of(severity);
  }

  public IncidentCreateAttributes state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

  /**
   * The IncidentCreateAttributes state.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getState() {
    return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }

  public IncidentCreateAttributes timeToResolve(Integer timeToResolve) {
    this.timeToResolve = JsonNullable.<Integer>of(timeToResolve);
    return this;
  }

  /**
   * The IncidentCreateAttributes time_to_resolve. maximum: 2147483647
   *
   * @return timeToResolve
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getTimeToResolve() {
    return timeToResolve.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_TO_RESOLVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getTimeToResolve_JsonNullable() {
    return timeToResolve;
  }

  @JsonProperty(JSON_PROPERTY_TIME_TO_RESOLVE)
  public void setTimeToResolve_JsonNullable(JsonNullable<Integer> timeToResolve) {
    this.timeToResolve = timeToResolve;
  }

  public void setTimeToResolve(Integer timeToResolve) {
    this.timeToResolve = JsonNullable.<Integer>of(timeToResolve);
  }

  public IncidentCreateAttributes title(String title) {
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
   * @return IncidentCreateAttributes
   */
  @JsonAnySetter
  public IncidentCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreateAttributes incidentCreateAttributes = (IncidentCreateAttributes) o;
    return Objects.equals(
            this.additionalNotifications, incidentCreateAttributes.additionalNotifications)
        && Objects.equals(this.archived, incidentCreateAttributes.archived)
        && Objects.equals(this.caseId, incidentCreateAttributes.caseId)
        && Objects.equals(
            this.creationIdempotencyKey, incidentCreateAttributes.creationIdempotencyKey)
        && Objects.equals(this.customerImpactEnd, incidentCreateAttributes.customerImpactEnd)
        && Objects.equals(this.customerImpactScope, incidentCreateAttributes.customerImpactScope)
        && Objects.equals(this.customerImpactStart, incidentCreateAttributes.customerImpactStart)
        && Objects.equals(this.customerImpacted, incidentCreateAttributes.customerImpacted)
        && Objects.equals(this.detected, incidentCreateAttributes.detected)
        && Objects.equals(this.duration, incidentCreateAttributes.duration)
        && Objects.equals(this.fields, incidentCreateAttributes.fields)
        && Objects.equals(this.incidentTypeUuid, incidentCreateAttributes.incidentTypeUuid)
        && Objects.equals(this.initialCells, incidentCreateAttributes.initialCells)
        && Objects.equals(this.notificationHandles, incidentCreateAttributes.notificationHandles)
        && Objects.equals(this.publicId, incidentCreateAttributes.publicId)
        && Objects.equals(this.resolved, incidentCreateAttributes.resolved)
        && Objects.equals(this.severity, incidentCreateAttributes.severity)
        && Objects.equals(this.state, incidentCreateAttributes.state)
        && Objects.equals(this.timeToResolve, incidentCreateAttributes.timeToResolve)
        && Objects.equals(this.title, incidentCreateAttributes.title)
        && Objects.equals(this.additionalProperties, incidentCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalNotifications,
        archived,
        caseId,
        creationIdempotencyKey,
        customerImpactEnd,
        customerImpactScope,
        customerImpactStart,
        customerImpacted,
        detected,
        duration,
        fields,
        incidentTypeUuid,
        initialCells,
        notificationHandles,
        publicId,
        resolved,
        severity,
        state,
        timeToResolve,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreateAttributes {\n");
    sb.append("    additionalNotifications: ")
        .append(toIndentedString(additionalNotifications))
        .append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    creationIdempotencyKey: ")
        .append(toIndentedString(creationIdempotencyKey))
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
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    incidentTypeUuid: ").append(toIndentedString(incidentTypeUuid)).append("\n");
    sb.append("    initialCells: ").append(toIndentedString(initialCells)).append("\n");
    sb.append("    notificationHandles: ")
        .append(toIndentedString(notificationHandles))
        .append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeToResolve: ").append(toIndentedString(timeToResolve)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
