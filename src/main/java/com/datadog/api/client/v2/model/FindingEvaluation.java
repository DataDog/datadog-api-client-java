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

/** The evaluation of the finding. */
@JsonSerialize(using = FindingEvaluation.FindingEvaluationSerializer.class)
public class FindingEvaluation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pass", "fail"));

  public static final FindingEvaluation PASS = new FindingEvaluation("pass");
  public static final FindingEvaluation FAIL = new FindingEvaluation("fail");

  FindingEvaluation(String value) {
    super(value, allowedValues);
  }

  public static class FindingEvaluationSerializer extends StdSerializer<FindingEvaluation> {
    public FindingEvaluationSerializer(Class<FindingEvaluation> t) {
      super(t);
    }

    public FindingEvaluationSerializer() {
      this(null);
    }

    @Override
    public void serialize(FindingEvaluation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FindingEvaluation fromValue(String value) {
    return new FindingEvaluation(value);
  }
}
