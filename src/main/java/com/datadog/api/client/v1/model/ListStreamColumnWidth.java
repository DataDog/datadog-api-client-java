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

/** Widget column width. */
@JsonSerialize(using = ListStreamColumnWidth.ListStreamColumnWidthSerializer.class)
public class ListStreamColumnWidth extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full"));

  public static final ListStreamColumnWidth AUTO = new ListStreamColumnWidth("auto");
  public static final ListStreamColumnWidth COMPACT = new ListStreamColumnWidth("compact");
  public static final ListStreamColumnWidth FULL = new ListStreamColumnWidth("full");

  ListStreamColumnWidth(String value) {
    super(value, allowedValues);
  }

  public static class ListStreamColumnWidthSerializer extends StdSerializer<ListStreamColumnWidth> {
    public ListStreamColumnWidthSerializer(Class<ListStreamColumnWidth> t) {
      super(t);
    }

    public ListStreamColumnWidthSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListStreamColumnWidth value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListStreamColumnWidth fromValue(String value) {
    return new ListStreamColumnWidth(value);
  }
}
