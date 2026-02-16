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
 * JSON:API type for coverage summary response. The value must always be <code>
 * ci_app_coverage_summary</code>.
 */
@JsonSerialize(using = CoverageSummaryType.CoverageSummaryTypeSerializer.class)
public class CoverageSummaryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("ci_app_coverage_summary"));

  public static final CoverageSummaryType CI_APP_COVERAGE_SUMMARY =
      new CoverageSummaryType("ci_app_coverage_summary");

  CoverageSummaryType(String value) {
    super(value, allowedValues);
  }

  public static class CoverageSummaryTypeSerializer extends StdSerializer<CoverageSummaryType> {
    public CoverageSummaryTypeSerializer(Class<CoverageSummaryType> t) {
      super(t);
    }

    public CoverageSummaryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CoverageSummaryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CoverageSummaryType fromValue(String value) {
    return new CoverageSummaryType(value);
  }
}
