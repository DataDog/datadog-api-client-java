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

/**
 * Kind of annotation. <code>pointInTime</code> annotations mark a single moment in time, while
 * <code>timeRegion</code> annotations span a window of time and require an <code>end_time</code>.
 */
@JsonSerialize(using = AnnotationKind.AnnotationKindSerializer.class)
public class AnnotationKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pointInTime", "timeRegion"));

  public static final AnnotationKind POINT_IN_TIME = new AnnotationKind("pointInTime");
  public static final AnnotationKind TIME_REGION = new AnnotationKind("timeRegion");

  AnnotationKind(String value) {
    super(value, allowedValues);
  }

  public static class AnnotationKindSerializer extends StdSerializer<AnnotationKind> {
    public AnnotationKindSerializer(Class<AnnotationKind> t) {
      super(t);
    }

    public AnnotationKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(AnnotationKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AnnotationKind fromValue(String value) {
    return new AnnotationKind(value);
  }
}
