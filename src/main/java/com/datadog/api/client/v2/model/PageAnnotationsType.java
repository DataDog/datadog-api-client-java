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

/** Page annotations resource type. */
@JsonSerialize(using = PageAnnotationsType.PageAnnotationsTypeSerializer.class)
public class PageAnnotationsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("page_annotations"));

  public static final PageAnnotationsType PAGE_ANNOTATIONS =
      new PageAnnotationsType("page_annotations");

  PageAnnotationsType(String value) {
    super(value, allowedValues);
  }

  public static class PageAnnotationsTypeSerializer extends StdSerializer<PageAnnotationsType> {
    public PageAnnotationsTypeSerializer(Class<PageAnnotationsType> t) {
      super(t);
    }

    public PageAnnotationsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PageAnnotationsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PageAnnotationsType fromValue(String value) {
    return new PageAnnotationsType(value);
  }
}
