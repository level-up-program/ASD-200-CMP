import subprocess, json, os

repoNameSearchString = "team-"

comprocess = subprocess.run(
    ["gh search repos --archived=false --match=name --json=name --owner=level-up-program '"+repoNameSearchString+"' > teamRepos.json"], shell=True)
f = open('teamRepos.json')
repos = json.load(f)

for r in repos:
    print(r['name'])
proceed = input('Do you want to DELETE these repos? y or n\n')

if proceed == 'y' or proceed == 'Y':
    for r in repos:
        subprocess.run(
        ["gh repo delete level-up-program/"+r['name']+" --confirm"], shell=True)
else:
    print("No action taken.")

os.remove("teamRepos.json")