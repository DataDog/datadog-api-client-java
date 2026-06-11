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

/** Relationship to the user authorized clients for this org authorized client. */
@JsonPropertyOrder({
  OrgAuthorizedClientRelationshipUserAuthorizedClients.JSON_PROPERTY_DATA,
  OrgAuthorizedClientRelationshipUserAuthorizedClients.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgAuthorizedClientRelationshipUserAuthorizedClients {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<OrgAuthorizedClientRelationshipUserAuthorizedClientsData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private OrgAuthorizedClientRelationshipUserAuthorizedClientsLinks links;

  public OrgAuthorizedClientRelationshipUserAuthorizedClients() {}

  @JsonCreator
  public OrgAuthorizedClientRelationshipUserAuthorizedClients(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<OrgAuthorizedClientRelationshipUserAuthorizedClientsData> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_LINKS)
          OrgAuthorizedClientRelationshipUserAuthorizedClientsLinks links) {
    this.data = data;
    this.links = links;
    this.unparsed |= links.unparsed;
  }

  public OrgAuthorizedClientRelationshipUserAuthorizedClients data(
      List<OrgAuthorizedClientRelationshipUserAuthorizedClientsData> data) {
    this.data = data;
    for (OrgAuthorizedClientRelationshipUserAuthorizedClientsData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OrgAuthorizedClientRelationshipUserAuthorizedClients addDataItem(
      OrgAuthorizedClientRelationshipUserAuthorizedClientsData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of user authorized client relationship data objects.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OrgAuthorizedClientRelationshipUserAuthorizedClientsData> getData() {
    return data;
  }

  public void setData(List<OrgAuthorizedClientRelationshipUserAuthorizedClientsData> data) {
    this.data = data;
  }

  public OrgAuthorizedClientRelationshipUserAuthorizedClients links(
      OrgAuthorizedClientRelationshipUserAuthorizedClientsLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links for the user authorized clients relationship.
   *
   * @return links
   */
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrgAuthorizedClientRelationshipUserAuthorizedClientsLinks getLinks() {
    return links;
  }

  public void setLinks(OrgAuthorizedClientRelationshipUserAuthorizedClientsLinks links) {
    this.links = links;
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
   * @return OrgAuthorizedClientRelationshipUserAuthorizedClients
   */
  @JsonAnySetter
  public OrgAuthorizedClientRelationshipUserAuthorizedClients putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this OrgAuthorizedClientRelationshipUserAuthorizedClients object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAuthorizedClientRelationshipUserAuthorizedClients
        orgAuthorizedClientRelationshipUserAuthorizedClients =
            (OrgAuthorizedClientRelationshipUserAuthorizedClients) o;
    return Objects.equals(this.data, orgAuthorizedClientRelationshipUserAuthorizedClients.data)
        && Objects.equals(this.links, orgAuthorizedClientRelationshipUserAuthorizedClients.links)
        && Objects.equals(
            this.additionalProperties,
            orgAuthorizedClientRelationshipUserAuthorizedClients.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAuthorizedClientRelationshipUserAuthorizedClients {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
