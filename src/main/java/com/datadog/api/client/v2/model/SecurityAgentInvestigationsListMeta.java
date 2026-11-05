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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Metadata of a page of investigations. */
@JsonPropertyOrder({
  SecurityAgentInvestigationsListMeta.JSON_PROPERTY_REASON,
  SecurityAgentInvestigationsListMeta.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationsListMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REASON = "reason";
  private SecurityAgentInvestigationNoRunReason reason;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public SecurityAgentInvestigationsListMeta() {}

  @JsonCreator
  public SecurityAgentInvestigationsListMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_COUNT) Long totalCount) {
    this.totalCount = totalCount;
  }

  public SecurityAgentInvestigationsListMeta reason(SecurityAgentInvestigationNoRunReason reason) {
    this.reason = reason;
    this.unparsed |= !reason.isValid();
    return this;
  }

  /**
   * Why <code>filter[signal_id]</code> returned no investigation. Set only on the first page of an
   * empty result. The reason is based on the organization's current settings. Poll again only on
   * <code>investigation_not_started</code>, after the number of seconds in the <code>Retry-After
   * </code> header; treat the others as final for this signal. - <code>investigation_not_started
   * </code>: no investigation has started yet, but one may still start. - <code>not_investigated
   * </code>: no investigation started within an hour of the signal, so none is expected. The signal
   * was skipped for a reason this API doesn't report, such as its severity or a rate limit. -
   * <code>rule_not_enabled</code>: the signal's detection rule doesn't have Bits Security Analyst
   * enabled, so no investigation starts automatically. - <code>signal_not_found</code>: the ID
   * isn't a signal ID, or no signal with this ID exists in the organization. - <code>
   * org_not_activated</code>: the organization hasn't activated Bits Security Analyst.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityAgentInvestigationNoRunReason getReason() {
    return reason;
  }

  public void setReason(SecurityAgentInvestigationNoRunReason reason) {
    if (!reason.isValid()) {
      this.unparsed = true;
    }
    this.reason = reason;
  }

  public SecurityAgentInvestigationsListMeta totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Without <code>filter[signal_id]</code>, the number of signals that match the filters. With
   * <code>filter[signal_id]</code>, the number of investigations of that signal. Pages past the
   * last page return 0.
   *
   * @return totalCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
   * @return SecurityAgentInvestigationsListMeta
   */
  @JsonAnySetter
  public SecurityAgentInvestigationsListMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationsListMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationsListMeta securityAgentInvestigationsListMeta =
        (SecurityAgentInvestigationsListMeta) o;
    return Objects.equals(this.reason, securityAgentInvestigationsListMeta.reason)
        && Objects.equals(this.totalCount, securityAgentInvestigationsListMeta.totalCount)
        && Objects.equals(
            this.additionalProperties, securityAgentInvestigationsListMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationsListMeta {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
