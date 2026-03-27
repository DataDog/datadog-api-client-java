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

/** Rum replay session resource type. */
@JsonSerialize(
    using = ViewershipHistorySessionDataType.ViewershipHistorySessionDataTypeSerializer.class)
public class ViewershipHistorySessionDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_replay_session"));

  public static final ViewershipHistorySessionDataType RUM_REPLAY_SESSION =
      new ViewershipHistorySessionDataType("rum_replay_session");

  ViewershipHistorySessionDataType(String value) {
    super(value, allowedValues);
  }

  public static class ViewershipHistorySessionDataTypeSerializer
      extends StdSerializer<ViewershipHistorySessionDataType> {
    public ViewershipHistorySessionDataTypeSerializer(Class<ViewershipHistorySessionDataType> t) {
      super(t);
    }

    public ViewershipHistorySessionDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ViewershipHistorySessionDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ViewershipHistorySessionDataType fromValue(String value) {
    return new ViewershipHistorySessionDataType(value);
  }
}
