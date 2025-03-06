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

/** Schema for a Security-based trigger. */
@JsonPropertyOrder({
  SecurityTriggerWrapper.JSON_PROPERTY_SECURITY_TRIGGER,
  SecurityTriggerWrapper.JSON_PROPERTY_START_STEP_NAMES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityTriggerWrapper {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SECURITY_TRIGGER = "securityTrigger";
  private SecurityTrigger securityTrigger;

  public static final String JSON_PROPERTY_START_STEP_NAMES = "startStepNames";
  private List<String> startStepNames = null;

  public SecurityTriggerWrapper() {}

  @JsonCreator
  public SecurityTriggerWrapper(
      @JsonProperty(required = true, value = JSON_PROPERTY_SECURITY_TRIGGER)
          SecurityTrigger securityTrigger) {
    this.securityTrigger = securityTrigger;
    this.unparsed |= securityTrigger.unparsed;
  }

  public SecurityTriggerWrapper securityTrigger(SecurityTrigger securityTrigger) {
    this.securityTrigger = securityTrigger;
    this.unparsed |= securityTrigger.unparsed;
    return this;
  }

  /**
   * Trigger a workflow VIA a Security Signal or Finding. For automatic triggering a handle must be
   * configured and the workflow must be published.
   *
   * @return securityTrigger
   */
  @JsonProperty(JSON_PROPERTY_SECURITY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityTrigger getSecurityTrigger() {
    return securityTrigger;
  }

  public void setSecurityTrigger(SecurityTrigger securityTrigger) {
    this.securityTrigger = securityTrigger;
  }

  public SecurityTriggerWrapper startStepNames(List<String> startStepNames) {
    this.startStepNames = startStepNames;
    return this;
  }

  public SecurityTriggerWrapper addStartStepNamesItem(String startStepNamesItem) {
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

  /** Return true if this SecurityTriggerWrapper object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityTriggerWrapper securityTriggerWrapper = (SecurityTriggerWrapper) o;
    return Objects.equals(this.securityTrigger, securityTriggerWrapper.securityTrigger)
        && Objects.equals(this.startStepNames, securityTriggerWrapper.startStepNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityTrigger, startStepNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityTriggerWrapper {\n");
    sb.append("    securityTrigger: ").append(toIndentedString(securityTrigger)).append("\n");
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
