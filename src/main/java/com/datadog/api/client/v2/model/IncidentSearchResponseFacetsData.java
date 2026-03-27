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

/** Facet data for incidents returned by a search query. */
@JsonPropertyOrder({
  IncidentSearchResponseFacetsData.JSON_PROPERTY_COMMANDER,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_CREATED_BY,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_FIELDS,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_IMPACT,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_LAST_MODIFIED_BY,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_POSTMORTEM,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_RESPONDER,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_SEVERITY,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_STATE,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_TIME_TO_REPAIR,
  IncidentSearchResponseFacetsData.JSON_PROPERTY_TIME_TO_RESOLVE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseFacetsData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMANDER = "commander";
  private List<IncidentSearchResponseUserFacetData> commander = null;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private List<IncidentSearchResponseUserFacetData> createdBy = null;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<IncidentSearchResponsePropertyFieldFacetData> fields = null;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private List<IncidentSearchResponseFieldFacetData> impact = null;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "last_modified_by";
  private List<IncidentSearchResponseUserFacetData> lastModifiedBy = null;

  public static final String JSON_PROPERTY_POSTMORTEM = "postmortem";
  private List<IncidentSearchResponseFieldFacetData> postmortem = null;

  public static final String JSON_PROPERTY_RESPONDER = "responder";
  private List<IncidentSearchResponseUserFacetData> responder = null;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private List<IncidentSearchResponseFieldFacetData> severity = null;

  public static final String JSON_PROPERTY_STATE = "state";
  private List<IncidentSearchResponseFieldFacetData> state = null;

  public static final String JSON_PROPERTY_TIME_TO_REPAIR = "time_to_repair";
  private List<IncidentSearchResponseNumericFacetData> timeToRepair = null;

  public static final String JSON_PROPERTY_TIME_TO_RESOLVE = "time_to_resolve";
  private List<IncidentSearchResponseNumericFacetData> timeToResolve = null;

  public IncidentSearchResponseFacetsData commander(
      List<IncidentSearchResponseUserFacetData> commander) {
    this.commander = commander;
    for (IncidentSearchResponseUserFacetData item : commander) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addCommanderItem(
      IncidentSearchResponseUserFacetData commanderItem) {
    if (this.commander == null) {
      this.commander = new ArrayList<>();
    }
    this.commander.add(commanderItem);
    this.unparsed |= commanderItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident commander users.
   *
   * @return commander
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMANDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseUserFacetData> getCommander() {
    return commander;
  }

  public void setCommander(List<IncidentSearchResponseUserFacetData> commander) {
    this.commander = commander;
  }

  public IncidentSearchResponseFacetsData createdBy(
      List<IncidentSearchResponseUserFacetData> createdBy) {
    this.createdBy = createdBy;
    for (IncidentSearchResponseUserFacetData item : createdBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addCreatedByItem(
      IncidentSearchResponseUserFacetData createdByItem) {
    if (this.createdBy == null) {
      this.createdBy = new ArrayList<>();
    }
    this.createdBy.add(createdByItem);
    this.unparsed |= createdByItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident creator users.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseUserFacetData> getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(List<IncidentSearchResponseUserFacetData> createdBy) {
    this.createdBy = createdBy;
  }

  public IncidentSearchResponseFacetsData fields(
      List<IncidentSearchResponsePropertyFieldFacetData> fields) {
    this.fields = fields;
    for (IncidentSearchResponsePropertyFieldFacetData item : fields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addFieldsItem(
      IncidentSearchResponsePropertyFieldFacetData fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    this.unparsed |= fieldsItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident property fields.
   *
   * @return fields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponsePropertyFieldFacetData> getFields() {
    return fields;
  }

  public void setFields(List<IncidentSearchResponsePropertyFieldFacetData> fields) {
    this.fields = fields;
  }

  public IncidentSearchResponseFacetsData impact(
      List<IncidentSearchResponseFieldFacetData> impact) {
    this.impact = impact;
    for (IncidentSearchResponseFieldFacetData item : impact) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addImpactItem(
      IncidentSearchResponseFieldFacetData impactItem) {
    if (this.impact == null) {
      this.impact = new ArrayList<>();
    }
    this.impact.add(impactItem);
    this.unparsed |= impactItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident impact attributes.
   *
   * @return impact
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseFieldFacetData> getImpact() {
    return impact;
  }

  public void setImpact(List<IncidentSearchResponseFieldFacetData> impact) {
    this.impact = impact;
  }

  public IncidentSearchResponseFacetsData lastModifiedBy(
      List<IncidentSearchResponseUserFacetData> lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    for (IncidentSearchResponseUserFacetData item : lastModifiedBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addLastModifiedByItem(
      IncidentSearchResponseUserFacetData lastModifiedByItem) {
    if (this.lastModifiedBy == null) {
      this.lastModifiedBy = new ArrayList<>();
    }
    this.lastModifiedBy.add(lastModifiedByItem);
    this.unparsed |= lastModifiedByItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident last modified by users.
   *
   * @return lastModifiedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseUserFacetData> getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(List<IncidentSearchResponseUserFacetData> lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public IncidentSearchResponseFacetsData postmortem(
      List<IncidentSearchResponseFieldFacetData> postmortem) {
    this.postmortem = postmortem;
    for (IncidentSearchResponseFieldFacetData item : postmortem) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addPostmortemItem(
      IncidentSearchResponseFieldFacetData postmortemItem) {
    if (this.postmortem == null) {
      this.postmortem = new ArrayList<>();
    }
    this.postmortem.add(postmortemItem);
    this.unparsed |= postmortemItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident postmortem existence.
   *
   * @return postmortem
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTMORTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseFieldFacetData> getPostmortem() {
    return postmortem;
  }

  public void setPostmortem(List<IncidentSearchResponseFieldFacetData> postmortem) {
    this.postmortem = postmortem;
  }

  public IncidentSearchResponseFacetsData responder(
      List<IncidentSearchResponseUserFacetData> responder) {
    this.responder = responder;
    for (IncidentSearchResponseUserFacetData item : responder) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addResponderItem(
      IncidentSearchResponseUserFacetData responderItem) {
    if (this.responder == null) {
      this.responder = new ArrayList<>();
    }
    this.responder.add(responderItem);
    this.unparsed |= responderItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident responder users.
   *
   * @return responder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseUserFacetData> getResponder() {
    return responder;
  }

  public void setResponder(List<IncidentSearchResponseUserFacetData> responder) {
    this.responder = responder;
  }

  public IncidentSearchResponseFacetsData severity(
      List<IncidentSearchResponseFieldFacetData> severity) {
    this.severity = severity;
    for (IncidentSearchResponseFieldFacetData item : severity) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addSeverityItem(
      IncidentSearchResponseFieldFacetData severityItem) {
    if (this.severity == null) {
      this.severity = new ArrayList<>();
    }
    this.severity.add(severityItem);
    this.unparsed |= severityItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident severity attributes.
   *
   * @return severity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseFieldFacetData> getSeverity() {
    return severity;
  }

  public void setSeverity(List<IncidentSearchResponseFieldFacetData> severity) {
    this.severity = severity;
  }

  public IncidentSearchResponseFacetsData state(List<IncidentSearchResponseFieldFacetData> state) {
    this.state = state;
    for (IncidentSearchResponseFieldFacetData item : state) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addStateItem(
      IncidentSearchResponseFieldFacetData stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<>();
    }
    this.state.add(stateItem);
    this.unparsed |= stateItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident state attributes.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseFieldFacetData> getState() {
    return state;
  }

  public void setState(List<IncidentSearchResponseFieldFacetData> state) {
    this.state = state;
  }

  public IncidentSearchResponseFacetsData timeToRepair(
      List<IncidentSearchResponseNumericFacetData> timeToRepair) {
    this.timeToRepair = timeToRepair;
    for (IncidentSearchResponseNumericFacetData item : timeToRepair) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addTimeToRepairItem(
      IncidentSearchResponseNumericFacetData timeToRepairItem) {
    if (this.timeToRepair == null) {
      this.timeToRepair = new ArrayList<>();
    }
    this.timeToRepair.add(timeToRepairItem);
    this.unparsed |= timeToRepairItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident time to repair metrics.
   *
   * @return timeToRepair
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_REPAIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseNumericFacetData> getTimeToRepair() {
    return timeToRepair;
  }

  public void setTimeToRepair(List<IncidentSearchResponseNumericFacetData> timeToRepair) {
    this.timeToRepair = timeToRepair;
  }

  public IncidentSearchResponseFacetsData timeToResolve(
      List<IncidentSearchResponseNumericFacetData> timeToResolve) {
    this.timeToResolve = timeToResolve;
    for (IncidentSearchResponseNumericFacetData item : timeToResolve) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseFacetsData addTimeToResolveItem(
      IncidentSearchResponseNumericFacetData timeToResolveItem) {
    if (this.timeToResolve == null) {
      this.timeToResolve = new ArrayList<>();
    }
    this.timeToResolve.add(timeToResolveItem);
    this.unparsed |= timeToResolveItem.unparsed;
    return this;
  }

  /**
   * Facet data for incident time to resolve metrics.
   *
   * @return timeToResolve
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_TO_RESOLVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentSearchResponseNumericFacetData> getTimeToResolve() {
    return timeToResolve;
  }

  public void setTimeToResolve(List<IncidentSearchResponseNumericFacetData> timeToResolve) {
    this.timeToResolve = timeToResolve;
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
   * @return IncidentSearchResponseFacetsData
   */
  @JsonAnySetter
  public IncidentSearchResponseFacetsData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentSearchResponseFacetsData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseFacetsData incidentSearchResponseFacetsData =
        (IncidentSearchResponseFacetsData) o;
    return Objects.equals(this.commander, incidentSearchResponseFacetsData.commander)
        && Objects.equals(this.createdBy, incidentSearchResponseFacetsData.createdBy)
        && Objects.equals(this.fields, incidentSearchResponseFacetsData.fields)
        && Objects.equals(this.impact, incidentSearchResponseFacetsData.impact)
        && Objects.equals(this.lastModifiedBy, incidentSearchResponseFacetsData.lastModifiedBy)
        && Objects.equals(this.postmortem, incidentSearchResponseFacetsData.postmortem)
        && Objects.equals(this.responder, incidentSearchResponseFacetsData.responder)
        && Objects.equals(this.severity, incidentSearchResponseFacetsData.severity)
        && Objects.equals(this.state, incidentSearchResponseFacetsData.state)
        && Objects.equals(this.timeToRepair, incidentSearchResponseFacetsData.timeToRepair)
        && Objects.equals(this.timeToResolve, incidentSearchResponseFacetsData.timeToResolve)
        && Objects.equals(
            this.additionalProperties, incidentSearchResponseFacetsData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        commander,
        createdBy,
        fields,
        impact,
        lastModifiedBy,
        postmortem,
        responder,
        severity,
        state,
        timeToRepair,
        timeToResolve,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseFacetsData {\n");
    sb.append("    commander: ").append(toIndentedString(commander)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    postmortem: ").append(toIndentedString(postmortem)).append("\n");
    sb.append("    responder: ").append(toIndentedString(responder)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeToRepair: ").append(toIndentedString(timeToRepair)).append("\n");
    sb.append("    timeToResolve: ").append(toIndentedString(timeToResolve)).append("\n");
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
