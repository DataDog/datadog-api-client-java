/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Facets</p>
 */
@JsonPropertyOrder({
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_ALL_TAGS,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_CREATOR_NAME,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_ENV_TAGS,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_SERVICE_TAGS,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_SLO_TYPE,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_TARGET,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_TEAM_TAGS,
  SearchSLOResponseDataAttributesFacets.JSON_PROPERTY_TIMEFRAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOResponseDataAttributesFacets {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALL_TAGS = "all_tags";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> allTags = null;

  public static final String JSON_PROPERTY_CREATOR_NAME = "creator_name";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> creatorName = null;

  public static final String JSON_PROPERTY_ENV_TAGS = "env_tags";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> envTags = null;

  public static final String JSON_PROPERTY_SERVICE_TAGS = "service_tags";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> serviceTags = null;

  public static final String JSON_PROPERTY_SLO_TYPE = "slo_type";
  private List<SearchSLOResponseDataAttributesFacetsObjectInt> sloType = null;

  public static final String JSON_PROPERTY_TARGET = "target";
  private List<SearchSLOResponseDataAttributesFacetsObjectInt> target = null;

  public static final String JSON_PROPERTY_TEAM_TAGS = "team_tags";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> teamTags = null;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private List<SearchSLOResponseDataAttributesFacetsObjectString> timeframe = null;

  public SearchSLOResponseDataAttributesFacets allTags(List<SearchSLOResponseDataAttributesFacetsObjectString> allTags) {
    this.allTags = allTags;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : allTags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addAllTagsItem(SearchSLOResponseDataAttributesFacetsObjectString allTagsItem) {
    if (this.allTags == null) {
      this.allTags = new ArrayList<>();
    }
    this.allTags.add(allTagsItem);
    this.unparsed |= allTagsItem.unparsed;
    return this;
  }

  /**
   * <p>All tags associated with an SLO.</p>
   * @return allTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALL_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getAllTags() {
        return allTags;
      }
  public void setAllTags(List<SearchSLOResponseDataAttributesFacetsObjectString> allTags) {
    this.allTags = allTags;
  }
  public SearchSLOResponseDataAttributesFacets creatorName(List<SearchSLOResponseDataAttributesFacetsObjectString> creatorName) {
    this.creatorName = creatorName;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : creatorName) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addCreatorNameItem(SearchSLOResponseDataAttributesFacetsObjectString creatorNameItem) {
    if (this.creatorName == null) {
      this.creatorName = new ArrayList<>();
    }
    this.creatorName.add(creatorNameItem);
    this.unparsed |= creatorNameItem.unparsed;
    return this;
  }

  /**
   * <p>Creator of an SLO.</p>
   * @return creatorName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getCreatorName() {
        return creatorName;
      }
  public void setCreatorName(List<SearchSLOResponseDataAttributesFacetsObjectString> creatorName) {
    this.creatorName = creatorName;
  }
  public SearchSLOResponseDataAttributesFacets envTags(List<SearchSLOResponseDataAttributesFacetsObjectString> envTags) {
    this.envTags = envTags;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : envTags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addEnvTagsItem(SearchSLOResponseDataAttributesFacetsObjectString envTagsItem) {
    if (this.envTags == null) {
      this.envTags = new ArrayList<>();
    }
    this.envTags.add(envTagsItem);
    this.unparsed |= envTagsItem.unparsed;
    return this;
  }

  /**
   * <p>Tags with the <code>env</code> tag key.</p>
   * @return envTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENV_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getEnvTags() {
        return envTags;
      }
  public void setEnvTags(List<SearchSLOResponseDataAttributesFacetsObjectString> envTags) {
    this.envTags = envTags;
  }
  public SearchSLOResponseDataAttributesFacets serviceTags(List<SearchSLOResponseDataAttributesFacetsObjectString> serviceTags) {
    this.serviceTags = serviceTags;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : serviceTags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addServiceTagsItem(SearchSLOResponseDataAttributesFacetsObjectString serviceTagsItem) {
    if (this.serviceTags == null) {
      this.serviceTags = new ArrayList<>();
    }
    this.serviceTags.add(serviceTagsItem);
    this.unparsed |= serviceTagsItem.unparsed;
    return this;
  }

  /**
   * <p>Tags with the <code>service</code> tag key.</p>
   * @return serviceTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SERVICE_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getServiceTags() {
        return serviceTags;
      }
  public void setServiceTags(List<SearchSLOResponseDataAttributesFacetsObjectString> serviceTags) {
    this.serviceTags = serviceTags;
  }
  public SearchSLOResponseDataAttributesFacets sloType(List<SearchSLOResponseDataAttributesFacetsObjectInt> sloType) {
    this.sloType = sloType;
    for (SearchSLOResponseDataAttributesFacetsObjectInt item : sloType) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addSloTypeItem(SearchSLOResponseDataAttributesFacetsObjectInt sloTypeItem) {
    if (this.sloType == null) {
      this.sloType = new ArrayList<>();
    }
    this.sloType.add(sloTypeItem);
    this.unparsed |= sloTypeItem.unparsed;
    return this;
  }

  /**
   * <p>Type of SLO.</p>
   * @return sloType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SLO_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectInt> getSloType() {
        return sloType;
      }
  public void setSloType(List<SearchSLOResponseDataAttributesFacetsObjectInt> sloType) {
    this.sloType = sloType;
  }
  public SearchSLOResponseDataAttributesFacets target(List<SearchSLOResponseDataAttributesFacetsObjectInt> target) {
    this.target = target;
    for (SearchSLOResponseDataAttributesFacetsObjectInt item : target) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addTargetItem(SearchSLOResponseDataAttributesFacetsObjectInt targetItem) {
    if (this.target == null) {
      this.target = new ArrayList<>();
    }
    this.target.add(targetItem);
    this.unparsed |= targetItem.unparsed;
    return this;
  }

  /**
   * <p>SLO Target</p>
   * @return target
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TARGET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectInt> getTarget() {
        return target;
      }
  public void setTarget(List<SearchSLOResponseDataAttributesFacetsObjectInt> target) {
    this.target = target;
  }
  public SearchSLOResponseDataAttributesFacets teamTags(List<SearchSLOResponseDataAttributesFacetsObjectString> teamTags) {
    this.teamTags = teamTags;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : teamTags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addTeamTagsItem(SearchSLOResponseDataAttributesFacetsObjectString teamTagsItem) {
    if (this.teamTags == null) {
      this.teamTags = new ArrayList<>();
    }
    this.teamTags.add(teamTagsItem);
    this.unparsed |= teamTagsItem.unparsed;
    return this;
  }

  /**
   * <p>Tags with the <code>team</code> tag key.</p>
   * @return teamTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getTeamTags() {
        return teamTags;
      }
  public void setTeamTags(List<SearchSLOResponseDataAttributesFacetsObjectString> teamTags) {
    this.teamTags = teamTags;
  }
  public SearchSLOResponseDataAttributesFacets timeframe(List<SearchSLOResponseDataAttributesFacetsObjectString> timeframe) {
    this.timeframe = timeframe;
    for (SearchSLOResponseDataAttributesFacetsObjectString item : timeframe) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SearchSLOResponseDataAttributesFacets addTimeframeItem(SearchSLOResponseDataAttributesFacetsObjectString timeframeItem) {
    if (this.timeframe == null) {
      this.timeframe = new ArrayList<>();
    }
    this.timeframe.add(timeframeItem);
    this.unparsed |= timeframeItem.unparsed;
    return this;
  }

  /**
   * <p>Timeframes of SLOs.</p>
   * @return timeframe
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEFRAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SearchSLOResponseDataAttributesFacetsObjectString> getTimeframe() {
        return timeframe;
      }
  public void setTimeframe(List<SearchSLOResponseDataAttributesFacetsObjectString> timeframe) {
    this.timeframe = timeframe;
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
   * @return SearchSLOResponseDataAttributesFacets
   */
  @JsonAnySetter
  public SearchSLOResponseDataAttributesFacets putAdditionalProperty(String key, Object value) {
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
   * Return true if this SearchSLOResponseDataAttributesFacets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOResponseDataAttributesFacets searchSloResponseDataAttributesFacets = (SearchSLOResponseDataAttributesFacets) o;
    return Objects.equals(this.allTags, searchSloResponseDataAttributesFacets.allTags) && Objects.equals(this.creatorName, searchSloResponseDataAttributesFacets.creatorName) && Objects.equals(this.envTags, searchSloResponseDataAttributesFacets.envTags) && Objects.equals(this.serviceTags, searchSloResponseDataAttributesFacets.serviceTags) && Objects.equals(this.sloType, searchSloResponseDataAttributesFacets.sloType) && Objects.equals(this.target, searchSloResponseDataAttributesFacets.target) && Objects.equals(this.teamTags, searchSloResponseDataAttributesFacets.teamTags) && Objects.equals(this.timeframe, searchSloResponseDataAttributesFacets.timeframe) && Objects.equals(this.additionalProperties, searchSloResponseDataAttributesFacets.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allTags,creatorName,envTags,serviceTags,sloType,target,teamTags,timeframe, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOResponseDataAttributesFacets {\n");
    sb.append("    allTags: ").append(toIndentedString(allTags)).append("\n");
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
    sb.append("    envTags: ").append(toIndentedString(envTags)).append("\n");
    sb.append("    serviceTags: ").append(toIndentedString(serviceTags)).append("\n");
    sb.append("    sloType: ").append(toIndentedString(sloType)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    teamTags: ").append(toIndentedString(teamTags)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
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
