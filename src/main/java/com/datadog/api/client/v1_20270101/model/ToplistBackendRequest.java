/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = ToplistBackendRequest.ToplistBackendRequestDeserializer.class)
@JsonSerialize(using = ToplistBackendRequest.ToplistBackendRequestSerializer.class)
public class ToplistBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ToplistBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ToplistBackendRequestSerializer extends StdSerializer<ToplistBackendRequest> {
    public ToplistBackendRequestSerializer(Class<ToplistBackendRequest> t) {
      super(t);
    }

    public ToplistBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ToplistBackendRequestDeserializer
      extends StdDeserializer<ToplistBackendRequest> {
    public ToplistBackendRequestDeserializer() {
      this(ToplistBackendRequest.class);
    }

    public ToplistBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ToplistBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize ToplistBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ToplistBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ToplistBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463319360
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463319360.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463319360.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463319360.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463319360.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463319360.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463319360.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463319360.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463319360.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463319360.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463319360.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463319360.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463319360.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463319360.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463319360) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463319360'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463319360'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463320800
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463320800.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463320800.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463320800.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463320800.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463320800.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463320800.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463320800.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463320800.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463320800.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463320800.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463320800.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463320800.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463320800.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463320800) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463320800'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463320800'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463321920
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463321920.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463321920.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463321920.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463321920.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463321920.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463321920.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463321920.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463321920.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463321920.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463321920.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463321920.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463321920.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463321920.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463321920) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463321920'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463321920'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463323520
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463323520.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463323520.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463323520.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463323520.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463323520.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463323520.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463323520.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463323520.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463323520.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463323520.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463323520.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463323520.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463323520.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463323520) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463323520'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463323520'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463325120
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463325120.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463325120.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463325120.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463325120.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463325120.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463325120.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463325120.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463325120.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463325120.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463325120.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463325120.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463325120.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463325120.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463325120) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463325120'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463325120'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463325920
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463325920.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463325920.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463325920.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463325920.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463325920.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463325920.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463325920.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463325920.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463325920.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463325920.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463325920.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463325920.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463325920.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463325920) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463325920'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463325920'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463326720
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463326720.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463326720.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463326720.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463326720.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463326720.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463326720.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463326720.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463326720.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463326720.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463326720.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463326720.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463326720.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463326720.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463326720) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463326720'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463326720'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463327520
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463327520.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463327520.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463327520.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463327520.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463327520.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463327520.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463327520.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463327520.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463327520.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463327520.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463327520.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463327520.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463327520.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463327520) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463327520'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463327520'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463328320
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463328320.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463328320.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463328320.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463328320.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463328320.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463328320.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463328320.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463328320.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463328320.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463328320.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463328320.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463328320.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463328320.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463328320) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463328320'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463328320'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463329120
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463329120.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463329120.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463329120.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463329120.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463329120.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463329120.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463329120.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463329120.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463329120.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463329120.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463329120.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463329120.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463329120.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463329120) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463329120'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463329120'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463526592
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463526592.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463526592.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463526592.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463526592.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463526592.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463526592.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463526592.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463526592.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463526592.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463526592.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463526592.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463526592.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463526592.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463526592) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463526592'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463526592'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463527392
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463527392.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463527392.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463527392.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463527392.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463527392.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463527392.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463527392.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463527392.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463527392.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463527392.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463527392.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463527392.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463527392.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463527392) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463527392'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463527392'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463528192
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463528192.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463528192.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463528192.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463528192.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463528192.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463528192.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463528192.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463528192.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463528192.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463528192.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463528192.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463528192.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463528192.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463528192) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463528192'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463528192'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463528992
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463528992.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463528992.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463528992.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463528992.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463528992.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463528992.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463528992.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463528992.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463528992.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463528992.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463528992.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463528992.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463528992.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463528992) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463528992'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463528992'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463529792
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463529792.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463529792.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463529792.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463529792.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463529792.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463529792.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463529792.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463529792.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463529792.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463529792.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463529792.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463529792.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463529792.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463529792) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463529792'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463529792'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463530592
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463530592.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463530592.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463530592.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463530592.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463530592.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463530592.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463530592.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463530592.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463530592.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463530592.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463530592.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463530592.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463530592.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463530592) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463530592'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463530592'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463531392
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463531392.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463531392.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463531392.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463531392.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463531392.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463531392.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463531392.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463531392.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463531392.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463531392.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463531392.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463531392.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463531392.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463531392) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463531392'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463531392'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463532192
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463532192.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463532192.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463532192.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463532192.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463532192.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463532192.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463532192.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463532192.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463532192.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463532192.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463532192.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463532192.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463532192.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463532192) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463532192'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463532192'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463532992
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463532992.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463532992.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463532992.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463532992.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463532992.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463532992.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463532992.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463532992.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463532992.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463532992.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463532992.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463532992.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463532992.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463532992) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463532992'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463532992'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463533792
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463533792.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463533792.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463533792.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463533792.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463533792.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463533792.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463533792.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463533792.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463533792.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463533792.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463533792.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463533792.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463533792.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463533792) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463533792'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463533792'",
            e);
      }

      // deserialize ToplistBackendRequest20270101OneOf4463535232
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ToplistBackendRequest20270101OneOf4463535232.class.equals(Integer.class)
            || ToplistBackendRequest20270101OneOf4463535232.class.equals(Long.class)
            || ToplistBackendRequest20270101OneOf4463535232.class.equals(Float.class)
            || ToplistBackendRequest20270101OneOf4463535232.class.equals(Double.class)
            || ToplistBackendRequest20270101OneOf4463535232.class.equals(Boolean.class)
            || ToplistBackendRequest20270101OneOf4463535232.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463535232.class.equals(Integer.class)
                        || ToplistBackendRequest20270101OneOf4463535232.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ToplistBackendRequest20270101OneOf4463535232.class.equals(Float.class)
                        || ToplistBackendRequest20270101OneOf4463535232.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463535232.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ToplistBackendRequest20270101OneOf4463535232.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(ToplistBackendRequest20270101OneOf4463535232.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ToplistBackendRequest20270101OneOf4463535232) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'ToplistBackendRequest20270101OneOf4463535232'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'ToplistBackendRequest20270101OneOf4463535232'",
            e);
      }

      ToplistBackendRequest ret = new ToplistBackendRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public ToplistBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ToplistBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ToplistBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463319360 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463320800 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463321920 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463323520 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463325120 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463325920 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463326720 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463327520 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463328320 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463329120 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463526592 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463527392 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463528192 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463528992 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463529792 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463530592 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463531392 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463532192 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463532992 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463533792 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ToplistBackendRequest(ToplistBackendRequest20270101OneOf4463535232 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "ToplistBackendRequest20270101OneOf",
        new GenericType<ToplistBackendRequest20270101OneOf>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463319360",
        new GenericType<ToplistBackendRequest20270101OneOf4463319360>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463320800",
        new GenericType<ToplistBackendRequest20270101OneOf4463320800>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463321920",
        new GenericType<ToplistBackendRequest20270101OneOf4463321920>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463323520",
        new GenericType<ToplistBackendRequest20270101OneOf4463323520>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463325120",
        new GenericType<ToplistBackendRequest20270101OneOf4463325120>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463325920",
        new GenericType<ToplistBackendRequest20270101OneOf4463325920>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463326720",
        new GenericType<ToplistBackendRequest20270101OneOf4463326720>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463327520",
        new GenericType<ToplistBackendRequest20270101OneOf4463327520>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463328320",
        new GenericType<ToplistBackendRequest20270101OneOf4463328320>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463329120",
        new GenericType<ToplistBackendRequest20270101OneOf4463329120>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463526592",
        new GenericType<ToplistBackendRequest20270101OneOf4463526592>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463527392",
        new GenericType<ToplistBackendRequest20270101OneOf4463527392>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463528192",
        new GenericType<ToplistBackendRequest20270101OneOf4463528192>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463528992",
        new GenericType<ToplistBackendRequest20270101OneOf4463528992>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463529792",
        new GenericType<ToplistBackendRequest20270101OneOf4463529792>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463530592",
        new GenericType<ToplistBackendRequest20270101OneOf4463530592>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463531392",
        new GenericType<ToplistBackendRequest20270101OneOf4463531392>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463532192",
        new GenericType<ToplistBackendRequest20270101OneOf4463532192>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463532992",
        new GenericType<ToplistBackendRequest20270101OneOf4463532992>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463533792",
        new GenericType<ToplistBackendRequest20270101OneOf4463533792>() {});
    schemas.put(
        "ToplistBackendRequest20270101OneOf4463535232",
        new GenericType<ToplistBackendRequest20270101OneOf4463535232>() {});
    JSON.registerDescendants(ToplistBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ToplistBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: ToplistBackendRequest20270101OneOf,
   * ToplistBackendRequest20270101OneOf4463319360, ToplistBackendRequest20270101OneOf4463320800,
   * ToplistBackendRequest20270101OneOf4463321920, ToplistBackendRequest20270101OneOf4463323520,
   * ToplistBackendRequest20270101OneOf4463325120, ToplistBackendRequest20270101OneOf4463325920,
   * ToplistBackendRequest20270101OneOf4463326720, ToplistBackendRequest20270101OneOf4463327520,
   * ToplistBackendRequest20270101OneOf4463328320, ToplistBackendRequest20270101OneOf4463329120,
   * ToplistBackendRequest20270101OneOf4463526592, ToplistBackendRequest20270101OneOf4463527392,
   * ToplistBackendRequest20270101OneOf4463528192, ToplistBackendRequest20270101OneOf4463528992,
   * ToplistBackendRequest20270101OneOf4463529792, ToplistBackendRequest20270101OneOf4463530592,
   * ToplistBackendRequest20270101OneOf4463531392, ToplistBackendRequest20270101OneOf4463532192,
   * ToplistBackendRequest20270101OneOf4463532992, ToplistBackendRequest20270101OneOf4463533792,
   * ToplistBackendRequest20270101OneOf4463535232
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463319360.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463320800.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463321920.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463323520.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463325120.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463325920.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463326720.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463327520.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463328320.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463329120.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463526592.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463527392.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463528192.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463528992.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463529792.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463530592.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463531392.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463532192.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463532992.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463533792.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ToplistBackendRequest20270101OneOf4463535232.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be ToplistBackendRequest20270101OneOf,"
            + " ToplistBackendRequest20270101OneOf4463319360,"
            + " ToplistBackendRequest20270101OneOf4463320800,"
            + " ToplistBackendRequest20270101OneOf4463321920,"
            + " ToplistBackendRequest20270101OneOf4463323520,"
            + " ToplistBackendRequest20270101OneOf4463325120,"
            + " ToplistBackendRequest20270101OneOf4463325920,"
            + " ToplistBackendRequest20270101OneOf4463326720,"
            + " ToplistBackendRequest20270101OneOf4463327520,"
            + " ToplistBackendRequest20270101OneOf4463328320,"
            + " ToplistBackendRequest20270101OneOf4463329120,"
            + " ToplistBackendRequest20270101OneOf4463526592,"
            + " ToplistBackendRequest20270101OneOf4463527392,"
            + " ToplistBackendRequest20270101OneOf4463528192,"
            + " ToplistBackendRequest20270101OneOf4463528992,"
            + " ToplistBackendRequest20270101OneOf4463529792,"
            + " ToplistBackendRequest20270101OneOf4463530592,"
            + " ToplistBackendRequest20270101OneOf4463531392,"
            + " ToplistBackendRequest20270101OneOf4463532192,"
            + " ToplistBackendRequest20270101OneOf4463532992,"
            + " ToplistBackendRequest20270101OneOf4463533792,"
            + " ToplistBackendRequest20270101OneOf4463535232");
  }

  /**
   * Get the actual instance, which can be the following: ToplistBackendRequest20270101OneOf,
   * ToplistBackendRequest20270101OneOf4463319360, ToplistBackendRequest20270101OneOf4463320800,
   * ToplistBackendRequest20270101OneOf4463321920, ToplistBackendRequest20270101OneOf4463323520,
   * ToplistBackendRequest20270101OneOf4463325120, ToplistBackendRequest20270101OneOf4463325920,
   * ToplistBackendRequest20270101OneOf4463326720, ToplistBackendRequest20270101OneOf4463327520,
   * ToplistBackendRequest20270101OneOf4463328320, ToplistBackendRequest20270101OneOf4463329120,
   * ToplistBackendRequest20270101OneOf4463526592, ToplistBackendRequest20270101OneOf4463527392,
   * ToplistBackendRequest20270101OneOf4463528192, ToplistBackendRequest20270101OneOf4463528992,
   * ToplistBackendRequest20270101OneOf4463529792, ToplistBackendRequest20270101OneOf4463530592,
   * ToplistBackendRequest20270101OneOf4463531392, ToplistBackendRequest20270101OneOf4463532192,
   * ToplistBackendRequest20270101OneOf4463532992, ToplistBackendRequest20270101OneOf4463533792,
   * ToplistBackendRequest20270101OneOf4463535232
   *
   * @return The actual instance (ToplistBackendRequest20270101OneOf,
   *     ToplistBackendRequest20270101OneOf4463319360, ToplistBackendRequest20270101OneOf4463320800,
   *     ToplistBackendRequest20270101OneOf4463321920, ToplistBackendRequest20270101OneOf4463323520,
   *     ToplistBackendRequest20270101OneOf4463325120, ToplistBackendRequest20270101OneOf4463325920,
   *     ToplistBackendRequest20270101OneOf4463326720, ToplistBackendRequest20270101OneOf4463327520,
   *     ToplistBackendRequest20270101OneOf4463328320, ToplistBackendRequest20270101OneOf4463329120,
   *     ToplistBackendRequest20270101OneOf4463526592, ToplistBackendRequest20270101OneOf4463527392,
   *     ToplistBackendRequest20270101OneOf4463528192, ToplistBackendRequest20270101OneOf4463528992,
   *     ToplistBackendRequest20270101OneOf4463529792, ToplistBackendRequest20270101OneOf4463530592,
   *     ToplistBackendRequest20270101OneOf4463531392, ToplistBackendRequest20270101OneOf4463532192,
   *     ToplistBackendRequest20270101OneOf4463532992, ToplistBackendRequest20270101OneOf4463533792,
   *     ToplistBackendRequest20270101OneOf4463535232)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf`. If the actual instance is not
   * `ToplistBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `ToplistBackendRequest20270101OneOf`
   */
  public ToplistBackendRequest20270101OneOf getToplistBackendRequest20270101OneOf()
      throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463319360`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463319360`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463319360`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463319360`
   */
  public ToplistBackendRequest20270101OneOf4463319360
      getToplistBackendRequest20270101OneOf4463319360() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463319360) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463320800`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463320800`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463320800`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463320800`
   */
  public ToplistBackendRequest20270101OneOf4463320800
      getToplistBackendRequest20270101OneOf4463320800() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463320800) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463321920`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463321920`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463321920`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463321920`
   */
  public ToplistBackendRequest20270101OneOf4463321920
      getToplistBackendRequest20270101OneOf4463321920() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463321920) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463323520`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463323520`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463323520`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463323520`
   */
  public ToplistBackendRequest20270101OneOf4463323520
      getToplistBackendRequest20270101OneOf4463323520() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463323520) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463325120`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463325120`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463325120`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463325120`
   */
  public ToplistBackendRequest20270101OneOf4463325120
      getToplistBackendRequest20270101OneOf4463325120() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463325120) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463325920`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463325920`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463325920`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463325920`
   */
  public ToplistBackendRequest20270101OneOf4463325920
      getToplistBackendRequest20270101OneOf4463325920() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463325920) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463326720`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463326720`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463326720`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463326720`
   */
  public ToplistBackendRequest20270101OneOf4463326720
      getToplistBackendRequest20270101OneOf4463326720() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463326720) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463327520`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463327520`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463327520`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463327520`
   */
  public ToplistBackendRequest20270101OneOf4463327520
      getToplistBackendRequest20270101OneOf4463327520() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463327520) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463328320`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463328320`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463328320`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463328320`
   */
  public ToplistBackendRequest20270101OneOf4463328320
      getToplistBackendRequest20270101OneOf4463328320() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463328320) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463329120`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463329120`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463329120`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463329120`
   */
  public ToplistBackendRequest20270101OneOf4463329120
      getToplistBackendRequest20270101OneOf4463329120() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463329120) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463526592`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463526592`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463526592`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463526592`
   */
  public ToplistBackendRequest20270101OneOf4463526592
      getToplistBackendRequest20270101OneOf4463526592() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463526592) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463527392`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463527392`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463527392`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463527392`
   */
  public ToplistBackendRequest20270101OneOf4463527392
      getToplistBackendRequest20270101OneOf4463527392() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463527392) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463528192`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463528192`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463528192`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463528192`
   */
  public ToplistBackendRequest20270101OneOf4463528192
      getToplistBackendRequest20270101OneOf4463528192() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463528192) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463528992`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463528992`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463528992`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463528992`
   */
  public ToplistBackendRequest20270101OneOf4463528992
      getToplistBackendRequest20270101OneOf4463528992() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463528992) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463529792`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463529792`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463529792`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463529792`
   */
  public ToplistBackendRequest20270101OneOf4463529792
      getToplistBackendRequest20270101OneOf4463529792() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463529792) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463530592`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463530592`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463530592`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463530592`
   */
  public ToplistBackendRequest20270101OneOf4463530592
      getToplistBackendRequest20270101OneOf4463530592() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463530592) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463531392`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463531392`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463531392`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463531392`
   */
  public ToplistBackendRequest20270101OneOf4463531392
      getToplistBackendRequest20270101OneOf4463531392() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463531392) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463532192`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463532192`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463532192`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463532192`
   */
  public ToplistBackendRequest20270101OneOf4463532192
      getToplistBackendRequest20270101OneOf4463532192() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463532192) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463532992`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463532992`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463532992`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463532992`
   */
  public ToplistBackendRequest20270101OneOf4463532992
      getToplistBackendRequest20270101OneOf4463532992() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463532992) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463533792`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463533792`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463533792`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463533792`
   */
  public ToplistBackendRequest20270101OneOf4463533792
      getToplistBackendRequest20270101OneOf4463533792() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463533792) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ToplistBackendRequest20270101OneOf4463535232`. If the actual
   * instance is not `ToplistBackendRequest20270101OneOf4463535232`, the ClassCastException will be
   * thrown.
   *
   * @return The actual instance of `ToplistBackendRequest20270101OneOf4463535232`
   * @throws ClassCastException if the instance is not
   *     `ToplistBackendRequest20270101OneOf4463535232`
   */
  public ToplistBackendRequest20270101OneOf4463535232
      getToplistBackendRequest20270101OneOf4463535232() throws ClassCastException {
    return (ToplistBackendRequest20270101OneOf4463535232) super.getActualInstance();
  }
}
