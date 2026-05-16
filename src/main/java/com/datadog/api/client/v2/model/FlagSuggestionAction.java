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

/** The type of change action for a suggestion. */
@JsonSerialize(using = FlagSuggestionAction.FlagSuggestionActionSerializer.class)
public class FlagSuggestionAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "created",
              "updated",
              "deleted",
              "archived",
              "unarchived",
              "started",
              "stopped",
              "paused",
              "unpaused"));

  public static final FlagSuggestionAction CREATED = new FlagSuggestionAction("created");
  public static final FlagSuggestionAction UPDATED = new FlagSuggestionAction("updated");
  public static final FlagSuggestionAction DELETED = new FlagSuggestionAction("deleted");
  public static final FlagSuggestionAction ARCHIVED = new FlagSuggestionAction("archived");
  public static final FlagSuggestionAction UNARCHIVED = new FlagSuggestionAction("unarchived");
  public static final FlagSuggestionAction STARTED = new FlagSuggestionAction("started");
  public static final FlagSuggestionAction STOPPED = new FlagSuggestionAction("stopped");
  public static final FlagSuggestionAction PAUSED = new FlagSuggestionAction("paused");
  public static final FlagSuggestionAction UNPAUSED = new FlagSuggestionAction("unpaused");

  FlagSuggestionAction(String value) {
    super(value, allowedValues);
  }

  public static class FlagSuggestionActionSerializer extends StdSerializer<FlagSuggestionAction> {
    public FlagSuggestionActionSerializer(Class<FlagSuggestionAction> t) {
      super(t);
    }

    public FlagSuggestionActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FlagSuggestionAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FlagSuggestionAction fromValue(String value) {
    return new FlagSuggestionAction(value);
  }
}
