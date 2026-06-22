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

/** Response payload for listing investigations. */
@JsonPropertyOrder({
  RemediationListInvestigationsResponse.JSON_PROPERTY_INVESTIGATIONS,
  RemediationListInvestigationsResponse.JSON_PROPERTY_NEXT_PAGE_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationListInvestigationsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INVESTIGATIONS = "investigations";
  private List<RemediationInvestigation> investigations = null;

  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "next_page_token";
  private String nextPageToken;

  public RemediationListInvestigationsResponse investigations(
      List<RemediationInvestigation> investigations) {
    this.investigations = investigations;
    for (RemediationInvestigation item : investigations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationListInvestigationsResponse addInvestigationsItem(
      RemediationInvestigation investigationsItem) {
    if (this.investigations == null) {
      this.investigations = new ArrayList<>();
    }
    this.investigations.add(investigationsItem);
    this.unparsed |= investigationsItem.unparsed;
    return this;
  }

  /**
   * The matching investigations.
   *
   * @return investigations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVESTIGATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationInvestigation> getInvestigations() {
    return investigations;
  }

  public void setInvestigations(List<RemediationInvestigation> investigations) {
    this.investigations = investigations;
  }

  public RemediationListInvestigationsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token to pass as page_token on the next call. Empty when there are no further pages.
   *
   * @return nextPageToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
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
   * @return RemediationListInvestigationsResponse
   */
  @JsonAnySetter
  public RemediationListInvestigationsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationListInvestigationsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationListInvestigationsResponse remediationListInvestigationsResponse =
        (RemediationListInvestigationsResponse) o;
    return Objects.equals(this.investigations, remediationListInvestigationsResponse.investigations)
        && Objects.equals(this.nextPageToken, remediationListInvestigationsResponse.nextPageToken)
        && Objects.equals(
            this.additionalProperties, remediationListInvestigationsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investigations, nextPageToken, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationListInvestigationsResponse {\n");
    sb.append("    investigations: ").append(toIndentedString(investigations)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
