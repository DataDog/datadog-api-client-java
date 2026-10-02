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

/** Statistical method used to calculate the experiment results. */
@JsonSerialize(
    using =
        ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
            .ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethodSerializer.class)
public class ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("Sequential", "FixedSample", "Bayesian", "SequentialFixedHybrid"));

  public static final ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
      SEQUENTIAL =
          new ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod("Sequential");
  public static final ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
      FIXEDSAMPLE =
          new ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod("FixedSample");
  public static final ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod BAYESIAN =
      new ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod("Bayesian");
  public static final ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod
      SEQUENTIALFIXEDHYBRID =
          new ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod(
              "SequentialFixedHybrid");

  ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethodSerializer
      extends StdSerializer<ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod> {
    public ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethodSerializer(
        Class<ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod> t) {
      super(t);
    }

    public ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod fromValue(
      String value) {
    return new ExperimentsAnalysisPlanV2DTODataAttributesConfidenceIntervalMethod(value);
  }
}
