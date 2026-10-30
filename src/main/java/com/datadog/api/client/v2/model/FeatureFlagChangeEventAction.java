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

/** The kind of change. */
@JsonSerialize(using = FeatureFlagChangeEventAction.FeatureFlagChangeEventActionSerializer.class)
public class FeatureFlagChangeEventAction extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "created",
              "updated",
              "deleted",
              "archived",
              "unarchived",
              "scheduled",
              "started",
              "paused",
              "unpaused",
              "stopped"));

  public static final FeatureFlagChangeEventAction CREATED =
      new FeatureFlagChangeEventAction("created");
  public static final FeatureFlagChangeEventAction UPDATED =
      new FeatureFlagChangeEventAction("updated");
  public static final FeatureFlagChangeEventAction DELETED =
      new FeatureFlagChangeEventAction("deleted");
  public static final FeatureFlagChangeEventAction ARCHIVED =
      new FeatureFlagChangeEventAction("archived");
  public static final FeatureFlagChangeEventAction UNARCHIVED =
      new FeatureFlagChangeEventAction("unarchived");
  public static final FeatureFlagChangeEventAction SCHEDULED =
      new FeatureFlagChangeEventAction("scheduled");
  public static final FeatureFlagChangeEventAction STARTED =
      new FeatureFlagChangeEventAction("started");
  public static final FeatureFlagChangeEventAction PAUSED =
      new FeatureFlagChangeEventAction("paused");
  public static final FeatureFlagChangeEventAction UNPAUSED =
      new FeatureFlagChangeEventAction("unpaused");
  public static final FeatureFlagChangeEventAction STOPPED =
      new FeatureFlagChangeEventAction("stopped");

  FeatureFlagChangeEventAction(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventActionSerializer
      extends StdSerializer<FeatureFlagChangeEventAction> {
    public FeatureFlagChangeEventActionSerializer(Class<FeatureFlagChangeEventAction> t) {
      super(t);
    }

    public FeatureFlagChangeEventActionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventAction value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventAction fromValue(String value) {
    return new FeatureFlagChangeEventAction(value);
  }
}
