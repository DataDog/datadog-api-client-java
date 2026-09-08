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

/** A node in the abstract syntax tree of the parsed source code. */
@JsonPropertyOrder({
  AstNode.JSON_PROPERTY_AST_TYPE,
  AstNode.JSON_PROPERTY_CHILDREN,
  AstNode.JSON_PROPERTY_END,
  AstNode.JSON_PROPERTY_FIELD_NAME,
  AstNode.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AstNode {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AST_TYPE = "ast_type";
  private String astType;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<AstNode> children = new ArrayList<>();

  public static final String JSON_PROPERTY_END = "end";
  private AnalysisPosition end;

  public static final String JSON_PROPERTY_FIELD_NAME = "field_name";
  private String fieldName;

  public static final String JSON_PROPERTY_START = "start";
  private AnalysisPosition start;

  public AstNode() {}

  @JsonCreator
  public AstNode(
      @JsonProperty(required = true, value = JSON_PROPERTY_AST_TYPE) String astType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHILDREN) List<AstNode> children,
      @JsonProperty(required = true, value = JSON_PROPERTY_END) AnalysisPosition end,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) AnalysisPosition start) {
    this.astType = astType;
    this.children = children;
    if (children != null) {
      for (AstNode item : children) {
        this.unparsed |= item.unparsed;
      }
    }
    this.end = end;
    this.unparsed |= end.unparsed;
    this.start = start;
    this.unparsed |= start.unparsed;
  }

  public AstNode astType(String astType) {
    this.astType = astType;
    return this;
  }

  /**
   * The tree-sitter node type of this AST node.
   *
   * @return astType
   */
  @JsonProperty(JSON_PROPERTY_AST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAstType() {
    return astType;
  }

  public void setAstType(String astType) {
    this.astType = astType;
  }

  public AstNode children(List<AstNode> children) {
    this.children = children;
    for (AstNode item : children) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AstNode addChildrenItem(AstNode childrenItem) {
    this.children.add(childrenItem);
    this.unparsed |= childrenItem.unparsed;
    return this;
  }

  /**
   * The child nodes of this AST node, or null for a leaf node.
   *
   * @return children
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AstNode> getChildren() {
    return children;
  }

  public void setChildren(List<AstNode> children) {
    this.children = children;
    if (children != null) {
      for (AstNode item : children) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AstNode end(AnalysisPosition end) {
    this.end = end;
    this.unparsed |= end.unparsed;
    return this;
  }

  /**
   * A position in source code, identified by line and column numbers.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnalysisPosition getEnd() {
    return end;
  }

  public void setEnd(AnalysisPosition end) {
    this.end = end;
    if (end != null) {
      this.unparsed |= end.unparsed;
    }
  }

  public AstNode fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The name of the field this node occupies within its parent node, when the parent addresses it
   * by name.
   *
   * @return fieldName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public AstNode start(AnalysisPosition start) {
    this.start = start;
    this.unparsed |= start.unparsed;
    return this;
  }

  /**
   * A position in source code, identified by line and column numbers.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnalysisPosition getStart() {
    return start;
  }

  public void setStart(AnalysisPosition start) {
    this.start = start;
    if (start != null) {
      this.unparsed |= start.unparsed;
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
   * @return AstNode
   */
  @JsonAnySetter
  public AstNode putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AstNode object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AstNode astNode = (AstNode) o;
    return Objects.equals(this.astType, astNode.astType)
        && Objects.equals(this.children, astNode.children)
        && Objects.equals(this.end, astNode.end)
        && Objects.equals(this.fieldName, astNode.fieldName)
        && Objects.equals(this.start, astNode.start)
        && Objects.equals(this.additionalProperties, astNode.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(astType, children, end, fieldName, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AstNode {\n");
    sb.append("    astType: ").append(toIndentedString(astType)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
