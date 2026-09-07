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
 * Lifecycle state of a DDSQL tabular query response. <code>running</code> means the query is still
 * executing and the client should poll the fetch endpoint with the returned <code>query_id</code>.
 * <code>completed</code> means the result set is inlined in <code>columns</code> and no further
 * polling is required.
 */
@JsonSerialize(using = DdsqlTabularQueryState.DdsqlTabularQueryStateSerializer.class)
public class DdsqlTabularQueryState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("running", "completed"));

  public static final DdsqlTabularQueryState RUNNING = new DdsqlTabularQueryState("running");
  public static final DdsqlTabularQueryState COMPLETED = new DdsqlTabularQueryState("completed");

  DdsqlTabularQueryState(String value) {
    super(value, allowedValues);
  }

  public static class DdsqlTabularQueryStateSerializer
      extends StdSerializer<DdsqlTabularQueryState> {
    public DdsqlTabularQueryStateSerializer(Class<DdsqlTabularQueryState> t) {
      super(t);
    }

    public DdsqlTabularQueryStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DdsqlTabularQueryState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DdsqlTabularQueryState fromValue(String value) {
    return new DdsqlTabularQueryState(value);
  }
}
