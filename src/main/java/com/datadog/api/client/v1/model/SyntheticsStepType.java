/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Step type used in your Synthetic test.</p>
 */
@JsonSerialize(using = SyntheticsStepType.SyntheticsStepTypeSerializer.class)
public class SyntheticsStepType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("assertCurrentUrl", "assertElementAttribute", "assertElementContent", "assertElementPresent", "assertEmail", "assertFileDownload", "assertFromJavascript", "assertPageContains", "assertPageLacks", "assertRequests", "click", "extractFromJavascript", "extractFromEmailBody", "extractVariable", "goToEmailLink", "goToUrl", "goToUrlAndMeasureTti", "hover", "playSubTest", "pressKey", "refresh", "runApiTest", "scroll", "selectOption", "typeText", "uploadFiles", "wait"));

  public static final SyntheticsStepType ASSERT_CURRENT_URL = new SyntheticsStepType("assertCurrentUrl");
  public static final SyntheticsStepType ASSERT_ELEMENT_ATTRIBUTE = new SyntheticsStepType("assertElementAttribute");
  public static final SyntheticsStepType ASSERT_ELEMENT_CONTENT = new SyntheticsStepType("assertElementContent");
  public static final SyntheticsStepType ASSERT_ELEMENT_PRESENT = new SyntheticsStepType("assertElementPresent");
  public static final SyntheticsStepType ASSERT_EMAIL = new SyntheticsStepType("assertEmail");
  public static final SyntheticsStepType ASSERT_FILE_DOWNLOAD = new SyntheticsStepType("assertFileDownload");
  public static final SyntheticsStepType ASSERT_FROM_JAVASCRIPT = new SyntheticsStepType("assertFromJavascript");
  public static final SyntheticsStepType ASSERT_PAGE_CONTAINS = new SyntheticsStepType("assertPageContains");
  public static final SyntheticsStepType ASSERT_PAGE_LACKS = new SyntheticsStepType("assertPageLacks");
  public static final SyntheticsStepType ASSERT_REQUESTS = new SyntheticsStepType("assertRequests");
  public static final SyntheticsStepType CLICK = new SyntheticsStepType("click");
  public static final SyntheticsStepType EXTRACT_FROM_JAVASCRIPT = new SyntheticsStepType("extractFromJavascript");
  public static final SyntheticsStepType EXTRACT_FROM_EMAIL_BODY = new SyntheticsStepType("extractFromEmailBody");
  public static final SyntheticsStepType EXTRACT_VARIABLE = new SyntheticsStepType("extractVariable");
  public static final SyntheticsStepType GO_TO_EMAIL_LINK = new SyntheticsStepType("goToEmailLink");
  public static final SyntheticsStepType GO_TO_URL = new SyntheticsStepType("goToUrl");
  public static final SyntheticsStepType GO_TO_URL_AND_MEASURE_TTI = new SyntheticsStepType("goToUrlAndMeasureTti");
  public static final SyntheticsStepType HOVER = new SyntheticsStepType("hover");
  public static final SyntheticsStepType PLAY_SUB_TEST = new SyntheticsStepType("playSubTest");
  public static final SyntheticsStepType PRESS_KEY = new SyntheticsStepType("pressKey");
  public static final SyntheticsStepType REFRESH = new SyntheticsStepType("refresh");
  public static final SyntheticsStepType RUN_API_TEST = new SyntheticsStepType("runApiTest");
  public static final SyntheticsStepType SCROLL = new SyntheticsStepType("scroll");
  public static final SyntheticsStepType SELECT_OPTION = new SyntheticsStepType("selectOption");
  public static final SyntheticsStepType TYPE_TEXT = new SyntheticsStepType("typeText");
  public static final SyntheticsStepType UPLOAD_FILES = new SyntheticsStepType("uploadFiles");
  public static final SyntheticsStepType WAIT = new SyntheticsStepType("wait");


  SyntheticsStepType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsStepTypeSerializer extends StdSerializer<SyntheticsStepType> {
      public SyntheticsStepTypeSerializer(Class<SyntheticsStepType> t) {
          super(t);
      }

      public SyntheticsStepTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SyntheticsStepType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SyntheticsStepType fromValue(String value) {
    return new SyntheticsStepType(value);
  }
}
