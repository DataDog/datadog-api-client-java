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

/** The primary color of the form theme. */
@JsonSerialize(
    using = FormUiDefinitionUiThemePrimaryColor.FormUiDefinitionUiThemePrimaryColorSerializer.class)
public class FormUiDefinitionUiThemePrimaryColor extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "gray",
              "red",
              "orange",
              "yellow",
              "green",
              "light-blue",
              "dark-blue",
              "magenta",
              "indigo"));

  public static final FormUiDefinitionUiThemePrimaryColor GRAY =
      new FormUiDefinitionUiThemePrimaryColor("gray");
  public static final FormUiDefinitionUiThemePrimaryColor RED =
      new FormUiDefinitionUiThemePrimaryColor("red");
  public static final FormUiDefinitionUiThemePrimaryColor ORANGE =
      new FormUiDefinitionUiThemePrimaryColor("orange");
  public static final FormUiDefinitionUiThemePrimaryColor YELLOW =
      new FormUiDefinitionUiThemePrimaryColor("yellow");
  public static final FormUiDefinitionUiThemePrimaryColor GREEN =
      new FormUiDefinitionUiThemePrimaryColor("green");
  public static final FormUiDefinitionUiThemePrimaryColor LIGHT_BLUE =
      new FormUiDefinitionUiThemePrimaryColor("light-blue");
  public static final FormUiDefinitionUiThemePrimaryColor DARK_BLUE =
      new FormUiDefinitionUiThemePrimaryColor("dark-blue");
  public static final FormUiDefinitionUiThemePrimaryColor MAGENTA =
      new FormUiDefinitionUiThemePrimaryColor("magenta");
  public static final FormUiDefinitionUiThemePrimaryColor INDIGO =
      new FormUiDefinitionUiThemePrimaryColor("indigo");

  FormUiDefinitionUiThemePrimaryColor(String value) {
    super(value, allowedValues);
  }

  public static class FormUiDefinitionUiThemePrimaryColorSerializer
      extends StdSerializer<FormUiDefinitionUiThemePrimaryColor> {
    public FormUiDefinitionUiThemePrimaryColorSerializer(
        Class<FormUiDefinitionUiThemePrimaryColor> t) {
      super(t);
    }

    public FormUiDefinitionUiThemePrimaryColorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormUiDefinitionUiThemePrimaryColor value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormUiDefinitionUiThemePrimaryColor fromValue(String value) {
    return new FormUiDefinitionUiThemePrimaryColor(value);
  }
}
