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

/** Assessment result for a label value. */
@JsonSerialize(using = LLMObsAnnotationAssessment.LLMObsAnnotationAssessmentSerializer.class)
public class LLMObsAnnotationAssessment extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pass", "fail"));

  public static final LLMObsAnnotationAssessment PASS = new LLMObsAnnotationAssessment("pass");
  public static final LLMObsAnnotationAssessment FAIL = new LLMObsAnnotationAssessment("fail");

  LLMObsAnnotationAssessment(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsAnnotationAssessmentSerializer
      extends StdSerializer<LLMObsAnnotationAssessment> {
    public LLMObsAnnotationAssessmentSerializer(Class<LLMObsAnnotationAssessment> t) {
      super(t);
    }

    public LLMObsAnnotationAssessmentSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsAnnotationAssessment value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsAnnotationAssessment fromValue(String value) {
    return new LLMObsAnnotationAssessment(value);
  }
}
