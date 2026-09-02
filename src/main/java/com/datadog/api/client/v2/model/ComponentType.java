/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The UI component type. */
@JsonSerialize(using = ComponentType.ComponentTypeSerializer.class)
public class ComponentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "table",
              "textInput",
              "textArea",
              "button",
              "text",
              "select",
              "modal",
              "schemaForm",
              "checkbox",
              "tabs",
              "vegaChart",
              "radioButtons",
              "numberInput",
              "fileInput",
              "jsonInput",
              "gridCell",
              "dateRangePicker",
              "search",
              "container",
              "calloutValue"));

  public static final ComponentType TABLE = new ComponentType("table");
  public static final ComponentType TEXTINPUT = new ComponentType("textInput");
  public static final ComponentType TEXTAREA = new ComponentType("textArea");
  public static final ComponentType BUTTON = new ComponentType("button");
  public static final ComponentType TEXT = new ComponentType("text");
  public static final ComponentType SELECT = new ComponentType("select");
  public static final ComponentType MODAL = new ComponentType("modal");
  public static final ComponentType SCHEMAFORM = new ComponentType("schemaForm");
  public static final ComponentType CHECKBOX = new ComponentType("checkbox");
  public static final ComponentType TABS = new ComponentType("tabs");
  public static final ComponentType VEGACHART = new ComponentType("vegaChart");
  public static final ComponentType RADIOBUTTONS = new ComponentType("radioButtons");
  public static final ComponentType NUMBERINPUT = new ComponentType("numberInput");
  public static final ComponentType FILEINPUT = new ComponentType("fileInput");
  public static final ComponentType JSONINPUT = new ComponentType("jsonInput");
  public static final ComponentType GRIDCELL = new ComponentType("gridCell");
  public static final ComponentType DATERANGEPICKER = new ComponentType("dateRangePicker");
  public static final ComponentType SEARCH = new ComponentType("search");
  public static final ComponentType CONTAINER = new ComponentType("container");
  public static final ComponentType CALLOUTVALUE = new ComponentType("calloutValue");

  ComponentType(String value) {
    super(value, allowedValues);
  }

  public static class ComponentTypeSerializer extends StdSerializer<ComponentType> {
    public ComponentTypeSerializer(Class<ComponentType> t) {
      super(t);
    }

    public ComponentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ComponentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ComponentType fromValue(String value) {
    return new ComponentType(value);
  }
}
