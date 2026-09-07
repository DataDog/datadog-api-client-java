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

/**
 * Action that will trigger a monitor notification if the downtime is in the <code>notify_end_types
 * </code> state.
 */
@JsonSerialize(using = DowntimeNotifyEndStateActions.DowntimeNotifyEndStateActionsSerializer.class)
public class DowntimeNotifyEndStateActions extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("canceled", "expired"));

  public static final DowntimeNotifyEndStateActions CANCELED =
      new DowntimeNotifyEndStateActions("canceled");
  public static final DowntimeNotifyEndStateActions EXPIRED =
      new DowntimeNotifyEndStateActions("expired");

  DowntimeNotifyEndStateActions(String value) {
    super(value, allowedValues);
  }

  public static class DowntimeNotifyEndStateActionsSerializer
      extends StdSerializer<DowntimeNotifyEndStateActions> {
    public DowntimeNotifyEndStateActionsSerializer(Class<DowntimeNotifyEndStateActions> t) {
      super(t);
    }

    public DowntimeNotifyEndStateActionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DowntimeNotifyEndStateActions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DowntimeNotifyEndStateActions fromValue(String value) {
    return new DowntimeNotifyEndStateActions(value);
  }
}
