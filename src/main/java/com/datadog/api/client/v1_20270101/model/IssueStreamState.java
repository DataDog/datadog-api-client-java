/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = IssueStreamState.IssueStreamStateSerializer.class)
public class IssueStreamState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("OPEN", "RESOLVED", "IGNORED", "EXCLUDED", "IN_PROGRESS", "ACKNOWLEDGED"));

  public static final IssueStreamState OPEN = new IssueStreamState("OPEN");
  public static final IssueStreamState RESOLVED = new IssueStreamState("RESOLVED");
  public static final IssueStreamState IGNORED = new IssueStreamState("IGNORED");
  public static final IssueStreamState EXCLUDED = new IssueStreamState("EXCLUDED");
  public static final IssueStreamState IN_PROGRESS = new IssueStreamState("IN_PROGRESS");
  public static final IssueStreamState ACKNOWLEDGED = new IssueStreamState("ACKNOWLEDGED");

  IssueStreamState(String value) {
    super(value, allowedValues);
  }

  public static class IssueStreamStateSerializer extends StdSerializer<IssueStreamState> {
    public IssueStreamStateSerializer(Class<IssueStreamState> t) {
      super(t);
    }

    public IssueStreamStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueStreamState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueStreamState fromValue(String value) {
    return new IssueStreamState(value);
  }
}
