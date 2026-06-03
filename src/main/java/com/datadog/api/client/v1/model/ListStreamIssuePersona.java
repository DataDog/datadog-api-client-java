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

/** Persona filter for the <code>issue_stream</code> data source. */
@JsonSerialize(using = ListStreamIssuePersona.ListStreamIssuePersonaSerializer.class)
public class ListStreamIssuePersona extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("all", "browser", "mobile", "backend"));

  public static final ListStreamIssuePersona ALL = new ListStreamIssuePersona("all");
  public static final ListStreamIssuePersona BROWSER = new ListStreamIssuePersona("browser");
  public static final ListStreamIssuePersona MOBILE = new ListStreamIssuePersona("mobile");
  public static final ListStreamIssuePersona BACKEND = new ListStreamIssuePersona("backend");

  ListStreamIssuePersona(String value) {
    super(value, allowedValues);
  }

  public static class ListStreamIssuePersonaSerializer
      extends StdSerializer<ListStreamIssuePersona> {
    public ListStreamIssuePersonaSerializer(Class<ListStreamIssuePersona> t) {
      super(t);
    }

    public ListStreamIssuePersonaSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListStreamIssuePersona value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListStreamIssuePersona fromValue(String value) {
    return new ListStreamIssuePersona(value);
  }
}
