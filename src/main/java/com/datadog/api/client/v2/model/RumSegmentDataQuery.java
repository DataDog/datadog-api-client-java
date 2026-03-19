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

/**
 * Query definition for the segment. Contains one or more query blocks and an optional combination
 * formula.
 */
@JsonPropertyOrder({
  RumSegmentDataQuery.JSON_PROPERTY_COMBINATION,
  RumSegmentDataQuery.JSON_PROPERTY_EVENT_PLATFORMS,
  RumSegmentDataQuery.JSON_PROPERTY_JOURNEYS,
  RumSegmentDataQuery.JSON_PROPERTY_REFERENCE_TABLES,
  RumSegmentDataQuery.JSON_PROPERTY_STATIC,
  RumSegmentDataQuery.JSON_PROPERTY_TEMPLATES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentDataQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMBINATION = "combination";
  private String combination;

  public static final String JSON_PROPERTY_EVENT_PLATFORMS = "event_platforms";
  private List<RumSegmentEventPlatform> eventPlatforms = null;

  public static final String JSON_PROPERTY_JOURNEYS = "journeys";
  private List<RumSegmentJourney> journeys = null;

  public static final String JSON_PROPERTY_REFERENCE_TABLES = "reference_tables";
  private List<RumSegmentReferenceTable> referenceTables = null;

  public static final String JSON_PROPERTY_STATIC = "static";
  private List<RumSegmentStaticEntry> _static = null;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<RumSegmentTemplateInstance> templates = null;

  public RumSegmentDataQuery combination(String combination) {
    this.combination = combination;
    return this;
  }

  /**
   * Boolean expression combining multiple query blocks.
   *
   * @return combination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCombination() {
    return combination;
  }

  public void setCombination(String combination) {
    this.combination = combination;
  }

  public RumSegmentDataQuery eventPlatforms(List<RumSegmentEventPlatform> eventPlatforms) {
    this.eventPlatforms = eventPlatforms;
    for (RumSegmentEventPlatform item : eventPlatforms) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentDataQuery addEventPlatformsItem(RumSegmentEventPlatform eventPlatformsItem) {
    if (this.eventPlatforms == null) {
      this.eventPlatforms = new ArrayList<>();
    }
    this.eventPlatforms.add(eventPlatformsItem);
    this.unparsed |= eventPlatformsItem.unparsed;
    return this;
  }

  /**
   * List of event platform query blocks.
   *
   * @return eventPlatforms
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_PLATFORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSegmentEventPlatform> getEventPlatforms() {
    return eventPlatforms;
  }

  public void setEventPlatforms(List<RumSegmentEventPlatform> eventPlatforms) {
    this.eventPlatforms = eventPlatforms;
  }

  public RumSegmentDataQuery journeys(List<RumSegmentJourney> journeys) {
    this.journeys = journeys;
    for (RumSegmentJourney item : journeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentDataQuery addJourneysItem(RumSegmentJourney journeysItem) {
    if (this.journeys == null) {
      this.journeys = new ArrayList<>();
    }
    this.journeys.add(journeysItem);
    this.unparsed |= journeysItem.unparsed;
    return this;
  }

  /**
   * List of journey-based query blocks.
   *
   * @return journeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOURNEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSegmentJourney> getJourneys() {
    return journeys;
  }

  public void setJourneys(List<RumSegmentJourney> journeys) {
    this.journeys = journeys;
  }

  public RumSegmentDataQuery referenceTables(List<RumSegmentReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
    for (RumSegmentReferenceTable item : referenceTables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentDataQuery addReferenceTablesItem(RumSegmentReferenceTable referenceTablesItem) {
    if (this.referenceTables == null) {
      this.referenceTables = new ArrayList<>();
    }
    this.referenceTables.add(referenceTablesItem);
    this.unparsed |= referenceTablesItem.unparsed;
    return this;
  }

  /**
   * List of reference table query blocks.
   *
   * @return referenceTables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSegmentReferenceTable> getReferenceTables() {
    return referenceTables;
  }

  public void setReferenceTables(List<RumSegmentReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
  }

  public RumSegmentDataQuery _static(List<RumSegmentStaticEntry> _static) {
    this._static = _static;
    for (RumSegmentStaticEntry item : _static) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentDataQuery add_staticItem(RumSegmentStaticEntry _staticItem) {
    if (this._static == null) {
      this._static = new ArrayList<>();
    }
    this._static.add(_staticItem);
    this.unparsed |= _staticItem.unparsed;
    return this;
  }

  /**
   * List of static user list blocks.
   *
   * @return _static
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSegmentStaticEntry> getStatic() {
    return _static;
  }

  public void setStatic(List<RumSegmentStaticEntry> _static) {
    this._static = _static;
  }

  public RumSegmentDataQuery templates(List<RumSegmentTemplateInstance> templates) {
    this.templates = templates;
    for (RumSegmentTemplateInstance item : templates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RumSegmentDataQuery addTemplatesItem(RumSegmentTemplateInstance templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    this.unparsed |= templatesItem.unparsed;
    return this;
  }

  /**
   * List of template-based query blocks.
   *
   * @return templates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RumSegmentTemplateInstance> getTemplates() {
    return templates;
  }

  public void setTemplates(List<RumSegmentTemplateInstance> templates) {
    this.templates = templates;
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
   * @return RumSegmentDataQuery
   */
  @JsonAnySetter
  public RumSegmentDataQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentDataQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentDataQuery rumSegmentDataQuery = (RumSegmentDataQuery) o;
    return Objects.equals(this.combination, rumSegmentDataQuery.combination)
        && Objects.equals(this.eventPlatforms, rumSegmentDataQuery.eventPlatforms)
        && Objects.equals(this.journeys, rumSegmentDataQuery.journeys)
        && Objects.equals(this.referenceTables, rumSegmentDataQuery.referenceTables)
        && Objects.equals(this._static, rumSegmentDataQuery._static)
        && Objects.equals(this.templates, rumSegmentDataQuery.templates)
        && Objects.equals(this.additionalProperties, rumSegmentDataQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        combination,
        eventPlatforms,
        journeys,
        referenceTables,
        _static,
        templates,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentDataQuery {\n");
    sb.append("    combination: ").append(toIndentedString(combination)).append("\n");
    sb.append("    eventPlatforms: ").append(toIndentedString(eventPlatforms)).append("\n");
    sb.append("    journeys: ").append(toIndentedString(journeys)).append("\n");
    sb.append("    referenceTables: ").append(toIndentedString(referenceTables)).append("\n");
    sb.append("    _static: ").append(toIndentedString(_static)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
