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

/** The triggering action for the event. */
@JsonSerialize(using = AppBuilderEventName.AppBuilderEventNameSerializer.class)
public class AppBuilderEventName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "pageChange",
              "tableRowClick",
              "_tableRowButtonClick",
              "change",
              "submit",
              "click",
              "toggleOpen",
              "close",
              "open",
              "executionFinished"));

  public static final AppBuilderEventName PAGECHANGE = new AppBuilderEventName("pageChange");
  public static final AppBuilderEventName TABLEROWCLICK = new AppBuilderEventName("tableRowClick");
  public static final AppBuilderEventName TABLEROWBUTTONCLICK =
      new AppBuilderEventName("_tableRowButtonClick");
  public static final AppBuilderEventName CHANGE = new AppBuilderEventName("change");
  public static final AppBuilderEventName SUBMIT = new AppBuilderEventName("submit");
  public static final AppBuilderEventName CLICK = new AppBuilderEventName("click");
  public static final AppBuilderEventName TOGGLEOPEN = new AppBuilderEventName("toggleOpen");
  public static final AppBuilderEventName CLOSE = new AppBuilderEventName("close");
  public static final AppBuilderEventName OPEN = new AppBuilderEventName("open");
  public static final AppBuilderEventName EXECUTIONFINISHED =
      new AppBuilderEventName("executionFinished");

  AppBuilderEventName(String value) {
    super(value, allowedValues);
  }

  public static class AppBuilderEventNameSerializer extends StdSerializer<AppBuilderEventName> {
    public AppBuilderEventNameSerializer(Class<AppBuilderEventName> t) {
      super(t);
    }

    public AppBuilderEventNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AppBuilderEventName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AppBuilderEventName fromValue(String value) {
    return new AppBuilderEventName(value);
  }
}
