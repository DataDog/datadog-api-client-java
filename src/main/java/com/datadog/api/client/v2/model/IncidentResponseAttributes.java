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
import java.util.UUID;
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
   * <p>The incident's attributes from a response.</p>
 */
@JsonPropertyOrder({
  IncidentResponseAttributes.JSON_PROPERTY_ARCHIVED,
  IncidentResponseAttributes.JSON_PROPERTY_CASE_ID,
  IncidentResponseAttributes.JSON_PROPERTY_CREATED,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_DURATION,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_END,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACT_START,
  IncidentResponseAttributes.JSON_PROPERTY_CUSTOMER_IMPACTED,
  IncidentResponseAttributes.JSON_PROPERTY_DECLARED,
  IncidentResponseAttributes.JSON_PROPERTY_DECLARED_BY,
  IncidentResponseAttributes.JSON_PROPERTY_DECLARED_BY_UUID,
  IncidentResponseAttributes.JSON_PROPERTY_DETECTED,
  IncidentResponseAttributes.JSON_PROPERTY_FIELDS,
  IncidentResponseAttributes.JSON_PROPERTY_INCIDENT_TYPE_UUID,
  IncidentResponseAttributes.JSON_PROPERTY_IS_TEST,
  IncidentResponseAttributes.JSON_PROPERTY_MODIFIED,
  IncidentResponseAttributes.JSON_PROPERTY_NON_DATADOG_CREATOR,
  IncidentResponseAttributes.JSON_PROPERTY_NOTIFICATION_HANDLES,
  IncidentResponseAttributes.JSON_PROPERTY_PUBLIC_ID,
  IncidentResponseAttributes.JSON_PROPERTY_RESOLVED,
  IncidentResponseAttributes.JSON_PROPERTY_SEVERITY,
  IncidentResponseAttributes.JSON_PROPERTY_STATE,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_DETECT,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_INTERNAL_RESPONSE,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_REPAIR,
  IncidentResponseAttributes.JSON_PROPERTY_TIME_TO_RESOLVE,
  IncidentResponseAttributes.JSON_PROPERTY_TITLE,
  IncidentResponseAttributes.JSON_PROPERTY_VISIBILITY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCHIVED = "archived";
  private JsonNullable<OffsetDateTime> archived = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CASE_ID = "case_id";
  private JsonNullable<Long> caseId = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_DURATION = "customer_impact_duration";
  private Long customerImpactDuration;

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_END = "customer_impact_end";
  private JsonNullable<OffsetDateTime> customerImpactEnd = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE = "customer_impact_scope";
  private JsonNullable<String> customerImpactScope = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACT_START = "customer_impact_start";
  private JsonNullable<OffsetDateTime> customerImpactStart = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_IMPACTED = "customer_impacted";
  private Boolean customerImpacted;

  public static final String JSON_PROPERTY_DECLARED = "declared";
  private OffsetDateTime declared;

  public static final String JSON_PROPERTY_DECLARED_BY = "declared_by";
  private JsonNullable<IncidentNonDatadogCreator> declaredBy = JsonNullable.<IncidentNonDatadogCreator>undefined();

  public static final String JSON_PROPERTY_DECLARED_BY_UUID = "declared_by_uuid";
  private JsonNullable<String> declaredByUuid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETECTED = "detected";
  private JsonNullable<OffsetDateTime> detected = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private Map<String, IncidentFieldAttributes> fields = null;

  public static final String JSON_PROPERTY_INCIDENT_TYPE_UUID = "incident_type_uuid";
  private String incidentTypeUuid;

  public static final String JSON_PROPERTY_IS_TEST = "is_test";
  private Boolean isTest;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_NON_DATADOG_CREATOR = "non_datadog_creator";
  private JsonNullable<IncidentNonDatadogCreator> nonDatadogCreator = JsonNullable.<IncidentNonDatadogCreator>undefined();

  public static final String JSON_PROPERTY_NOTIFICATION_HANDLES = "notification_handles";
  private JsonNullable<List<IncidentNotificationHandle>> notificationHandles = JsonNullable.<List<IncidentNotificationHandle>>undefined();

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private Long publicId;

  public static final String JSON_PROPERTY_RESOLVED = "resolved";
  private JsonNullable<OffsetDateTime> resolved = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private IncidentSeverity severity;

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

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

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private JsonNullable<String> visibility = JsonNullable.<String>undefined();

  public IncidentResponseAttributes() {}

  @JsonCreator
  public IncidentResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_TITLE)String title) {
        this.title = title;
  }

  /**
   * <p>Timestamp of when the incident was archived.</p>
   * @return archived
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getArchived() {

        if (archived == null) {
          archived = JsonNullable.<OffsetDateTime>undefined();
        }
        return archived.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getArchived_JsonNullable() {
    return archived;
  }
  @JsonProperty(JSON_PROPERTY_ARCHIVED)private void setArchived_JsonNullable(JsonNullable<OffsetDateTime> archived) {
    this.archived = archived;
  }
  public IncidentResponseAttributes caseId(Long caseId) {
    this.caseId = JsonNullable.<Long>of(caseId);
    return this;
  }

  /**
   * <p>The incident case id.</p>
   * @return caseId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getCaseId() {
        return caseId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CASE_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getCaseId_JsonNullable() {
    return caseId;
  }
  @JsonProperty(JSON_PROPERTY_CASE_ID)public void setCaseId_JsonNullable(JsonNullable<Long> caseId) {
    this.caseId = caseId;
  }
  public void setCaseId(Long caseId) {
    this.caseId = JsonNullable.<Long>of(caseId);
  }

  /**
   * <p>Timestamp when the incident was created.</p>
   * @return created
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreated() {
        return created;
      }

  /**
   * <p>Length of the incident's customer impact in seconds.
   * Equals the difference between <code>customer_impact_start</code> and <code>customer_impact_end</code>.</p>
   * @return customerImpactDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCustomerImpactDuration() {
        return customerImpactDuration;
      }
  public IncidentResponseAttributes customerImpactEnd(OffsetDateTime customerImpactEnd) {
    this.customerImpactEnd = JsonNullable.<OffsetDateTime>of(customerImpactEnd);
    return this;
  }

  /**
   * <p>Timestamp when customers were no longer impacted by the incident.</p>
   * @return customerImpactEnd
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getCustomerImpactEnd() {
        return customerImpactEnd.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_END)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCustomerImpactEnd_JsonNullable() {
    return customerImpactEnd;
  }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_END)public void setCustomerImpactEnd_JsonNullable(JsonNullable<OffsetDateTime> customerImpactEnd) {
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
   * <p>A summary of the impact customers experienced during the incident.</p>
   * @return customerImpactScope
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getCustomerImpactScope() {
        return customerImpactScope.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCustomerImpactScope_JsonNullable() {
    return customerImpactScope;
  }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_SCOPE)public void setCustomerImpactScope_JsonNullable(JsonNullable<String> customerImpactScope) {
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
   * <p>Timestamp when customers began being impacted by the incident.</p>
   * @return customerImpactStart
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getCustomerImpactStart() {
        return customerImpactStart.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_START)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCustomerImpactStart_JsonNullable() {
    return customerImpactStart;
  }
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACT_START)public void setCustomerImpactStart_JsonNullable(JsonNullable<OffsetDateTime> customerImpactStart) {
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
   * <p>A flag indicating whether the incident caused customer impact.</p>
   * @return customerImpacted
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOMER_IMPACTED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getCustomerImpacted() {
        return customerImpacted;
      }
  public void setCustomerImpacted(Boolean customerImpacted) {
    this.customerImpacted = customerImpacted;
  }

  /**
   * <p>Timestamp when the incident was declared.</p>
   * @return declared
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DECLARED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getDeclared() {
        return declared;
      }
  public IncidentResponseAttributes declaredBy(IncidentNonDatadogCreator declaredBy) {
    this.declaredBy = JsonNullable.<IncidentNonDatadogCreator>of(declaredBy);
    return this;
  }

  /**
   * <p>Incident's non Datadog creator.</p>
   * @return declaredBy
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public IncidentNonDatadogCreator getDeclaredBy() {
        return declaredBy.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DECLARED_BY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<IncidentNonDatadogCreator> getDeclaredBy_JsonNullable() {
    return declaredBy;
  }
  @JsonProperty(JSON_PROPERTY_DECLARED_BY)public void setDeclaredBy_JsonNullable(JsonNullable<IncidentNonDatadogCreator> declaredBy) {
    this.declaredBy = declaredBy;
  }
  public void setDeclaredBy(IncidentNonDatadogCreator declaredBy) {
    this.declaredBy = JsonNullable.<IncidentNonDatadogCreator>of(declaredBy);
  }
  public IncidentResponseAttributes declaredByUuid(String declaredByUuid) {
    this.declaredByUuid = JsonNullable.<String>of(declaredByUuid);
    return this;
  }

  /**
   * <p>UUID of the user who declared the incident.</p>
   * @return declaredByUuid
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getDeclaredByUuid() {
        return declaredByUuid.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DECLARED_BY_UUID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDeclaredByUuid_JsonNullable() {
    return declaredByUuid;
  }
  @JsonProperty(JSON_PROPERTY_DECLARED_BY_UUID)public void setDeclaredByUuid_JsonNullable(JsonNullable<String> declaredByUuid) {
    this.declaredByUuid = declaredByUuid;
  }
  public void setDeclaredByUuid(String declaredByUuid) {
    this.declaredByUuid = JsonNullable.<String>of(declaredByUuid);
  }
  public IncidentResponseAttributes detected(OffsetDateTime detected) {
    this.detected = JsonNullable.<OffsetDateTime>of(detected);
    return this;
  }

  /**
   * <p>Timestamp when the incident was detected.</p>
   * @return detected
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getDetected() {
        return detected.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DETECTED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDetected_JsonNullable() {
    return detected;
  }
  @JsonProperty(JSON_PROPERTY_DETECTED)public void setDetected_JsonNullable(JsonNullable<OffsetDateTime> detected) {
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
   * <p>A condensed view of the user-defined fields attached to incidents.</p>
   * @return fields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, IncidentFieldAttributes> getFields() {
        return fields;
      }
  public void setFields(Map<String, IncidentFieldAttributes> fields) {
    this.fields = fields;
  }
  public IncidentResponseAttributes incidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
    return this;
  }

  /**
   * <p>A unique identifier that represents an incident type.</p>
   * @return incidentTypeUuid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE_UUID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIncidentTypeUuid() {
        return incidentTypeUuid;
      }
  public void setIncidentTypeUuid(String incidentTypeUuid) {
    this.incidentTypeUuid = incidentTypeUuid;
  }
  public IncidentResponseAttributes isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

  /**
   * <p>A flag indicating whether the incident is a test incident.</p>
   * @return isTest
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_TEST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsTest() {
        return isTest;
      }
  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  /**
   * <p>Timestamp when the incident was last modified.</p>
   * @return modified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModified() {
        return modified;
      }
  public IncidentResponseAttributes nonDatadogCreator(IncidentNonDatadogCreator nonDatadogCreator) {
    this.nonDatadogCreator = JsonNullable.<IncidentNonDatadogCreator>of(nonDatadogCreator);
    return this;
  }

  /**
   * <p>Incident's non Datadog creator.</p>
   * @return nonDatadogCreator
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public IncidentNonDatadogCreator getNonDatadogCreator() {
        return nonDatadogCreator.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NON_DATADOG_CREATOR)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<IncidentNonDatadogCreator> getNonDatadogCreator_JsonNullable() {
    return nonDatadogCreator;
  }
  @JsonProperty(JSON_PROPERTY_NON_DATADOG_CREATOR)public void setNonDatadogCreator_JsonNullable(JsonNullable<IncidentNonDatadogCreator> nonDatadogCreator) {
    this.nonDatadogCreator = nonDatadogCreator;
  }
  public void setNonDatadogCreator(IncidentNonDatadogCreator nonDatadogCreator) {
    this.nonDatadogCreator = JsonNullable.<IncidentNonDatadogCreator>of(nonDatadogCreator);
  }
  public IncidentResponseAttributes notificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = JsonNullable.<List<IncidentNotificationHandle>>of(notificationHandles);
    return this;
  }
  public IncidentResponseAttributes addNotificationHandlesItem(IncidentNotificationHandle notificationHandlesItem) {
    if (this.notificationHandles == null || !this.notificationHandles.isPresent()) {
      this.notificationHandles = JsonNullable.<List<IncidentNotificationHandle>>of(new ArrayList<>());
    }
    try {
      this.notificationHandles.get().add(notificationHandlesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Notification handles that will be notified of the incident during update.</p>
   * @return notificationHandles
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<IncidentNotificationHandle> getNotificationHandles() {
        return notificationHandles.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IncidentNotificationHandle>> getNotificationHandles_JsonNullable() {
    return notificationHandles;
  }
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_HANDLES)public void setNotificationHandles_JsonNullable(JsonNullable<List<IncidentNotificationHandle>> notificationHandles) {
    this.notificationHandles = notificationHandles;
  }
  public void setNotificationHandles(List<IncidentNotificationHandle> notificationHandles) {
    this.notificationHandles = JsonNullable.<List<IncidentNotificationHandle>>of(notificationHandles);
  }
  public IncidentResponseAttributes publicId(Long publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The monotonically increasing integer ID for the incident.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Timestamp when the incident's state was last changed from active or stable to resolved or completed.</p>
   * @return resolved
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public OffsetDateTime getResolved() {
        return resolved.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getResolved_JsonNullable() {
    return resolved;
  }
  @JsonProperty(JSON_PROPERTY_RESOLVED)public void setResolved_JsonNullable(JsonNullable<OffsetDateTime> resolved) {
    this.resolved = resolved;
  }
  public void setResolved(OffsetDateTime resolved) {
    this.resolved = JsonNullable.<OffsetDateTime>of(resolved);
  }
  public IncidentResponseAttributes severity(IncidentSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * <p>The incident severity.</p>
   * @return severity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentSeverity getSeverity() {
        return severity;
      }
  public void setSeverity(IncidentSeverity severity) {
    if (!severity.isValid()) {
        this.unparsed = true;
    }
    this.severity = severity;
  }
  public IncidentResponseAttributes state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

  /**
   * <p>The state incident.</p>
   * @return state
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getState() {
        return state.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  @JsonProperty(JSON_PROPERTY_STATE)public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }
  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }

  /**
   * <p>The amount of time in seconds to detect the incident.
   * Equals the difference between <code>customer_impact_start</code> and <code>detected</code>.</p>
   * @return timeToDetect
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_TO_DETECT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeToDetect() {
        return timeToDetect;
      }

  /**
   * <p>The amount of time in seconds to call incident after detection. Equals the difference of <code>detected</code> and <code>created</code>.</p>
   * @return timeToInternalResponse
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_TO_INTERNAL_RESPONSE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeToInternalResponse() {
        return timeToInternalResponse;
      }

  /**
   * <p>The amount of time in seconds to resolve customer impact after detecting the issue. Equals the difference between <code>customer_impact_end</code> and <code>detected</code>.</p>
   * @return timeToRepair
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_TO_REPAIR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeToRepair() {
        return timeToRepair;
      }

  /**
   * <p>The amount of time in seconds to resolve the incident after it was created. Equals the difference between <code>created</code> and <code>resolved</code>.</p>
   * @return timeToResolve
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME_TO_RESOLVE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeToResolve() {
        return timeToResolve;
      }
  public IncidentResponseAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>The title of the incident, which summarizes what happened.</p>
   * @return title
  **/
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public IncidentResponseAttributes visibility(String visibility) {
    this.visibility = JsonNullable.<String>of(visibility);
    return this;
  }

  /**
   * <p>The incident visibility status.</p>
   * @return visibility
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getVisibility() {
        return visibility.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getVisibility_JsonNullable() {
    return visibility;
  }
  @JsonProperty(JSON_PROPERTY_VISIBILITY)public void setVisibility_JsonNullable(JsonNullable<String> visibility) {
    this.visibility = visibility;
  }
  public void setVisibility(String visibility) {
    this.visibility = JsonNullable.<String>of(visibility);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentResponseAttributes
   */
  @JsonAnySetter
  public IncidentResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this IncidentResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponseAttributes incidentResponseAttributes = (IncidentResponseAttributes) o;
    return Objects.equals(this.archived, incidentResponseAttributes.archived) && Objects.equals(this.caseId, incidentResponseAttributes.caseId) && Objects.equals(this.created, incidentResponseAttributes.created) && Objects.equals(this.customerImpactDuration, incidentResponseAttributes.customerImpactDuration) && Objects.equals(this.customerImpactEnd, incidentResponseAttributes.customerImpactEnd) && Objects.equals(this.customerImpactScope, incidentResponseAttributes.customerImpactScope) && Objects.equals(this.customerImpactStart, incidentResponseAttributes.customerImpactStart) && Objects.equals(this.customerImpacted, incidentResponseAttributes.customerImpacted) && Objects.equals(this.declared, incidentResponseAttributes.declared) && Objects.equals(this.declaredBy, incidentResponseAttributes.declaredBy) && Objects.equals(this.declaredByUuid, incidentResponseAttributes.declaredByUuid) && Objects.equals(this.detected, incidentResponseAttributes.detected) && Objects.equals(this.fields, incidentResponseAttributes.fields) && Objects.equals(this.incidentTypeUuid, incidentResponseAttributes.incidentTypeUuid) && Objects.equals(this.isTest, incidentResponseAttributes.isTest) && Objects.equals(this.modified, incidentResponseAttributes.modified) && Objects.equals(this.nonDatadogCreator, incidentResponseAttributes.nonDatadogCreator) && Objects.equals(this.notificationHandles, incidentResponseAttributes.notificationHandles) && Objects.equals(this.publicId, incidentResponseAttributes.publicId) && Objects.equals(this.resolved, incidentResponseAttributes.resolved) && Objects.equals(this.severity, incidentResponseAttributes.severity) && Objects.equals(this.state, incidentResponseAttributes.state) && Objects.equals(this.timeToDetect, incidentResponseAttributes.timeToDetect) && Objects.equals(this.timeToInternalResponse, incidentResponseAttributes.timeToInternalResponse) && Objects.equals(this.timeToRepair, incidentResponseAttributes.timeToRepair) && Objects.equals(this.timeToResolve, incidentResponseAttributes.timeToResolve) && Objects.equals(this.title, incidentResponseAttributes.title) && Objects.equals(this.visibility, incidentResponseAttributes.visibility) && Objects.equals(this.additionalProperties, incidentResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(archived,caseId,created,customerImpactDuration,customerImpactEnd,customerImpactScope,customerImpactStart,customerImpacted,declared,declaredBy,declaredByUuid,detected,fields,incidentTypeUuid,isTest,modified,nonDatadogCreator,notificationHandles,publicId,resolved,severity,state,timeToDetect,timeToInternalResponse,timeToRepair,timeToResolve,title,visibility, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponseAttributes {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customerImpactDuration: ").append(toIndentedString(customerImpactDuration)).append("\n");
    sb.append("    customerImpactEnd: ").append(toIndentedString(customerImpactEnd)).append("\n");
    sb.append("    customerImpactScope: ").append(toIndentedString(customerImpactScope)).append("\n");
    sb.append("    customerImpactStart: ").append(toIndentedString(customerImpactStart)).append("\n");
    sb.append("    customerImpacted: ").append(toIndentedString(customerImpacted)).append("\n");
    sb.append("    declared: ").append(toIndentedString(declared)).append("\n");
    sb.append("    declaredBy: ").append(toIndentedString(declaredBy)).append("\n");
    sb.append("    declaredByUuid: ").append(toIndentedString(declaredByUuid)).append("\n");
    sb.append("    detected: ").append(toIndentedString(detected)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    incidentTypeUuid: ").append(toIndentedString(incidentTypeUuid)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    nonDatadogCreator: ").append(toIndentedString(nonDatadogCreator)).append("\n");
    sb.append("    notificationHandles: ").append(toIndentedString(notificationHandles)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeToDetect: ").append(toIndentedString(timeToDetect)).append("\n");
    sb.append("    timeToInternalResponse: ").append(toIndentedString(timeToInternalResponse)).append("\n");
    sb.append("    timeToRepair: ").append(toIndentedString(timeToRepair)).append("\n");
    sb.append("    timeToResolve: ").append(toIndentedString(timeToResolve)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
