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

/** State of the issue */
@JsonSerialize(using = IssueState.IssueStateSerializer.class)
public class IssueState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OPEN", "ACKNOWLEDGED", "RESOLVED", "IGNORED", "EXCLUDED"));

  public static final IssueState OPEN = new IssueState("OPEN");
  public static final IssueState ACKNOWLEDGED = new IssueState("ACKNOWLEDGED");
  public static final IssueState RESOLVED = new IssueState("RESOLVED");
  public static final IssueState IGNORED = new IssueState("IGNORED");
  public static final IssueState EXCLUDED = new IssueState("EXCLUDED");

  IssueState(String value) {
    super(value, allowedValues);
  }

  public static class IssueStateSerializer extends StdSerializer<IssueState> {
    public IssueStateSerializer(Class<IssueState> t) {
      super(t);
    }

    public IssueStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueState fromValue(String value) {
    return new IssueState(value);
  }
}
