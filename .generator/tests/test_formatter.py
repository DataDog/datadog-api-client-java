# coding=utf-8
"""Unit tests for the formatter module."""

import yaml
from click.testing import CliRunner

from generator.cli import cli
from generator.formatter import format_data_with_schema


class SchemaWithRef(dict):
    """A schema dict that carries a $ref, as the generator produces after resolving references."""

    def __init__(self, *args, ref=None, **kwargs):
        super().__init__(*args, **kwargs)
        if ref:
            self.__reference__ = {"$ref": ref}


def test_named_array_alias_in_oneof_uses_generated_wrapper():
    message_schema = SchemaWithRef(
        {
            "type": "object",
            "properties": {
                "role": {"type": "string"},
                "content": {"type": "string"},
            },
            "required": ["role", "content"],
        },
        ref="#/components/schemas/LLMObsPromptChatMessage",
    )
    chat_schema = SchemaWithRef(
        {
            "type": "array",
            "items": message_schema,
            "x-generate-alias-as-model": True,
        },
        ref="#/components/schemas/LLMObsPromptChatTemplate",
    )
    template_schema = SchemaWithRef(
        {"oneOf": [{"type": "string"}, chat_schema]},
        ref="#/components/schemas/LLMObsPromptTemplate",
    )

    _, result, imports = format_data_with_schema(
        [
            {"role": "system", "content": "You help {{company_name}} customers."},
            {"role": "user", "content": "Answer {{question}}"},
        ],
        template_schema,
    )

    assert (
        "new LLMObsPromptTemplate(new LLMObsPromptChatTemplate("
        "Arrays.asList(" in result
    )
    assert "new LLMObsPromptTemplate(Arrays.asList(" not in result
    assert "LLMObsPromptChatTemplate" in imports


def test_named_array_alias_model_accepts_formatted_list(tmp_path):
    spec_dir = tmp_path / "v2"
    spec_dir.mkdir()
    spec_path = spec_dir / "openapi.yaml"
    spec_path.write_text(
        yaml.safe_dump(
            {
                "openapi": "3.0.0",
                "info": {"title": "test", "version": "1"},
                "servers": [{"url": "https://api.example.com", "variables": {}}],
                "paths": {
                    "/test": {
                        "post": {
                            "operationId": "TestArrayAlias",
                            "tags": ["Test"],
                            "requestBody": {
                                "content": {
                                    "application/json": {
                                        "schema": {
                                            "$ref": "#/components/schemas/LLMObsPromptChatTemplate"
                                        }
                                    }
                                }
                            },
                            "responses": {"200": {"description": "OK"}},
                        }
                    }
                },
                "components": {
                    "securitySchemes": {},
                    "schemas": {
                        "LLMObsPromptChatMessage": {
                            "type": "object",
                            "properties": {
                                "role": {"type": "string"},
                                "content": {"type": "string"},
                            },
                        },
                        "LLMObsPromptChatTemplate": {
                            "type": "array",
                            "items": {"$ref": "#/components/schemas/LLMObsPromptChatMessage"},
                            "x-generate-alias-as-model": True,
                        },
                    }
                },
            }
        )
    )
    output = tmp_path / "generated"

    result = CliRunner().invoke(cli, [str(spec_path), "--output", str(output)])

    assert result.exit_code == 0
    model = (output / "v2/model/LLMObsPromptChatTemplate.java").read_text()
    assert "public LLMObsPromptChatTemplate() {}" in model
    assert "public LLMObsPromptChatTemplate(List<LLMObsPromptChatMessage> items)" in model
    assert "super(items);" in model
