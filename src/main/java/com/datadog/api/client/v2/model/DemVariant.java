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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A variant (sub-funnel) of a DEM journey with its own steps. */
@JsonPropertyOrder({
  DemVariant.JSON_PROPERTY_FILTER,
  DemVariant.JSON_PROPERTY_ID,
  DemVariant.JSON_PROPERTY_NAME,
  DemVariant.JSON_PROPERTY_RUM_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemVariant {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RUM_STEPS = "rum_steps";
  private List<DemRumStep> rumSteps = new ArrayList<>();

  public DemVariant() {}

  @JsonCreator
  public DemVariant(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUM_STEPS) List<DemRumStep> rumSteps) {
    this.name = name;
    this.rumSteps = rumSteps;
    for (DemRumStep item : rumSteps) {
      this.unparsed |= item.unparsed;
    }
  }

  public DemVariant filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * An optional RUM query filter to scope this variant.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  /**
   * The unique identifier of the variant.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public DemVariant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the variant.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DemVariant rumSteps(List<DemRumStep> rumSteps) {
    this.rumSteps = rumSteps;
    for (DemRumStep item : rumSteps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DemVariant addRumStepsItem(DemRumStep rumStepsItem) {
    this.rumSteps.add(rumStepsItem);
    this.unparsed |= rumStepsItem.unparsed;
    return this;
  }

  /**
   * List of RUM journey steps.
   *
   * @return rumSteps
   */
  @JsonProperty(JSON_PROPERTY_RUM_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DemRumStep> getRumSteps() {
    return rumSteps;
  }

  public void setRumSteps(List<DemRumStep> rumSteps) {
    this.rumSteps = rumSteps;
    if (rumSteps != null) {
      for (DemRumStep item : rumSteps) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return DemVariant
   */
  @JsonAnySetter
  public DemVariant putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemVariant object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemVariant demVariant = (DemVariant) o;
    return Objects.equals(this.filter, demVariant.filter)
        && Objects.equals(this.id, demVariant.id)
        && Objects.equals(this.name, demVariant.name)
        && Objects.equals(this.rumSteps, demVariant.rumSteps)
        && Objects.equals(this.additionalProperties, demVariant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, id, name, rumSteps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemVariant {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rumSteps: ").append(toIndentedString(rumSteps)).append("\n");
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
