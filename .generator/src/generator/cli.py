import pathlib

import click
from jinja2 import Environment, FileSystemLoader

from . import openapi
from . import formatter

PACKAGE_NAME = "com.datadog.api.{}.client"
GENERATED_ANNOTATION = (
    '@javax.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")'
)


@click.command()
@click.option(
    "-i",
    "--input",
    type=click.Path(exists=True, file_okay=True, dir_okay=False, path_type=pathlib.Path),
)
@click.option(
    "-o",
    "--output",
    type=click.Path(path_type=pathlib.Path),
)
def cli(input, output):
    """
    Generate a Ruby code snippet from OpenAPI specification.
    """
    spec = openapi.load(input)
    version = input.parent.name
    env = Environment(loader=FileSystemLoader(str(pathlib.Path(__file__).parent / "templates")))

    env.filters["accept_headers"] = openapi.accept_headers
    env.filters["attribute_name"] = formatter.attribute_name
    env.filters["camel_case"] = formatter.camel_case
    env.filters["collection_format"] = openapi.collection_format
    env.filters["format_server"] = openapi.format_server
    env.filters["format_value"] = formatter.format_value
    env.filters["parameter_schema"] = openapi.parameter_schema
    env.filters["parameters"] = openapi.parameters
    env.filters["return_type"] = openapi.return_type
    env.filters["simple_type"] = formatter.simple_type
    env.filters["snake_case"] = formatter.snake_case
    env.filters["untitle_case"] = formatter.untitle_case
    env.filters["upperfirst"] = formatter.upperfirst
    env.filters["variable_name"] = formatter.variable_name
    env.filters["is_primitive"] = openapi.is_primitive
    env.filters["is_java_base_type"] = openapi.is_java_base_type
    env.filters["is_model"] = openapi.is_model
    env.filters["get_required_attributes"] = openapi.get_required_attributes
    env.filters["escape_html"] = formatter.escape_html
    env.filters["docstring"] = formatter.docstring
    env.filters["inline_docstring"] = formatter.inline_docstring
    env.filters["un_parameterize_type"] = formatter.un_parameterize_type

    env.globals["enumerate"] = enumerate
    env.globals["get_name"] = openapi.get_name
    env.globals["get_type_for_attribute"] = openapi.get_type_for_attribute
    env.globals["get_type_for_parameter"] = openapi.get_type_for_parameter
    env.globals["get_type"] = openapi.type_to_java
    env.globals["get_api_models"] = openapi.get_api_models
    env.globals["openapi"] = spec
    env.globals["package_name"] = PACKAGE_NAME.format(version)
    env.globals["generated_annotation"] = GENERATED_ANNOTATION
    env.globals["version"] = version

    api_j2 = env.get_template("Api.j2")
    model_j2 = env.get_template("model.j2")

    extra_files = {
        "ApiClient.java": env.get_template("ApiClient.j2"),
        "ApiException.java": env.get_template("ApiException.j2"),
        "ApiResponse.java": env.get_template("ApiResponse.j2"),
        "Configuration.java": env.get_template("Configuration.j2"),
        "JSON.java": env.get_template("JSON.j2"),
        "JavaTimeFormatter.java": env.get_template("JavaTimeFormatter.j2"),
        "JsonTimeSerializer.java": env.get_template("JsonTimeSerializer.j2"),
        "Pair.java": env.get_template("Pair.j2"),
        "RFC3339DateFormat.java": env.get_template("RFC3339DateFormat.j2"),
        "ServerConfiguration.java": env.get_template("ServerConfiguration.j2"),
        "ServerVariable.java": env.get_template("ServerVariable.j2"),
        "StringUtil.java": env.get_template("StringUtil.j2"),
    }

    extra_models = {
        "AbstractOpenApiSchema.java": env.get_template("AbstractOpenApiSchema.j2"),
        "UnparsedObject.java": env.get_template("UnparsedObject.j2"),
    }

    auth_files = {
        "ApiKeyAuth.java": env.get_template("auth/ApiKeyAuth.j2"),
        "Authentication.java": env.get_template("auth/Authentication.j2"),
        "HttpBasicAuth.java": env.get_template("auth/HttpBasicAuth.j2"),
        "HttpBearerAuth.java": env.get_template("auth/HttpBearerAuth.j2"),
        "OAuth.java": env.get_template("auth/OAuth.j2"),
        "OAuthFlow.java": env.get_template("auth/OAuthFlow.j2"),
    }

    apis = openapi.apis(spec)
    models = openapi.models(spec)

    output.mkdir(parents=True, exist_ok=True)

    for name, template in extra_files.items():
        filename = output / name
        with filename.open("w") as fp:
            fp.write(template.render(apis=apis, models=models))

    auth_path = output / "auth"
    auth_path.mkdir(parents=True, exist_ok=True)
    for name, template in auth_files.items():
        filename = auth_path / name
        with filename.open("w") as fp:
            fp.write(template.render())

    model_dir = output / "model"
    model_dir.mkdir(parents=True, exist_ok=True)
    for name, template in extra_models.items():
        filename = model_dir / name
        with filename.open("w") as fp:
            fp.write(template.render())

    for name, model in models.items():
        model_path = model_dir / f"{name}.java"
        with model_path.open("w") as fp:
            fp.write(model_j2.render(name=name, model=model))

    api_dir = output / "api"
    api_dir.mkdir(parents=True, exist_ok=True)
    for name, operations in apis.items():
        api_name = formatter.upperfirst(formatter.camel_case(name)) + "Api"
        filename = api_dir / f"{api_name}.java"
        with filename.open("w") as fp:
            fp.write(api_j2.render(name=api_name, operations=operations))
