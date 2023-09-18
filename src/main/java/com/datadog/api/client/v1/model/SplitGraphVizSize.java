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

/** Size of the individual graphs in the split. */
@JsonSerialize(using = SplitGraphVizSize.SplitGraphVizSizeSerializer.class)
public class SplitGraphVizSize extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("xs", "sm", "md", "lg"));

  public static final SplitGraphVizSize XS = new SplitGraphVizSize("xs");
  public static final SplitGraphVizSize SM = new SplitGraphVizSize("sm");
  public static final SplitGraphVizSize MD = new SplitGraphVizSize("md");
  public static final SplitGraphVizSize LG = new SplitGraphVizSize("lg");

  SplitGraphVizSize(String value) {
    super(value, allowedValues);
  }

  public static class SplitGraphVizSizeSerializer extends StdSerializer<SplitGraphVizSize> {
    public SplitGraphVizSizeSerializer(Class<SplitGraphVizSize> t) {
      super(t);
    }

    public SplitGraphVizSizeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SplitGraphVizSize value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SplitGraphVizSize fromValue(String value) {
    return new SplitGraphVizSize(value);
  }
}
