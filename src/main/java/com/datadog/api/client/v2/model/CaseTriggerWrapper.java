/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Schema for a Case-based trigger. */
@JsonPropertyOrder({
  CaseTriggerWrapper.JSON_PROPERTY_CASE_TRIGGER,
  CaseTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseTriggerWrapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE_TRIGGER = "caseTrigger";
  private CaseTrigger caseTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public CaseTriggerWrapper() {}

  @JsonCreator
  public CaseTriggerWrapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASE_TRIGGER) CaseTrigger caseTrigger) {
    this.caseTrigger = caseTrigger;
    this.unparsed |= caseTrigger.unparsed;
  }

  public CaseTriggerWrapper caseTrigger(CaseTrigger caseTrigger) {
    this.caseTrigger = caseTrigger;
    this.unparsed |= caseTrigger.unparsed;
    return this;
  }

  /**
   * Trigger a workflow VIA a Case. For automatic triggering a handle must be configured and the
   * workflow must be published.
   *
   * @return caseTrigger
   */
  @JsonProperty(JSON_PROPERTY_CASE_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseTrigger getCaseTrigger() {
    return caseTrigger;
  }

  public void setCaseTrigger(CaseTrigger caseTrigger) {
    this.caseTrigger = caseTrigger;
  }

  public CaseTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }

  public CaseTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
    if (this.startStepNames == null) {
      this.startStepNames = new ArrayList<>();
    }
    this.startStepNames.add(startStepNamesItem);
    return this;
  }

  /**
   * A list of steps that run first after a trigger fires.
   *
   * @return startStepNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_STEP_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStartStepNames() {
    return startStepNames;
  }

  public void setStartStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
  }

  /** Return true if this CaseTriggerWrapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseTriggerWrapper caseTriggerWrapper = (CaseTriggerWrapper) o;
    return Objects.equals(this.caseTrigger, caseTriggerWrapper.caseTrigger)
        && Objects.equals(this.startStepNames, caseTriggerWrapper.startStepNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseTrigger, startStepNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseTriggerWrapper {\n");
    sb.append("    caseTrigger: ").append(toIndentedString(caseTrigger)).append("\n");
    sb.append("    startStepNames: ").append(toIndentedString(startStepNames)).append("\n");
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
