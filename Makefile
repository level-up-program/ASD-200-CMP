.PHONY: clean issue-export-json
.DEFAULT_GOAL := issue-dump

clean:
	rm -f github-dump.*

issue-export-json:
	./export_issues.sh

issue-convert-csv:
	python json2csv.py

issue-dump: clean issue-export-json issue-convert-csv