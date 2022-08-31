import subprocess, json, os

repoNameSearchString = "team-"

comprocess = subprocess.run(
    ["gh search repos --archived=false --json=name --owner=level-up-program '"+repoNameSearchString+"' > teamRepos.json"], shell=True)
f = open('teamRepos.json')
repos = json.load(f)

for r in repos:
    print(r['name'])
proceed = input('Do you want to archive these repos? y or n\n')

if proceed == 'y' or proceed == 'Y':
    for r in repos:
        subprocess.run(
        ["gh repo archive level-up-program/"+r['name']+" -y"], shell=True)
else:
    print("No action taken.")

os.remove("teamRepos.json")