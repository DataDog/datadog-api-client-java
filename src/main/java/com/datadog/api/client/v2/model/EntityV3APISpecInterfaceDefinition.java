/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The definition of <code>EntityV3APISpecInterfaceDefinition</code> object. */
@JsonPropertyOrder({EntityV3APISpecInterfaceDefinition.JSON_PROPERTY_DEFINITION})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3APISpecInterfaceDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private Object definition;

  public EntityV3APISpecInterfaceDefinition definition(Object definition) {
    this.definition = definition;
    return this;
  }

  /**
   * The API definition.
   *
   * @return definition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getDefinition() {
    return definition;
  }

  public void setDefinition(Object definition) {
    this.definition = definition;
  }

  /** Return true if this EntityV3APISpecInterfaceDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3APISpecInterfaceDefinition entityV3ApiSpecInterfaceDefinition =
        (EntityV3APISpecInterfaceDefinition) o;
    return Objects.equals(this.definition, entityV3ApiSpecInterfaceDefinition.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3APISpecInterfaceDefinition {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
