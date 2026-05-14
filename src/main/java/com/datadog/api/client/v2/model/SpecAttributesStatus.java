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

/** The publication status of the spec. */
@JsonSerialize(using = SpecAttributesStatus.SpecAttributesStatusSerializer.class)
public class SpecAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("published", "draft", "deprecated"));

  public static final SpecAttributesStatus PUBLISHED = new SpecAttributesStatus("published");
  public static final SpecAttributesStatus DRAFT = new SpecAttributesStatus("draft");
  public static final SpecAttributesStatus DEPRECATED = new SpecAttributesStatus("deprecated");

  SpecAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class SpecAttributesStatusSerializer extends StdSerializer<SpecAttributesStatus> {
    public SpecAttributesStatusSerializer(Class<SpecAttributesStatus> t) {
      super(t);
    }

    public SpecAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpecAttributesStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpecAttributesStatus fromValue(String value) {
    return new SpecAttributesStatus(value);
  }
}
