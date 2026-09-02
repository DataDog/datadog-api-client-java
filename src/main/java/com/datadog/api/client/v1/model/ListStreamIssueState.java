/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Issue state filter for the <code>issue_stream</code> data source. */
@JsonSerialize(using = ListStreamIssueState.ListStreamIssueStateSerializer.class)
public class ListStreamIssueState extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("OPEN", "IGNORED", "ACKNOWLEDGED", "RESOLVED"));

  public static final ListStreamIssueState OPEN = new ListStreamIssueState("OPEN");
  public static final ListStreamIssueState IGNORED = new ListStreamIssueState("IGNORED");
  public static final ListStreamIssueState ACKNOWLEDGED = new ListStreamIssueState("ACKNOWLEDGED");
  public static final ListStreamIssueState RESOLVED = new ListStreamIssueState("RESOLVED");

  ListStreamIssueState(String value) {
    super(value, allowedValues);
  }

  public static class ListStreamIssueStateSerializer extends StdSerializer<ListStreamIssueState> {
    public ListStreamIssueStateSerializer(Class<ListStreamIssueState> t) {
      super(t);
    }

    public ListStreamIssueStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListStreamIssueState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListStreamIssueState fromValue(String value) {
    return new ListStreamIssueState(value);
  }
}
