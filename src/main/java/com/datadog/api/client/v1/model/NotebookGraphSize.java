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

/** The size of the graph. */
@JsonSerialize(using = NotebookGraphSize.NotebookGraphSizeSerializer.class)
public class NotebookGraphSize extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("xs", "s", "m", "l", "xl"));

  public static final NotebookGraphSize EXTRA_SMALL = new NotebookGraphSize("xs");
  public static final NotebookGraphSize SMALL = new NotebookGraphSize("s");
  public static final NotebookGraphSize MEDIUM = new NotebookGraphSize("m");
  public static final NotebookGraphSize LARGE = new NotebookGraphSize("l");
  public static final NotebookGraphSize EXTRA_LARGE = new NotebookGraphSize("xl");

  NotebookGraphSize(String value) {
    super(value, allowedValues);
  }

  public static class NotebookGraphSizeSerializer extends StdSerializer<NotebookGraphSize> {
    public NotebookGraphSizeSerializer(Class<NotebookGraphSize> t) {
      super(t);
    }

    public NotebookGraphSizeSerializer() {
      this(null);
    }

    @Override
    public void serialize(NotebookGraphSize value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NotebookGraphSize fromValue(String value) {
    return new NotebookGraphSize(value);
  }
}
