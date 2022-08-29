/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Step type used in your Synthetic test. */
@JsonSerialize(using = SyntheticsStepType.SyntheticsStepTypeSerializer.class)
public class SyntheticsStepType {

  public static final SyntheticsStepType ASSERT_CURRENT_URL =
      new SyntheticsStepType("assertCurrentUrl");
  public static final SyntheticsStepType ASSERT_ELEMENT_ATTRIBUTE =
      new SyntheticsStepType("assertElementAttribute");
  public static final SyntheticsStepType ASSERT_ELEMENT_CONTENT =
      new SyntheticsStepType("assertElementContent");
  public static final SyntheticsStepType ASSERT_ELEMENT_PRESENT =
      new SyntheticsStepType("assertElementPresent");
  public static final SyntheticsStepType ASSERT_EMAIL = new SyntheticsStepType("assertEmail");
  public static final SyntheticsStepType ASSERT_FILE_DOWNLOAD =
      new SyntheticsStepType("assertFileDownload");
  public static final SyntheticsStepType ASSERT_FROM_JAVASCRIPT =
      new SyntheticsStepType("assertFromJavascript");
  public static final SyntheticsStepType ASSERT_PAGE_CONTAINS =
      new SyntheticsStepType("assertPageContains");
  public static final SyntheticsStepType ASSERT_PAGE_LACKS =
      new SyntheticsStepType("assertPageLacks");
  public static final SyntheticsStepType CLICK = new SyntheticsStepType("click");
  public static final SyntheticsStepType EXTRACT_FROM_JAVASCRIPT =
      new SyntheticsStepType("extractFromJavascript");
  public static final SyntheticsStepType EXTRACT_VARIABLE =
      new SyntheticsStepType("extractVariable");
  public static final SyntheticsStepType GO_TO_EMAIL_LINK = new SyntheticsStepType("goToEmailLink");
  public static final SyntheticsStepType GO_TO_URL = new SyntheticsStepType("goToUrl");
  public static final SyntheticsStepType GO_TO_URL_AND_MEASURE_TTI =
      new SyntheticsStepType("goToUrlAndMeasureTti");
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

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "assertCurrentUrl",
              "assertElementAttribute",
              "assertElementContent",
              "assertElementPresent",
              "assertEmail",
              "assertFileDownload",
              "assertFromJavascript",
              "assertPageContains",
              "assertPageLacks",
              "click",
              "extractFromJavascript",
              "extractVariable",
              "goToEmailLink",
              "goToUrl",
              "goToUrlAndMeasureTti",
              "hover",
              "playSubTest",
              "pressKey",
              "refresh",
              "runApiTest",
              "scroll",
              "selectOption",
              "typeText",
              "uploadFiles",
              "wait"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SyntheticsStepType(String value) {
    this.value = value;
  }

  public static class SyntheticsStepTypeSerializer extends StdSerializer<SyntheticsStepType> {
    public SyntheticsStepTypeSerializer(Class<SyntheticsStepType> t) {
      super(t);
    }

    public SyntheticsStepTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SyntheticsStepType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SyntheticsStepType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SyntheticsStepType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SyntheticsStepType fromValue(String value) {
    return new SyntheticsStepType(value);
  }
}
