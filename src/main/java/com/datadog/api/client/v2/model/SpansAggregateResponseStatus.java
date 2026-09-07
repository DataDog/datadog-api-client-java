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

/** The status of the response. */
@JsonSerialize(using = SpansAggregateResponseStatus.SpansAggregateResponseStatusSerializer.class)
public class SpansAggregateResponseStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("done", "timeout"));

  public static final SpansAggregateResponseStatus DONE = new SpansAggregateResponseStatus("done");
  public static final SpansAggregateResponseStatus TIMEOUT =
      new SpansAggregateResponseStatus("timeout");

  SpansAggregateResponseStatus(String value) {
    super(value, allowedValues);
  }

  public static class SpansAggregateResponseStatusSerializer
      extends StdSerializer<SpansAggregateResponseStatus> {
    public SpansAggregateResponseStatusSerializer(Class<SpansAggregateResponseStatus> t) {
      super(t);
    }

    public SpansAggregateResponseStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpansAggregateResponseStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansAggregateResponseStatus fromValue(String value) {
    return new SpansAggregateResponseStatus(value);
  }
}
