.PHONY: all
all: generate
	@git add --update

.PHONY: generate
generate: .generator .env
	@docker-compose -f docker-compose.generator.yaml up
	@mkdir -p api_docs/v1 api_docs/v2
	@cp -r v1/src/main ./src/
	@cp -r v2/src/main ./src/
	@cp -nr v1/src/test ./src/ || true
	@cp -nr v2/src/test ./src/ || true
	@cp -r v1/docs/* ./api_docs/v1/
	@cp -r v2/docs/* ./api_docs/v2/
	@cp v1/README.md ./api_docs/v1/
	@cp v2/README.md ./api_docs/v2/
	@rm -rf v1 v2
	@rm -rf src/test/java/com/datadog/api/v*/client/model
	@pre-commit run --all-files --hook-stage=manual docs || echo "modified files"
	@pre-commit run --all-files --hook-stage=manual lint || echo "modified files"

.PHONY: .env
.env:
	@echo "export UID=$(shell id -u)\nexport GID=$(shell id -g)" > $@

target:
	@mkdir $@
	
target/google-java-format.jar: target
	@wget https://github.com/google/google-java-format/releases/download/google-java-format-1.9/google-java-format-1.9-all-deps.jar -O "$@"
	@echo '1d98720a5984de85a822aa32a378eeacd4d17480d31cba6e730caae313466b97  target/google-java-format.jar' | sha256sum --check || ( rm $@; exit 1 )
