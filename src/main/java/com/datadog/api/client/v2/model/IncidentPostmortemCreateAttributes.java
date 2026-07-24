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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The postmortem's attributes for a creation request. */
@JsonPropertyOrder({
  IncidentPostmortemCreateAttributes.JSON_PROPERTY_DOCUMENT_URL,
  IncidentPostmortemCreateAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentPostmortemCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOCUMENT_URL = "document_url";
  private String documentUrl;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentPostmortemCreateAttributes() {}

  @JsonCreator
  public IncidentPostmortemCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENT_URL) String documentUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.documentUrl = documentUrl;
    this.title = title;
  }

  public IncidentPostmortemCreateAttributes documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * The URL of the postmortem document (for example, a Datadog notebook, Confluence page, or Google
   * Doc).
   *
   * @return documentUrl
   */
  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public IncidentPostmortemCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the postmortem.
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
   * @return IncidentPostmortemCreateAttributes
   */
  @JsonAnySetter
  public IncidentPostmortemCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentPostmortemCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentPostmortemCreateAttributes incidentPostmortemCreateAttributes =
        (IncidentPostmortemCreateAttributes) o;
    return Objects.equals(this.documentUrl, incidentPostmortemCreateAttributes.documentUrl)
        && Objects.equals(this.title, incidentPostmortemCreateAttributes.title)
        && Objects.equals(
            this.additionalProperties, incidentPostmortemCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentUrl, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentPostmortemCreateAttributes {\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
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
