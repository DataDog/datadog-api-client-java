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
   * <p>A list of severity modifier rules with pagination metadata.</p>
 */
@JsonPropertyOrder({
  SeverityModifierRulesResponse.JSON_PROPERTY_DATA,
  SeverityModifierRulesResponse.JSON_PROPERTY_LINKS,
  SeverityModifierRulesResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityModifierRulesResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SeverityModifierRuleDataResponse> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private SecurityAutomationRulesLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private SecurityAutomationRulesMeta meta;

  public SeverityModifierRulesResponse() {}

  @JsonCreator
  public SeverityModifierRulesResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)List<SeverityModifierRuleDataResponse> data,
            @JsonProperty(required=true, value=JSON_PROPERTY_LINKS)SecurityAutomationRulesLinks links,
            @JsonProperty(required=true, value=JSON_PROPERTY_META)SecurityAutomationRulesMeta meta) {
        this.data = data;
        for (SeverityModifierRuleDataResponse item : data) {
          this.unparsed |= item.unparsed;
        }
        this.links = links;
        this.unparsed |= links.unparsed;
        this.meta = meta;
        this.unparsed |= meta.unparsed;
  }
  public SeverityModifierRulesResponse data(List<SeverityModifierRuleDataResponse> data) {
    this.data = data;
    for (SeverityModifierRuleDataResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SeverityModifierRulesResponse addDataItem(SeverityModifierRuleDataResponse dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>A list of severity modifier rule data objects.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SeverityModifierRuleDataResponse> getData() {
        return data;
      }
  public void setData(List<SeverityModifierRuleDataResponse> data) {
    this.data = data;
    if (data != null) {
      for (SeverityModifierRuleDataResponse item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public SeverityModifierRulesResponse links(SecurityAutomationRulesLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * <p>Pagination links for the list of automation rules.</p>
   * @return links
  **/
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityAutomationRulesLinks getLinks() {
        return links;
      }
  public void setLinks(SecurityAutomationRulesLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }
  public SeverityModifierRulesResponse meta(SecurityAutomationRulesMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the list of automation rules.</p>
   * @return meta
  **/
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityAutomationRulesMeta getMeta() {
        return meta;
      }
  public void setMeta(SecurityAutomationRulesMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
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
   * @return SeverityModifierRulesResponse
   */
  @JsonAnySetter
  public SeverityModifierRulesResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this SeverityModifierRulesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityModifierRulesResponse severityModifierRulesResponse = (SeverityModifierRulesResponse) o;
    return Objects.equals(this.data, severityModifierRulesResponse.data) && Objects.equals(this.links, severityModifierRulesResponse.links) && Objects.equals(this.meta, severityModifierRulesResponse.meta) && Objects.equals(this.additionalProperties, severityModifierRulesResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,links,meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityModifierRulesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
