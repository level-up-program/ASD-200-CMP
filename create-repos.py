import subprocess
import json
import os
import csv

dict_from_csv = {}
with open('team-info.csv', mode='r') as teamInput:
	reader = csv.reader(teamInput)
	dict_from_csv = {rows[0]:rows[1] for rows in reader}

print(dict_from_csv)
teams = dict_from_csv.keys()
created_repos = {}
org = "level-up-program"

for team in teams:
	language = dict_from_csv.get(team)
	template = ""
	if language == 'java':
		template = "java-cucumber-reference"
	elif language == "dotnet":
		template = "dotnet-reference"
	elif language == "python":
		template = "python-robot-reference"
	else:
		template = "BAD_DATA_NO_TEMPLATE"

	repo_name = "team-"+team
	comprocess = subprocess.run(
            ["gh repo create "+org+"/"+repo_name+" --public --template "+org+"/"+template], shell=True)
	if comprocess.returncode == 0:
		created_repos[team] = repo_name

	#Add repo to the participants team
	subprocess.run(["gh api --method PUT -H \"Accept: application/vnd.github+json\" /orgs/"+org+"/teams/participants/repos/"+org +"/"+repo_name+" -f permission='admin'"], shell=True)

with open("created-repos.json", "w") as outfile:
	json.dump(created_repos, outfile)
