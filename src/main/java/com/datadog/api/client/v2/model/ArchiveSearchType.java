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

/** Archive Search resource type. */
@JsonSerialize(using = ArchiveSearchType.ArchiveSearchTypeSerializer.class)
public class ArchiveSearchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("archive_search"));

  public static final ArchiveSearchType ARCHIVE_SEARCH = new ArchiveSearchType("archive_search");

  ArchiveSearchType(String value) {
    super(value, allowedValues);
  }

  public static class ArchiveSearchTypeSerializer extends StdSerializer<ArchiveSearchType> {
    public ArchiveSearchTypeSerializer(Class<ArchiveSearchType> t) {
      super(t);
    }

    public ArchiveSearchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ArchiveSearchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ArchiveSearchType fromValue(String value) {
    return new ArchiveSearchType(value);
  }
}
