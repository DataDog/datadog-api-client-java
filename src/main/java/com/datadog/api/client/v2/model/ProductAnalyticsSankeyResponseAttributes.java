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

/** */
@JsonPropertyOrder({
  ProductAnalyticsSankeyResponseAttributes.JSON_PROPERTY_LINKS,
  ProductAnalyticsSankeyResponseAttributes.JSON_PROPERTY_NODES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LINKS = "links";
  private List<ProductAnalyticsSankeyLink> links = null;

  public static final String JSON_PROPERTY_NODES = "nodes";
  private List<ProductAnalyticsSankeyNode> nodes = null;

  public ProductAnalyticsSankeyResponseAttributes links(List<ProductAnalyticsSankeyLink> links) {
    this.links = links;
    for (ProductAnalyticsSankeyLink item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsSankeyResponseAttributes addLinksItem(
      ProductAnalyticsSankeyLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * The links (flows) between nodes.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsSankeyLink> getLinks() {
    return links;
  }

  public void setLinks(List<ProductAnalyticsSankeyLink> links) {
    this.links = links;
  }

  public ProductAnalyticsSankeyResponseAttributes nodes(List<ProductAnalyticsSankeyNode> nodes) {
    this.nodes = nodes;
    for (ProductAnalyticsSankeyNode item : nodes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsSankeyResponseAttributes addNodesItem(
      ProductAnalyticsSankeyNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    this.unparsed |= nodesItem.unparsed;
    return this;
  }

  /**
   * The nodes (pages) in the Sankey diagram.
   *
   * @return nodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsSankeyNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<ProductAnalyticsSankeyNode> nodes) {
    this.nodes = nodes;
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
   * @return ProductAnalyticsSankeyResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyResponseAttributes productAnalyticsSankeyResponseAttributes =
        (ProductAnalyticsSankeyResponseAttributes) o;
    return Objects.equals(this.links, productAnalyticsSankeyResponseAttributes.links)
        && Objects.equals(this.nodes, productAnalyticsSankeyResponseAttributes.nodes)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsSankeyResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, nodes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyResponseAttributes {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
