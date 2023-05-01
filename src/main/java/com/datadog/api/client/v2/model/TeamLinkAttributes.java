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

/** Team link attributes */
@JsonPropertyOrder({
  TeamLinkAttributes.JSON_PROPERTY_LABEL,
  TeamLinkAttributes.JSON_PROPERTY_POSITION,
  TeamLinkAttributes.JSON_PROPERTY_TEAM_ID,
  TeamLinkAttributes.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamLinkAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public TeamLinkAttributes() {}

  @JsonCreator
  public TeamLinkAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL) String label,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.label = label;
    this.url = url;
  }

  public TeamLinkAttributes label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The link's label
   *
   * @return label
   */
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public TeamLinkAttributes position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * The link's position, used to sort links for the team maximum: 2147483647
   *
   * @return position
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * ID of the team the link is associated with
   *
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeamId() {
    return teamId;
  }

  public TeamLinkAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL for the link
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this TeamLinkAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamLinkAttributes teamLinkAttributes = (TeamLinkAttributes) o;
    return Objects.equals(this.label, teamLinkAttributes.label)
        && Objects.equals(this.position, teamLinkAttributes.position)
        && Objects.equals(this.teamId, teamLinkAttributes.teamId)
        && Objects.equals(this.url, teamLinkAttributes.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, position, teamId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamLinkAttributes {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
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
