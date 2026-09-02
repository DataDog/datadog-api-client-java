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
 * The type of Datadog resource linked to the case as contextual evidence. Each type corresponds to
 * a different Datadog product signal (for example, a security finding, a monitor alert, or an
 * incident).
 */
@JsonSerialize(using = CaseInsightType.CaseInsightTypeSerializer.class)
public class CaseInsightType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "SECURITY_SIGNAL",
              "MONITOR",
              "EVENT_CORRELATION",
              "ERROR_TRACKING",
              "CLOUD_COST_RECOMMENDATION",
              "INCIDENT",
              "SENSITIVE_DATA_SCANNER_ISSUE",
              "EVENT",
              "WATCHDOG_STORY",
              "WIDGET",
              "SECURITY_FINDING",
              "INSIGHT_SCORECARD_CAMPAIGN",
              "RESOURCE_POLICY",
              "APM_RECOMMENDATION",
              "SCM_URL",
              "PROFILING_DOWNSIZING_EXPERIMENT"));

  public static final CaseInsightType SECURITY_SIGNAL = new CaseInsightType("SECURITY_SIGNAL");
  public static final CaseInsightType MONITOR = new CaseInsightType("MONITOR");
  public static final CaseInsightType EVENT_CORRELATION = new CaseInsightType("EVENT_CORRELATION");
  public static final CaseInsightType ERROR_TRACKING = new CaseInsightType("ERROR_TRACKING");
  public static final CaseInsightType CLOUD_COST_RECOMMENDATION =
      new CaseInsightType("CLOUD_COST_RECOMMENDATION");
  public static final CaseInsightType INCIDENT = new CaseInsightType("INCIDENT");
  public static final CaseInsightType SENSITIVE_DATA_SCANNER_ISSUE =
      new CaseInsightType("SENSITIVE_DATA_SCANNER_ISSUE");
  public static final CaseInsightType EVENT = new CaseInsightType("EVENT");
  public static final CaseInsightType WATCHDOG_STORY = new CaseInsightType("WATCHDOG_STORY");
  public static final CaseInsightType WIDGET = new CaseInsightType("WIDGET");
  public static final CaseInsightType SECURITY_FINDING = new CaseInsightType("SECURITY_FINDING");
  public static final CaseInsightType INSIGHT_SCORECARD_CAMPAIGN =
      new CaseInsightType("INSIGHT_SCORECARD_CAMPAIGN");
  public static final CaseInsightType RESOURCE_POLICY = new CaseInsightType("RESOURCE_POLICY");
  public static final CaseInsightType APM_RECOMMENDATION =
      new CaseInsightType("APM_RECOMMENDATION");
  public static final CaseInsightType SCM_URL = new CaseInsightType("SCM_URL");
  public static final CaseInsightType PROFILING_DOWNSIZING_EXPERIMENT =
      new CaseInsightType("PROFILING_DOWNSIZING_EXPERIMENT");

  CaseInsightType(String value) {
    super(value, allowedValues);
  }

  public static class CaseInsightTypeSerializer extends StdSerializer<CaseInsightType> {
    public CaseInsightTypeSerializer(Class<CaseInsightType> t) {
      super(t);
    }

    public CaseInsightTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CaseInsightType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CaseInsightType fromValue(String value) {
    return new CaseInsightType(value);
  }
}
