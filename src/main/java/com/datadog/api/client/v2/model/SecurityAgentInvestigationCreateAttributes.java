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

/** Attributes of the investigation to start. */
@JsonPropertyOrder({
  SecurityAgentInvestigationCreateAttributes.JSON_PROPERTY_RERUN,
  SecurityAgentInvestigationCreateAttributes.JSON_PROPERTY_SIGNAL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityAgentInvestigationCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RERUN = "rerun";
  private Boolean rerun = false;

  public static final String JSON_PROPERTY_SIGNAL_ID = "signal_id";
  private String signalId;

  public SecurityAgentInvestigationCreateAttributes() {}

  @JsonCreator
  public SecurityAgentInvestigationCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SIGNAL_ID) String signalId) {
    this.signalId = signalId;
  }

  public SecurityAgentInvestigationCreateAttributes rerun(Boolean rerun) {
    this.rerun = rerun;
    return this;
  }

  /**
   * Start a new investigation even if the signal already has one. If the signal's investigation is
   * still running, the response has that investigation instead. A rerun counts toward the monthly
   * investigation limit like any investigation.
   *
   * @return rerun
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RERUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRerun() {
    return rerun;
  }

  public void setRerun(Boolean rerun) {
    this.rerun = rerun;
  }

  public SecurityAgentInvestigationCreateAttributes signalId(String signalId) {
    this.signalId = signalId;
    return this;
  }

  /**
   * ID of the signal to investigate, in its V1 form, which starts with <code>AQ</code>, or in its
   * longer V3 form, which starts with <code>Aw</code>. Investigations carry the V1 form, so their
   * <code>signal_id</code> can differ from the ID you pass.
   *
   * @return signalId
   */
  @JsonProperty(JSON_PROPERTY_SIGNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSignalId() {
    return signalId;
  }

  public void setSignalId(String signalId) {
    this.signalId = signalId;
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
   * @return SecurityAgentInvestigationCreateAttributes
   */
  @JsonAnySetter
  public SecurityAgentInvestigationCreateAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityAgentInvestigationCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAgentInvestigationCreateAttributes securityAgentInvestigationCreateAttributes =
        (SecurityAgentInvestigationCreateAttributes) o;
    return Objects.equals(this.rerun, securityAgentInvestigationCreateAttributes.rerun)
        && Objects.equals(this.signalId, securityAgentInvestigationCreateAttributes.signalId)
        && Objects.equals(
            this.additionalProperties,
            securityAgentInvestigationCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rerun, signalId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityAgentInvestigationCreateAttributes {\n");
    sb.append("    rerun: ").append(toIndentedString(rerun)).append("\n");
    sb.append("    signalId: ").append(toIndentedString(signalId)).append("\n");
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
