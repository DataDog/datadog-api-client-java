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
import java.util.Objects;

/** A trigger created from a general investigation request. */
@JsonPropertyOrder({
  GeneralInvestigationTrigger.JSON_PROPERTY_GENERAL_INVESTIGATION,
  GeneralInvestigationTrigger.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeneralInvestigationTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GENERAL_INVESTIGATION = "general_investigation";
  private GeneralInvestigationAttributes generalInvestigation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GeneralInvestigationTriggerType type;

  public GeneralInvestigationTrigger() {}

  @JsonCreator
  public GeneralInvestigationTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_GENERAL_INVESTIGATION)
          GeneralInvestigationAttributes generalInvestigation,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          GeneralInvestigationTriggerType type) {
    this.generalInvestigation = generalInvestigation;
    this.unparsed |= generalInvestigation.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public GeneralInvestigationTrigger generalInvestigation(
      GeneralInvestigationAttributes generalInvestigation) {
    this.generalInvestigation = generalInvestigation;
    this.unparsed |= generalInvestigation.unparsed;
    return this;
  }

  /**
   * Attributes for a general investigation, not tied to a specific monitor alert.
   *
   * @return generalInvestigation
   */
  @JsonProperty(JSON_PROPERTY_GENERAL_INVESTIGATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeneralInvestigationAttributes getGeneralInvestigation() {
    return generalInvestigation;
  }

  public void setGeneralInvestigation(GeneralInvestigationAttributes generalInvestigation) {
    this.generalInvestigation = generalInvestigation;
    if (generalInvestigation != null) {
      this.unparsed |= generalInvestigation.unparsed;
    }
  }

  public GeneralInvestigationTrigger type(GeneralInvestigationTriggerType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of general investigation trigger.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeneralInvestigationTriggerType getType() {
    return type;
  }

  public void setType(GeneralInvestigationTriggerType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this GeneralInvestigationTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralInvestigationTrigger generalInvestigationTrigger = (GeneralInvestigationTrigger) o;
    return Objects.equals(
            this.generalInvestigation, generalInvestigationTrigger.generalInvestigation)
        && Objects.equals(this.type, generalInvestigationTrigger.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generalInvestigation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralInvestigationTrigger {\n");
    sb.append("    generalInvestigation: ")
        .append(toIndentedString(generalInvestigation))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
