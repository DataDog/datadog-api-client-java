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

/** The vulnerability status. */
@JsonSerialize(using = Status.StatusSerializer.class)
public class Status extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("Open", "Muted", "Remediated", "InProgress", "AutoClosed"));

  public static final Status OPEN = new Status("Open");
  public static final Status MUTED = new Status("Muted");
  public static final Status REMEDIATED = new Status("Remediated");
  public static final Status INPROGRESS = new Status("InProgress");
  public static final Status AUTOCLOSED = new Status("AutoClosed");

  Status(String value) {
    super(value, allowedValues);
  }

  public static class StatusSerializer extends StdSerializer<Status> {
    public StatusSerializer(Class<Status> t) {
      super(t);
    }

    public StatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(Status value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Status fromValue(String value) {
    return new Status(value);
  }
}
