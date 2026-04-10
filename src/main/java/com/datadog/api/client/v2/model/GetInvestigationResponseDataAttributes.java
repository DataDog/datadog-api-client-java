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

/** Attributes of the investigation. */
@JsonPropertyOrder({
  GetInvestigationResponseDataAttributes.JSON_PROPERTY_CONCLUSIONS,
  GetInvestigationResponseDataAttributes.JSON_PROPERTY_STATUS,
  GetInvestigationResponseDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetInvestigationResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONCLUSIONS = "conclusions";
  private List<InvestigationConclusion> conclusions = new ArrayList<>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public GetInvestigationResponseDataAttributes() {}

  @JsonCreator
  public GetInvestigationResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONCLUSIONS)
          List<InvestigationConclusion> conclusions,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.conclusions = conclusions;
    this.status = status;
    this.title = title;
  }

  public GetInvestigationResponseDataAttributes conclusions(
      List<InvestigationConclusion> conclusions) {
    this.conclusions = conclusions;
    for (InvestigationConclusion item : conclusions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GetInvestigationResponseDataAttributes addConclusionsItem(
      InvestigationConclusion conclusionsItem) {
    this.conclusions.add(conclusionsItem);
    this.unparsed |= conclusionsItem.unparsed;
    return this;
  }

  /**
   * The conclusions drawn from the investigation.
   *
   * @return conclusions
   */
  @JsonProperty(JSON_PROPERTY_CONCLUSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<InvestigationConclusion> getConclusions() {
    return conclusions;
  }

  public void setConclusions(List<InvestigationConclusion> conclusions) {
    this.conclusions = conclusions;
  }

  public GetInvestigationResponseDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the investigation.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetInvestigationResponseDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the investigation.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return GetInvestigationResponseDataAttributes
   */
  @JsonAnySetter
  public GetInvestigationResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GetInvestigationResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvestigationResponseDataAttributes getInvestigationResponseDataAttributes =
        (GetInvestigationResponseDataAttributes) o;
    return Objects.equals(this.conclusions, getInvestigationResponseDataAttributes.conclusions)
        && Objects.equals(this.status, getInvestigationResponseDataAttributes.status)
        && Objects.equals(this.title, getInvestigationResponseDataAttributes.title)
        && Objects.equals(
            this.additionalProperties, getInvestigationResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusions, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvestigationResponseDataAttributes {\n");
    sb.append("    conclusions: ").append(toIndentedString(conclusions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
