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

/** On-Call Page urgency level. */
@JsonSerialize(using = PageUrgency.PageUrgencySerializer.class)
public class PageUrgency extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "high"));

  public static final PageUrgency LOW = new PageUrgency("low");
  public static final PageUrgency HIGH = new PageUrgency("high");

  PageUrgency(String value) {
    super(value, allowedValues);
  }

  public static class PageUrgencySerializer extends StdSerializer<PageUrgency> {
    public PageUrgencySerializer(Class<PageUrgency> t) {
      super(t);
    }

    public PageUrgencySerializer() {
      this(null);
    }

    @Override
    public void serialize(PageUrgency value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PageUrgency fromValue(String value) {
    return new PageUrgency(value);
  }
}
